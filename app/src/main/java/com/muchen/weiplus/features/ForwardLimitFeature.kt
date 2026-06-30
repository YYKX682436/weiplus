package com.muchen.weiplus.features

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

        hookGetIntExtra(classLoader)
        hookMenuItemCreate(classLoader)
        hookSetTitle(classLoader)
        hookForwardBi(classLoader)
        hookMenuClick(classLoader)

        module.log(Log.INFO, TAG, "v11: setTitle hook to identify Forward by name")
    }

    // Hook db5.h4(Context, int groupId, int itemId) — log group+id only
    private fun hookMenuItemCreate(classLoader: ClassLoader) {
        try {
            val h4 = classLoader.loadClass("db5.h4")
            for (c in h4.declaredConstructors) {
                if (c.parameterTypes.size == 3) {
                    module.hook(c).intercept { chain ->
                        val groupId = chain.args[1] as Int
                        val itemId = chain.args[2] as Int
                        module.log(Log.INFO, TAG, "MENU_NEW g=$groupId id=$itemId")
                        chain.proceed()
                    }
                    module.log(Log.INFO, TAG, "  db5.h4.<init> Hook OK")
                    return
                }
            }
            module.log(Log.WARN, TAG, "  db5.h4 no 3-arg ctor")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "  db5.h4 FAIL: " + (e.message ?: ""))
        }
    }

    // Hook db5.h4.setTitle(CharSequence) — log title with group/item from instance fields
    private fun hookSetTitle(classLoader: ClassLoader) {
        try {
            val h4 = classLoader.loadClass("db5.h4")
            val setTitle = h4.getDeclaredMethod("setTitle", CharSequence::class.java)
            module.hook(setTitle).intercept { chain ->
                val title = chain.args[0] as? CharSequence ?: "?"
                val inst = chain.thisObject
                // Read group + itemId from fields
                val gField = h4.getDeclaredField("f228366g"); gField.isAccessible = true
                val iField = h4.getDeclaredField("f228367h"); iField.isAccessible = true
                val g = gField.getInt(inst)
                val it = iField.getInt(inst)
                module.log(Log.INFO, TAG, "MENU_TITLE g=$g id=$it title=''$title''")
                chain.proceed()
            }
            module.log(Log.INFO, TAG, "  db5.h4.setTitle Hook OK")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "  db5.h4.setTitle FAIL: " + (e.message ?: ""))
        }
    }

    private fun hookMenuClick(classLoader: ClassLoader) {
        try {
            val u0 = classLoader.loadClass("com.tencent.mm.ui.widget.dialog.u0")
            val onClick = u0.getDeclaredMethod("onItemClick",
                classLoader.loadClass("android.widget.AdapterView"),
                classLoader.loadClass("android.view.View"),
                Int::class.javaPrimitiveType!!,
                Long::class.javaPrimitiveType!!
            )
            module.hook(onClick).intercept { chain ->
                val pos = chain.args[2] as Int
                module.log(Log.INFO, TAG, "MENU_CLICK pos=$pos")
                chain.proceed()
            }
            module.log(Log.INFO, TAG, "  u0.onItemClick Hook OK")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "  u0.onItemClick FAIL: " + (e.message ?: ""))
        }
    }

    private fun hookForwardBi(classLoader: ClassLoader) {
        try {
            val ffs = classLoader.loadClass("dk5.b0")
            for (m in ffs.declaredMethods) {
                if (m.name == "Bi" && m.parameterTypes.size == 3) {
                    module.hook(m).intercept { chain ->
                        val vm = chain.args[1]
                        val vmName = vm?.javaClass?.simpleName ?: "null"
                        module.log(Log.INFO, TAG, "FORWARD_Bi viewModel=$vmName")
                        chain.proceed()
                    }
                    module.log(Log.INFO, TAG, "  dk5.b0.Bi Hook OK")
                    return
                }
            }
            module.log(Log.WARN, TAG, "  dk5.b0.Bi not found")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "  dk5.b0 FAIL: " + (e.message ?: ""))
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
                    module.log(Log.INFO, TAG, "getIntExtra(max_limit_num): $result -> 9999")
                    return@intercept 9999
                }
                result
            }
            module.log(Log.INFO, TAG, "  Intent.getIntExtra Hook OK")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "  Intent.getIntExtra FAIL: " + (e.message ?: ""))
        }
    }
}
