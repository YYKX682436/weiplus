package com.muchen.weiplus.entry

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import com.muchen.weiplus.features.*
import io.github.libxposed.api.XposedModule
import io.github.libxposed.api.XposedModuleInterface.PackageReadyParam

class ModuleEntry : XposedModule() {

    companion object {
        private const val TAG = "WeiPlus"
        private const val MENU_ID = 0x7701

        val FEATURES: List<BaseFeature> = listOf(
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

    // === 入口 Hook ===

    private fun injectEntry(classLoader: ClassLoader) {
        try {
            val clz = classLoader.loadClass("com.tencent.mm.ui.LauncherUI")

            // 右上角菜单 — after hook (onCreateOptionsMenu返回boolean，不能返回null)
            try {
                val m = clz.getDeclaredMethod("onCreateOptionsMenu", Menu::class.java)
                hook(m).intercept { chain ->
                    val result = chain.proceed() ?: false
                    val menu = chain.args[0] as? Menu
                    if (menu != null && menu.findItem(MENU_ID) == null) {
                        menu.add(0, MENU_ID, 0, "微+")
                            .setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS)
                    }
                    result
                }
            } catch (_: Throwable) {}

            // 菜单点击 → 打开面板 — before hook
            try {
                val m = clz.getDeclaredMethod("onOptionsItemSelected", MenuItem::class.java)
                hook(m).intercept { chain ->
                    val item = chain.args[0] as? MenuItem
                    if (item?.itemId == MENU_ID) {
                        (chain.thisObject as? Activity)?.let { openPanel(it) }
                        return@intercept true
                    }
                    chain.proceed()
                }
            } catch (_: Throwable) {}

            // 浮动按钮 — after hook (只加一次)
            try {
                val m = clz.getDeclaredMethod("onResume")
                hook(m).intercept { chain ->
                    chain.proceed()
                    if (!fabAdded) {
                        val a = chain.thisObject as? Activity ?: return@intercept null
                        Handler(Looper.getMainLooper()).postDelayed({
                            try { addFab(a); fabAdded = true } catch (_: Throwable) {}
                        }, 1500)
                    }
                    null
                }
            } catch (_: Throwable) {}

        } catch (_: Throwable) {}
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
