package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class AppBrandRuntimeContainerWC extends ze.l implements com.tencent.mm.plugin.appbrand.wxassistant.p2 {
    public static final android.util.SparseIntArray C;
    public static final java.lang.Class[] D;
    public int A;
    public com.tencent.mm.plugin.appbrand.wxassistant.c2 B;

    static {
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.h hVar = com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.h.f85588a;
        java.util.Set set = com.tencent.mm.plugin.appbrand.x8.f92379a;
        synchronized (set) {
            ((java.util.HashSet) set).add(hVar);
        }
        C = new android.util.SparseIntArray();
        D = new java.lang.Class[]{com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t.class};
    }

    public AppBrandRuntimeContainerWC(com.tencent.mm.plugin.appbrand.task.b1 b1Var) {
        super(b1Var, com.tencent.mm.plugin.appbrand.o6.class);
        this.A = 0;
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (com.tencent.mm.ui.bk.k(this.f87645d)) {
            android.app.Activity w17 = w();
            android.view.View decorView = w().getWindow().getDecorView();
            int i18 = com.tencent.mm.plugin.appbrand.widget.n0.f91768e;
            if (decorView != null && w17 != null) {
                com.tencent.mm.plugin.appbrand.widget.n0 n0Var = new com.tencent.mm.plugin.appbrand.widget.n0();
                android.view.View decorView2 = w17.getWindow().getDecorView();
                decorView.setBackground(n0Var);
                com.tencent.mm.plugin.appbrand.widget.m0 m0Var = new com.tencent.mm.plugin.appbrand.widget.m0(n0Var, decorView2);
                if (decorView2 == decorView) {
                    com.tencent.mm.ui.qk.c(w17, true).a(m0Var);
                } else {
                    decorView.setOnApplyWindowInsetsListener(m0Var);
                }
                n0Var.f91772d = w17.getWindow().getNavigationBarColor();
            }
        }
        if (i17 >= 26) {
            this.f74838q.setOnSystemUiVisibilityChangeListener(new com.tencent.mm.plugin.appbrand.m5(this));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer
    public com.tencent.mm.plugin.appbrand.AppBrandRuntime I(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        return (ze.n) cf.i.a("AppBrandRuntimeProfile|createRuntime-" + appBrandInitConfig.f77278d, new com.tencent.mm.plugin.appbrand.o5(this, appBrandInitConfig));
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer
    public boolean M(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        ze.n nVar = (ze.n) appBrandRuntime;
        ze.n nVar2 = (ze.n) getActiveRuntime();
        if (nVar2 instanceof com.tencent.mm.plugin.appbrand.o6) {
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = ((com.tencent.mm.plugin.appbrand.o6) nVar2).u0().L1;
            if (halfScreenConfig.c()) {
                if (halfScreenConfig.D == k91.x2.f305817e) {
                    return true;
                }
            }
        }
        return (nVar instanceof com.tencent.mm.plugin.appbrand.o6) && ((com.tencent.mm.plugin.appbrand.o6) nVar).e3();
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer
    public void N(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime3 = (ze.n) appBrandRuntime;
        ze.n nVar = (ze.n) appBrandRuntime2;
        if (appBrandRuntime3 != null) {
            com.tencent.mm.plugin.appbrand.x0.g(appBrandRuntime3.f74803n, com.tencent.mm.plugin.appbrand.w0.LAUNCH_MINI_PROGRAM);
        }
        if (com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.b(appBrandInitConfig)) {
            d0((com.tencent.mm.plugin.appbrand.o6) nVar);
        }
        k0(appBrandInitConfig);
        super.N(appBrandRuntime3, nVar, appBrandInitConfig);
        if (nVar.f74796e == this) {
            com.tencent.mm.plugin.appbrand.report.b3.f87812a.e((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) appBrandInitConfig);
        }
        if (appBrandRuntime3 != null) {
            ((com.tencent.mm.plugin.appbrand.ui.u8) ((com.tencent.mm.plugin.appbrand.ui.dd) nd.f.a(com.tencent.mm.plugin.appbrand.ui.dd.class))).m(nVar, new com.tencent.mm.plugin.appbrand.p5(this, nVar), appBrandRuntime3, null);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer
    public void O(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime3 = (ze.n) appBrandRuntime;
        ze.n nVar = (ze.n) appBrandRuntime2;
        if (appBrandRuntime3 != null) {
            com.tencent.mm.plugin.appbrand.x0.g(appBrandRuntime3.f74803n, com.tencent.mm.plugin.appbrand.w0.LAUNCH_MINI_PROGRAM);
        }
        if (appBrandRuntime3 == null || !com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.n0.a((com.tencent.mm.plugin.appbrand.o6) appBrandRuntime3, (com.tencent.mm.plugin.appbrand.o6) nVar, (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) appBrandInitConfig)) {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) appBrandInitConfig;
            appBrandInitConfigWC.f77296i2 = true;
            if (com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.b(appBrandInitConfig)) {
                d0(null);
            }
            k0(appBrandInitConfig);
            b0();
            if (com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.b(appBrandInitConfig) && !ha1.m.a()) {
                java.util.LinkedHashMap linkedHashMap = com.tencent.mm.plugin.appbrand.l.f84208a;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBridge", "clearRunningGames(exclude:%s)", nVar.f74803n);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.LinkedHashMap linkedHashMap2 = com.tencent.mm.plugin.appbrand.l.f84209b;
                synchronized (linkedHashMap2) {
                    for (com.tencent.mm.plugin.appbrand.o6 o6Var : linkedHashMap2.values()) {
                        if (o6Var != null && o6Var.q2() && o6Var != nVar) {
                            linkedList.add(o6Var);
                        }
                    }
                }
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.plugin.appbrand.o6) it.next()).K2();
                }
            }
            if (nVar.J0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainerWC", "loadNew(), runtime[%s] initialized, should be persistent, use loadExisted() instead", nVar.f74803n);
                super.N(appBrandRuntime3, nVar, appBrandInitConfig);
                com.tencent.mm.plugin.appbrand.weishi.c.a(nVar);
                if (nVar.f74796e == this) {
                    com.tencent.mm.plugin.appbrand.report.b3.f87812a.e(appBrandInitConfigWC);
                }
            } else {
                super.O(appBrandRuntime3, nVar, appBrandInitConfig);
                if (nVar.f74796e == this) {
                    com.tencent.mm.plugin.appbrand.report.b3.f87812a.c(appBrandInitConfigWC);
                    if (appBrandRuntime3 != null) {
                        com.tencent.mm.plugin.appbrand.c6.a(1, appBrandInitConfigWC);
                    }
                }
            }
            i0();
            if (appBrandRuntime3 != null) {
                ((com.tencent.mm.plugin.appbrand.ui.u8) ((com.tencent.mm.plugin.appbrand.ui.dd) nd.f.a(com.tencent.mm.plugin.appbrand.ui.dd.class))).m(nVar, new com.tencent.mm.plugin.appbrand.n5(this, nVar), appBrandRuntime3, null);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer
    public void Q() {
        super.Q();
        com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) getActiveRuntime();
        if (o6Var != null) {
            d0(o6Var);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer
    public void R(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2, java.lang.Runnable runnable) {
        com.tencent.mm.plugin.appbrand.r5 r5Var = new com.tencent.mm.plugin.appbrand.r5(this, runnable, appBrandRuntime, appBrandRuntime2);
        if (!((com.tencent.mm.plugin.appbrand.o6) appBrandRuntime2).J2.a(appBrandRuntime2, true, r5Var)) {
            r5Var.run();
        }
        if (appBrandRuntime2.N0()) {
            com.tencent.mm.plugin.appbrand.service.u5 u5Var = (com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class);
            java.lang.String sessionId = ((com.tencent.luggage.sdk.config.AppBrandInitConfigLU) appBrandRuntime2.u0()).f();
            java.lang.String appId = appBrandRuntime2.f74803n;
            com.tencent.mm.plugin.appbrand.wxassistant.u0 u0Var = (com.tencent.mm.plugin.appbrand.wxassistant.u0) u5Var;
            u0Var.getClass();
            kotlin.jvm.internal.o.g(sessionId, "sessionId");
            kotlin.jvm.internal.o.g(appId, "appId");
            com.tencent.mm.plugin.appbrand.wxassistant.w2 Di = u0Var.Di();
            Di.getClass();
            java.lang.String a17 = Di.a(sessionId);
            com.tencent.mm.plugin.appbrand.wxassistant.v2 v2Var = com.tencent.mm.plugin.appbrand.wxassistant.w2.f92328a;
            boolean b17 = kotlin.jvm.internal.o.b(com.tencent.mm.plugin.appbrand.wxassistant.v2.a(v2Var).getString(a17 + '0', ""), appId);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainerWC", "onRuntimeClose wxAssistSessionId[%s], appId[%s], isFirstAppId[%b] isWxAssistantTraining[%b]", sessionId, appId, java.lang.Boolean.valueOf(b17), java.lang.Boolean.FALSE);
            java.lang.String str = null;
            if (b17) {
                java.lang.String appId2 = appBrandRuntime2.f74803n;
                com.tencent.mm.plugin.appbrand.wxassistant.n nVar = com.tencent.mm.plugin.appbrand.wxassistant.n.f92236a;
                kotlin.jvm.internal.o.g(appId2, "appId");
                com.tencent.mm.plugin.appbrand.wxassistant.n nVar2 = com.tencent.mm.plugin.appbrand.wxassistant.n.f92236a;
                nVar2.getClass();
                com.tencent.mm.plugin.appbrand.wxassistant.n.f92240e.c(nVar2, com.tencent.mm.plugin.appbrand.wxassistant.n.f92237b[0], java.lang.Boolean.TRUE);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantLogic", "reOpenHeadless appId:".concat(appId2));
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                l81.b1 b1Var = new l81.b1();
                b1Var.f317032k = com.tencent.liteav.TXLiteAVCode.WARNING_VIRTUAL_BACKGROUND_DEVICE_UNSURPORTED;
                b1Var.f317014b = appId2;
                b1Var.f317031j0 = new com.tencent.mm.plugin.appbrand.config.AppBrandAssistantParams(true, "", 0.0d, 0.0d, 12, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantLogic", "open weAppOpenBundle:" + b1Var);
                kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.appbrand.wxassistant.f(context, b1Var, null), 3, null);
                return;
            }
            com.tencent.mm.plugin.appbrand.wxassistant.w2 Di2 = u0Var.Di();
            Di2.getClass();
            java.lang.String b18 = Di2.b(sessionId);
            java.lang.String a18 = Di2.a(sessionId);
            int i17 = com.tencent.mm.plugin.appbrand.wxassistant.v2.a(v2Var).getInt(b18, -1);
            if (i17 != -1) {
                java.lang.String str2 = a18 + i17;
                str = com.tencent.mm.plugin.appbrand.wxassistant.v2.a(v2Var).getString(str2, null);
                com.tencent.mm.plugin.appbrand.wxassistant.v2.a(v2Var).W(str2);
                com.tencent.mm.plugin.appbrand.wxassistant.v2.a(v2Var).putInt(b18, i17 - 1);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandWxAssistantService", "removeTopAppId: sessionId:" + sessionId + " not exist");
                return;
            }
            if (!kotlin.jvm.internal.o.b(str, appId)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandWxAssistantService", "removeTopAppId: appId not match realAppId:" + str + " appId:" + appId);
                if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
                    throw new java.lang.Exception("appId not match");
                }
            }
            u0Var.Ri().remove(appId);
            long g17 = u0Var.Ri().g();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantService", "removeTopAppId: sessionId:" + sessionId + " realAppId:" + str + " appId:" + appId + " count:" + g17);
            if (g17 == 0) {
                com.tencent.mm.plugin.appbrand.wxassistant.n.f92236a.getClass();
                com.tencent.mm.plugin.appbrand.wxassistant.c3.f92150a.getClass();
                if (com.tencent.mm.plugin.appbrand.wxassistant.c3.f92155f) {
                    ((ku5.t0) ku5.t0.f312615d).B(com.tencent.mm.plugin.appbrand.wxassistant.e.f92195d);
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer
    public void U(java.lang.Exception exc) {
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime a17;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime = getActiveRuntime();
        if (activeRuntime == null || (a17 = com.tencent.mm.plugin.appbrand.report.quality.e.a(activeRuntime)) == null) {
            return;
        }
        java.lang.String str = ((com.tencent.luggage.sdk.config.AppBrandInitConfigLU) activeRuntime.u0()).f47278x;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = ((com.tencent.luggage.sdk.config.AppBrandInitConfigLU) activeRuntime.u0()).f47269b2;
        int i17 = ((com.tencent.luggage.sdk.config.AppBrandInitConfigLU) activeRuntime.u0()).L;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader S2 = ((com.tencent.mm.plugin.appbrand.o6) activeRuntime).S2(false);
        com.tencent.mm.autogen.mmdata.rpt.WAFrameworkErrorReportStruct wAFrameworkErrorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WAFrameworkErrorReportStruct();
        wAFrameworkErrorReportStruct.f61943d = wAFrameworkErrorReportStruct.b("InstanceId", a17.f88134d, true);
        wAFrameworkErrorReportStruct.f61944e = wAFrameworkErrorReportStruct.b("Appid", activeRuntime.f74803n, true);
        wAFrameworkErrorReportStruct.f61945f = wAFrameworkErrorReportStruct.b("Username", str, true);
        wAFrameworkErrorReportStruct.f61946g = a17.f88137g;
        wAFrameworkErrorReportStruct.f61947h = appBrandStatObject.f87790f;
        wAFrameworkErrorReportStruct.f61948i = wAFrameworkErrorReportStruct.b("SceneNote", u46.l.s(appBrandStatObject.f87791g, 1024), true);
        wAFrameworkErrorReportStruct.f61949j = i17;
        wAFrameworkErrorReportStruct.f61950k = wAFrameworkErrorReportStruct.b("PublibVersionStr", S2 == null ? "" : S2.W0(), true);
        wAFrameworkErrorReportStruct.f61951l = wAFrameworkErrorReportStruct.b("NetworkType", com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a), true);
        wAFrameworkErrorReportStruct.f61952m = wAFrameworkErrorReportStruct.b("ErrorStack", fp.s0.a(android.util.Log.getStackTraceString(exc)), true);
        wAFrameworkErrorReportStruct.f61953n = java.lang.System.currentTimeMillis();
        wAFrameworkErrorReportStruct.k();
    }

    @Override // ze.l
    public boolean a0() {
        boolean z17;
        if (getStackSize() > 0) {
            return false;
        }
        android.app.Activity w17 = w();
        if (w17 instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandUI) {
            if (((com.tencent.mm.plugin.appbrand.ui.AppBrandUI) w17).F7() && w17.isTaskRoot()) {
                int taskId = w17.getTaskId();
                int hashCode = w17.hashCode();
                int i17 = 0;
                while (true) {
                    android.util.SparseIntArray sparseIntArray = C;
                    if (i17 >= sparseIntArray.size()) {
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i17);
                    if (sparseIntArray.valueAt(i17) == taskId && keyAt != hashCode) {
                        z17 = true;
                        break;
                    }
                    i17++;
                }
            }
        }
        z17 = false;
        if (z17) {
            try {
                b0();
            } finally {
                if (z17) {
                    i0();
                }
            }
        }
        c0(false);
        return true;
    }

    public void b0() {
        int i17 = this.A;
        int i18 = i17 + 1;
        this.A = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainerWC", "addSkipCloseActivityOnceFlagRef for activity:%d, %d -> %d", java.lang.Integer.valueOf(w() != null ? w().hashCode() : 0), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public void c0(final boolean z17) {
        if (this.A > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainerWC", "closeActivity(%b), mSkipCloseActivityOnceFlag:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.A));
            if (getStackSize() > 0 || !(w() instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI)) {
                return;
            }
            db5.f.c(w(), null);
            return;
        }
        final ze.n nVar = (ze.n) getActiveRuntime();
        final java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC$$a
            @Override // java.lang.Runnable
            public final void run() {
                android.util.SparseIntArray sparseIntArray = com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC.C;
                com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC.this;
                android.app.Activity w17 = appBrandRuntimeContainerWC.w();
                if (w17 != null && !w17.isFinishing()) {
                    boolean F7 = ((com.tencent.mm.plugin.appbrand.ui.b8) appBrandRuntimeContainerWC.f74841t).f89579a.F7();
                    int stackSize = appBrandRuntimeContainerWC.getStackSize();
                    com.tencent.luggage.sdk.config.AppBrandInitConfigLU u07 = stackSize > 0 ? ((ze.n) appBrandRuntimeContainerWC.getActiveRuntime()).u0() : null;
                    if (F7 && z17) {
                        w17.moveTaskToBack(true);
                    } else {
                        w17.finish();
                    }
                    if (stackSize <= 0) {
                        w17.overridePendingTransition(0, 0);
                    } else {
                        ((com.tencent.mm.plugin.appbrand.ui.u8) ((com.tencent.mm.plugin.appbrand.ui.dd) nd.f.a(com.tencent.mm.plugin.appbrand.ui.dd.class))).j(w17, u07);
                    }
                }
                if ((appBrandRuntimeContainerWC.w() instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI) && appBrandRuntimeContainerWC.w().isFinishing()) {
                    ze.n nVar2 = nVar;
                    if (nVar2 != null) {
                        try {
                            if (!nVar2.x0().getCurrentPage().R) {
                                return;
                            }
                        } catch (java.lang.NullPointerException e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandRuntimeContainerWC", e17, "closeActivity", new java.lang.Object[0]);
                            return;
                        }
                    }
                    appBrandRuntimeContainerWC.w().overridePendingTransition(0, 0);
                }
            }
        };
        android.app.Activity w17 = w();
        boolean z18 = false;
        if (nVar != null && nVar.u0().q() == k91.y3.DISABLED) {
            if (w17 instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandUI) {
                com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI = (com.tencent.mm.plugin.appbrand.ui.AppBrandUI) w();
                java.util.Objects.requireNonNull(appBrandUI);
                z18 = !appBrandUI.u7();
            } else if (w17 != null) {
                z18 = true;
            }
        }
        if (!z18) {
            runnable.run();
        } else {
            java.util.Objects.requireNonNull(w17);
            db5.f.c(w17, new db5.d() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC$$b
                @Override // db5.d
                public final void onComplete(boolean z19) {
                    android.util.SparseIntArray sparseIntArray = com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC.C;
                    runnable.run();
                }
            });
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer, xi1.h, xi1.i
    public void d(int i17, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        super.d(i17, appBrandRuntime);
        if (!((com.tencent.mm.plugin.appbrand.o6) appBrandRuntime).u0().L1.c()) {
            if (w() instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI) {
                db5.f.b(w());
            }
        } else {
            try {
                if (i(appBrandRuntime) == null) {
                    db5.f.c(w(), null);
                }
            } catch (java.lang.IllegalAccessError unused) {
            }
        }
    }

    public void d0(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        if (w() instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI) {
            if (o6Var == null ? ((java.lang.Boolean) ha1.r.f279785c.e()).booleanValue() : o6Var.q2() && (o6Var.f86167d3 || ((java.lang.Boolean) ha1.r.f279785c.e()).booleanValue())) {
                db5.f.b(w());
            }
        }
    }

    public com.tencent.mm.plugin.appbrand.wxassistant.c2 e0() {
        if (this.B == null) {
            android.content.Context w17 = w();
            if (w17 == null) {
                w17 = this.f87645d;
            }
            com.tencent.mm.plugin.appbrand.wxassistant.c2 c2Var = new com.tencent.mm.plugin.appbrand.wxassistant.c2(w17, this);
            this.B = c2Var;
            c2Var.setBackgroundColor(this.f87645d.getColor(com.tencent.mm.R.color.a9e));
        }
        return this.B;
    }

    public void g0(android.view.WindowManager.LayoutParams layoutParams) {
        if (w() == null || w().getWindow() == null) {
            return;
        }
        android.view.View decorView = w().getWindow().getDecorView();
        if ((decorView.getWindowSystemUiVisibility() & 2) == 0) {
            android.graphics.drawable.Drawable background = decorView.getBackground();
            if (background instanceof com.tencent.mm.plugin.appbrand.widget.n0) {
                com.tencent.mm.plugin.appbrand.widget.n0 n0Var = (com.tencent.mm.plugin.appbrand.widget.n0) background;
                int navigationBarColor = w().getWindow().getNavigationBarColor();
                boolean z17 = navigationBarColor != n0Var.f91772d;
                n0Var.f91772d = navigationBarColor;
                if (z17) {
                    n0Var.invalidateSelf();
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.r0, com.tencent.mm.plugin.appbrand.hc
    public android.content.Context h() {
        return com.tencent.mm.plugin.appbrand.ui.z6.b(w());
    }

    public void h0(android.content.res.Configuration configuration) {
        n0(configuration);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.s5(this, configuration));
        java.util.LinkedList linkedList = this.f74839r;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.appbrand.AppBrandRuntime) it.next()).a1(configuration);
            }
        }
    }

    public void i0() {
        int i17 = this.A;
        int i18 = i17 - 1;
        this.A = i18;
        if (i18 < 0) {
            this.A = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainerWC", "removeSkipCloseActivityOnceFlagRef for activity:%d, %d -> %d", java.lang.Integer.valueOf(w() != null ? w().hashCode() : 0), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.A));
    }

    public final void k0(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        if (appBrandInitConfig == null) {
            return;
        }
        boolean z17 = (appBrandInitConfig instanceof com.tencent.luggage.sdk.config.AppBrandInitConfigLU) && ((com.tencent.luggage.sdk.config.AppBrandInitConfigLU) appBrandInitConfig).k();
        android.widget.FrameLayout frameLayout = this.f74838q;
        com.tencent.mm.plugin.appbrand.widget.input.u3 y17 = z17 ? com.tencent.mm.plugin.appbrand.widget.input.u3.y(frameLayout) : ie.d.N(frameLayout);
        if (y17 != null && (y17.getParent() instanceof android.view.ViewGroup)) {
            y17.z();
            ((android.view.ViewGroup) y17.getParent()).removeView(y17);
        }
        if (z17) {
            return;
        }
        try {
            android.app.Activity w17 = w();
            java.util.Objects.requireNonNull(w17);
            w17.getWindow().setSoftInputMode(16);
            android.app.Activity w18 = w();
            java.util.LinkedList linkedList = com.tencent.mm.plugin.appbrand.widget.input.h1.f91462u;
            ql1.a onLayoutListener = ((com.tencent.mm.plugin.appbrand.widget.input.h1) w18.findViewById(com.tencent.mm.R.id.a0o)).getOnLayoutListener();
            if (onLayoutListener instanceof com.tencent.mm.plugin.appbrand.widget.input.l2) {
                ((com.tencent.mm.plugin.appbrand.widget.input.l2) onLayoutListener).i(1);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeContainerWC", "removeUnmatchedSoftInputPanel, fix SoftInputMode for MiniProgram, get exception:%s", e17);
        }
    }

    public void l0() {
        com.tencent.mm.plugin.appbrand.report.model.t0 t0Var;
        long longValue;
        java.util.Iterator it = new java.util.LinkedList(this.f74839r).iterator();
        while (it.hasNext()) {
            ze.n nVar = (ze.n) it.next();
            if ((nVar instanceof com.tencent.mm.plugin.appbrand.o6) && (t0Var = ((com.tencent.mm.plugin.appbrand.o6) nVar).M2) != null) {
                com.tencent.mm.autogen.mmdata.rpt.AppBrandCloseReasonStruct appBrandCloseReasonStruct = new com.tencent.mm.autogen.mmdata.rpt.AppBrandCloseReasonStruct();
                java.lang.Long l17 = t0Var.f88109a;
                appBrandCloseReasonStruct.f55128e = l17 != null ? l17.longValue() : -1L;
                appBrandCloseReasonStruct.f55127d = appBrandCloseReasonStruct.b("appId", t0Var.f88110b, true);
                appBrandCloseReasonStruct.f55131h = appBrandCloseReasonStruct.b("flags", com.tencent.mm.plugin.appbrand.report.quality.d.f88159a.a(), true);
                appBrandCloseReasonStruct.f55130g = 2L;
                appBrandCloseReasonStruct.f55132i = appBrandCloseReasonStruct.b(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, t0Var.f88111c, true);
                if (t0Var.f88112d == null) {
                    longValue = 0;
                } else {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    java.lang.Long l18 = t0Var.f88112d;
                    kotlin.jvm.internal.o.d(l18);
                    longValue = currentTimeMillis - l18.longValue();
                }
                appBrandCloseReasonStruct.f55129f = longValue;
                appBrandCloseReasonStruct.n();
                bm5.f1.a();
                appBrandCloseReasonStruct.k();
            }
        }
    }

    public final void n0(android.content.res.Configuration configuration) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return;
        }
        configuration.uiMode &= -49;
        if (com.tencent.mm.ui.bk.C()) {
            configuration.uiMode |= 32;
        } else {
            configuration.uiMode |= 16;
        }
        com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().updateConfiguration(configuration, com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics());
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public void o(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        android.graphics.Bitmap Y1;
        if (!(appBrandRuntime instanceof ze.n) || (Y1 = ((ze.n) appBrandRuntime).Y1()) == null) {
            return;
        }
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.f87645d);
        android.view.ViewGroup.LayoutParams layoutParams = appBrandRuntime.f74810s.getLayoutParams();
        com.tencent.mm.plugin.appbrand.widget.q qVar = appBrandRuntime.f74810s;
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(qVar.getWidth(), qVar.getHeight(), layoutParams != null ? ((android.widget.FrameLayout.LayoutParams) qVar.getLayoutParams()).gravity : 81);
        frameLayout.setBackground(new android.graphics.drawable.BitmapDrawable(this.f87645d.getResources(), Y1));
        frameLayout.setWillNotDraw(false);
        android.widget.FrameLayout frameLayout2 = this.f74838q;
        frameLayout2.addView(frameLayout, layoutParams2);
        frameLayout2.bringChildToFront(frameLayout);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0 A[Catch: NullPointerException | OutOfMemoryError -> 0x00e4, NullPointerException -> 0x00e6, TRY_LEAVE, TryCatch #2 {NullPointerException | OutOfMemoryError -> 0x00e4, blocks: (B:30:0x00b1, B:32:0x00bd, B:34:0x00c9, B:40:0x00e0), top: B:29:0x00b1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o0(com.tencent.mm.plugin.appbrand.u5 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC.o0(com.tencent.mm.plugin.appbrand.u5, boolean):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.r0, xi1.g
    public void setWindowDescription(xi1.d dVar) {
        android.app.Activity w17 = w();
        if (w17 != null && (w17 instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandUI) && ((com.tencent.mm.plugin.appbrand.ui.AppBrandUI) w17).F7()) {
            super.setWindowDescription(dVar);
        }
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "AppBrandRuntimeContainerWC@%d(%s)", java.lang.Integer.valueOf(hashCode()), w());
    }
}
