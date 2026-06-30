package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public abstract class u0 extends com.tencent.luggage.sdk.processes.r implements com.tencent.mm.app.t2 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.task.h0 f89199h;

    /* renamed from: i, reason: collision with root package name */
    public static com.tencent.mm.plugin.appbrand.task.u0 f89200i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f89201m;

    /* renamed from: g, reason: collision with root package name */
    public boolean f89202g = true;

    static {
        com.tencent.mm.plugin.appbrand.task.h0 h0Var = new com.tencent.mm.plugin.appbrand.task.h0(null);
        f89199h = h0Var;
        cf.b.a(h0Var);
        f89201m = 1;
    }

    public static final com.tencent.mm.plugin.appbrand.task.u0 C() {
        return f89199h.a();
    }

    public static final void D(com.tencent.mm.plugin.appbrand.task.u0 u0Var, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.task.k kVar, android.content.Intent intent) {
        u0Var.getClass();
        if (!appBrandInitConfigWC.f77296i2) {
            com.tencent.mm.plugin.appbrand.app.g2 g2Var = com.tencent.mm.plugin.appbrand.app.g2.f75089d;
            g2Var.getClass();
            kotlin.jvm.internal.o.g(intent, "intent");
            android.content.ComponentName component = intent.getComponent();
            g2Var.Bi(appBrandInitConfigWC, component != null ? component.getClassName() : null);
        }
        com.tencent.mm.plugin.appbrand.ui.w9.f90315b.removeCallbacksAndMessages(null);
    }

    public static final void E(com.tencent.mm.plugin.appbrand.task.u0 u0Var, android.content.Context context, android.content.Intent intent, com.tencent.luggage.sdk.processes.w params, com.tencent.luggage.sdk.processes.x strategy, com.tencent.luggage.sdk.processes.s appRecord) {
        u0Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(strategy, "strategy");
        kotlin.jvm.internal.o.g(appRecord, "appRecord");
        com.tencent.mars.xlog.Log.i("Luggage.LuggageMiniProgramProcessManager", "onStartWxaApp--START-- strategy:" + strategy + ", app:" + appRecord);
        u0Var.v(new com.tencent.luggage.sdk.processes.p(context, intent, strategy, appRecord));
    }

    public final int[] F() {
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader;
        java.util.List<com.tencent.luggage.sdk.processes.s> a17 = a();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
        for (com.tencent.luggage.sdk.processes.s sVar : a17) {
            com.tencent.mm.plugin.appbrand.task.o oVar = sVar instanceof com.tencent.mm.plugin.appbrand.task.o ? (com.tencent.mm.plugin.appbrand.task.o) sVar : null;
            arrayList.add(java.lang.Integer.valueOf((oVar == null || (iCommLibReader = oVar.f89111o) == null) ? 0 : iCommLibReader.i()));
        }
        return kz5.n0.R0(arrayList);
    }

    public com.tencent.mm.plugin.appbrand.task.k G(com.tencent.luggage.sdk.processes.LuggageServiceType serviceType) {
        kotlin.jvm.internal.o.g(serviceType, "serviceType");
        if (L(serviceType)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessesManager", "tryPreloadNextTaskProcess serviceType = [%s] reachedMaxLimit", serviceType);
            return null;
        }
        if (!com.tencent.mm.plugin.appbrand.ui.t7.a()) {
            return (com.tencent.mm.plugin.appbrand.task.k) l(k(), serviceType);
        }
        java.util.List k17 = k();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : k17) {
            if (!(((com.tencent.mm.plugin.appbrand.task.k) obj) instanceof com.tencent.mm.plugin.appbrand.task.n)) {
                arrayList.add(obj);
            }
        }
        return (com.tencent.mm.plugin.appbrand.task.k) l(arrayList, serviceType);
    }

    public void H(java.lang.String appId, com.tencent.mm.plugin.appbrand.task.a1 params, yz5.l ret) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(ret, "ret");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getAvailableTaskToPreRender appId:");
        sb6.append(appId);
        sb6.append(", mode:");
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = params.f88991d;
        sb6.append(appBrandInitConfigWC.W1);
        sb6.append(", instanceId:");
        sb6.append(appBrandInitConfigWC.f47277w);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessesManager", sb6.toString());
        if (com.tencent.luggage.sdk.launching.p.HEADLESS == appBrandInitConfigWC.W1 || (this instanceof com.tencent.mm.plugin.appbrand.task.y0)) {
            ret.invoke(m(appId, params, com.tencent.luggage.sdk.processes.LuggageServiceType.f47626e));
            return;
        }
        java.util.List k17 = k();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : k17) {
            if (!(((com.tencent.mm.plugin.appbrand.task.k) obj2) instanceof com.tencent.mm.plugin.appbrand.task.n)) {
                arrayList.add(obj2);
            }
        }
        if (!kotlin.jvm.internal.o.b("wxb1320569c2a2b6d2", appId) || 1190 != params.f88992e.f87790f) {
            ret.invoke(n(arrayList, appId, params, com.tencent.luggage.sdk.processes.LuggageServiceType.f47626e));
            return;
        }
        java.util.Iterator it = k().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((com.tencent.mm.plugin.appbrand.task.k) obj) instanceof com.tencent.mm.plugin.appbrand.task.n) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.tencent.mm.plugin.appbrand.task.k kVar = (com.tencent.mm.plugin.appbrand.task.k) obj;
        if (kVar == null) {
            kVar = (com.tencent.mm.plugin.appbrand.task.k) n(arrayList, appId, params, com.tencent.luggage.sdk.processes.LuggageServiceType.f47626e);
        }
        ret.invoke(kVar);
    }

    public final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC I(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            com.tencent.luggage.sdk.processes.s c17 = c(str, -1);
            kotlin.jvm.internal.o.d(c17);
            java.lang.String i17 = ((com.tencent.mm.plugin.appbrand.task.k) f(c17)).i();
            kotlin.jvm.internal.o.d(i17);
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$AppInitConfigParcelWrapper appBrandProcessesManager$AppInitConfigParcelWrapper = (com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$AppInitConfigParcelWrapper) com.tencent.mm.ipcinvoker.f.b(i17, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.appbrand.task.i0.f89031a);
            if (appBrandProcessesManager$AppInitConfigParcelWrapper == null) {
                return null;
            }
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = appBrandProcessesManager$AppInitConfigParcelWrapper.f88986d;
            appBrandInitConfigWC.f47269b2 = appBrandProcessesManager$AppInitConfigParcelWrapper.f88987e;
            return appBrandInitConfigWC;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessesManager", "getInitConfigOfRunningApp findProcess get exception:" + e17);
            return null;
        }
    }

    public com.tencent.luggage.sdk.processes.h J(java.lang.String appId, com.tencent.luggage.sdk.processes.w wVar) {
        com.tencent.mm.plugin.appbrand.task.a1 params = (com.tencent.mm.plugin.appbrand.task.a1) wVar;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(params, "params");
        oe1.b2.a(appId);
        return (com.tencent.mm.plugin.appbrand.task.k) m(appId, params, params.f47697b ? com.tencent.luggage.sdk.processes.LuggageServiceType.f47627f : com.tencent.luggage.sdk.processes.LuggageServiceType.f47626e);
    }

    public boolean K(com.tencent.mm.plugin.appbrand.task.a1 params) {
        com.tencent.luggage.sdk.processes.s sVar;
        int i17;
        boolean z17;
        boolean z18;
        boolean z19;
        com.tencent.mm.plugin.appbrand.task.o oVar;
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = params.f88991d;
        boolean c17 = n91.t.c(appBrandInitConfigWC);
        java.lang.String str = params.f47696a;
        if (c17 && (oVar = (com.tencent.mm.plugin.appbrand.task.o) c(str, params.f47698c)) != null && oVar.f89106j) {
            return false;
        }
        if (!appBrandInitConfigWC.L1.c()) {
            if (z65.c.a()) {
                z17 = true;
            } else {
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            boolean z27 = z17 ? com.tencent.mm.sdk.platformtools.o4.L().getBoolean("appbrand_half_screen_debug_force_half_screen", false) : false;
            com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenDebugger", "isForceHalfScreen[" + z27 + ']');
            if (z27) {
                int i18 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getConfiguration().orientation == 2 ? com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x : com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
                com.tencent.mm.plugin.appbrand.config.l lVar = new com.tencent.mm.plugin.appbrand.config.l();
                lVar.f77521a = true;
                k91.s2 s2Var = k91.s2.f305760d;
                lVar.f77526f = s2Var;
                lVar.f77529i = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9), true, true, false, false, 24, null);
                lVar.f77527g = true;
                lVar.f77531k = k91.t2.f305767e;
                lVar.f77530j = false;
                lVar.f77522b = (int) (i18 * 0.7f);
                lVar.f77534n = true;
                lVar.f77532l = true;
                lVar.f77542v = false;
                lVar.f77543w = false;
                lVar.f77539s = true;
                lVar.f77541u = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig(true, ya.a.SHARE);
                if (z65.c.a()) {
                    z18 = true;
                } else {
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    z18 = false;
                }
                boolean z28 = z18 ? com.tencent.mm.sdk.platformtools.o4.L().getBoolean("appbrand_half_screen_debug_force_forbid_sliding_up_gesture", false) : false;
                com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenDebugger", "isForbidSlidingUpGesture[" + z28 + ']');
                lVar.f77533m = z28;
                lVar.f77537q = true;
                lVar.f77528h = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig(com.tencent.mm.sdk.platformtools.x2.f193072b + ".ui.LauncherUI", s2Var);
                lVar.f77536p = k91.y2.f305827d;
                appBrandInitConfigWC.L1 = lVar.a();
                if (z65.c.a()) {
                    z19 = true;
                } else {
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    z19 = false;
                }
                boolean z29 = z19 ? com.tencent.mm.sdk.platformtools.o4.L().getBoolean("appbrand_half_screen_debug_force_finder_scene", false) : false;
                com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenDebugger", "isForceFinderScene[" + z29 + ']');
                if (z29) {
                    params.f88992e.f87790f = 1177;
                }
            }
        }
        com.tencent.luggage.sdk.processes.s[] j17 = j(str, -1);
        int length = j17.length;
        int i19 = 0;
        while (true) {
            if (i19 >= length) {
                sVar = null;
                break;
            }
            sVar = j17[i19];
            kotlin.jvm.internal.o.e(sVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.task.AppBrandMiniProgramRecord");
            if (((com.tencent.mm.plugin.appbrand.task.o) sVar).f89107k) {
                break;
            }
            i19++;
        }
        boolean z37 = appBrandInitConfigWC.L1.c() || (sVar != null);
        appBrandInitConfigWC.M1 = z37;
        com.tencent.mm.plugin.appbrand.config.AppBrandAssistantParams appBrandAssistantParams = appBrandInitConfigWC.A1;
        if (appBrandAssistantParams != null) {
            com.tencent.mm.plugin.appbrand.wxassistant.u0 u0Var = (com.tencent.mm.plugin.appbrand.wxassistant.u0) ((com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class));
            u0Var.getClass();
            com.tencent.mm.plugin.appbrand.wxassistant.c3 c3Var = com.tencent.mm.plugin.appbrand.wxassistant.c3.f92150a;
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            appBrandAssistantParams.f77199d = !z65.c.a() ? false : u0Var.Ri().contains(str);
        }
        if (!appBrandInitConfigWC.f77292e2) {
            oe1.b2.a(appBrandInitConfigWC.f77278d);
            if (appBrandInitConfigWC.K1 != 1 && !z37 && !appBrandInitConfigWC.A2 && appBrandInitConfigWC.r() != k91.z3.TRANSPARENT && !appBrandInitConfigWC.h() && com.tencent.mm.plugin.appbrand.ui.t7.b() && (((i17 = android.os.Build.VERSION.SDK_INT) < 31 || !kz5.z.G(new k91.y3[]{k91.y3.SLIDE, k91.y3.DISABLED}, appBrandInitConfigWC.o())) && (i17 < 31 || !com.tencent.mm.plugin.appbrand.ui.u8.n(appBrandInitConfigWC) || f89201m != 1))) {
                return false;
            }
        }
        return true;
    }

    public final boolean L(com.tencent.luggage.sdk.processes.LuggageServiceType serviceType) {
        int i17;
        kotlin.jvm.internal.o.g(serviceType, "serviceType");
        java.util.List k17 = k();
        if ((k17 instanceof java.util.Collection) && k17.isEmpty()) {
            i17 = 0;
        } else {
            java.util.Iterator it = k17.iterator();
            i17 = 0;
            while (it.hasNext()) {
                if ((((com.tencent.mm.plugin.appbrand.task.k) it.next()).f47642c == serviceType) && (i17 = i17 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        if (i17 > com.tencent.mm.plugin.appbrand.task.v0.a(serviceType)) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                java.lang.String z17 = com.tencent.mm.sdk.platformtools.t8.z1("TaskManager count the serviceType [%s] in TASK_LIST, count = [%d], but max limit = [%d]", serviceType.name(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.task.v0.a(serviceType)));
                kotlin.jvm.internal.o.f(z17, "safeFormatString(...)");
                throw new java.lang.IllegalStateException(z17.toString());
            }
        }
        return i17 >= com.tencent.mm.plugin.appbrand.task.v0.a(serviceType);
    }

    public jz5.l M(com.tencent.luggage.sdk.processes.s record, com.tencent.luggage.sdk.processes.w wVar) {
        com.tencent.mm.plugin.appbrand.task.a1 params = (com.tencent.mm.plugin.appbrand.task.a1) wVar;
        kotlin.jvm.internal.o.g(record, "record");
        kotlin.jvm.internal.o.g(params, "params");
        if (params.f88991d.M1) {
            return new jz5.l(com.tencent.luggage.sdk.processes.x.f47700e, f(record));
        }
        com.tencent.luggage.sdk.processes.h f17 = f(record);
        com.tencent.luggage.sdk.processes.x xVar = com.tencent.luggage.sdk.processes.x.f47700e;
        record.f47688e = true;
        return new jz5.l(xVar, f17);
    }

    public final void N(yz5.l messageFactory) {
        kotlin.jvm.internal.o.g(messageFactory, "messageFactory");
        for (com.tencent.mm.plugin.appbrand.task.k kVar : k()) {
            java.util.Iterator it = kVar.h().iterator();
            while (it.hasNext()) {
                com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage luggageClientProcessMessage = (com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage) messageFactory.invoke((com.tencent.luggage.sdk.processes.s) it.next());
                if (luggageClientProcessMessage != null) {
                    com.tencent.luggage.sdk.processes.h.q(kVar, luggageClientProcessMessage, null, 2, null);
                }
            }
        }
    }

    public final void O(java.lang.String appId, yz5.l messageFactory) {
        com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage luggageClientProcessMessage;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(messageFactory, "messageFactory");
        com.tencent.luggage.sdk.processes.s sVar = (com.tencent.luggage.sdk.processes.s) kz5.z.O(j(appId, -1));
        if (sVar == null || (luggageClientProcessMessage = (com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage) messageFactory.invoke(sVar)) == null) {
            return;
        }
        com.tencent.luggage.sdk.processes.h.q(f(sVar), luggageClientProcessMessage, null, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x02e5, code lost:
    
        if (r11 != false) goto L113;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0167 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0241  */
    /* JADX WARN: Type inference failed for: r10v22, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(com.tencent.luggage.sdk.processes.LuggageServiceType r25, com.tencent.mm.plugin.appbrand.service.x6 r26) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.task.u0.P(com.tencent.luggage.sdk.processes.LuggageServiceType, com.tencent.mm.plugin.appbrand.service.x6):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bd, code lost:
    
        if (kz5.z.G(r7, r5) != false) goto L34;
     */
    @Override // com.tencent.luggage.sdk.processes.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.luggage.sdk.processes.h m(java.lang.String r5, com.tencent.luggage.sdk.processes.w r6, com.tencent.luggage.sdk.processes.LuggageServiceType r7) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.task.u0.m(java.lang.String, com.tencent.luggage.sdk.processes.w, com.tencent.luggage.sdk.processes.LuggageServiceType):com.tencent.luggage.sdk.processes.h");
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        this.f89202g = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessesManager", "onAppBackground(" + str + ')');
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        this.f89202g = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessesManager", "onAppForeground(" + str + ')');
    }

    @Override // com.tencent.luggage.sdk.processes.r
    public void w(com.tencent.luggage.sdk.processes.s record) {
        kotlin.jvm.internal.o.g(record, "record");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessesManager", "sendFinishMessage record:" + record + ", stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        com.tencent.luggage.sdk.processes.h.q(f(record), new com.tencent.mm.plugin.appbrand.task.ipc.AppBrandFinishMessage(record.f47684a, record.f47691h, false), null, 2, null);
    }
}
