package com.muchen.weiplus.entry

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.muchen.weiplus.features.AntiRecallFeature
import com.muchen.weiplus.features.FeatureConfig
import com.muchen.weiplus.features.ShowDetailTimeFeature
import com.muchen.weiplus.features.SwipeQuoteFeature
import com.muchen.weiplus.ui.IosSwitch
import io.github.libxposed.api.XposedModule
import io.github.libxposed.api.XposedModuleInterface.PackageLoadedParam
import io.github.libxposed.api.XposedModuleInterface.PackageReadyParam

class ModuleEntry : XposedModule() {

    companion object {
        private const val TAG = "WeiPlus"
        private const val WECHAT_PKG = "com.tencent.mm"
    }

    private var isMainProcess = false

    override fun onPackageLoaded(param: PackageLoadedParam) {
        if (param.packageName != WECHAT_PKG) return

        val pn = getProcessName()
        log(Log.INFO, TAG, "onPackageLoaded: $pn isFirstPkg=${param.isFirstPackage}")
        isMainProcess = (pn == WECHAT_PKG)

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
                log(Log.ERROR, TAG, "Tinker Hook 失败", e)
            }
        }
    }

    override fun onPackageReady(param: PackageReadyParam) {
        if (param.packageName != WECHAT_PKG) return

        val pn = getProcessName()
        log(Log.INFO, TAG, "onPackageReady: $pn isFirstPkg=${param.isFirstPackage}")
        log(Log.INFO, TAG, "WeiPlus 已注入进程: $pn (API $apiVersion)")

        if (isMainProcess) {
            FeatureConfig.load()
            Handler(Looper.getMainLooper()).postDelayed({
                showToast("WeiPlus 已注入")
            }, 2000)
            injectEntry(param.classLoader)
            registerFeatures(param.classLoader)
        }
    }

    private fun registerFeatures(classLoader: ClassLoader) {
        try { AntiRecallFeature().onEnable(this, classLoader); log(Log.INFO, TAG, "AntiRecallFeature OK") }
        catch (e: Throwable) { log(Log.ERROR, TAG, "AntiRecallFeature fail", e) }

        try { SwipeQuoteFeature().onEnable(this, classLoader); log(Log.INFO, TAG, "SwipeQuoteFeature OK") }
        catch (e: Throwable) { log(Log.ERROR, TAG, "SwipeQuoteFeature fail", e) }

        try { ShowDetailTimeFeature().onEnable(this, classLoader); log(Log.INFO, TAG, "ShowDetailTimeFeature OK") }
        catch (e: Throwable) { log(Log.ERROR, TAG, "ShowDetailTimeFeature fail", e) }

    }

    private fun injectEntry(classLoader: ClassLoader) {
        try {
            val clz = classLoader.loadClass("com.tencent.mm.ui.LauncherUI")
            val m = clz.getDeclaredMethod("onResume")
            hook(m).intercept { chain ->
                chain.proceed()
                val a = chain.thisObject as? Activity ?: return@intercept null
                Handler(Looper.getMainLooper()).postDelayed({
                    try { addFabIfNeeded(a) } catch (_: Throwable) {}
                }, 500)
                null
            }
            log(Log.INFO, TAG, "LauncherUI.onResume Hook OK")
        } catch (e: Throwable) {
            log(Log.ERROR, TAG, "LauncherUI Hook fail", e)
        }
    }

    // === FAB ===

    private fun addFabIfNeeded(activity: Activity) {
        val root = activity.window.decorView
            .findViewById<ViewGroup>(android.R.id.content) ?: return
        if (root.findViewWithTag<TextView>("weiplus_fab") != null) return
        val d = activity.resources.displayMetrics.density
        val btn = TextView(activity).apply {
            tag = "weiplus_fab"
            text = "WeiPlus"
            setTextColor(Color.WHITE)
            setBackgroundColor(Color.argb(220, 70, 130, 250))
            textSize = 14f
            gravity = Gravity.CENTER
            setPadding((16 * d).toInt(), (10 * d).toInt(), (16 * d).toInt(), (10 * d).toInt())
            elevation = 8f * d
            setOnClickListener { showPanel(activity) }
        }
        root.addView(btn, FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT,
            Gravity.BOTTOM or Gravity.END
        ).apply {
            bottomMargin = (100 * d).toInt()
            rightMargin = (16 * d).toInt()
        })
    }

    // === 嵌入面板 ===

    private fun showPanel(activity: Activity) {
        val root = activity.window.decorView
            .findViewById<ViewGroup>(android.R.id.content) ?: return

        val existing = root.findViewWithTag<View>("weiplus_panel")
        if (existing != null) {
            root.removeView(existing)
            return
        }

        val d = activity.resources.displayMetrics.density

        val container = FrameLayout(activity).apply {
            tag = "weiplus_panel"
            setBackgroundColor(Color.argb(100, 0, 0, 0))
            setOnClickListener { root.removeView(this) }
        }

        val panel = LinearLayout(activity).apply {
            orientation = LinearLayout.VERTICAL
            background = GradientDrawable().apply {
                cornerRadius = 16f * d
                setColor(Color.argb(0xF8, 0x1C, 0x1C, 0x1E))
            }
            setPadding((20 * d).toInt(), (8 * d).toInt(), (20 * d).toInt(), (16 * d).toInt())
            elevation = 16f * d
        }

        panel.addView(TextView(activity).apply {
            text = "WeiPlus"
            setTextColor(Color.WHITE)
            textSize = 18f
            setPadding(0, (12 * d).toInt(), 0, (16 * d).toInt())
        })

        panel.addView(switchRow(activity, d, "禁止消息撤回", "阻止好友撤回已发消息",
            FeatureConfig.antiRecall
        ) { FeatureConfig.antiRecall = it; FeatureConfig.save() })

        panel.addView(switchRow(activity, d, "左滑引用消息", "左滑消息快速引用回复",
            FeatureConfig.swipeQuote
        ) { FeatureConfig.swipeQuote = it; FeatureConfig.save() })

        panel.addView(switchRow(activity, d, "显示详细时间", "头像下方显示消息时间",
            FeatureConfig.showDetailTime
        ) { FeatureConfig.showDetailTime = it; FeatureConfig.save() })


        panel.addView(TextView(activity).apply {
            text = "关闭"
            setTextColor(Color.argb(0xFF, 0x4A, 0x9E, 0xFF))
            textSize = 14f
            gravity = Gravity.CENTER
            setPadding(0, (16 * d).toInt(), 0, (4 * d).toInt())
            setOnClickListener { root.removeView(container) }
        })

        val panelLp = FrameLayout.LayoutParams(
            (300 * d).toInt(), FrameLayout.LayoutParams.WRAP_CONTENT
        ).apply { gravity = Gravity.CENTER }
        container.addView(panel, panelLp)
        root.addView(container, FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT
        ))
    }

    private fun switchRow(ctx: Context, d: Float, title: String, subtitle: String, initial: Boolean,
                          onToggle: (Boolean) -> Unit): LinearLayout {
        val row = LinearLayout(ctx).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            setPadding(0, (10 * d).toInt(), 0, (10 * d).toInt())
        }
        val col = LinearLayout(ctx).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(0, 0, (8 * d).toInt(), 0)
        }
        row.addView(col, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))
        col.addView(TextView(ctx).apply {
            text = title; setTextColor(Color.argb(0xFF, 0xFF, 0xFF, 0xFF)); textSize = 15f
        })
        col.addView(TextView(ctx).apply {
            text = subtitle; setTextColor(Color.argb(0xFF, 0x8E, 0x8E, 0x93)); textSize = 12f
        })
        val sw = IosSwitch(ctx, 1.0f)
        sw.setChecked(initial, false)
        row.addView(sw)
        row.setOnClickListener { val nv = !sw.isChecked; sw.setChecked(nv, true); onToggle(nv) }
        sw.onToggle = { onToggle(it) }
        return row
    }

    // === 工具 ===

    private fun getProcessName(): String {
        return try {
            val c = Class.forName("android.app.ActivityThread")
            val am = c.getDeclaredMethod("currentActivityThread").invoke(null)
            c.getDeclaredMethod("getProcessName").invoke(am) as? String ?: WECHAT_PKG
        } catch (_: Throwable) {
            try { java.io.File("/proc/self/cmdline").readText().trimEnd('\u0000') }
            catch (_: Throwable) { WECHAT_PKG }
        }
    }

    private fun getAppContext(): Context? {
        return try {
            val c = Class.forName("android.app.ActivityThread")
            c.getDeclaredMethod("currentApplication").invoke(null) as? Context
        } catch (_: Throwable) { null }
    }

    private fun showToast(msg: String) {
        try { Handler(Looper.getMainLooper()).post { getAppContext()?.let { Toast.makeText(it, msg, Toast.LENGTH_SHORT).show() } } }
        catch (_: Throwable) {}
    }
}