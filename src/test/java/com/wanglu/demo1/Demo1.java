package com.wanglu.demo1;

import org.junit.Assert;
import org.junit.Test;

import com.wanglu.demo.Demo;

public class Demo1 {
	@Test
	public void isNotNull(){
		Assert.assertTrue(Demo.isNotNull(" "));
		Assert.assertFalse(Demo.isNotNull("他不是一个傻子"));
		System.out.println(Demo.isNotNull(""));
	}
}
