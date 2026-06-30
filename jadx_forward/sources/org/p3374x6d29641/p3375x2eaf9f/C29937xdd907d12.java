package org.p3374x6d29641.p3375x2eaf9f;

/* renamed from: org.xwalk.core.XWalkEnvironment */
/* loaded from: classes13.dex */
public class C29937xdd907d12 {

    /* renamed from: c, reason: collision with root package name */
    public static android.content.Context f429503c = null;

    /* renamed from: d, reason: collision with root package name */
    public static by5.u3 f429504d = null;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f429505e = null;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f429506f = null;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f429507g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f429508h = false;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f429509i = false;

    /* renamed from: j, reason: collision with root package name */
    public static int f429510j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f429511k;

    /* renamed from: o, reason: collision with root package name */
    public static by5.t0 f429515o;

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.String f429516p;

    /* renamed from: a, reason: collision with root package name */
    public static final zx5.k f429501a = new zx5.k();

    /* renamed from: b, reason: collision with root package name */
    public static final wx5.b f429502b = new wx5.b();

    /* renamed from: l, reason: collision with root package name */
    public static final android.os.Bundle f429512l = new android.os.Bundle();

    /* renamed from: isTurnOnKVLog */
    public static boolean f76383x856b8893 = false;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Set f429513m = new java.util.HashSet();

    /* renamed from: n, reason: collision with root package name */
    public static final android.os.Bundle f429514n = new android.os.Bundle();

    /* renamed from: q, reason: collision with root package name */
    public static int f429517q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f429518r = false;

    public static void a(java.lang.String str) {
        by5.c4.f("XWalkEnvironment", "appendAppInfo:" + str);
        ((java.util.HashSet) f429513m).add(str);
    }

    public static android.content.Context b(android.content.Context context) {
        return context instanceof android.app.Application ? context : context.getApplicationContext();
    }

    public static void c(android.content.Context context) {
        if (p()) {
            return;
        }
        q(context);
    }

    /* renamed from: containsAppInfo */
    public static boolean m156974xd8072b50(java.lang.String str) {
        by5.c4.f("XWalkEnvironment", "containsAppInfo, strInfos:" + str);
        java.lang.String[] split = str.split("&");
        if (split != null && split.length != 0) {
            for (java.lang.String str2 : split) {
                if (!android.text.TextUtils.isEmpty(str2)) {
                    if (!((java.util.HashSet) f429513m).contains(str2.trim())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static int d() {
        by5.u3 u3Var = f429504d;
        if (u3Var == null) {
            return -1;
        }
        return u3Var.f118138a;
    }

    /* renamed from: dumpAppInfo */
    public static java.lang.String m156975x966e5ddb() {
        java.lang.String join = android.text.TextUtils.join(";", f429513m);
        by5.c4.f("XWalkEnvironment", "dumpAppInfo:" + join);
        return join;
    }

    public static synchronized boolean e() {
        boolean z17;
        synchronized (org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.class) {
            if (android.os.Build.VERSION.SDK_INT < 26) {
                by5.c4.f("XWalkEnvironment", "getEnableSandbox, disable sandbox because android version below O");
                f429518r = false;
            }
            by5.c4.f("XWalkEnvironment", "getEnableSandbox:" + f429518r);
            z17 = f429518r;
        }
        return z17;
    }

    public static boolean f(int i17) {
        tx5.h g17;
        tx5.i c17 = tx5.j.c(n(d()));
        if (c17 == null || (g17 = c17.g()) == null) {
            return false;
        }
        return g17.mo120203x3ec63efc(i17);
    }

    public static int g(java.lang.String str) {
        return by5.u3.c(str).f118138a;
    }

    /* renamed from: getProcessName */
    public static java.lang.String m156976xe5e58464() {
        java.lang.Object obj;
        java.lang.String str;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        java.lang.Object c17;
        if (!android.text.TextUtils.isEmpty(f429516p)) {
            return f429516p;
        }
        android.os.Bundle bundle = f429514n;
        synchronized (bundle) {
            obj = bundle.get("processName");
        }
        if (obj != null) {
            java.lang.String obj2 = obj.toString();
            f429516p = obj2;
            return obj2;
        }
        android.content.Context context = f429503c;
        if (android.os.Build.VERSION.SDK_INT < 28 || (c17 = by5.j0.c("android.app.Application", "getProcessName")) == null) {
            try {
                str = by5.g0.a();
            } catch (java.lang.Throwable unused) {
                if (context != null) {
                    int myPid = android.os.Process.myPid();
                    android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
                    if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
                        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                            if (runningAppProcessInfo.pid == myPid) {
                                by5.c4.f("ProcessUtil", "getProcessNameByPid, processName:" + runningAppProcessInfo.processName);
                                str = runningAppProcessInfo.processName;
                                break;
                            }
                        }
                    }
                }
                str = null;
            }
        } else {
            by5.c4.f("ProcessUtil", "safeGetProcessName, processName:" + c17);
            str = c17.toString();
        }
        f429516p = str;
        return str;
    }

    public static int h() {
        return g(by5.a.b());
    }

    public static int i() {
        return g("armeabi-v7a".equalsIgnoreCase(by5.a.b()) ? "arm64-v8a" : "armeabi-v7a");
    }

    public static int j(android.content.Context context, java.lang.String str) {
        if (context == null) {
            by5.c4.c("XWalkEnvironment", "getInstalledPluginVersion, context is null");
            return -2;
        }
        android.content.SharedPreferences d17 = by5.d4.d(str);
        if (d17 != null) {
            return d17.getInt("availableVersion", -1);
        }
        by5.c4.c("XWalkEnvironment", "getInstalledPluginVersion, sp is null");
        return -3;
    }

    public static synchronized int k() {
        synchronized (org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.class) {
            int i17 = f429517q;
            if (i17 < 0 || i17 > 2) {
                by5.c4.g("XWalkEnvironment", "getMultiProcessType, MULTI_PROCESS_TYPE_DISABLE");
                return 0;
            }
            by5.c4.f("XWalkEnvironment", "getMultiProcessType, multiProcessType:" + f429517q);
            return f429517q;
        }
    }

    public static java.lang.String l() {
        android.content.Context context = f429503c;
        if (context != null) {
            return context.getPackageName();
        }
        by5.c4.c("XWalkEnvironment", "getPackageName, sApplicationContext is null");
        return "";
    }

    public static java.lang.String m(java.lang.String str) {
        try {
            java.lang.String m156976xe5e58464 = m156976xe5e58464();
            if (m156976xe5e58464 == null) {
                m156976xe5e58464 = "";
            } else if (m156976xe5e58464.contains(":")) {
                m156976xe5e58464 = m156976xe5e58464.substring(m156976xe5e58464.lastIndexOf(":") + 1).toLowerCase();
            } else if (m156976xe5e58464.contains(".")) {
                m156976xe5e58464 = m156976xe5e58464.substring(m156976xe5e58464.lastIndexOf(".") + 1).toLowerCase();
            }
            if (!"tools".equalsIgnoreCase(m156976xe5e58464) && !"mm".equalsIgnoreCase(m156976xe5e58464) && !"support".equalsIgnoreCase(m156976xe5e58464)) {
                if (m156976xe5e58464.startsWith("appbrand")) {
                    by5.c4.f("XWalkEnvironment", "getSafeModuleName, module = appbrand");
                    return "appbrand";
                }
                by5.c4.f("XWalkEnvironment", "getSafeModuleName, unknown:" + m156976xe5e58464 + ", use defaultVal:" + str);
                return str;
            }
            by5.c4.f("XWalkEnvironment", "getSafeModuleName, module = " + m156976xe5e58464);
            return m156976xe5e58464;
        } catch (java.lang.Throwable th6) {
            by5.c4.d("XWalkEnvironment", "getSafeModuleName, use defaultVal:" + str + ", error", th6);
            return str;
        }
    }

    public static com.p314xaae8f345.p3210x3857dc.f1 n(int i17) {
        boolean p17 = p();
        com.p314xaae8f345.p3210x3857dc.f1 f1Var = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_NONE;
        if (!p17) {
            by5.c4.g("XWalkEnvironment", "getWebViewKindFromVersion, not init yet, version:" + i17);
            return f1Var;
        }
        if (i17 <= 0) {
            by5.c4.g("XWalkEnvironment", "getWebViewKindFromVersion, invalid version:" + i17);
            return f1Var;
        }
        if (by5.z3.s(i17, "libxwebcore.so")) {
            return com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS;
        }
        by5.c4.g("XWalkEnvironment", "getWebViewKindFromVersion, version:" + i17 + ", no pinus so file exist");
        return f1Var;
    }

    public static boolean o() {
        return 2000 <= d();
    }

    public static boolean p() {
        return f429503c != null;
    }

    public static synchronized void q(android.content.Context context) {
        synchronized (org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.class) {
            if (context == null) {
                by5.c4.g("XWalkEnvironment", "init, invalid context");
                return;
            }
            if (p()) {
                by5.c4.g("XWalkEnvironment", "init, already init");
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            by5.c4.g("XWalkEnvironment", "init start, sdkVersion:20260502, processName:" + m156976xe5e58464() + ", stack:" + android.util.Log.getStackTraceString(new java.lang.Exception("please ignore this exception")));
            f429503c = b(context);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init, application context:");
            sb6.append(f429503c);
            by5.c4.f("XWalkEnvironment", sb6.toString());
            by5.d4.h(f429503c);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            f429504d = r();
            by5.c4.f("XWalkEnvironment", "init, initCoreInfo costTime:" + (java.lang.System.currentTimeMillis() - currentTimeMillis2) + ", coreInfo:" + f429504d);
            by5.c4.f("XWalkEnvironment", "showBuildConfigs, SHOULD_EMBED_XWEB_CORE:false, XWEB_TEST_MODE:false, FORCE_XWEB_CORE:false, NEED_TURN_OFF_DYNAMIC_CODE:false, THIRD_PARD_RELEASE:false");
            by5.a1.f();
            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
            cy5.m.f();
            by5.c4.f("XWalkEnvironment", "init, initPlugins costTime:" + (java.lang.System.currentTimeMillis() - currentTimeMillis3));
            com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
            u0Var.e(context);
            f429505e = "com.tencent.xweb.pinus.sdk.process.PrivilegedProcessService";
            f429506f = "com.tencent.xweb.pinus.sdk.process.SandboxedProcessService";
            com.p314xaae8f345.p3210x3857dc.t1.i();
            synchronized (com.p314xaae8f345.p3210x3857dc.i3.class) {
                android.content.SharedPreferences c17 = by5.d4.c();
                if (c17 != null && by5.a1.c()) {
                    by5.c4.f("XWebWebViewMode", "init, remove webview mode");
                    c17.edit().remove("SP_KEY_WEBVIEW_MODE_FOR_MM").apply();
                }
            }
            if (by5.a1.c()) {
                by5.c4.f("XWebRemoteDebugHandler", "reset remote debug started to false");
                u0Var.l(false);
            }
            zx5.n.b(f429503c, f429501a);
            wx5.e.b(f429503c, f429502b);
            com.p314xaae8f345.p3210x3857dc.C27818xf002da6f.d();
            by5.c4.g("XWalkEnvironment", "init end, processName:" + m156976xe5e58464() + ", costTime:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public static by5.u3 r() {
        android.content.SharedPreferences g17;
        android.content.SharedPreferences g18 = by5.d4.g("xweb_using_core_version");
        if (g18 != null && l().equalsIgnoreCase(m156976xe5e58464())) {
            by5.c4.f("XWebCoreInfo", "reset using core version in main process");
            g18.edit().clear().apply();
        }
        java.lang.String b17 = by5.a.b();
        by5.u3 c17 = by5.u3.c(b17);
        int i17 = c17.f118138a;
        if (i17 > 0) {
            java.io.File file = new java.io.File(by5.z3.b(i17));
            if (!(file.exists() && file.isFile())) {
                by5.c4.f("XWalkEnvironment", "initCoreVersionInfo, no apk in version(" + c17.f118138a + ") dir");
                c17 = new by5.u3(-1, null, b17);
                by5.u3.e(c17.f118138a, c17.f118139b, c17.f118140c);
            }
        }
        int i18 = c17.f118138a;
        if (i18 > 0 && by5.z3.s(i18, "libxwalkcore.so")) {
            by5.c4.f("XWalkEnvironment", "initCoreVersionInfo, xwalk core version(" + c17.f118138a + ") no longer support");
            c17 = new by5.u3(-1, null, b17);
            by5.u3.e(c17.f118138a, c17.f118139b, c17.f118140c);
        }
        int i19 = c17.f118138a;
        if (i19 > 0 && (g17 = by5.d4.g("xweb_using_core_version")) != null) {
            by5.c4.f("XWebCoreInfo", "save using core version:" + i19);
            g17.edit().putBoolean("using_core_version_" + i19, true).apply();
        }
        return c17;
    }

    public static void s(android.content.Context context, boolean z17) {
        if (context == null) {
            by5.c4.g("XWalkEnvironment", "initInChildProcess, invalid context");
            return;
        }
        if (p()) {
            by5.c4.g("XWalkEnvironment", "initInChildProcess, already init");
            return;
        }
        by5.c4.g("XWalkEnvironment", "initInChildProcess start, sdkVersion:20260502, isIsolated:" + z17 + " stack:" + android.util.Log.getStackTraceString(new java.lang.Exception("please ignore this exception")));
        f429503c = b(context);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initInChildProcess, application context:");
        sb6.append(f429503c);
        by5.c4.g("XWalkEnvironment", sb6.toString());
        if (!z17) {
            by5.d4.h(f429503c);
            f429504d = r();
            by5.c4.f("XWalkEnvironment", "initInChildProcess, coreInfo:" + f429504d);
        }
        by5.c4.g("XWalkEnvironment", "initInChildProcess end, processName:" + m156976xe5e58464());
    }

    public static boolean t() {
        return o() && f(2020);
    }

    public static void u(java.util.Locale locale) {
        if (locale == null) {
            by5.c4.g("XWalkEnvironment", "setLocale, customize locale not set");
            return;
        }
        by5.c4.f("XWalkEnvironment", "setLocale, customize locale:" + locale.toLanguageTag());
        f429507g = locale.toLanguageTag();
    }
}
