package com.muchen.weiplus.features

import io.github.libxposed.api.XposedModule

/**
 * 功能基类 鈥?鎵€鏈夊姛鑳芥ā鍧楃户鎵挎绫?
 */
abstract class BaseFeature {

    /** 鍔熻兘鍞竴鏍囪瘑 */
    abstract val key: String

    /** 鍔熻兘鍚嶇О */
    abstract val name: String

    /**
     * 婵€娲诲姛鑳?缁戝畾 Hook锛?
     * @param module XposedModule 瀹炰緥
     * @param classLoader 寰俊鐨?ClassLoader
     */
    abstract fun onEnable(module: XposedModule, classLoader: ClassLoader)

    /** 鍋滅敤鍔熻兘锛堟殏涓嶅疄鐜帮紝闇€閲嶅惎寰俊鐢熸晥锛?*/
    open fun onDisable() {}
}
