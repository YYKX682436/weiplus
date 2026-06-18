package com.muchen.weiplus.entry

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.Gravity
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import com.muchen.weiplus.features.*
import io.github.libxposed.api.XposedModule
import io.github.libxposed.api.XposedModuleInterface.PackageLoadedParam
import io.github.libxposed.api.XposedModuleInterface.PackageReadyParam

class ModuleEntry : XposedModule() {

    companion object {
        private const val TAG = "WeiPlus"
        private const val WECHAT_PKG = "com.tencent.mm"

        val FEATURES: List<BaseFeature> = listOf(
            DisableHotUpdateFeature(),
            AntiRecallFeature(),
            MomentEnhanceFeature(),
            CleanerFeature()
        )
    }

    private var fabAdded = false
    private var featuresActivated = false
    private var isMainProcess = false

    override fun onPackageLoaded(param: PackageLoadedParam) {
        if (param.packageName != WECHAT_PKG) return
        if (!param.isFirstPackage) return

        isMainProcess = (getProcessName() == WECHAT_PKG)

        if (isMainProcess) {
            try {
                val cl = param.defaultClassLoader
                val tinkerLoader = cl.loadClass("com.tencent.tinker.loader.TinkerLoader")
                val appClass = cl.loadClass("com.tencent.tinker.loader.app.TinkerApplication")
                val tryLoadMethod = tinkerLoader.getDeclaredMethod("tryLoad", appClass)
                hook(tryLoadMethod).intercept { _ ->
                    log(Log.INFO, TAG, "Tinker 热更新已拦截")
                    false
                }
            } catch (e: Throwable) {
                log(Log.ERROR, TAG, "Tinker Hook 失败 (可能微信未使用Tinker)", e)
            }
        }
    }

    override fun onPackageReady(param: PackageReadyParam) {
        if (param.packageName != WECHAT_PKG) return
        if (!param.isFirstPackage) return

        log(Log.INFO, TAG, "微+ 注入进程: ${getProcessName()} (API $apiVersion)")

        if (isMainProcess) {
            Handler(Looper.getMainLooper()).postDelayed({
                showToast("微+ 已注入 \u2728")
            }, 2000)
            injectEntry(param.classLoader)
        }

        Handler(Looper.getMainLooper()).postDelayed({
            activateFeatures(param.classLoader)
        }, 3000)
    }

    private fun activateFeatures(classLoader: ClassLoader) {
        if (featuresActivated) return
        featuresActivated = true

        val ctx = getAppContext() ?: return
        var count = 0
        for (feature in FEATURES) {
            if (feature.isEnabled(ctx)) {
                try {
                    feature.onEnable(classLoader)
                    log(Log.INFO, TAG, "功能已激活: ${feature.name}")
                    count++
                } catch (e: Throwable) {
                    log(Log.ERROR, TAG, "激活失败: ${feature.name}", e)
                }
            } else {
                log(Log.INFO, TAG, "功能未启用: ${feature.name}")
            }
        }
        log(Log.INFO, TAG, "共激活 $count 个功能")
    }

    // === 入口：FAB 浮动按钮 ===

    private fun injectEntry(classLoader: ClassLoader) {
        try {
            val clz = classLoader.loadClass("com.tencent.mm.ui.LauncherUI")
            log(Log.INFO, TAG, "LauncherUI 类加载成功")

            try {
                val m = clz.getDeclaredMethod("onResume")
                hook(m).intercept { chain ->
                    chain.proceed()
                    val a = chain.thisObject as? Activity ?: return@intercept null
                    Handler(Looper.getMainLooper()).postDelayed({
                        try { if (!fabAdded) { addFab(a); fabAdded = true } } catch (_: Throwable) {}
                    }, 500)
                    null
                }
                log(Log.INFO, TAG, "onResume Hook 成功")
            } catch (e: Throwable) {
                log(Log.ERROR, TAG, "onResume Hook 失败", e)
            }

        } catch (e: Throwable) {
            log(Log.ERROR, TAG, "LauncherUI 类加载失败", e)
        }
    }

    // === 工具方法 ===

    private fun getProcessName(): String {
        return try {
            val c = Class.forName("android.app.ActivityThread")
            val am = c.getDeclaredMethod("currentActivityThread").invoke(null)
            c.getDeclaredMethod("getProcessName").invoke(am) as? String ?: WECHAT_PKG
        } catch (_: Throwable) {
            try {
                java.io.File("/proc/self/cmdline").readText().trimEnd('\u0000')
            } catch (_: Throwable) { WECHAT_PKG }
        }
    }

    private fun getAppContext(): Context? {
        return try {
            val c = Class.forName("android.app.ActivityThread")
            c.getDeclaredMethod("currentApplication").invoke(null) as? Context
        } catch (_: Throwable) { null }
    }

    private fun showToast(msg: String) {
        try {
            Handler(Looper.getMainLooper()).post {
                val app = getAppContext() ?: return@post
                Toast.makeText(app, msg, Toast.LENGTH_SHORT).show()
            }
        } catch (_: Throwable) {}
    }

    private fun openPanel(ctx: Context) {
        try {
            val intent = Intent()
            intent.setClassName("com.muchen.weiplus", "com.muchen.weiplus.ui.MainActivity")
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            ctx.startActivity(intent)
        } catch (e: Throwable) {
            log(Log.ERROR, TAG, "startActivity fail", e)
            Toast.makeText(ctx, "微+ 启动失败", Toast.LENGTH_SHORT).show()
        }
    }

    private fun addFab(activity: Activity) {
        val root = activity.window.decorView
            .findViewById<ViewGroup>(android.R.id.content) ?: return
        if (root.findViewWithTag<TextView>("weiplus_fab") != null) return
        val d = activity.resources.displayMetrics.density
        val btn = TextView(activity).apply {
            tag = "weiplus_fab"
            text = "微+"
            setTextColor(Color.WHITE)
            setBackgroundColor(Color.argb(220, 70, 130, 250))
            textSize = 14f
            gravity = Gravity.CENTER
            setPadding((16 * d).toInt(), (10 * d).toInt(), (16 * d).toInt(), (10 * d).toInt())
            elevation = 8f * d
            setOnClickListener { openPanel(activity) }
        }
        root.addView(btn, FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT,
            Gravity.BOTTOM or Gravity.END
        ).apply {
            bottomMargin = (100 * d).toInt()
            rightMargin = (16 * d).toInt()
        })
        log(Log.INFO, TAG, "FAB 已添加 (右下角)")
    }
}


