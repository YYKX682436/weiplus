package com.p314xaae8f345.p373xbe494963.p378x2e06d1;

/* loaded from: classes13.dex */
public class Log {

    /* renamed from: ASSERT */
    public static final int f14606x73a36746 = 7;

    /* renamed from: DEBUG */
    public static final int f14607x3de9e33 = 3;

    /* renamed from: ERROR */
    public static final int f14608x3f2d9e8 = 6;

    /* renamed from: INFO */
    public static final int f14609x225cae = 4;

    /* renamed from: VERBOSE */
    public static final int f14610x3fb90562 = 2;

    /* renamed from: WARN */
    public static final int f14611x288a86 = 5;

    /* renamed from: sDeprecatedTagPrefix */
    private static final java.lang.String f14612xa7904ae6 = "cr.";

    /* renamed from: sTagPrefix */
    private static final java.lang.String f14613x975fb399 = "cr_";

    /* renamed from: useChromiumLog */
    private static final boolean f14614xeef379c7 = true;

    private Log() {
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m29261x163d4aae(3, str, m29255x7833a815(str2, m29258xab29925f(objArr), objArr));
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m29261x163d4aae(6, str, m29254x6bfa1bcd(str2, m29258xab29925f(objArr), objArr));
    }

    /* renamed from: formatLog */
    private static java.lang.String m29254x6bfa1bcd(java.lang.String str, java.lang.Throwable th6, java.lang.Object... objArr) {
        return objArr != null ? ((th6 != null || objArr.length <= 0) && objArr.length <= 1) ? str : java.lang.String.format(java.util.Locale.US, str, objArr) : str;
    }

    /* renamed from: formatLogWithStack */
    private static java.lang.String m29255x7833a815(java.lang.String str, java.lang.Throwable th6, java.lang.Object... objArr) {
        return "[" + m29256x45fc0f1a() + "] " + m29254x6bfa1bcd(str, th6, objArr);
    }

    /* renamed from: getCallOrigin */
    private static java.lang.String m29256x45fc0f1a() {
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        java.lang.String name = com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.class.getName();
        int i17 = 0;
        while (true) {
            if (i17 >= stackTrace.length) {
                break;
            }
            if (stackTrace[i17].getClassName().equals(name)) {
                i17 += 3;
                break;
            }
            i17++;
        }
        return stackTrace[i17].getFileName() + ":" + stackTrace[i17].getLineNumber();
    }

    /* renamed from: getStackTraceString */
    public static java.lang.String m29257x2d915d84(java.lang.Throwable th6) {
        return android.util.Log.getStackTraceString(th6);
    }

    /* renamed from: getThrowableToLog */
    private static java.lang.Throwable m29258xab29925f(java.lang.Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        java.lang.Object obj = objArr[objArr.length - 1];
        if (obj instanceof java.lang.Throwable) {
            return (java.lang.Throwable) obj;
        }
        return null;
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m29261x163d4aae(4, str, m29254x6bfa1bcd(str2, m29258xab29925f(objArr), objArr));
    }

    /* renamed from: isDebug */
    private static boolean m29259x7a994349() {
        return true;
    }

    /* renamed from: isLoggable */
    public static boolean m29260x492678c7(java.lang.String str, int i17) {
        if (m29259x7a994349() || i17 > 4) {
            return android.util.Log.isLoggable(str, i17);
        }
        return false;
    }

    /* renamed from: nativeWriteLogToNative */
    private static native void m29261x163d4aae(int i17, java.lang.String str, java.lang.String str2);

    /* renamed from: normalizeTag */
    public static java.lang.String m29262x2edc714d(java.lang.String str) {
        if (str.startsWith(f14613x975fb399)) {
            return str;
        }
        return f14613x975fb399 + str.substring(str.startsWith(f14612xa7904ae6) ? 3 : 0, str.length());
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m29261x163d4aae(2, str, m29255x7833a815(str2, m29258xab29925f(objArr), objArr));
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m29261x163d4aae(5, str, m29254x6bfa1bcd(str2, m29258xab29925f(objArr), objArr));
    }

    public static void wtf(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m29261x163d4aae(7, str, m29254x6bfa1bcd(str2, m29258xab29925f(objArr), objArr));
    }
}
