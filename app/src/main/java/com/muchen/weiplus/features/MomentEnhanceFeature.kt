package com.muchen.weiplus.features

import com.muchen.weiplus.ui.MainActivity

/**
 * 朋友圈增强 — 无水印保存、强制显示
 */
class MomentEnhanceFeature : BaseFeature() {
    override val key = MainActivity.KEY_MOMENT_ENHANCE
    override val name = "朋友圈增强"
    override val description = "无水印保存、强制显示"

    override fun onEnable(classLoader: ClassLoader) {
        // TODO: Hook 朋友圈相关方法
    }
}
