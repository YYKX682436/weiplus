package com.muchen.weiplus.features

import java.io.File

object PreferenceBridge {
    private const val PREFS_FILE = "/sdcard/weiplus_prefs"
    
    fun get(key: String, default: Boolean): Boolean {
        try {
            val file = File(PREFS_FILE)
            if (!file.exists()) return default
            file.readLines().forEach { line ->
                val parts = line.split("=", limit = 2)
                if (parts.size == 2 && parts[0].trim() == key) {
                    return parts[1].trim().equals("true", ignoreCase = true)
                }
            }
        } catch (_: Throwable) {}
        return default
    }
    
    fun set(key: String, value: Boolean) {
        try {
            val file = File(PREFS_FILE)
            val lines = if (file.exists()) file.readLines().toMutableList() else mutableListOf()
            val entry = "$key=$value"
            val idx = lines.indexOfFirst { it.startsWith("$key=") }
            if (idx >= 0) lines[idx] = entry else lines.add(entry)
            file.writeText(lines.joinToString("\n"))
        } catch (_: Throwable) {}
    }
}
