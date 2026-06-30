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

        // Hook Intent.putExtra: intercept max_limit_num = 9 -> 9999
        hookPutExtra(classLoader)

        // Hook Intent.getIntExtra: also inflate on read side
        hookGetIntExtra(classLoader)

        // Activity scanner
        hookActivityCreate(classLoader)

        module.log(Log.INFO, TAG, "v8: intercept max_limit_num=9 -> 9999")
    }

    private fun hookPutExtra(classLoader: ClassLoader) {
        try {
            val intentClass = classLoader.loadClass("android.content.Intent")
            val putExtraInt = intentClass.getDeclaredMethod(
                "putExtra", String::class.java, Int::class.javaPrimitiveType!!
            )
            module.hook(putExtraInt).intercept { chain ->
                val key = chain.args[0] as? String ?: ""
                val value = (chain.args[1] as? Int) ?: 0
                if (FeatureConfig.forwardLimit && key == "max_limit_num" && value in 1..100) {
                    module.log(Log.INFO, TAG, "Intent.putExtra(max_limit_num): $value -> 9999")
                    chain.args[1] = 9999
                }
                chain.proceed()
            }
            module.log(Log.INFO, TAG, "  Intent.putExtra Hook OK")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "  Intent.putExtra FAIL: " + (e.message ?: ""))
        }
    }

    private fun hookGetIntExtra(classLoader: ClassLoader) {
        try {
            val intentClass = classLoader.loadClass("android.content.Intent")
            val getIntExtra = intentClass.getDeclaredMethod(
                "getIntExtra", String::class.java, Int::class.javaPrimitiveType!!
            )
            module.hook(getIntExtra).intercept { chain ->
                val key = chain.args[0] as? String ?: ""
                val result = chain.proceed() as Int
                if (FeatureConfig.forwardLimit && key == "max_limit_num" && result in 1..100) {
                    module.log(Log.INFO, TAG, "Intent.getIntExtra(max_limit_num): $result -> 9999")
                    return@intercept 9999
                }
                result
            }
            module.log(Log.INFO, TAG, "  Intent.getIntExtra Hook OK")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "  Intent.getIntExtra FAIL: " + (e.message ?: ""))
        }
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
                }
                null
            }
            module.log(Log.INFO, TAG, "  Activity.onCreate Hook OK")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "  Activity.onCreate FAIL: " + (e.message ?: ""))
        }
    }
}
