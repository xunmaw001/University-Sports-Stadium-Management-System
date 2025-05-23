package com.entity.view;

import com.entity.XueshengdingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-02 11:13:26
 */
@TableName("xueshengdingdan")
public class XueshengdingdanView  extends XueshengdingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengdingdanView(){
	}
 
 	public XueshengdingdanView(XueshengdingdanEntity xueshengdingdanEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengdingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
