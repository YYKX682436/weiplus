package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.Logger */
/* loaded from: classes14.dex */
public final class C0544x87fce1b0 {

    /* renamed from: DEFAULT_MIN_LOG_LEVEL */
    static final int f1138x52f7371e = 3;

    /* renamed from: MAX_TAG_LENGTH */
    private static final int f1139x28e76526 = 23;

    /* renamed from: sMinLogLevel */
    private static int f1140x9fecfc9f = 3;

    private C0544x87fce1b0() {
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        m4675xf350edf7(m4680xc77e3854(str), 3);
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        m4675xf350edf7(m4680xc77e3854(str), 6);
    }

    /* renamed from: getMinLogLevel */
    public static int m4671xa18c51dc() {
        return f1140x9fecfc9f;
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        m4675xf350edf7(m4680xc77e3854(str), 4);
    }

    /* renamed from: isDebugEnabled */
    public static boolean m4672xa8834bb8(java.lang.String str) {
        return m4675xf350edf7(m4680xc77e3854(str), 3);
    }

    /* renamed from: isErrorEnabled */
    public static boolean m4673x817b6a63(java.lang.String str) {
        return m4675xf350edf7(m4680xc77e3854(str), 6);
    }

    /* renamed from: isInfoEnabled */
    public static boolean m4674xd67f5b29(java.lang.String str) {
        return m4675xf350edf7(m4680xc77e3854(str), 4);
    }

    /* renamed from: isLogLevelEnabled */
    private static boolean m4675xf350edf7(java.lang.String str, int i17) {
        return f1140x9fecfc9f <= i17 || android.util.Log.isLoggable(str, i17);
    }

    /* renamed from: isVerboseEnabled */
    public static boolean m4676xcef4db29(java.lang.String str) {
        return m4675xf350edf7(m4680xc77e3854(str), 2);
    }

    /* renamed from: isWarnEnabled */
    public static boolean m4677x1e9a6a51(java.lang.String str) {
        return m4675xf350edf7(m4680xc77e3854(str), 5);
    }

    /* renamed from: resetMinLogLevel */
    public static void m4678x1e777e43() {
        f1140x9fecfc9f = 3;
    }

    /* renamed from: setMinLogLevel */
    public static void m4679x37f1c550(int i17) {
        f1140x9fecfc9f = i17;
    }

    /* renamed from: truncateTag */
    private static java.lang.String m4680xc77e3854(java.lang.String str) {
        return (android.os.Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        m4675xf350edf7(m4680xc77e3854(str), 5);
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        m4675xf350edf7(m4680xc77e3854(str), 3);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        m4675xf350edf7(m4680xc77e3854(str), 6);
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        m4675xf350edf7(m4680xc77e3854(str), 4);
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        m4675xf350edf7(m4680xc77e3854(str), 5);
    }
}
