package com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db;

/* renamed from: com.tencent.youtu.ytcommon.tools.YTLogger */
/* loaded from: classes14.dex */
public class C27963xd0ec8b {

    /* renamed from: iFaceLiveLogger */
    private static com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.IFaceLiveLogger f62610x53b2b4a2;

    /* renamed from: sEnableLog */
    private static boolean f62611xec9638e;

    /* renamed from: sEnableNativeLog */
    private static boolean f62612x586c3077;

    /* renamed from: com.tencent.youtu.ytcommon.tools.YTLogger$IFaceLiveLogger */
    /* loaded from: classes14.dex */
    public interface IFaceLiveLogger {
        void d(java.lang.String str, java.lang.String str2);

        void e(java.lang.String str, java.lang.String str2);

        void i(java.lang.String str, java.lang.String str2);

        void v(java.lang.String str, java.lang.String str2);

        void w(java.lang.String str, java.lang.String str2);
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.IFaceLiveLogger iFaceLiveLogger;
        if (f62611xec9638e && (iFaceLiveLogger = f62610x53b2b4a2) != null) {
            iFaceLiveLogger.d(str, str2);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.IFaceLiveLogger iFaceLiveLogger = f62610x53b2b4a2;
        if (iFaceLiveLogger != null) {
            iFaceLiveLogger.e(str, str2);
        }
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.IFaceLiveLogger iFaceLiveLogger;
        if (f62611xec9638e && (iFaceLiveLogger = f62610x53b2b4a2) != null) {
            iFaceLiveLogger.i(str, str2);
        }
    }

    /* renamed from: isEnableLog */
    public static boolean m121272x2096b4b7() {
        return f62611xec9638e;
    }

    /* renamed from: isEnableNativeLog */
    public static boolean m121273x6e183ee0() {
        return f62612x586c3077;
    }

    /* renamed from: setIsEnabledLog */
    public static void m121274x8985d68f(boolean z17) {
        f62611xec9638e = z17;
    }

    /* renamed from: setIsEnabledNativeLog */
    public static void m121275x77ac9eb8(boolean z17) {
        f62612x586c3077 = z17;
    }

    /* renamed from: setLog */
    public static void m121276xca027b82(com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.IFaceLiveLogger iFaceLiveLogger) {
        f62610x53b2b4a2 = iFaceLiveLogger;
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.IFaceLiveLogger iFaceLiveLogger;
        if (f62611xec9638e && (iFaceLiveLogger = f62610x53b2b4a2) != null) {
            iFaceLiveLogger.v(str, str2);
        }
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.IFaceLiveLogger iFaceLiveLogger;
        if (f62611xec9638e && (iFaceLiveLogger = f62610x53b2b4a2) != null) {
            iFaceLiveLogger.w(str, str2);
        }
    }
}
