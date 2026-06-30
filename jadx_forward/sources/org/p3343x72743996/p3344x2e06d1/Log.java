package org.p3343x72743996.p3344x2e06d1;

/* loaded from: classes13.dex */
public class Log {

    /* renamed from: ASSERT */
    public static final int f73324x73a36746 = 7;

    /* renamed from: DEBUG */
    public static final int f73325x3de9e33 = 3;

    /* renamed from: ERROR */
    public static final int f73326x3f2d9e8 = 6;

    /* renamed from: INFO */
    public static final int f73327x225cae = 4;

    /* renamed from: VERBOSE */
    public static final int f73328x3fb90562 = 2;

    /* renamed from: WARN */
    public static final int f73329x288a86 = 5;

    private Log() {
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m152498x7a994349();
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m152493x6bfa1bcd(str2, m152497xab29925f(objArr), objArr);
        m152500x2edc714d(str);
    }

    /* renamed from: formatLog */
    private static java.lang.String m152493x6bfa1bcd(java.lang.String str, java.lang.Throwable th6, java.lang.Object... objArr) {
        return objArr != null ? ((th6 != null || objArr.length <= 0) && objArr.length <= 1) ? str : java.lang.String.format(java.util.Locale.US, str, objArr) : str;
    }

    /* renamed from: formatLogWithStack */
    private static java.lang.String m152494x7833a815(java.lang.String str, java.lang.Throwable th6, java.lang.Object... objArr) {
        return "[" + m152495x45fc0f1a() + "] " + m152493x6bfa1bcd(str, th6, objArr);
    }

    /* renamed from: getCallOrigin */
    private static java.lang.String m152495x45fc0f1a() {
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        java.lang.String name = org.p3343x72743996.p3344x2e06d1.Log.class.getName();
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
    public static java.lang.String m152496x2d915d84(java.lang.Throwable th6) {
        return android.util.Log.getStackTraceString(th6);
    }

    /* renamed from: getThrowableToLog */
    private static java.lang.Throwable m152497xab29925f(java.lang.Object[] objArr) {
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
        m152493x6bfa1bcd(str2, m152497xab29925f(objArr), objArr);
        m152500x2edc714d(str);
    }

    /* renamed from: isDebug */
    private static boolean m152498x7a994349() {
        return true;
    }

    /* renamed from: isLoggable */
    public static boolean m152499x492678c7(java.lang.String str, int i17) {
        m152498x7a994349();
        if (i17 <= 4) {
            return false;
        }
        return android.util.Log.isLoggable(str, i17);
    }

    /* renamed from: normalizeTag */
    public static java.lang.String m152500x2edc714d(java.lang.String str) {
        return "cr_" + str;
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m152498x7a994349();
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m152493x6bfa1bcd(str2, m152497xab29925f(objArr), objArr);
        m152500x2edc714d(str);
    }

    public static void wtf(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.Throwable m152497xab29925f = m152497xab29925f(objArr);
        java.lang.String m152493x6bfa1bcd = m152493x6bfa1bcd(str2, m152497xab29925f, objArr);
        java.lang.String m152500x2edc714d = m152500x2edc714d(str);
        if (m152497xab29925f != null) {
            android.util.Log.wtf(m152500x2edc714d, m152493x6bfa1bcd, m152497xab29925f);
        } else {
            android.util.Log.wtf(m152500x2edc714d, m152493x6bfa1bcd);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        m152500x2edc714d(str);
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        m152500x2edc714d(str);
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        m152500x2edc714d(str);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        m152500x2edc714d(str);
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        m152500x2edc714d(str);
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        m152500x2edc714d(str);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        e(str, str2, obj);
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        i(str, str2, obj);
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        w(str, str2, obj);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.Object obj2) {
        e(str, str2, obj, obj2);
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.Object obj2) {
        i(str, str2, obj, obj2);
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.Object obj2) {
        w(str, str2, obj, obj2);
    }
}
