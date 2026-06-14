package com.muchen.weiplus.ui

import android.animation.ValueAnimator
import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.animation.DecelerateInterpolator
import android.widget.*

/**
 * 微+ 全屏面板 — 微信原生风格 + 折叠菜单
 * 点击分类标题展开/收起二级功能开关
 */
class MainActivity : Activity() {

    private var antiRecall = false
    private var chatEnhance = false
    private var automation = false
    private var timedTask = false
    private var momentEnhance = false
    private var cleaner = false

    private lateinit var prefs: android.content.SharedPreferences

    // 折叠状态
    private var chatExpanded = false
    private var autoExpanded = false
    private var momentExpanded = false
    private var toolExpanded = false

    companion object {
        const val PREF_NAME = "weiplus_prefs"
        const val KEY_ANTI_RECALL = "anti_recall"
        const val KEY_CHAT_ENHANCE = "chat_enhance"
        const val KEY_AUTOMATION = "automation"
        const val KEY_TIMED_TASK = "timed_task"
        const val KEY_MOMENT_ENHANCE = "moment_enhance"
        const val KEY_CLEANER = "cleaner"

        // 微信配色
        val WX_BG = Color.parseColor("#111111")
        val WX_CARD = Color.parseColor("#1A1A1A")
        val WX_GREEN = Color.parseColor("#07C160")
        val WX_TEXT = Color.parseColor("#E0E0E0")
        val WX_SUB = Color.parseColor("#8A8A8A")
        val WX_DIV = Color.parseColor("#2A2A2A")

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
            decorView.setBackgroundColor(Color.argb(0x88, 0x00, 0x00, 0x00))
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

        // 主面板
        val panel = LinearLayout(this)
        panel.orientation = LinearLayout.VERTICAL
        panel.setBackgroundColor(WX_BG)
        panel.setPadding(0, dip(12), 0, dip(12))

        val bg = GradientDrawable()
        bg.cornerRadii = floatArrayOf(dpf(16), dpf(16), dpf(16), dpf(16), 0f, 0f, 0f, 0f)
        panel.background = bg
        panel.elevation = dpf(4)

        // 拖拽条
        val handle = View(this)
        handle.setBackgroundColor(Color.argb(0x30, 0xFF, 0xFF, 0xFF))
        val hl = LinearLayout.LayoutParams(dip(36), dip(4))
        hl.gravity = Gravity.CENTER_HORIZONTAL
        hl.topMargin = dip(6); hl.bottomMargin = dip(14)
        panel.addView(handle, hl)

        // 标题行
        panel.addView(wxTitleRow("微+", "微信增强模块"))

        // 分隔
        panel.addView(wxDivider())

        // 可滚动内容
        val scroll = ScrollView(this)
        val content = LinearLayout(this)
        content.orientation = LinearLayout.VERTICAL

        // 聊天增强分类
        content.addView(categorySection("聊天增强", { chatExpanded }, { chatExpanded = it; refreshPanel() },
            toggleItem("防撤回", "防止好友撤回消息", { antiRecall }, { antiRecall = it }),
            toggleItem("聊天增强", "多选转发、长截图等", { chatEnhance }, { chatEnhance = it })
        ))
        content.addView(wxDivider())

        // 自动化分类
        content.addView(categorySection("自动化", { autoExpanded }, { autoExpanded = it; refreshPanel() },
            toggleItem("自动任务", "定时消息、自动回复", { automation }, { automation = it }),
            toggleItem("定时任务", "定时发送消息、朋友圈", { timedTask }, { timedTask = it })
        ))
        content.addView(wxDivider())

        // 朋友圈分类
        content.addView(categorySection("朋友圈", { momentExpanded }, { momentExpanded = it; refreshPanel() },
            toggleItem("朋友圈增强", "无水印保存、强制显示", { momentEnhance }, { momentEnhance = it })
        ))
        content.addView(wxDivider())

        // 工具分类
        content.addView(categorySection("工具", { toolExpanded }, { toolExpanded = it; refreshPanel() },
            toggleItem("清理工具", "深度清理缓存和文件", { cleaner }, { cleaner = it })
        ))

        // 版本
        content.addView(wxDivider())
        val ver = TextView(this)
        ver.text = "微+ v1.0.0"
        ver.setTextColor(WX_SUB)
        ver.textSize = 12f
        ver.gravity = Gravity.CENTER
        ver.setPadding(0, dip(20), 0, dip(20))
        content.addView(ver)

        scroll.addView(content)
        panel.addView(scroll, LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f))

        val lp = FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        lp.gravity = Gravity.BOTTOM
        root.addView(panel, lp)
        root.setOnClickListener {}
        return root
    }

    // === 微信风格组件 ===

    /** 分类区块：标题行 + 展开内容 */
    private fun categorySection(
        title: String,
        expanded: () -> Boolean,
        onToggle: (Boolean) -> Unit,
        vararg items: View
    ): LinearLayout {
        val section = LinearLayout(this)
        section.orientation = LinearLayout.VERTICAL

        // 标题行（点击展开/收起）
        val header = LinearLayout(this)
        header.orientation = LinearLayout.HORIZONTAL
        header.setPadding(dip(16), dip(14), dip(12), dip(14))
        header.gravity = Gravity.CENTER_VERTICAL
        header.setOnClickListener { onToggle(!expanded()) }

        val tv = TextView(this)
        tv.text = title
        tv.setTextColor(WX_TEXT)
        tv.textSize = 16f
        header.addView(tv, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))

        // 展开/收起箭头
        val arrow = TextView(this)
        arrow.text = expanded().let { if (it) "▾" else "▸" }
        arrow.setTextColor(WX_SUB)
        arrow.textSize = 14f
        header.addView(arrow)
        section.addView(header)

        // 子项容器（动画展开/收起）
        val subContainer = LinearLayout(this)
        subContainer.orientation = LinearLayout.VERTICAL
        subContainer.visibility = if (expanded()) View.VISIBLE else View.GONE
        subContainer.tag = "sub_$title"
        items.forEachIndexed { i, item ->
            if (i > 0) subContainer.addView(wxSubDivider())
            subContainer.addView(item)
        }
        section.addView(subContainer)
        section.tag = "section_$title"

        return section
    }

    /** 开关行 */
    private fun toggleItem(
        title: String, subtitle: String,
        getter: () -> Boolean, setter: (Boolean) -> Unit
    ): LinearLayout {
        val row = LinearLayout(this)
        row.orientation = LinearLayout.HORIZONTAL
        row.setPadding(dip(28), dip(12), dip(12), dip(12))
        row.gravity = Gravity.CENTER_VERTICAL

        val col = LinearLayout(this)
        col.orientation = LinearLayout.VERTICAL
        col.setPadding(0, 0, dip(12), 0)
        row.addView(col, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))

        val tv = TextView(this)
        tv.text = title; tv.setTextColor(WX_TEXT); tv.textSize = 15f
        col.addView(tv)

        val ts = TextView(this)
        ts.text = subtitle; ts.setTextColor(WX_SUB); ts.textSize = 12f
        col.addView(ts)

        val sw = IosSwitch(this)
        sw.setChecked(getter(), false)
        row.addView(sw)

        row.setOnClickListener {
            val nv = !sw.isChecked
            sw.setChecked(nv, true)
            setter(nv)
        }
        sw.onToggle = setter
        return row
    }

    /** 标题行 */
    private fun wxTitleRow(title: String, subtitle: String): LinearLayout {
        val row = LinearLayout(this)
        row.orientation = LinearLayout.HORIZONTAL
        row.setPadding(dip(16), dip(12), dip(16), dip(6))
        row.gravity = Gravity.CENTER_VERTICAL
        val tv = TextView(this)
        tv.text = title; tv.setTextColor(WX_TEXT); tv.textSize = 22f
        row.addView(tv, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))
        val st = TextView(this)
        st.text = subtitle; st.setTextColor(WX_SUB); st.textSize = 12f
        row.addView(st)
        return row
    }

    private fun wxDivider(): View {
        val v = View(this)
        v.setBackgroundColor(WX_DIV)
        v.layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, dip(1))
        return v
    }

    private fun wxSubDivider(): View {
        val v = View(this)
        v.setBackgroundColor(Color.argb(0x0F, 0xFF, 0xFF, 0xFF))
        val lp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, dip(1))
        lp.setMargins(dip(28), 0, dip(16), 0)
        v.layoutParams = lp
        return v
    }

    /** 刷新面板（折叠状态改变时） */
    private fun refreshPanel() {
        val root = findViewById<FrameLayout>(android.R.id.content)
            ?: return
        // 找到主面板重新设置内容
        val panel = (root.getChildAt(0) as? ViewGroup) ?: return
        panel.removeAllViews()
        setContentView(buildUI())
    }

    private fun dip(v: Int): Int = (v * resources.displayMetrics.density + 0.5f).toInt()
    private fun dpf(v: Int): Float = v * resources.displayMetrics.density
}
