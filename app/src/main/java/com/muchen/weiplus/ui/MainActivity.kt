package com.muchen.weiplus.ui

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.*

/**
 * 微+ 面板 — 白色液态玻璃覆盖层 + 卡片式菜单 + 大开关
 */
class MainActivity : Activity() {

    private var antiRecall = false
    private var chatEnhance = false
    private var automation = false
    private var timedTask = false
    private var momentEnhance = false
    private var cleaner = false

    private lateinit var prefs: android.content.SharedPreferences

    companion object {
        const val PREF_NAME = "weiplus_prefs"
        const val KEY_ANTI_RECALL = "anti_recall"
        const val KEY_CHAT_ENHANCE = "chat_enhance"
        const val KEY_AUTOMATION = "automation"
        const val KEY_TIMED_TASK = "timed_task"
        const val KEY_MOMENT_ENHANCE = "moment_enhance"
        const val KEY_CLEANER = "cleaner"

        fun isFeatureEnabled(ctx: Context, key: String): Boolean {
            return ctx.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
                .getBoolean(key, false)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        prefs = getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        loadPrefs()

        window?.apply {
            setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
            decorView.setBackgroundColor(Color.argb(0x55, 0x00, 0x00, 0x00))
            decorView.setOnClickListener { v -> if (v == decorView) finish() }
        }

        setContentView(buildUI())
    }

    override fun onPause() { super.onPause(); savePrefs() }

    private fun loadPrefs() {
        antiRecall = prefs.getBoolean(KEY_ANTI_RECALL, false)
        chatEnhance = prefs.getBoolean(KEY_CHAT_ENHANCE, false)
        automation = prefs.getBoolean(KEY_AUTOMATION, false)
        timedTask = prefs.getBoolean(KEY_TIMED_TASK, false)
        momentEnhance = prefs.getBoolean(KEY_MOMENT_ENHANCE, false)
        cleaner = prefs.getBoolean(KEY_CLEANER, false)
    }

    private fun savePrefs() {
        prefs.edit()
            .putBoolean(KEY_ANTI_RECALL, antiRecall)
            .putBoolean(KEY_CHAT_ENHANCE, chatEnhance)
            .putBoolean(KEY_AUTOMATION, automation)
            .putBoolean(KEY_TIMED_TASK, timedTask)
            .putBoolean(KEY_MOMENT_ENHANCE, momentEnhance)
            .putBoolean(KEY_CLEANER, cleaner)
            .apply()
    }

    private fun buildUI(): FrameLayout {
        val root = FrameLayout(this)
        root.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)

        // 白色液态玻璃面板
        val panel = LinearLayout(this)
        panel.orientation = LinearLayout.VERTICAL
        panel.setPadding(0, 0, 0, dip(36))

        val bg = GradientDrawable()
        bg.cornerRadii = floatArrayOf(dpf(20), dpf(20), dpf(20), dpf(20), 0f, 0f, 0f, 0f)
        bg.setColor(Color.argb(0xF2, 0xF2, 0xF2, 0xF7))
        panel.background = bg
        panel.elevation = dpf(6)

        // 拖拽条
        val handle = View(this)
        handle.setBackgroundColor(Color.argb(0x30, 0x00, 0x00, 0x00))
        val hl = LinearLayout.LayoutParams(dip(36), dip(4))
        hl.gravity = Gravity.CENTER_HORIZONTAL
        hl.topMargin = dip(10); hl.bottomMargin = dip(10)
        panel.addView(handle, hl)

        // 标题
        panel.addView(titleBar())
        panel.addView(space(8))

        // 滚动
        val scroll = ScrollView(this)
        val content = LinearLayout(this)
        content.orientation = LinearLayout.VERTICAL
        content.setPadding(0, 0, 0, dip(8))

        // 功能卡片（每张卡片一个分类 + 大开关）
        content.addView(featureCard("💬", "聊天增强", "防撤回 · 多选转发 · 长截图", { antiRecall || chatEnhance }) {
            addView(bigToggle("防撤回", "阻止好友撤回消息", { antiRecall }, { antiRecall = it }))
            addView(thinDivider())
            addView(bigToggle("聊天增强", "多选转发、长截图", { chatEnhance }, { chatEnhance = it }))
        })

        content.addView(featureCard("⚡", "自动化", "定时消息 · 自动回复 · 定时朋友圈", { automation || timedTask }) {
            addView(bigToggle("自动任务", "定时消息、自动回复", { automation }, { automation = it }))
            addView(thinDivider())
            addView(bigToggle("定时任务", "定时发送消息、朋友圈", { timedTask }, { timedTask = it }))
        })

        content.addView(featureCard("🌟", "朋友圈", "无水印保存 · 强制显示", { momentEnhance }) {
            addView(bigToggle("朋友圈增强", "无水印保存、强制显示", { momentEnhance }, { momentEnhance = it }))
        })

        content.addView(featureCard("🔧", "工具", "深度清理 · 空间释放", { cleaner }) {
            addView(bigToggle("清理工具", "深度清理缓存和文件", { cleaner }, { cleaner = it }))
        })

        // 版本
        val ver = TextView(this)
        ver.text = "微+ v1.0.0"
        ver.setTextColor(Color.argb(0xFF, 0xA0, 0xA0, 0xB0))
        ver.textSize = 12f
        ver.gravity = Gravity.CENTER
        ver.setPadding(0, dip(24), 0, dip(12))
        content.addView(ver)

        scroll.addView(content)
        panel.addView(scroll, LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f))

        val lp = FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        lp.gravity = Gravity.BOTTOM
        root.addView(panel, lp)
        root.setOnClickListener {}
        return root
    }

    // === 构建组件 ===

    /** 标题栏 */
    private fun titleBar(): LinearLayout {
        val row = LinearLayout(this)
        row.orientation = LinearLayout.HORIZONTAL
        row.setPadding(dip(20), dip(8), dip(20), dip(2))
        row.gravity = Gravity.CENTER_VERTICAL
        val tv = TextView(this)
        tv.text = "微+"
        tv.setTextColor(Color.argb(0xFF, 0x1C, 0x1C, 0x1E))
        tv.textSize = 26f
        row.addView(tv, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))

        val badge = TextView(this)
        badge.text = "微信增强"
        badge.setTextColor(Color.argb(0xFF, 0x8E, 0x8E, 0x93))
        badge.textSize = 12f
        badge.setPadding(dip(10), dip(3), dip(10), dip(4))
        badge.background = GradientDrawable().apply {
            cornerRadius = dpf(10)
            setColor(Color.argb(0x20, 0x00, 0x00, 0x00))
        }
        row.addView(badge)
        return row
    }

    /** 功能卡片 */
    private fun featureCard(
        emoji: String, title: String, subtitle: String,
        hasActive: () -> Boolean,
        content: LinearLayout.() -> Unit
    ): LinearLayout {
        val card = LinearLayout(this)
        card.orientation = LinearLayout.VERTICAL
        val m = dip(14)
        val lp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        lp.setMargins(m, dip(6), m, dip(6))
        card.layoutParams = lp

        val cardBg = GradientDrawable()
        cardBg.cornerRadius = dpf(14)
        cardBg.setColor(Color.argb(0xEE, 0xFF, 0xFF, 0xFF))
        cardBg.setStroke(dip(1), Color.argb(0x12, 0x00, 0x00, 0x00))
        card.background = cardBg
        card.elevation = dpf(1)

        // 卡片头部
        val header = LinearLayout(this)
        header.orientation = LinearLayout.HORIZONTAL
        header.setPadding(dip(16), dip(12), dip(16), dip(8))
        header.gravity = Gravity.CENTER_VERTICAL

        val icon = TextView(this)
        icon.text = emoji
        icon.textSize = 20f
        icon.setPadding(0, 0, dip(10), 0)
        header.addView(icon)

        val col = LinearLayout(this)
        col.orientation = LinearLayout.VERTICAL
        header.addView(col, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))

        val tv = TextView(this)
        tv.text = title
        tv.setTextColor(Color.argb(0xFF, 0x1C, 0x1C, 0x1E))
        tv.textSize = 15f
        col.addView(tv)

        val ts = TextView(this)
        ts.text = subtitle
        ts.setTextColor(Color.argb(0xFF, 0x99, 0x99, 0xA0))
        ts.textSize = 11f
        col.addView(ts)

        // 状态点
        val dot = View(this)
        val dotSize = dip(8)
        val dotLp = LinearLayout.LayoutParams(dotSize, dotSize)
        dot.background = GradientDrawable().apply {
            shape = GradientDrawable.OVAL
            setColor(if (hasActive()) Color.argb(0xFF, 0x34, 0xC7, 0x59) else Color.argb(0xFF, 0xD1, 0xD1, 0xD6))
        }
        header.addView(dot, dotLp)

        card.addView(header)
        card.addView(cardDivider())
        card.content()
        return card
    }

    /** 大号开关行 */
    private fun bigToggle(
        title: String, subtitle: String,
        getter: () -> Boolean, setter: (Boolean) -> Unit
    ): LinearLayout {
        val row = LinearLayout(this)
        row.orientation = LinearLayout.HORIZONTAL
        row.setPadding(dip(16), dip(14), dip(12), dip(14))
        row.gravity = Gravity.CENTER_VERTICAL

        val col = LinearLayout(this)
        col.orientation = LinearLayout.VERTICAL
        row.addView(col, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))

        val tv = TextView(this)
        tv.text = title
        tv.setTextColor(Color.argb(0xFF, 0x1C, 0x1C, 0x1E))
        tv.textSize = 17f
        col.addView(tv)

        val ts = TextView(this)
        ts.text = subtitle
        ts.setTextColor(Color.argb(0xFF, 0x8E, 0x8E, 0x93))
        ts.textSize = 13f
        col.addView(ts)

        // 放大版开关 (1.3x)
        val sw = IosSwitch(this)
        sw.setChecked(getter(), false)
        sw.setScaleX(1.3f)
        sw.setScaleY(1.3f)
        row.addView(sw, LinearLayout.LayoutParams(
            (dip(30) * 1.3f).toInt(), (dip(18) * 1.3f).toInt()
        ))

        row.setOnClickListener {
            val nv = !sw.isChecked
            sw.setChecked(nv, true)
            setter(nv)
        }
        sw.onToggle = setter
        return row
    }

    private fun cardDivider(): View {
        val v = View(this)
        v.setBackgroundColor(Color.argb(0x0C, 0x00, 0x00, 0x00))
        v.layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, dip(1))
        return v
    }

    private fun thinDivider(): View {
        val v = View(this)
        v.setBackgroundColor(Color.argb(0x08, 0x00, 0x00, 0x00))
        val lp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, dip(1))
        lp.setMargins(dip(16), 0, dip(16), 0)
        v.layoutParams = lp
        return v
    }

    private fun space(h: Int): View {
        val v = View(this)
        v.layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, dip(h))
        return v
    }

    private fun dip(v: Int): Int = (v * resources.displayMetrics.density + 0.5f).toInt()
    private fun dpf(v: Int): Float = v * resources.displayMetrics.density
}
