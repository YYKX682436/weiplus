package com.muchen.weiplus.features

import android.app.Activity
import android.util.Log
import io.github.libxposed.api.XposedModule

class ForwardLimitFeature : BaseFeature() {

    companion object {
        private const val TAG = "ForwardLimit"
    }

    override val key = "forward_limit"
    override val name = "\u89e3\u9664\u8f6c\u53d1\u9650\u5236"

    private lateinit var module: XposedModule

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        this.module = module

        hookGetMaxSelectCount(classLoader, "com.tencent.mm.ui.contact.SelectContactUI")
        hookGetMaxSelectCount(classLoader, "com.tencent.mm.ui.contact.MMBaseSelectContactUI")
        hookGetMaxSelectCount(classLoader, "com.tencent.mm.pluginsdk.ui.MultiSelectContactView")

        hookIntentMaxSelect(classLoader)

        interceptBools(classLoader, "com.tencent.mm.feature.forward.ui.ForwardMsgPreviewUI")
        interceptBools(classLoader, "com.tencent.mm.ui.chatting.e")
        interceptBools(classLoader, "com.tencent.mm.ui.chatting.d")
        interceptBools(classLoader, "com.tencent.mm.ui.chatting.f")

        hookActivityCreate(classLoader)

        module.log(Log.INFO, TAG, "v4: targeted hooks installed")
    }

    private fun hookGetMaxSelectCount(classLoader: ClassLoader, clsName: String) {
        try {
            val clz = classLoader.loadClass(clsName)
            val m = clz.getDeclaredMethod("getMaxSelectCount")
            module.hook(m).intercept { chain ->
                if (!FeatureConfig.forwardLimit) return@intercept chain.proceed()
                val orig = chain.proceed() as Int
                module.log(Log.INFO, TAG, "getMaxSelectCount@" + clsName.substringAfterLast('.') + ": $orig -> MAX")
                return@intercept Int.MAX_VALUE
            }
            module.log(Log.INFO, TAG, "  getMaxSelectCount OK @ " + clsName.substringAfterLast('.'))
        } catch (e: NoSuchMethodException) {
            module.log(Log.WARN, TAG, "  getMaxSelectCount NOT FOUND @ " + clsName.substringAfterLast('.'))
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "  getMaxSelectCount FAIL @ " + clsName.substringAfterLast('.') + ": " + (e.message ?: ""))
        }
    }

    private fun hookIntentMaxSelect(classLoader: ClassLoader) {
        try {
            val intentClass = classLoader.loadClass("android.content.Intent")
            val getIntExtra = intentClass.getDeclaredMethod(
                "getIntExtra", String::class.java, Int::class.javaPrimitiveType!!
            )
            module.hook(getIntExtra).intercept { chain ->
                val key = chain.args[0] as? String ?: ""
                val result = chain.proceed() as Int
                if (FeatureConfig.forwardLimit && key.contains("MAX_SELECT_COUNT")) {
                    module.log(Log.INFO, TAG, "Intent.getIntExtra(MAX_SELECT_COUNT): $result -> 9999")
                    return@intercept 9999
                }
                result
            }
            module.log(Log.INFO, TAG, "  Intent.getIntExtra Hook OK")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "  Intent.getIntExtra FAIL: " + (e.message ?: ""))
        }
    }

    private fun interceptBools(classLoader: ClassLoader, clsName: String) {
        try {
            val clz = classLoader.loadClass(clsName)
            var count = 0
            for (m in clz.declaredMethods) {
                if (m.returnType == Boolean::class.javaPrimitiveType) {
                    module.hook(m).intercept { chain ->
                        if (!FeatureConfig.forwardLimit) return@intercept chain.proceed()
                        val orig = chain.proceed()
                        if (orig as? Boolean == false) {
                            module.log(Log.INFO, TAG, "BOOL " + clsName.substringAfterLast('.') + "." + m.name + "() F->T")
                        }
                        return@intercept true
                    }
                    count++
                }
            }
            if (count > 0) module.log(Log.INFO, TAG, "  " + clsName.substringAfterLast('.') + ": $count bool hooks")
        } catch (_: Throwable) {}
    }

    private fun hookActivityCreate(classLoader: ClassLoader) {
        try {
            val activityClass = classLoader.loadClass("android.app.Activity")
            val onCreateMethod = activityClass.getDeclaredMethod("onCreate", android.os.Bundle::class.java)
            module.hook(onCreateMethod).intercept { chain ->
                chain.proceed()
                val activity = chain.thisObject as? Activity ?: return@intercept null
                val clsName = activity.javaClass.name
                val lower = clsName.lowercase()
                if (lower.contains("forward") || lower.contains("transmit") ||
                    lower.contains("selectcontact") || lower.contains("selectconv") ||
                    lower.contains("multiselect") || lower.contains("sharehistory") ||
                    lower.contains("msgrecord")) {
                    module.log(Log.INFO, TAG, "ACTIVITY: $clsName")
                    try { interceptBools(classLoader, clsName) } catch (_: Throwable) {}
                    try { hookGetMaxSelectCount(classLoader, clsName) } catch (_: Throwable) {}
                }
                null
            }
            module.log(Log.INFO, TAG, "  Activity.onCreate Hook OK")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "  Activity.onCreate FAIL: " + (e.message ?: ""))
        }
    }
}
