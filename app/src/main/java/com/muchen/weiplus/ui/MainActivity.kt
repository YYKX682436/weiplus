package com.muchen.weiplus.ui

import android.app.Activity
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import com.muchen.weiplus.features.FeatureConfig

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FeatureConfig.load()

        val panel = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(0, dip(16), 0, dip(16))
        }

        addSection(panel, "\u6d88\u606f\u589e\u5f3a")
        addCard(panel) { card ->
            addToggle(card, "\u7981\u6b62\u6d88\u606f\u64a4\u56de", "\u963b\u6b62\u597d\u53cb\u64a4\u56de\u5df2\u53d1\u6d88\u606f",
                FeatureConfig.antiRecall
            ) { FeatureConfig.antiRecall = it; FeatureConfig.save() }
            addCardDivider(card)
            addToggle(card, "\u5de6\u6ed1\u5f15\u7528\u6d88\u606f", "\u5de6\u6ed1\u6d88\u606f\u5feb\u901f\u5f15\u7528\u56de\u590d",
                FeatureConfig.swipeQuote
            ) { FeatureConfig.swipeQuote = it; FeatureConfig.save() }
            addCardDivider(card)
            addToggle(card, "\u663e\u793a\u8be6\u7ec6\u65f6\u95f4", "\u5934\u50cf\u4e0b\u65b9\u663e\u793a\u6d88\u606f\u65f6\u95f4 HH:mm:ss",
                FeatureConfig.showDetailTime
            ) { FeatureConfig.showDetailTime = it; FeatureConfig.save() }
        }

        addSection(panel, "")
        addCard(panel) { card ->
            addInfoRow(card, "\u7248\u672c", "1.0.0")
            addCardDivider(card)
            addInfoRow(card, "\u8bf4\u660e", "\u9700\u8981\u6fc0\u6d3b LSPosed \u6a21\u5757\u540e\u91cd\u542f\u5fae\u4fe1\u3002\n\u6240\u6709\u529f\u80fd\u5747\u9700\u6709\u6548\u7684 LSPosed \u73af\u5883")
        }

        val scroll = ScrollView(this).apply { addView(panel) }
        setContentView(scroll)
        window.statusBarColor = Color.argb(0xF8, 0x1C, 0x1C, 0x1E)
    }

    private fun addSection(panel: LinearLayout, title: String) {
        if (title.isNotEmpty()) {
            panel.addView(TextView(this).apply {
                text = title
                setTextColor(Color.argb(0xFF, 0x8E, 0x8E, 0x93))
                textSize = 13f
                setPadding(dip(20), dip(8), dip(20), dip(6))
            })
        }
    }

    private fun addCard(panel: LinearLayout, block: (LinearLayout) -> Unit) {
        val card = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            background = GradientDrawable().apply {
                cornerRadius = dpf(12)
                setColor(Color.argb(0xFC, 0xFF, 0xFF, 0xFF))
            }
            val lp = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            ).apply { setMargins(dip(16), 0, dip(16), dip(12)) }
            layoutParams = lp
        }
        block(card)
        panel.addView(card)
    }

    private fun addToggle(card: LinearLayout, title: String, subtitle: String,
                          initial: Boolean, onToggle: (Boolean) -> Unit) {
        val row = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            setPadding(dip(20), dip(14), dip(16), dip(14))
        }

        val col = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(0, 0, dip(8), 0)
        }
        row.addView(col, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))

        col.addView(TextView(this).apply {
            text = title
            setTextColor(Color.argb(0xFF, 0x1C, 0x1C, 0x1E))
            textSize = 16f
        })
        col.addView(TextView(this).apply {
            text = subtitle
            setTextColor(Color.argb(0xFF, 0x8E, 0x8E, 0x93))
            textSize = 12f
        })

        val sw = IosSwitch(this, 1.2f)
        sw.setChecked(initial, false)
        sw.onToggle = onToggle
        row.addView(sw)
        row.setOnClickListener { sw.setChecked(!sw.isChecked, true) }

        card.addView(row)
    }

    private fun addCardDivider(card: LinearLayout) {
        val div = View(this).apply {
            setBackgroundColor(Color.argb(0x0C, 0x00, 0x00, 0x00))
            layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dip(1)
            ).apply { setMargins(dip(20), 0, dip(20), 0) }
        }
        card.addView(div)
    }

    private fun addInfoRow(card: LinearLayout, label: String, value: String) {
        val row = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            setPadding(dip(20), dip(14), dip(20), dip(14))
        }
        row.addView(TextView(this).apply {
            text = label
            setTextColor(Color.argb(0xFF, 0x1C, 0x1C, 0x1E))
            textSize = 16f
        }, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))
        row.addView(TextView(this).apply {
            text = value
            setTextColor(Color.argb(0xFF, 0x8E, 0x8E, 0x93))
            textSize = 14f
        })
        card.addView(row)
    }

    private fun dip(v: Int): Int = (v * resources.displayMetrics.density + 0.5f).toInt()
    private fun dpf(v: Int): Float = v * resources.displayMetrics.density
}