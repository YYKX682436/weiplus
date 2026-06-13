package com.muchen.weiplus.ui

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.*


class MainActivity : android.app.Activity() {

    private var antiRecall = false
    private var chatEnhance = false
    private var automation = false
    private var timedTask = false
    private var momentEnhance = false
    private var cleaner = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 全屏 + 点击外部关闭
        window?.apply {
            setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
            decorView.setBackgroundColor(Color.argb(0x66, 0x00, 0x00, 0x00))
            decorView.setOnClickListener {
                if (it == decorView) finish()
            }
        }

        setContentView(buildUI())
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    private fun buildUI(): FrameLayout {
        val root = FrameLayout(this)
        root.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )

        // 主面板 (白色液态玻璃, 从底部弹出)
        val panel = LinearLayout(this)
        panel.orientation = LinearLayout.VERTICAL
        panel.setPadding(0, 0, 0, dip(40))

        val bg = GradientDrawable()
        bg.cornerRadii = floatArrayOf(dpf(24), dpf(24), dpf(24), dpf(24), 0f, 0f, 0f, 0f)
        bg.setColor(Color.argb(0xF5, 0xF8, 0xF8, 0xFA))
        panel.background = bg
        panel.elevation = dpf(8)

        // 拖拽条
        val handle = View(this)
        handle.setBackgroundColor(Color.argb(0x30, 0x00, 0x00, 0x00))
        val hl = LinearLayout.LayoutParams(dip(36), dip(5))
        hl.gravity = Gravity.CENTER_HORIZONTAL
        hl.topMargin = dip(12); hl.bottomMargin = dip(8)
        panel.addView(handle, hl)

        // 标题行
        panel.addView(titleRow("微+", "微信增强"))
        panel.addView(space(14))

        // 滚动内容
        val scroll = ScrollView(this)
        val content = LinearLayout(this)
        content.orientation = LinearLayout.VERTICAL

        content.addView(categoryHeader("聊天增强"))
        content.addView(buildCard(
            toggleRow("防撤回", "防止好友撤回消息", { antiRecall }, { antiRecall = it }),
            toggleRow("聊天增强", "多选转发、长截图", { chatEnhance }, { chatEnhance = it })
        ))
        content.addView(space(14))

        content.addView(categoryHeader("自动化"))
        content.addView(buildCard(
            toggleRow("自动任务", "定时消息、自动回复", { automation }, { automation = it }),
            toggleRow("定时任务", "定时发送消息、朋友圈", { timedTask }, { timedTask = it })
        ))
        content.addView(space(14))

        content.addView(categoryHeader("朋友圈"))
        content.addView(buildCard(
            toggleRow("朋友圈增强", "无水印保存、强制显示", { momentEnhance }, { momentEnhance = it })
        ))
        content.addView(space(14))

        content.addView(categoryHeader("工具"))
        content.addView(buildCard(
            toggleRow("清理工具", "深度清理缓存和文件", { cleaner }, { cleaner = it })
        ))
        content.addView(space(20))

        val ver = TextView(this)
        ver.text = "微+ v1.0.0 · 微信 8.0.74"
        ver.setTextColor(Color.argb(0xFF, 0xA0, 0xA0, 0xB0))
        ver.textSize = 12f
        ver.gravity = Gravity.CENTER
        ver.setPadding(0, dip(16), 0, dip(32))
        content.addView(ver)

        scroll.addView(content)
        panel.addView(scroll, LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f
        ))

        // 底部关闭按钮
        val closeBtn = TextView(this)
        closeBtn.text = "关闭"
        closeBtn.setTextColor(Color.argb(0xFF, 0x00, 0x7A, 0xFF))
        closeBtn.textSize = 15f
        closeBtn.gravity = Gravity.CENTER
        closeBtn.setPadding(0, dip(12), 0, dip(8))
        closeBtn.setOnClickListener { finish() }
        panel.addView(closeBtn, LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT
        ))

        val panelLp = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT
        )
        panelLp.gravity = Gravity.BOTTOM
        root.addView(panel, panelLp)
        root.setOnClickListener {} // 阻止点击穿透

        return root
    }

    // === 构建组件 (与WeiPlusPanel相同) ===

    private fun buildCard(vararg rows: View): LinearLayout {
        val card = LinearLayout(this)
        card.orientation = LinearLayout.VERTICAL
        card.setPadding(dip(2), dip(2), dip(2), dip(2))
        val m = dip(16)
        (card.layoutParams as? LinearLayout.LayoutParams)?.setMargins(m, 0, m, 0)
        val cardBg = GradientDrawable()
        cardBg.cornerRadius = dpf(16)
        cardBg.setColor(Color.argb(0xAA, 0xFF, 0xFF, 0xFF))
        cardBg.setStroke(dip(1), Color.argb(0x18, 0x00, 0x00, 0x00))
        card.background = cardBg
        card.elevation = dpf(1)
        rows.forEachIndexed { i, row ->
            if (i > 0) card.addView(divider())
            card.addView(row)
        }
        return card
    }

    private fun titleRow(title: String, subtitle: String): LinearLayout {
        val row = LinearLayout(this)
        row.orientation = LinearLayout.HORIZONTAL
        row.setPadding(dip(24), dip(10), dip(24), dip(6))
        val tv = TextView(this)
        tv.text = title; tv.setTextColor(Color.argb(0xFF, 0x1C, 0x1C, 0x1E))
        tv.textSize = 28f
        row.addView(tv, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))
        val st = TextView(this)
        st.text = subtitle; st.setTextColor(Color.argb(0xFF, 0x8E, 0x8E, 0x93))
        st.textSize = 13f; st.gravity = Gravity.CENTER_VERTICAL
        row.addView(st)
        return row
    }

    private fun categoryHeader(title: String): TextView {
        val tv = TextView(this)
        tv.text = title.uppercase()
        tv.setTextColor(Color.argb(0xFF, 0x8E, 0x8E, 0x93))
        tv.textSize = 11f
        tv.setPadding(dip(20), dip(6), dip(20), dip(6))
        return tv
    }

    private fun divider(): View {
        val v = View(this)
        v.setBackgroundColor(Color.argb(0x0C, 0x00, 0x00, 0x00))
        val lp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, dip(1))
        lp.setMargins(dip(16), 0, dip(16), 0)
        v.layoutParams = lp
        return v
    }

    private fun toggleRow(title: String, subtitle: String, getter: () -> Boolean, setter: (Boolean) -> Unit): LinearLayout {
        val row = LinearLayout(this)
        row.orientation = LinearLayout.HORIZONTAL
        row.setPadding(dip(16), dip(12), dip(12), dip(12))
        row.gravity = Gravity.CENTER_VERTICAL

        val textCol = LinearLayout(this)
        textCol.orientation = LinearLayout.VERTICAL
        row.addView(textCol, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))

        val tv = TextView(this)
        tv.text = title; tv.setTextColor(Color.argb(0xFF, 0x1C, 0x1C, 0x1E))
        tv.textSize = 16f
        textCol.addView(tv)

        val ts = TextView(this)
        ts.text = subtitle; ts.setTextColor(Color.argb(0xFF, 0x8E, 0x8E, 0x93))
        ts.textSize = 12f
        textCol.addView(ts)

        val iosSwitch = IosSwitch(this)
        iosSwitch.setChecked(getter(), false)
        row.addView(iosSwitch, LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT))
        row.setOnClickListener { val nv = !iosSwitch.isChecked; iosSwitch.setChecked(nv, true); setter(nv) }
        iosSwitch.onToggle = setter
        return row
    }

    private fun space(h: Int): View {
        val v = View(this)
        v.layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, dip(h))
        return v
    }

    private fun dip(v: Int): Int = (v * resources.displayMetrics.density + 0.5f).toInt()
    private fun dpf(v: Int): Float = v * resources.displayMetrics.density
}
