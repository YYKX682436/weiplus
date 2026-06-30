package com.p314xaae8f345.p3207xd1e0294a.p3208xcbe10e0a;

/* renamed from: com.tencent.wxperf.thread.ThreadInspect */
/* loaded from: classes12.dex */
public final class C27811xabc31c8a {

    /* renamed from: ALL_THREAD_FLAG */
    private static final int f61106x7d8986c3 = -2;

    /* renamed from: CURR_PID_FLAG */
    private static final int f61107xf5dd712d = -1;

    /* renamed from: CURR_TID_FLAG */
    private static final int f61108x956224a9 = -1;

    /* renamed from: LIB_NAME */
    private static final java.lang.String f61109x627f3c25 = "wxperf-tkill";
    private static final java.lang.String TAG = "ThreadInspect";

    /* renamed from: initialized */
    private static volatile boolean f61110x498da6d4;

    /* renamed from: sTidThreads */
    private static final java.util.Map<java.lang.Integer, java.lang.ref.WeakReference<java.lang.Thread>> f61111x8255c4ed = new java.util.HashMap();

    /* renamed from: _hellAccFlag_ */
    private byte f61112x7f11beae;

    /* renamed from: dump */
    private static void m120081x2f39f4(int i17, int i18, int i19, java.lang.String str) {
        if (f61110x498da6d4) {
            m120114xb8ff1aab(i17, i18, i19, str);
        }
    }

    /* renamed from: dumpLocalAllThread */
    public static void m120083x4c7ceaf4(int i17, java.lang.String str) {
        m120081x2f39f4(-1, -2, i17, str);
    }

    /* renamed from: dumpLocalCurrentThread */
    public static void m120085x850cd04c(int i17, java.lang.String str) {
        m120081x2f39f4(-1, -1, i17, str);
    }

    /* renamed from: dumpLocalThread */
    public static void m120087xf881cac1(int i17, int i18, java.lang.String str) {
        m120081x2f39f4(-1, i17, i18, str);
    }

    /* renamed from: dumpRemoteAllThread */
    public static void m120089x3558e4d1(int i17, int i18, java.lang.String str) {
        m120081x2f39f4(i17, -2, i18, str);
    }

    /* renamed from: dumpRemoteThread */
    public static void m120091xbb3a6604(int i17, int i18, int i19, java.lang.String str) {
        m120081x2f39f4(i17, i18, i19, str);
    }

    private static java.lang.String get(int i17, int i18, java.lang.String str) {
        if (f61110x498da6d4) {
            return m120115xc3e73bbf(i17, i18, str);
        }
        return null;
    }

    /* renamed from: getLocalAllThread */
    public static java.lang.String m120093x75152cd6(java.lang.String str) {
        return get(-1, -2, str);
    }

    /* renamed from: getLocalCurrentThread */
    public static java.lang.String m120095x420d512e(java.lang.String str) {
        return get(-1, -1, str);
    }

    /* renamed from: getLocalThread */
    public static java.lang.String m120097x2f59a41f(int i17, java.lang.String str) {
        return get(-1, i17, str);
    }

    /* renamed from: getRemoteAllThread */
    public static java.lang.String m120099x1fc8df2f(int i17, java.lang.String str) {
        return get(i17, -2, str);
    }

    /* renamed from: getRemoteThread */
    public static java.lang.String m120101x5f5db866(int i17, int i18, java.lang.String str) {
        return get(i17, i18, str);
    }

    /* renamed from: init */
    public static boolean m120102x316510() {
        return m120103x316510(null);
    }

    private static void log(int i17, int i18, java.lang.String str, int i19, java.lang.String str2) {
        if (f61110x498da6d4) {
            m120116xc3e74fad(i17, i18, str, i19, str2);
        }
    }

    /* renamed from: logLocalAllThread */
    public static void m120105x47f4c844(java.lang.String str, int i17, java.lang.String str2) {
        log(-1, -2, str, i17, str2);
    }

    /* renamed from: logLocalCurrentThread */
    public static void m120107x1bb5859c(java.lang.String str, int i17, java.lang.String str2) {
        log(-1, -1, str, i17, str2);
    }

    /* renamed from: logLocalThread */
    public static void m120109x85c76f71(int i17, java.lang.String str, int i18, java.lang.String str2) {
        log(-1, i17, str, i18, str2);
    }

    /* renamed from: logRemoteAllThread */
    public static void m120111xa8dcb181(int i17, java.lang.String str, int i18, java.lang.String str2) {
        log(i17, -2, str, i18, str2);
    }

    /* renamed from: logRemoteThread */
    public static void m120113xd6a95754(int i17, int i18, java.lang.String str, int i19, java.lang.String str2) {
        log(i17, i18, str, i19, str2);
    }

    /* renamed from: nativeDump */
    private static native void m120114xb8ff1aab(int i17, int i18, int i19, java.lang.String str);

    /* renamed from: nativeGet */
    private static native java.lang.String m120115xc3e73bbf(int i17, int i18, java.lang.String str);

    /* renamed from: nativeLog */
    public static native void m120116xc3e74fad(int i17, int i18, java.lang.String str, int i19, java.lang.String str2);

    /* renamed from: dumpLocalAllThread */
    public static void m120082x4c7ceaf4(int i17) {
        m120081x2f39f4(-1, -2, i17, null);
    }

    /* renamed from: dumpLocalCurrentThread */
    public static void m120084x850cd04c(int i17) {
        m120081x2f39f4(-1, -1, i17, null);
    }

    /* renamed from: dumpLocalThread */
    public static void m120086xf881cac1(int i17, int i18) {
        m120081x2f39f4(-1, i17, i18, null);
    }

    /* renamed from: dumpRemoteAllThread */
    public static void m120088x3558e4d1(int i17, int i18) {
        m120081x2f39f4(i17, -2, i18, null);
    }

    /* renamed from: dumpRemoteThread */
    public static void m120090xbb3a6604(int i17, int i18, int i19) {
        m120081x2f39f4(i17, i18, i19, null);
    }

    /* renamed from: getLocalAllThread */
    public static java.lang.String m120092x75152cd6() {
        return get(-1, -2, null);
    }

    /* renamed from: getLocalCurrentThread */
    public static java.lang.String m120094x420d512e() {
        return get(-1, -1, null);
    }

    /* renamed from: getLocalThread */
    public static java.lang.String m120096x2f59a41f(int i17) {
        return get(-1, i17, null);
    }

    /* renamed from: getRemoteAllThread */
    public static java.lang.String m120098x1fc8df2f(int i17) {
        return get(i17, -2, null);
    }

    /* renamed from: getRemoteThread */
    public static java.lang.String m120100x5f5db866(int i17, int i18) {
        return get(i17, i18, null);
    }

    /* renamed from: init */
    public static boolean m120103x316510(m3.a aVar) {
        if (!f61110x498da6d4) {
            synchronized (com.p314xaae8f345.p3207xd1e0294a.p3208xcbe10e0a.C27811xabc31c8a.class) {
                if (!f61110x498da6d4) {
                    try {
                        if (aVar == null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(f61109x627f3c25);
                            java.lang.Object obj = new java.lang.Object();
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(obj, arrayList.toArray(), "com/tencent/wxperf/thread/ThreadInspect", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(Landroidx/core/util/Consumer;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                            java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
                            yj0.a.f(obj, "com/tencent/wxperf/thread/ThreadInspect", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(Landroidx/core/util/Consumer;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                        } else {
                            aVar.mo3938xab27b508(f61109x627f3c25);
                        }
                        f61110x498da6d4 = true;
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.m96099x79dc3db(6, TAG, th6);
                        f61110x498da6d4 = false;
                    }
                }
            }
        }
        return f61110x498da6d4;
    }

    /* renamed from: logLocalAllThread */
    public static void m120104x47f4c844(java.lang.String str, int i17) {
        log(-1, -2, str, i17, null);
    }

    /* renamed from: logLocalCurrentThread */
    public static void m120106x1bb5859c(java.lang.String str, int i17) {
        log(-1, -1, str, i17, null);
    }

    /* renamed from: logLocalThread */
    public static void m120108x85c76f71(int i17, java.lang.String str, int i18) {
        log(-1, i17, str, i18, null);
    }

    /* renamed from: logRemoteAllThread */
    public static void m120110xa8dcb181(int i17, java.lang.String str, int i18) {
        log(i17, -2, str, i18, null);
    }

    /* renamed from: logRemoteThread */
    public static void m120112xd6a95754(int i17, int i18, java.lang.String str, int i19) {
        log(i17, i18, str, i19, null);
    }
}
