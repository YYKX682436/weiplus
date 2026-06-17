package com.muchen.weiplus.entry

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.Gravity
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.muchen.weiplus.features.*
import io.github.libxposed.api.XposedModule
import io.github.libxposed.api.XposedModuleInterface.PackageLoadedParam
import io.github.libxposed.api.XposedModuleInterface.PackageReadyParam

class ModuleEntry : XposedModule() {

    companion object {
        private const val TAG = "WeiPlus"
        
        val FEATURES: List<BaseFeature> = listOf(
            DisableHotUpdateFeature(),
            AntiRecallFeature(),
            ChatEnhanceFeature(),
            AutomationFeature(),
            TimedTaskFeature(),
            MomentEnhanceFeature(),
            CleanerFeature()
        )
    }

    private var fabAdded = false
    private var featuresActivated = false

    // === 阶段1: 包加载时 — 最早时机，拦截 Tinker 热更新 ===
    override fun onPackageLoaded(param: PackageLoadedParam) {
        if (param.packageName != "com.tencent.mm") return
        if (!param.isFirstPackage) return

        // 无条件拦截 Tinker 热更新（最早时机），防止补丁改变类结构
        try {
            val tinkerLoader = param.defaultClassLoader
                .loadClass("com.tencent.tinker.loader.TinkerLoader")
            val tryLoadMethod = tinkerLoader.getDeclaredMethod(
                "tryLoad",
                Class.forName("com.tencent.tinker.loader.app.TinkerApplication")
            )
            hook(tryLoadMethod).intercept { _ ->
                log(Log.INFO, TAG, "Tinker 热更新已拦截 — 补丁不会加载")
                false
            }
        } catch (e: Throwable) {
            log(Log.ERROR, TAG, "Tinker Hook 失败", e)
        }
    }

    // === 阶段2: 包就绪时 — 主入口 Hook ===
    override fun onPackageReady(param: PackageReadyParam) {
        if (param.packageName != "com.tencent.mm") return
        if (!param.isFirstPackage) return

        log(Log.INFO, TAG, "微+ 注入微信主进程... (API $apiVersion)")

        Handler(Looper.getMainLooper()).postDelayed({
            showToast("微+ 已注入 \u2728")
        }, 2000)

        injectEntry(param.classLoader)

        Handler(Looper.getMainLooper()).postDelayed({
            activateFeatures(param.classLoader)
        }, 3000)
    }

    // === 功能激活 ===

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

    // === 入口注入: 往底部 cgi 布局加入「微+」入口 ===

    private fun injectEntry(classLoader: ClassLoader) {
        try {
            var cgiId = -1
            // 反射获取 R.id.cgi 的资源 ID
            try {
                val rId = classLoader.loadClass("com.tencent.mm.R\$id")
                cgiId = rId.getDeclaredField("cgi").getInt(null)
            } catch (e: Throwable) {
                log(Log.ERROR, TAG, "获取 R.id.cgi 失败", e)
            }

            val clz = classLoader.loadClass("com.tencent.mm.ui.LauncherUI")
            log(Log.INFO, TAG, "LauncherUI 类加载成功, cgi=$cgiId")

            // 在 onResume 中向 cgi 布局注入入口
            try {
                val m = clz.getDeclaredMethod("onResume")
                hook(m).intercept { chain ->
                    chain.proceed()
                    val a = chain.thisObject as? Activity ?: return@intercept null
                    Handler(Looper.getMainLooper()).postDelayed({
                        try {
                            injectCgiEntry(a, cgiId)
                            if (!fabAdded) {
                                addFab(a)
                                fabAdded = true
                            }
                        } catch (_: Throwable) {}
                    }, 1500)
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

    /** 往 cgi 布局注入「微+」入口 */
    private fun injectCgiEntry(activity: Activity, cgiId: Int) {
        if (cgiId <= 0) return
        val root = activity.window.decorView
            .findViewById<android.view.ViewGroup>(android.R.id.content) ?: return
        val cgiLayout = root.findViewById<LinearLayout>(cgiId) ?: return
        if (cgiLayout.findViewWithTag<TextView>("weiplus_cgi") != null) return

        val d = activity.resources.displayMetrics.density
        val entry = TextView(activity).apply {
            tag = "weiplus_cgi"
            text = "微+"
            setTextColor(Color.WHITE)
            setBackgroundColor(Color.argb(200, 80, 140, 230))
            textSize = 13f
            gravity = Gravity.CENTER
            setPadding((14 * d).toInt(), (8 * d).toInt(), (14 * d).toInt(), (8 * d).toInt())
            setOnClickListener { openPanel(activity) }
        }
        // 靠右添加
        cgiLayout.addView(entry, LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT,
            0f
        ).apply {
            gravity = Gravity.CENTER_VERTICAL or Gravity.END
            rightMargin = (12 * d).toInt()
        })
        log(Log.INFO, TAG, "cgi 入口注入成功")
    }

    // === 工具方法 ===

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
            .findViewById<android.view.ViewGroup>(android.R.id.content) ?: return
        if (root.findViewWithTag<TextView>("weiplus_fab") != null) return
        val d = activity.resources.displayMetrics.density
        val btn = TextView(activity).apply {
            tag = "weiplus_fab"
            text = "微+"
            setTextColor(Color.WHITE)
            setBackgroundColor(Color.argb(200, 80, 140, 230))
            textSize = 13f; gravity = Gravity.CENTER
            setPadding((14 * d).toInt(), (8 * d).toInt(), (14 * d).toInt(), (8 * d).toInt())
            setOnClickListener { openPanel(activity) }
        }
        root.addView(btn, FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT,
            Gravity.BOTTOM or Gravity.END
        ).apply {
            bottomMargin = (80 * d).toInt()
            rightMargin = (12 * d).toInt()
        })
    }
}
