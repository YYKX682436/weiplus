package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareParams f85092a;

    /* renamed from: b, reason: collision with root package name */
    public volatile transient boolean f85093b = false;

    /* renamed from: c, reason: collision with root package name */
    public volatile transient com.tencent.mm.plugin.appbrand.launching.u8 f85094c;

    /* renamed from: d, reason: collision with root package name */
    public volatile transient com.tencent.mm.ipcinvoker.r f85095d;

    /* renamed from: e, reason: collision with root package name */
    public volatile transient java.lang.ref.WeakReference f85096e;

    public r1(android.app.Activity activity, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f85096e = new java.lang.ref.WeakReference(activity);
        com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareParams appBrandPrepareTask$PrepareParams = new com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareParams();
        this.f85092a = appBrandPrepareTask$PrepareParams;
        appBrandPrepareTask$PrepareParams.f84380d = bm5.f1.a();
        appBrandPrepareTask$PrepareParams.f84382f = o6Var.u0();
        appBrandPrepareTask$PrepareParams.f84383g = o6Var.l2();
        appBrandPrepareTask$PrepareParams.f84384h = o6Var.S2(false);
        appBrandPrepareTask$PrepareParams.f84381e = o6Var.u0().S1;
    }

    public static void a(com.tencent.mm.plugin.appbrand.launching.r1 r1Var, com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult appBrandPrepareTask$PrepareResult) {
        r1Var.getClass();
        com.tencent.mm.plugin.appbrand.launching.o1 o1Var = appBrandPrepareTask$PrepareResult.f84385d;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = r1Var.f85092a.f84382f;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrepareTask", "[applaunch] runInClientProcess, event = %s, %s %d", o1Var, appBrandInitConfigWC.f77278d, java.lang.Integer.valueOf(appBrandInitConfigWC.f77281g));
        if (o1Var == null) {
            return;
        }
        switch (o1Var.ordinal()) {
            case 0:
                if (r1Var.f85094c != null) {
                    r1Var.f85094c.w(appBrandPrepareTask$PrepareResult.f84390i);
                    return;
                }
                return;
            case 1:
                com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = appBrandPrepareTask$PrepareResult.f84387f;
                if (appBrandSysConfigWC == null && appBrandPrepareTask$PrepareResult.f84386e == null) {
                    ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.appbrand.launching.f1(r1Var));
                } else if (appBrandSysConfigWC != null) {
                    ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.appbrand.launching.g1(r1Var));
                }
                if (r1Var.f85094c == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPrepareTask", "runInClientProcess, prepare done, but callback is null");
                    return;
                }
                com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC2 = appBrandPrepareTask$PrepareResult.f84387f;
                if (appBrandSysConfigWC2 != null) {
                    ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.plugin.appbrand.launching.h1(r1Var, appBrandSysConfigWC2.f305852r));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrepareTask", "runInClientProcess, config null");
                }
                try {
                    r1Var.f85094c.G(appBrandPrepareTask$PrepareResult.f84387f, appBrandPrepareTask$PrepareResult.f84386e, appBrandPrepareTask$PrepareResult.f84388g);
                    return;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandPrepareTask", th6, "runInClientProcess, prepare done exception interrupted[%b] appId[%s]", java.lang.Boolean.valueOf(r1Var.f85093b), r1Var.f85092a.f84382f.f77278d);
                    if (r1Var.f85093b) {
                        return;
                    }
                    android.app.Activity activity = (android.app.Activity) r1Var.f85096e.get();
                    if (activity != null) {
                        activity.finish();
                    }
                    com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.launching.i1(r1Var, th6));
                    return;
                }
            case 2:
                java.lang.ref.WeakReference weakReference = r1Var.f85096e;
                android.app.Activity activity2 = weakReference == null ? null : (android.app.Activity) weakReference.get();
                if (activity2 != null) {
                    activity2.finish();
                    activity2.overridePendingTransition(0, 0);
                }
                int myPid = android.os.Process.myPid();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(myPid));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/launching/AppBrandPrepareTask", "onEventResult", "(Lcom/tencent/mm/plugin/appbrand/launching/AppBrandPrepareTask$PrepareResult;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(obj, "com/tencent/mm/plugin/appbrand/launching/AppBrandPrepareTask", "onEventResult", "(Lcom/tencent/mm/plugin/appbrand/launching/AppBrandPrepareTask$PrepareResult;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                return;
            case 3:
                if (r1Var.f85094c != null) {
                    r1Var.f85094c.H(appBrandPrepareTask$PrepareResult.f84389h);
                    return;
                }
                return;
            case 4:
                if (r1Var.f85094c != null) {
                    r1Var.f85094c.A();
                    return;
                }
                return;
            case 5:
                if (r1Var.f85094c != null) {
                    r1Var.f85094c.E(appBrandPrepareTask$PrepareResult.f84391m);
                    return;
                }
                return;
            case 6:
                if (r1Var.f85094c != null) {
                    r1Var.f85094c.J();
                    return;
                }
                return;
            case 7:
                if (r1Var.f85094c != null) {
                    r1Var.f85094c.F();
                    return;
                }
                return;
            case 8:
                if (r1Var.f85094c != null) {
                    r1Var.f85094c.y();
                    return;
                }
                return;
            case 9:
                if (r1Var.f85094c != null) {
                    r1Var.f85094c.C();
                    return;
                }
                return;
            case 10:
                if (r1Var.f85094c != null) {
                    r1Var.f85094c.z(appBrandPrepareTask$PrepareResult.f84392n);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void b() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareParams appBrandPrepareTask$PrepareParams = this.f85092a;
        objArr[0] = appBrandPrepareTask$PrepareParams == null ? null : appBrandPrepareTask$PrepareParams.f84382f.f77278d;
        objArr[1] = java.lang.Integer.valueOf(appBrandPrepareTask$PrepareParams == null ? -1 : appBrandPrepareTask$PrepareParams.f84382f.f77281g);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrepareTask", "interrupt() appId[%s] type[%d]", objArr);
        this.f85093b = true;
        com.tencent.mm.plugin.appbrand.launching.u8 u8Var = this.f85094c;
        if (u8Var != null) {
            u8Var.dead();
        }
        if (this.f85095d != null) {
            com.tencent.mm.ipcinvoker.extension.l.c(this.f85095d);
            this.f85095d = null;
        }
    }

    public void c() {
        com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareParams appBrandPrepareTask$PrepareParams = this.f85092a;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = appBrandPrepareTask$PrepareParams.f84384h;
        java.lang.String str = appBrandPrepareTask$PrepareParams.f84382f.f77278d;
        java.util.Locale locale = java.util.Locale.ENGLISH;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(iCommLibReader instanceof com.tencent.mm.plugin.appbrand.appcache.AssetReader);
        objArr[1] = java.lang.Integer.valueOf(iCommLibReader == null ? -1 : iCommLibReader.i());
        objArr[2] = iCommLibReader == null ? "" : iCommLibReader.W0();
        com.tencent.mm.plugin.appbrand.keylogger.w.a(com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.class, str, java.lang.String.format(locale, "CommLibInfo: useLocal=%b,libVersionInt=%d,libVersionStr=%s", objArr));
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, appBrandPrepareTask$PrepareParams, com.tencent.mm.plugin.appbrand.launching.m1.class, new com.tencent.mm.plugin.appbrand.launching.d1(this));
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = appBrandPrepareTask$PrepareParams.f84382f;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrepareTask", "[applaunch] startPrepare in appbrand %s, %d", appBrandInitConfigWC.f77278d, java.lang.Integer.valueOf(appBrandInitConfigWC.f77281g));
    }
}
