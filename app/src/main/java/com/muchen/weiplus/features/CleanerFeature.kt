package com.muchen.weiplus.features

import com.muchen.weiplus.ui.MainActivity

/**
 * 清理工具 — 深度清理缓存和文件
 */
class CleanerFeature : BaseFeature() {
    override val key = MainActivity.KEY_CLEANER
    override val name = "清理工具"
    override val description = "深度清理缓存和文件"

    override fun onEnable(classLoader: ClassLoader) {
        // TODO: 清理缓存逻辑
    }
}
