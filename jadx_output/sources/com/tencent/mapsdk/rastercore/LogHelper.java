package com.tencent.mapsdk.rastercore;

/* loaded from: classes13.dex */
public class LogHelper {
    private static java.lang.Boolean DEBUG = java.lang.Boolean.FALSE;
    private static final java.lang.String DEFAULT_TAG = "tencentSdk";

    public static void d(java.lang.String str, java.lang.String str2) {
        log(str, str2, 'd');
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        log(str, str2, 'e');
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        log(str, str2, 'i');
    }

    public static void log(java.lang.String str) {
        log(null, str, 'v');
    }

    public static void setDebugMode(boolean z17) {
        DEBUG = java.lang.Boolean.valueOf(z17);
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        log(str, str2, 'v');
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        log(str, str2, 'w');
    }

    public static void d(java.lang.String str) {
        log(null, str, 'd');
    }

    public static void e(java.lang.String str) {
        log(null, str, 'e');
    }

    public static void i(java.lang.String str) {
        log(null, str, 'i');
    }

    private static void log(java.lang.String str, java.lang.String str2, char c17) {
        if (DEBUG.booleanValue()) {
            android.text.TextUtils.isEmpty(str);
        }
    }

    public static void v(java.lang.String str) {
        log(null, str, 'v');
    }

    public static void w(java.lang.String str) {
        log(null, str, 'w');
    }
}
