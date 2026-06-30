package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class n7 implements com.tencent.mm.plugin.appbrand.launching.n1 {

    /* renamed from: d, reason: collision with root package name */
    public volatile android.os.CancellationSignal f86034d;

    /* renamed from: e, reason: collision with root package name */
    public volatile android.os.CancellationSignal f86035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.r1 f86036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.u8 f86037g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f86038h;

    public n7(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.launching.r1 r1Var, com.tencent.mm.plugin.appbrand.u8 u8Var) {
        this.f86038h = o6Var;
        this.f86036f = r1Var;
        this.f86037g = u8Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.n1
    public void A() {
        boolean z17 = this.f86038h.L0() || this.f86036f.f85093b;
        this.f86038h.K("onSyncLaunchStart task[%d] interrupted[%b]", java.lang.Integer.valueOf(this.f86036f.hashCode()), java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        try {
            com.tencent.mm.plugin.appbrand.report.quality.e.b(this.f86038h.f74803n, true).K = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeWC", "onSyncLaunchStart get QualitySession with appId[%s], e=%s", this.f86038h.f74803n, e17);
        }
        com.tencent.mm.plugin.appbrand.j3 j3Var = this.f86038h.f86188t2;
        if (j3Var != null) {
            j3Var.l(com.tencent.mm.plugin.appbrand.p4.SYNC_LAUNCH);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.n1
    public void C() {
        boolean z17 = this.f86038h.L0() || this.f86036f.f85093b;
        this.f86038h.K("notifyAppRestartOnLaunchRequestedLatestVersion, task[%d], interrupted[%b]", java.lang.Integer.valueOf(this.f86036f.hashCode()), java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        this.f86035e = a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.n7$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.n7.this.f86038h;
                wg1.b bVar = wg1.b.f445711d;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeRestartHelper", "restartAppImplOnLaunchRequestedLatestVersion appId:%s", o6Var.f74803n);
                new com.tencent.mm.plugin.appbrand.ye$$a(o6Var, bVar).run();
            }
        });
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.y4
    public void E(int i17) {
        this.f86038h.E(i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.n1
    public void F() {
        boolean z17 = this.f86038h.L0() || this.f86036f.f85093b;
        boolean z18 = this.f86038h.u0().f77309v2;
        this.f86038h.K("onLaunchTimeoutFallbackReloadRequested, task[%d], interrupted[%b], isBackupWxaAttrsAlreadyUsed[%b]", java.lang.Integer.valueOf(this.f86036f.hashCode()), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (z17 || z18) {
            return;
        }
        this.f86034d = a(new com.tencent.mm.plugin.appbrand.t7(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.n1
    public void G(com.tencent.luggage.sdk.config.AppBrandSysConfigLU appBrandSysConfigLU, com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction appBrandLaunchErrorAction, final com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle appStartupPerformanceReportBundle) {
        final com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) appBrandSysConfigLU;
        boolean z17 = this.f86036f.f85093b;
        boolean z18 = this.f86038h.S;
        boolean L0 = this.f86038h.L0();
        boolean z19 = this.f86034d != null;
        sj1.l.e(this.f86038h.f74803n, "internal:prepare", "AppBrandPrepareTask.onPrepareDone");
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f86038h;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(this.f86036f.hashCode());
        objArr[1] = java.lang.Boolean.valueOf(appBrandSysConfigWC == null);
        objArr[2] = java.lang.Boolean.valueOf(z17);
        objArr[3] = java.lang.Boolean.valueOf(z18);
        objArr[4] = java.lang.Boolean.valueOf(L0);
        objArr[5] = java.lang.Boolean.valueOf(z19);
        o6Var.K("AppBrandPrepareTask.onPrepareDone task[%d] null==config?[%b], isInterruptedBeforePrepareDone[%b], runtimeFinishing[%b %b], isFallbackReloadRequested[%b]", objArr);
        if (z17 || z18 || L0) {
            this.f86038h.H.a("destroyed");
            return;
        }
        if (appBrandSysConfigWC == null) {
            com.tencent.mm.plugin.appbrand.keylogger.w.b(this.f86038h.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPrepareResourceWaitForResult);
            com.tencent.mm.plugin.appbrand.keylogger.w.b(this.f86038h.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepColdLaunchFailed);
            com.tencent.mm.plugin.appbrand.keylogger.w.i(com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.class, this.f86038h.f74803n);
            this.f86038h.H.a(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
            if (this.f86034d != null) {
                return;
            }
            this.f86038h.L2(new com.tencent.mm.plugin.appbrand.o7(this, appBrandLaunchErrorAction));
            if (appBrandLaunchErrorAction != null) {
                com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.d(this.f86038h, com.tencent.mm.plugin.appbrand.jsapi.fakenative.h0.LaunchFailed);
            }
            java.lang.String str = this.f86038h.f74803n;
            java.lang.String t07 = this.f86038h.t0();
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject l27 = this.f86038h.l2();
            if (l27 != null && !com.tencent.mm.sdk.platformtools.t8.K0(l27.f87794m)) {
                com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.k0.b(4, str, t07, l27.f87794m, 0L);
            }
            if (this.f86038h.u0().h()) {
                if (appBrandLaunchErrorAction != null) {
                    ((com.tencent.mm.plugin.appbrand.wxassistant.u0) ((com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class))).Ui(this.f86038h.u0().f(), this.f86038h.f74803n, com.tencent.mm.plugin.appbrand.service.o0.f88731p);
                    return;
                } else {
                    ((com.tencent.mm.plugin.appbrand.wxassistant.u0) ((com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class))).Ui(this.f86038h.u0().f(), this.f86038h.f74803n, com.tencent.mm.plugin.appbrand.service.o0.f88732r);
                    return;
                }
            }
            return;
        }
        this.f86038h.K("AppBrandPrepareTask.onPrepareDone task[%d] pkg[%s]", java.lang.Integer.valueOf(this.f86036f.hashCode()), appBrandSysConfigWC.f305852r);
        if (this.f86034d != null) {
            this.f86034d.cancel();
            this.f86034d = null;
        }
        if (this.f86035e != null) {
            this.f86035e.cancel();
            this.f86035e = null;
        }
        com.tencent.mm.plugin.appbrand.keylogger.w.e(this.f86038h.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPrepareResourceWaitForResult);
        com.tencent.mm.plugin.appbrand.keylogger.w.e(this.f86038h.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPrepareResourceGroup);
        com.tencent.mm.plugin.appbrand.keylogger.w.g(this.f86038h.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepSetupConfigsPostResourcePrepared);
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader S2 = this.f86038h.S2(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "onPrepareDone runtimeLibReader[%s] of runtime[%s], relyCommLibUpdate[%b], updatedCommLibVersionInLaunch[%d]", S2, this.f86038h.toString(), java.lang.Boolean.valueOf(appBrandSysConfigWC.A.f47304g), java.lang.Integer.valueOf(appBrandSysConfigWC.A.f47308n));
        if (S2 == null) {
            this.f86038h.H.a("FATAL");
            return;
        }
        boolean z27 = com.tencent.mm.plugin.appbrand.appcache.y7.f76065a.d() && (S2 instanceof com.tencent.mm.plugin.appbrand.appcache.AssetReader);
        if (z27 && appBrandSysConfigWC.A.f47308n > 0) {
            this.f86038h.H.a("reload");
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.p7(this));
            return;
        }
        this.f86038h.p3(S2);
        if (z27 && ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_appbrand_local_common_lib_safe_reload, true)) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), com.tencent.mm.plugin.appbrand.appcache.r5.class, new com.tencent.mm.plugin.appbrand.r7(this));
            return;
        }
        this.f86038h.H.c();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "[AfterLaunchTiming] afterLaunchAdvanceEnabled=%b, appId=%s", java.lang.Boolean.valueOf(this.f86038h.Y2.a()), this.f86038h.f74803n);
        if (this.f86038h.Y2.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "[AfterLaunchTiming] cold_start EARLY: onResourcePrepareComplete, calling afterlaunch, appId=%s", this.f86038h.f74803n);
            com.tencent.mm.plugin.appbrand.trade.l.a(this.f86038h);
        }
        boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (com.tencent.mm.plugin.appbrand.appcache.g0.b(this.f86038h.f74805p.f77281g) && this.f86038h.u0().L != appBrandSysConfigWC.f305852r.pkgVersion) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeWC", "onPrepareDone, InitConfig.appVersion(%d) != SysConfig.appVersion(%d), appId:%s", java.lang.Integer.valueOf(this.f86038h.u0().L), java.lang.Integer.valueOf(appBrandSysConfigWC.f305852r.pkgVersion), this.f86038h.f74803n);
            if (this.f86038h.I1) {
                iz5.a.h("InitConfig.appVersion != SysConfig.appVersion @smoothieli");
                throw null;
            }
        }
        ((com.tencent.mm.plugin.appbrand.m2) this.f86038h.E).add(appBrandSysConfigWC);
        ((com.tencent.mm.plugin.appbrand.m2) this.f86038h.E).add(appStartupPerformanceReportBundle);
        final long currentTimeMillis = java.lang.System.currentTimeMillis();
        final com.tencent.mm.plugin.appbrand.j3 j3Var = this.f86038h.f86188t2;
        if (j3Var != null) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.j3$$d
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.j3 j3Var2 = com.tencent.mm.plugin.appbrand.j3.this;
                    km5.q qVar = j3Var2.f78462n;
                    if (qVar == null) {
                        j3Var2.j();
                        return;
                    }
                    lm5.j jVar = lm5.d.f319601b;
                    ((km5.q) qVar.b(jVar, new com.tencent.mm.plugin.appbrand.a4(j3Var2))).t(jVar, new com.tencent.mm.plugin.appbrand.z3(j3Var2));
                }
            };
            synchronized (j3Var.f78460l) {
                if (j3Var.f78459k.get()) {
                    runnable.run();
                } else {
                    j3Var.f78460l.addLast(runnable);
                }
            }
        }
        java.lang.String str2 = this.f86038h.f74803n;
        java.util.List list = (java.util.List) ((java.util.HashMap) pj1.b.f354931a.f354932a).get(com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.NAME);
        if (list != null && list.size() > 0) {
            android.support.v4.media.f.a(list.get(0));
            throw null;
        }
        if (this.f86038h.f86190v2 != null) {
            this.f86038h.f86190v2.b();
        }
        ((com.tencent.mm.plugin.appbrand.m2) this.f86038h.E).add(appBrandSysConfigWC.A.f47301d);
        ((com.tencent.mm.plugin.appbrand.m2) this.f86038h.E).add(new si1.n(appBrandSysConfigWC.B));
        ((com.tencent.mm.plugin.appbrand.m2) this.f86038h.E).add(new ti1.b(appBrandSysConfigWC.C));
        com.tencent.mm.plugin.appbrand.o6 o6Var2 = this.f86038h;
        o6Var2.getClass();
        o6Var2.X1 = new si1.a1(o6Var2);
        try {
            java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "AppBrandRuntimeWC(%s)#resetAppConfig", this.f86038h.f74803n);
            final com.tencent.mm.plugin.appbrand.o6 o6Var3 = this.f86038h;
            cf.i.b(format, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.n7$$d
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.o6.this.w2();
                }
            });
            com.tencent.mm.plugin.appbrand.j3 j3Var2 = this.f86038h.f86188t2;
            if (j3Var2 != null) {
                com.tencent.mm.plugin.appbrand.o6 o6Var4 = j3Var2.f78450b;
                if (!o6Var4.q2() && ((o6Var4.g2() != 1030 || !com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d) && gf.y0.b(o6Var4, o6Var4.t0(), false))) {
                    km5.q qVar = j3Var2.f78462n;
                    if (qVar != null) {
                        qVar.B();
                    }
                    j3Var2.j();
                }
            }
            final com.tencent.mm.plugin.appbrand.b6 b6Var = (com.tencent.mm.plugin.appbrand.b6) this.f86037g.f89275b;
            final java.lang.String str3 = b6Var.f76764b.f74803n;
            ((ku5.t0) ku5.t0.f312615d).a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.b6$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.b6 b6Var2 = com.tencent.mm.plugin.appbrand.b6.this;
                    com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle appStartupPerformanceReportBundle2 = appStartupPerformanceReportBundle;
                    com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC2 = appBrandSysConfigWC;
                    long j17 = currentTimeMillis;
                    java.lang.String str4 = str3;
                    b6Var2.getClass();
                    try {
                        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime a17 = com.tencent.mm.plugin.appbrand.report.quality.e.a(b6Var2.f76764b);
                        if (a17 != null) {
                            com.tencent.mm.plugin.appbrand.report.quality.e.f88172a.m(b6Var2.f76764b, a17, appStartupPerformanceReportBundle2);
                            if (appBrandSysConfigWC2 != null) {
                                try {
                                    com.tencent.mm.plugin.appbrand.report.quality.e.c(appBrandSysConfigWC2, a17, appStartupPerformanceReportBundle2, b6Var2.f76764b, j17);
                                    int i17 = appBrandSysConfigWC2.Y.I * 1000;
                                    com.tencent.mm.plugin.appbrand.report.quality.w wVar = com.tencent.mm.plugin.appbrand.report.quality.t0.f88312l;
                                    com.tencent.mars.xlog.Log.i("MicroMsg.QualitySampleHelper", "updateSampleInterval :%d", java.lang.Integer.valueOf(i17));
                                    com.tencent.mm.plugin.appbrand.report.quality.k1.f88215a.f88244a = i17;
                                } catch (java.lang.Throwable th6) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimePrepareProcessResultReporterBlockingProcess", "onPrepareDone [%s] reportResourceReady e = %s", str4, th6);
                                }
                            }
                        }
                    } finally {
                        b6Var2.d();
                    }
                }
            });
            com.tencent.mm.plugin.appbrand.keylogger.w.e(this.f86038h.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepSetupConfigsPostResourcePrepared);
            this.f86038h.getClass();
            com.tencent.mm.plugin.appbrand.keepalive.j jVar = com.tencent.mm.plugin.appbrand.keepalive.j.INSTANCE;
            com.tencent.mm.plugin.appbrand.o6 o6Var5 = this.f86038h;
            jVar.getClass();
            o6Var5.N.a(new com.tencent.mm.plugin.appbrand.keepalive.f(jVar, o6Var5));
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKeepAliveManager", "setUp process:%s", bm5.f1.a());
            this.f86038h.f86178l2 = null;
            this.f86038h.m(new com.tencent.mm.plugin.appbrand.s7(this));
            if (this.f86038h.f86191w2 != null) {
                if (this.f86036f.f85093b || !u46.a.a(appBrandSysConfigWC.N, 2)) {
                    this.f86038h.f86191w2.a();
                } else {
                    this.f86038h.f86191w2.b();
                }
            }
            if (!this.f86036f.f85093b) {
                com.tencent.mm.plugin.appbrand.launching.j2 j2Var = new com.tencent.mm.plugin.appbrand.launching.j2(this.f86038h, this.f86037g);
                java.util.LinkedList linkedList = j2Var.f84689c;
                if (linkedList.size() <= 0) {
                    j2Var.f84688b.d();
                } else {
                    cf.d dVar = new cf.d(new com.tencent.mm.plugin.appbrand.launching.i2(j2Var), linkedList.size());
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((yz5.l) it.next()).invoke(new com.tencent.mm.plugin.appbrand.launching.h2(dVar));
                    }
                }
            }
            i81.b0 b0Var = this.f86038h.A2;
            if (b0Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "onResourceReadyReceived");
                b0Var.f289535l = true;
                b0Var.b();
            }
            this.f86038h.K("onPrepareDone stuffs task[%d] cost[%dms] interrupted[%b]", java.lang.Integer.valueOf(this.f86036f.hashCode()), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Boolean.valueOf(this.f86036f.f85093b));
            sj1.l.g(this.f86038h.f74803n);
        } catch (com.tencent.mm.plugin.appbrand.appstorage.r1 unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeWC", "onPrepareDone [%s] commLib not ready", this.f86038h.f74803n);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.n1
    public void H(final int i17) {
        boolean z17 = this.f86038h.L0() || this.f86036f.f85093b;
        this.f86038h.K("onDownloadProgress(%d), task[%d] hasDownload[%b]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f86036f.hashCode()), java.lang.Boolean.valueOf(this.f86038h.f86180m2));
        if (z17) {
            return;
        }
        final com.tencent.mm.plugin.appbrand.o6 o6Var = this.f86038h;
        o6Var.getClass();
        o6Var.m(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$g
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.ui.vc vcVar = com.tencent.mm.plugin.appbrand.AppBrandRuntime.this.f74811t;
                if (vcVar != null) {
                    vcVar.setProgress(i17);
                }
            }
        });
        o6Var.H.getClass();
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.n1
    public void J() {
        boolean z17 = this.f86038h.L0() || this.f86036f.f85093b;
        this.f86038h.K("onSyncJsApiInfoStart task[%d] interrupted[%b]", java.lang.Integer.valueOf(this.f86036f.hashCode()), java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        try {
            com.tencent.mm.plugin.appbrand.report.quality.e.b(this.f86038h.f74803n, true).M = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeWC", "onSyncJsApiInfoStart get QualitySession with appId[%s], e=%s", this.f86038h.f74803n, e17);
        }
        com.tencent.mm.plugin.appbrand.j3 j3Var = this.f86038h.f86188t2;
        if (j3Var != null) {
            j3Var.l(com.tencent.mm.plugin.appbrand.p4.SYNC_JSAPIINFO);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeWC", "AppBrandRuntimeBoostStrategy boost null!");
        }
    }

    public final android.os.CancellationSignal a(final java.lang.Runnable runnable) {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f86038h;
        if (o6Var.f74796e == null) {
            o6Var.K2();
            return null;
        }
        final android.app.Activity r07 = o6Var.r0();
        if (r07 == null) {
            o6Var.K2();
            return null;
        }
        if (o6Var.Y != null) {
            final android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
            o6Var.m(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.n7$$b
                @Override // java.lang.Runnable
                public final void run() {
                    final com.tencent.mm.plugin.appbrand.n7 n7Var = com.tencent.mm.plugin.appbrand.n7.this;
                    android.os.CancellationSignal cancellationSignal2 = cancellationSignal;
                    final java.lang.Runnable runnable2 = runnable;
                    final android.app.Activity activity = r07;
                    n7Var.getClass();
                    if (cancellationSignal2.isCanceled()) {
                        if (runnable2 instanceof wu5.b) {
                            ((wu5.b) runnable2).b();
                        }
                    } else {
                        final androidx.lifecycle.v vVar = new androidx.lifecycle.v() { // from class: com.tencent.mm.plugin.appbrand.n7$$e
                            @Override // androidx.lifecycle.v
                            public final void onStateChanged(androidx.lifecycle.y yVar, androidx.lifecycle.m mVar) {
                                com.tencent.mm.plugin.appbrand.n7 n7Var2 = com.tencent.mm.plugin.appbrand.n7.this;
                                n7Var2.getClass();
                                int i17 = com.tencent.mm.plugin.appbrand.i8.f78336a[mVar.ordinal()];
                                if (i17 == 1) {
                                    n7Var2.f86038h.K2();
                                } else {
                                    if (i17 != 2) {
                                        return;
                                    }
                                    runnable2.run();
                                }
                            }
                        };
                        ((androidx.fragment.app.FragmentActivity) activity).mo133getLifecycle().a(vVar);
                        final androidx.lifecycle.v vVar2 = new androidx.lifecycle.v() { // from class: com.tencent.mm.plugin.appbrand.n7$$f
                            @Override // androidx.lifecycle.v
                            public final void onStateChanged(androidx.lifecycle.y yVar, androidx.lifecycle.m mVar) {
                                if (mVar == androidx.lifecycle.m.ON_DESTROY) {
                                    ((androidx.fragment.app.FragmentActivity) activity).mo133getLifecycle().c(vVar);
                                }
                            }
                        };
                        ((com.tencent.mm.plugin.appbrand.x2) n7Var.f86038h.P).f92371d.a(vVar2);
                        cancellationSignal2.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() { // from class: com.tencent.mm.plugin.appbrand.n7$$g
                            @Override // android.os.CancellationSignal.OnCancelListener
                            public final void onCancel() {
                                com.tencent.mm.plugin.appbrand.n7 n7Var2 = com.tencent.mm.plugin.appbrand.n7.this;
                                android.app.Activity activity2 = activity;
                                androidx.lifecycle.x xVar = vVar;
                                androidx.lifecycle.v vVar3 = vVar2;
                                java.lang.Runnable runnable3 = runnable2;
                                n7Var2.getClass();
                                ((androidx.fragment.app.FragmentActivity) activity2).mo133getLifecycle().c(xVar);
                                ((com.tencent.mm.plugin.appbrand.x2) n7Var2.f86038h.P).f92371d.c(vVar3);
                                if (runnable3 instanceof wu5.b) {
                                    ((wu5.b) runnable3).b();
                                }
                            }
                        });
                    }
                }
            });
            return cancellationSignal;
        }
        runnable.run();
        if (!(runnable instanceof wu5.b)) {
            return null;
        }
        android.os.CancellationSignal cancellationSignal2 = new android.os.CancellationSignal();
        cancellationSignal2.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() { // from class: com.tencent.mm.plugin.appbrand.n7$$c
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                ((wu5.b) runnable).b();
            }
        });
        return cancellationSignal2;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.n1
    public void w(long j17) {
        boolean z17 = this.f86038h.L0() || this.f86036f.f85093b;
        this.f86038h.K("onDownloadStarted(%s) task[%d] interrupted[%b]", com.tencent.mm.sdk.platformtools.t8.v(j17), java.lang.Integer.valueOf(this.f86036f.hashCode()), java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f86038h;
        o6Var.f86180m2 = true;
        if (o6Var.f86178l2 != null) {
            this.f86038h.f86178l2.f88048b = true;
        }
        try {
            com.tencent.mm.plugin.appbrand.report.quality.e.b(this.f86038h.f74803n, true).L = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeWC", "onSyncLaunchStart get QualitySession with appId[%s], e=%s", this.f86038h.f74803n, e17);
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var2 = this.f86038h;
        boolean z18 = o6Var2.f86180m2;
        if (o6Var2.q2() && o6Var2.P2() != null) {
            com.tencent.mm.plugin.appbrand.game.preload.j.a().f78231h = z18;
        }
        com.tencent.mm.plugin.appbrand.j3 j3Var = this.f86038h.f86188t2;
        if (j3Var != null) {
            j3Var.l(com.tencent.mm.plugin.appbrand.p4.SYNC_GET_CODE);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.n1
    public void y() {
        boolean z17 = this.f86038h.L0() || this.f86036f.f85093b;
        this.f86038h.K("onSyncAppidABTestStart task[%d] interrupted[%b]", java.lang.Integer.valueOf(this.f86036f.hashCode()), java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        try {
            com.tencent.mm.plugin.appbrand.report.quality.e.b(this.f86038h.f74803n, true).N = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeWC", "onSyncAppidABTestStart get QualitySession with appId[%s], e=%s", this.f86038h.f74803n, e17);
        }
        com.tencent.mm.plugin.appbrand.j3 j3Var = this.f86038h.f86188t2;
        if (j3Var != null) {
            j3Var.l(com.tencent.mm.plugin.appbrand.p4.SYNC_APPID_ABTEST_INFO);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeWC", "AppBrandRuntimeBoostStrategy boost null!");
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.n1
    public void z(java.lang.String str) {
        boolean z17 = this.f86038h.L0() || this.f86036f.f85093b;
        this.f86038h.K("notifyStartMigrateTargetApp, task[%d], interrupted[%b]", java.lang.Integer.valueOf(this.f86036f.hashCode()), java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        this.f86038h.a3(str);
    }
}
