package com.p307xc6797c64.qvb;

/* renamed from: com.qcloud.qvb.XNet */
/* loaded from: classes10.dex */
public final class C2852x293225 {

    /* renamed from: LOG_DEBUG */
    public static int f9717x64a33d58 = 3;

    /* renamed from: LOG_ERROR */
    public static int f9718x64b7790d = 0;

    /* renamed from: LOG_INFO */
    public static int f9719xa86ac4e9 = 2;

    /* renamed from: LOG_NONE */
    public static int f9720xa86d0f73 = -1;

    /* renamed from: LOG_WARN */
    public static int f9721xa870f2c1 = 1;

    /* renamed from: SDK_VERSION */
    private static java.lang.String f9722x6604d593 = null;
    static final java.lang.String TAG = "[TencentXP2P][XNet]";

    /* renamed from: appCtx */
    private static java.lang.ref.WeakReference<android.content.Context> f9723xabe45046 = null;

    /* renamed from: archCpuAbi */
    private static java.lang.String f9724xb89ee196 = "";

    /* renamed from: cacheDir */
    private static java.lang.String f9725xe62915ab = null;

    /* renamed from: filesDir */
    private static java.lang.String f9726xd4362a96 = null;

    /* renamed from: sEnableDebug */
    private static boolean f9727x81896c1d = false;

    /* renamed from: sIsSoLoaded */
    private static boolean f9728x4c3ac59e = false;

    /* renamed from: sLogLevel */
    private static int f9729x158cb433 = 3;

    /* renamed from: _hellAccFlag_ */
    private byte f9730x7f11beae;

    /* renamed from: destroy */
    public static void m21199x5cd39ffa() {
        if (f9728x4c3ac59e) {
            m21211x57b56d60();
        } else {
            com.p307xc6797c64.qvb.AbstractC2851x87fce1b0.m21194x5c4d208("so not loaded, ignore jni_destroy call");
        }
    }

    /* renamed from: disableDebug */
    public static void m21200xc3b9144b() {
        f9727x81896c1d = false;
        if (f9728x4c3ac59e) {
            m21212xecfdb6a5();
        } else {
            com.p307xc6797c64.qvb.AbstractC2851x87fce1b0.m21194x5c4d208("so not loaded, ignore jni_disableDebug call");
        }
    }

    /* renamed from: enableDebug */
    public static void m21201xa9527a90() {
        f9727x81896c1d = true;
        if (f9728x4c3ac59e) {
            m21213x9a2324f6();
        } else {
            com.p307xc6797c64.qvb.AbstractC2851x87fce1b0.m21194x5c4d208("so not loaded, ignore jni_enableDebug call");
        }
    }

    /* renamed from: getArchABI */
    private static java.lang.String m21202x11357ffc() {
        if (f9724xb89ee196.isEmpty()) {
            f9724xb89ee196 = m21220x5c0b5e47();
        }
        return m21209xe1dbd73c(f9724xb89ee196) ? f9724xb89ee196 : "";
    }

    /* renamed from: getCacheDir */
    private static java.lang.String m21203x62035321() {
        java.lang.String str = f9725xe62915ab;
        if (str != null) {
            return str;
        }
        android.content.Context context = f9723xabe45046.get();
        return context != null ? context.getCacheDir().getAbsolutePath() : "/";
    }

    /* renamed from: getDiskDir */
    private static java.lang.String m21204xa16f797a() {
        java.lang.String str = f9726xd4362a96;
        if (str != null) {
            return str;
        }
        android.content.Context context = f9723xabe45046.get();
        return context != null ? context.getFilesDir().getAbsolutePath() : "/";
    }

    /* renamed from: getHost */
    public static java.lang.String m21205xfb805e1e() {
        if (f9728x4c3ac59e) {
            return m21214x76c29202();
        }
        com.p307xc6797c64.qvb.AbstractC2851x87fce1b0.m21194x5c4d208("so not loaded, ignore jni_host call");
        return "";
    }

    /* renamed from: getVersion */
    public static java.lang.String m21206x52c258a2() {
        if (!f9728x4c3ac59e) {
            com.p307xc6797c64.qvb.AbstractC2851x87fce1b0.m21194x5c4d208("so not loaded, ignore jni_version call");
        } else if (f9722x6604d593 == null) {
            f9722x6604d593 = m21221xfd6ea3e();
        }
        return f9722x6604d593;
    }

    /* renamed from: init */
    public static void m21207x316510(android.content.Context context, com.p307xc6797c64.qvb.a aVar) {
        throw null;
    }

    /* renamed from: isArchValid */
    private static boolean m21209xe1dbd73c(java.lang.String str) {
        return java.util.Arrays.asList(vb.a.f515993a).contains(str);
    }

    /* renamed from: jni_alias */
    private static native void m21210x612b8536(java.lang.String str, java.lang.String str2);

    /* renamed from: jni_destroy */
    private static native void m21211x57b56d60();

    /* renamed from: jni_disableDebug */
    private static native void m21212xecfdb6a5();

    /* renamed from: jni_enableDebug */
    private static native void m21213x9a2324f6();

    /* renamed from: jni_host */
    private static native java.lang.String m21214x76c29202();

    /* renamed from: jni_init */
    private static native int m21215x76c3016a(java.lang.String str, android.content.Context context);

    /* renamed from: jni_resume */
    private static native int m21216xe0e9b607();

    /* renamed from: jni_setInfo */
    private static native void m21217x712d6196(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: jni_setLogLevel */
    private static native void m21218xde57bb88(int i17);

    /* renamed from: jni_setLogger */
    private static native void m21219xe0885878();

    /* renamed from: jni_targetArchABI */
    private static native java.lang.String m21220x5c0b5e47();

    /* renamed from: jni_version */
    private static native java.lang.String m21221xfd6ea3e();

    /* renamed from: loadLibrary */
    public static void m21222xeb57c8f5(android.content.Context context) {
        java.lang.String str;
        if (f9728x4c3ac59e) {
            return;
        }
        str = "load library failed.";
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("AdvanceP2P");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/qcloud/qvb/XNet", "loadLibrary", "(Landroid/content/Context;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/qcloud/qvb/XNet", "loadLibrary", "(Landroid/content/Context;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            f9728x4c3ac59e = true;
        } catch (java.lang.Exception | java.lang.UnsatisfiedLinkError e17) {
            str = android.text.TextUtils.isEmpty(e17.getMessage()) ? "load library failed." : e17.getMessage();
            com.p307xc6797c64.qvb.AbstractC2851x87fce1b0.m21194x5c4d208(str);
        }
        if (!f9728x4c3ac59e) {
            throw new java.lang.Exception(str);
        }
    }

    /* renamed from: loadSoFromSdcard */
    private static boolean m21223xe430acad(vb.a aVar) {
        try {
            throw null;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    /* renamed from: proxyOf */
    public static java.lang.String m21224xed96f0e5(java.lang.String str) {
        java.lang.String m21205xfb805e1e = m21205xfb805e1e();
        if (m21205xfb805e1e.isEmpty()) {
            return "";
        }
        return m21205xfb805e1e + "/" + str + "/";
    }

    /* renamed from: resume */
    public static int m21225xc84dc82d() {
        if (!f9728x4c3ac59e) {
            com.p307xc6797c64.qvb.AbstractC2851x87fce1b0.m21194x5c4d208("so not loaded, ignore jni_resume call");
            return -1;
        }
        int m21216xe0e9b607 = m21216xe0e9b607();
        com.p307xc6797c64.qvb.AbstractC2851x87fce1b0.m21195x3164ae("resume, ret: " + m21216xe0e9b607);
        return m21216xe0e9b607;
    }

    /* renamed from: setCacheDir */
    public static void m21226x5cbbb42d(java.lang.String str) {
        f9725xe62915ab = str;
    }

    /* renamed from: setFilesDir */
    public static void m21227x4ac8c918(java.lang.String str) {
        f9726xd4362a96 = str;
    }

    /* renamed from: setInfo */
    public static void m21228x764b9430(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null || str2 == null || str3 == null) {
            throw new java.lang.NullPointerException("appId or appKey or appSecretKey can't be null!");
        }
        if (f9728x4c3ac59e) {
            m21217x712d6196(str, str2, str3);
        } else {
            com.p307xc6797c64.qvb.AbstractC2851x87fce1b0.m21194x5c4d208("so not loaded, ignore jni_setInfo call");
        }
    }

    /* renamed from: setLogLevel */
    public static void m21229xed871122(int i17) {
        f9729x158cb433 = i17;
        if (f9728x4c3ac59e) {
            m21218xde57bb88(i17);
        } else {
            com.p307xc6797c64.qvb.AbstractC2851x87fce1b0.m21194x5c4d208("so not loaded, ignore setLogLevel call");
        }
    }

    /* renamed from: setLogger */
    public static void m21230x16e44c92(com.p307xc6797c64.qvb.AbstractC2851x87fce1b0 abstractC2851x87fce1b0) {
        com.p307xc6797c64.qvb.AbstractC2851x87fce1b0.m21196x16e44c92(abstractC2851x87fce1b0);
        if (f9728x4c3ac59e) {
            m21219xe0885878();
        } else {
            com.p307xc6797c64.qvb.AbstractC2851x87fce1b0.m21194x5c4d208("so not loaded, ignore jni_setLogger call");
        }
    }

    /* renamed from: init */
    public static void m21208x316510(android.content.Context context, java.lang.String str) {
        com.p307xc6797c64.qvb.AbstractC2851x87fce1b0.m21195x3164ae("init XNet.");
        if (context == null || str == null) {
            throw new java.lang.NullPointerException("context/config can't be null when init XNet!");
        }
        f9723xabe45046 = new java.lang.ref.WeakReference<>(context);
        m21222xeb57c8f5(context);
        if (f9728x4c3ac59e && f9727x81896c1d) {
            m21201xa9527a90();
        }
        if (f9728x4c3ac59e) {
            m21229xed871122(f9729x158cb433);
        }
        int m21215x76c3016a = m21215x76c3016a(str, ((android.content.ContextWrapper) context).getBaseContext());
        if (m21215x76c3016a != 0) {
            throw new java.lang.IllegalStateException("init sdk error, ret=" + m21215x76c3016a);
        }
        android.content.SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("BuglySdkInfos", 0).edit();
        edit.putString("e30245116c", m21206x52c258a2());
        edit.apply();
    }
}
