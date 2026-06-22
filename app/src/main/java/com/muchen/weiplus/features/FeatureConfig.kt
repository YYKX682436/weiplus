package com.muchen.weiplus.features

object FeatureConfig {
    var antiRecall = true
    var swipeQuote = true

    fun load() {
        try {
            val f = java.io.File("/sdcard/weiplus_prefs")
            if (!f.exists()) return
            f.readLines().forEach { line ->
                val parts = line.split("=", limit = 2)
                if (parts.size != 2) return@forEach
                val v = parts[1].trim().equals("true", ignoreCase = true)
                when (parts[0].trim()) {
                    "anti_recall" -> antiRecall = v
                    "swipe_quote" -> swipeQuote = v
                }
            }
        } catch (_: Throwable) {}
    }

    fun save() {
        try {
            java.io.File("/sdcard/weiplus_prefs").writeText(
                "anti_recall=$antiRecall\nswipe_quote=$swipeQuote\n"
            )
        } catch (_: Throwable) {}
    }
}
