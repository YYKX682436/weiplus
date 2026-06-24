package com.muchen.weiplus.features

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
import io.github.libxposed.api.XposedModule
import java.util.Random
import java.util.concurrent.atomic.AtomicInteger

class GameCheatFeature : BaseFeature() {

    companion object { private const val TAG = "DiceCheat" }
    override val key = "game_cheat"
    override val name = "猜拳骰子作弊"

    private lateinit var module: XposedModule
    private val mainHandler = Handler(Looper.getMainLooper())

    private var blockedChain: Any? = null
    private var gameType = 0

    @Volatile private var expectGameRand = false
    private val presetRandVal = AtomicInteger(-1)

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        this.module = module
        hookViewClick()
        hookRandomNextInt()
        module.log(Log.INFO, TAG, "猜拳骰子作弊 V")
    }

    // ==================== View click hook ====================

    private fun hookViewClick() {
        try {
            val m = View::class.java.getDeclaredMethod("performClick")
            module.hook(m).intercept { chain ->
                if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                val v = chain.thisObject as? View ?: return@intercept chain.proceed()
                if (isGameEmojiView(v)) {
                    blockedChain = chain
                    expectGameRand = true
                    presetRandVal.set(-1)
                    mainHandler.post { showGameOverlay(v) }
                    return@intercept false
                }
                chain.proceed()
            }
            module.log(Log.INFO, TAG, "View.click V")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "View.click X: ${e.message}")
        }
    }

    private fun isGameEmojiView(view: View): Boolean {
        try {
            var p: Any? = view.parent
            while (p != null) {
                val cn = p.javaClass.name.lowercase()
                if (cn.contains("emoji") || cn.contains("sticker") || cn.contains("smiley") || cn.contains("expression")) {
                    val combined = collectViewInfo(view)
                    if (combined.contains("dice") || combined.contains("骰")) { gameType = 2; return true }
                    if (combined.contains("jsb") || combined.contains("猜拳") || combined.contains("mora") ||
                        combined.contains("game") || combined.contains("剪刀") || combined.contains("石头") ||
                        combined.contains("拳")) { gameType = 1; return true }
                    break
                }
                p = (p as? ViewGroup)?.parent
            }
        } catch (e: Throwable) {}
        return false
    }

    private fun collectViewInfo(view: View): String {
        val sb = StringBuilder()
        view.contentDescription?.toString()?.let { if (it.isNotEmpty()) sb.append("cd=$it ") }
        view.tag?.toString()?.let { if (it.isNotEmpty()) sb.append("tag=$it ") }
        if (view is ViewGroup) {
            for (i in 0 until view.childCount) {
                val child = view.getChildAt(i) ?: continue
                child.contentDescription?.toString()?.let { if (it.isNotEmpty()) sb.append("c${i}cd=$it ") }
                child.tag?.toString()?.let { if (it.isNotEmpty()) sb.append("c${i}tag=$it ") }
            }
        }
        return sb.toString().trim()
    }

    // ==================== Random.nextInt hook ====================

    private fun hookRandomNextInt() {
        try {
            val m = Random::class.java.getDeclaredMethod("nextInt", java.lang.Integer.TYPE)
            module.hook(m).intercept { chain ->
                val bound = chain.args[0] as Int
                if (expectGameRand && (bound == 3 || bound == 6)) {
                    expectGameRand = false
                    val preset = presetRandVal.getAndSet(-1)
                    if (preset >= 0) {
                        module.log(Log.INFO, TAG, "RAND -> preset=$preset (bound=$bound)")
                        return@intercept preset
                    }
                }
                chain.proceed()
            }
            module.log(Log.INFO, TAG, "Random.nextInt V")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "Random.nextInt X: ${e.message}")
        }
    }

    // ==================== Overlay UI ====================

    private fun showGameOverlay(clickedView: View) {
        try {
            val activity = getActivity(clickedView.context)
            if (activity == null) {
                module.log(Log.WARN, TAG, "OVERLAY FAIL: getActivity null")
                proceedBlocked()
                return
            }

            val root = activity.window.decorView.findViewById<ViewGroup>(android.R.id.content)
            if (root == null || activity.isFinishing) {
                module.log(Log.WARN, TAG, "OVERLAY FAIL: root=$root isFinishing=${activity.isFinishing}")
                proceedBlocked()
                return
            }

            module.log(Log.INFO, TAG, "OVERLAY creating type=$gameType")
            val d = activity.resources.displayMetrics.density

            val overlay = FrameLayout(activity).apply {
                tag = "weiplus_game_cheat"
                setBackgroundColor(Color.argb(120, 0, 0, 0))
                setOnClickListener { root.removeView(this); proceedBlocked() }
            }

            val panel = LinearLayout(activity).apply {
                orientation = LinearLayout.VERTICAL
                background = GradientDrawable().apply {
                    cornerRadius = 16f * d
                    setColor(Color.argb(0xF0, 0x1C, 0x1C, 0x1E))
                }
                setPadding((32 * d).toInt(), (24 * d).toInt(), (32 * d).toInt(), (24 * d).toInt())
                elevation = 20f * d
            }

            val title = if (gameType == 2) "选择骰子点数" else "选择猜拳结果"
            panel.addView(TextView(activity).apply {
                text = title; setTextColor(Color.WHITE); textSize = 17f
                gravity = Gravity.CENTER; setPadding(0, 0, 0, (20 * d).toInt())
            })

            val items = if (gameType == 2)
                listOf("1点", "2点", "3点", "4点", "5点", "6点")
            else
                listOf("石头", "剪刀", "布")

            for ((idx, label) in items.withIndex()) {
                panel.addView(TextView(activity).apply {
                    text = label; setTextColor(Color.WHITE); textSize = 16f
                    setPadding(0, (10 * d).toInt(), 0, (10 * d).toInt())
                    setOnClickListener {
                        presetRandVal.set(idx)
                        root.removeView(overlay)
                        module.log(Log.INFO, TAG, "CHOSE type=$gameType idx=$idx")
                        proceedBlocked()
                    }
                })
            }

            panel.addView(TextView(activity).apply {
                text = "取消"; setTextColor(Color.argb(0xFF, 0x4A, 0x9E, 0xFF)); textSize = 14f
                gravity = Gravity.CENTER; setPadding(0, (16 * d).toInt(), 0, 0)
                setOnClickListener { root.removeView(overlay); proceedBlocked() }
            })

            val panelLp = FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT).apply { gravity = Gravity.CENTER }
            overlay.addView(panel, panelLp)
            root.addView(overlay, FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT))
            module.log(Log.INFO, TAG, "OVERLAY shown")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "OVERLAY X: ${e.message}")
            proceedBlocked()
        }
    }

    private fun proceedBlocked() {
        val chain = blockedChain ?: return
        try {
            // Try getDeclaredMethod first (handles non-public methods + inherited)
            var found: java.lang.reflect.Method? = null
            var c: Class<*>? = chain.javaClass
            while (c != null) {
                try { found = c.getDeclaredMethod("proceed"); found!!.isAccessible = true; break }
                catch (_: Throwable) { c = c.superclass }
            }
            if (found != null) {
                found.invoke(chain)
            } else {
                module.log(Log.WARN, TAG, "PROCEED: proceed() method not found on ${chain.javaClass.name}")
            }
        } catch (e: Throwable) {
            module.log(Log.WARN, TAG, "PROCEED err: ${e.message}")
        }
        blockedChain = null
    }

    private fun getActivity(ctx: Context): Activity? {
        var c: Context? = ctx
        while (c != null) {
            if (c is Activity) return c
            c = if (c is android.content.ContextWrapper) c.baseContext else null
        }
        return null
    }
}
