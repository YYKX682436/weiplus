package com.muchen.weiplus.features

object FeatureConfig {
    var antiRecall = true
    var swipeQuote = true
    var showDetailTime = true

    fun load() {
        try {
            val f = java.io.File("/sdcard/weiplus_prefs")
            if (!f.exists()) return
            f.readLines().forEach { line ->
                val parts = line.split("=", limit = 2)
                if (parts.size != 2) return@forEach
                val key = parts[0].trim()
                val v = parts[1].trim()
                when (key) {
                    "anti_recall" -> antiRecall = v.equals("true", ignoreCase = true)
                    "swipe_quote" -> swipeQuote = v.equals("true", ignoreCase = true)
                    "show_detail_time" -> showDetailTime = v.equals("true", ignoreCase = true)
                }
            }
        } catch (_: Throwable) {}
    }

    fun save() {
        try {
            java.io.File("/sdcard/weiplus_prefs").writeText(
                "anti_recall=$antiRecall\n" +
                "swipe_quote=$swipeQuote\n" +
                "show_detail_time=$showDetailTime\n"
            )
        } catch (_: Throwable) {}
    }
}
