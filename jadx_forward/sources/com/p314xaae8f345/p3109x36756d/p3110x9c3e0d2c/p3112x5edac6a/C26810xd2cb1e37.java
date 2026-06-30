package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a;

/* renamed from: com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils */
/* loaded from: classes13.dex */
public class C26810xd2cb1e37 {

    /* renamed from: DEBUG */
    public static final int f57429x3de9e33 = 4;

    /* renamed from: ERROR */
    public static final int f57430x3f2d9e8 = 1;

    /* renamed from: ERROR_MESSAGE */
    private static final java.lang.String f57431x4254a490 = "log message error : ";

    /* renamed from: INFO */
    public static final int f57432x225cae = 3;

    /* renamed from: LOG_LEVEL */
    public static final int f57433x65144289 = 6;

    /* renamed from: VERBOSE */
    public static final int f57434x3fb90562 = 5;

    /* renamed from: WARN */
    public static final int f57435x288a86 = 2;

    private C26810xd2cb1e37() {
    }

    /* renamed from: debug */
    public static void m105840x5b09653(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.d(str, str2);
    }

    /* renamed from: error */
    public static void m105842x5c4d208(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(str, str2);
    }

    /* renamed from: getMessageString */
    private static <T> java.lang.String m105844x6090a742(java.lang.String str, T[] tArr) {
        try {
            return java.lang.String.format(java.util.Locale.ENGLISH, str.replaceAll("\\{\\}", "%s"), tArr);
        } catch (java.util.IllegalFormatException | java.util.regex.PatternSyntaxException e17) {
            return f57431x4254a490 + e17.getMessage();
        }
    }

    /* renamed from: info */
    public static void m105845x3164ae(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(str, str2);
    }

    /* renamed from: verbose */
    public static void m105847x14ed7982(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.v(str, str2);
    }

    /* renamed from: warn */
    public static void m105848x379286(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(str, str2);
    }

    /* renamed from: debug */
    public static <T> void m105841x5b09653(java.lang.String str, java.lang.String str2, T... tArr) {
        if (str2 != null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.d(str, m105844x6090a742(str2, tArr));
        }
    }

    /* renamed from: error */
    public static <T> void m105843x5c4d208(java.lang.String str, java.lang.String str2, T... tArr) {
        if (str2 != null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(str, m105844x6090a742(str2, tArr));
        }
    }

    /* renamed from: info */
    public static <T> void m105846x3164ae(java.lang.String str, java.lang.String str2, T... tArr) {
        if (str2 != null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(str, m105844x6090a742(str2, tArr));
        }
    }
}
