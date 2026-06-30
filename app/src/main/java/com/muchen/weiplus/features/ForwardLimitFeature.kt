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

        // Strategy 1: Intercept max_limit_num = 9 -> 9999 (working via getIntExtra)
        hookGetIntExtra(classLoader)

        // Strategy 2: Discovery — log ALL menu items created (db5.h4)
        hookMenuItemCreate(classLoader)

        // Strategy 3: Discovery — log menu item clicks via u0.onItemClick
        hookMenuClick(classLoader)

        // Strategy 4: Hook ForwardFeatureService.Bi to see viewModels
        hookForwardBi(classLoader)

        module.log(Log.INFO, TAG, "v10: discovery — menu items + ForwardBi")
    }

    // Hook db5.h4(Context, int groupId, int itemId) constructor
    private fun hookMenuItemCreate(classLoader: ClassLoader) {
        try {
            val h4 = classLoader.loadClass("db5.h4")
            for (c in h4.declaredConstructors) {
                if (c.parameterTypes.size == 3) {
                    module.hook(c).intercept { chain ->
                        chain.proceed()
                        val groupId = chain.args[1] as Int
                        val itemId = chain.args[2] as Int
                        module.log(Log.INFO, TAG, "MENU_NEW g=$groupId id=$itemId")
                    }
                    module.log(Log.INFO, TAG, "  db5.h4.<init>(Ctx,int,int) Hook OK")
                    return
                }
            }
            module.log(Log.WARN, TAG, "  db5.h4 no 3-arg ctor")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "  db5.h4 FAIL: " + (e.message ?: ""))
        }
    }

    // Hook com.tencent.mm.ui.widget.dialog.u0.onItemClick
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

    // Hook dk5.b0.Bi(Context, co.a, n13.r) — ForwardFeatureService
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
            module.log(Log.WARN, TAG, "  dk5.b0.Bi not found among ${ffs.declaredMethods.size} methods")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "  dk5.b0 FAIL: " + (e.message ?: ""))
        }
    }

    // Hook Intent.getIntExtra to override max_limit_num (working)
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
