package com.p314xaae8f345.p519xbf8bc95e.p536x4beb0e9c;

/* renamed from: com.tencent.mapsdk.rastercore.LogHelper */
/* loaded from: classes13.dex */
public class C4422xd8343bf2 {

    /* renamed from: DEBUG */
    private static java.lang.Boolean f17536x3de9e33 = java.lang.Boolean.FALSE;

    /* renamed from: DEFAULT_TAG */
    private static final java.lang.String f17537x665bdc5c = "tencentSdk";

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

    /* renamed from: setDebugMode */
    public static void m37442x4fed1454(boolean z17) {
        f17536x3de9e33 = java.lang.Boolean.valueOf(z17);
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
        if (f17536x3de9e33.booleanValue()) {
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
