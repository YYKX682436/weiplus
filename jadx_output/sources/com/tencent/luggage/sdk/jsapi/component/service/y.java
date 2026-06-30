package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class y extends com.tencent.mm.plugin.appbrand.e9 implements ph1.s, com.tencent.luggage.sdk.jsapi.component.o {
    public static final java.lang.String[] Q = {com.tencent.mm.plugin.appbrand.page.n2.NAME, com.tencent.mm.plugin.appbrand.page.m2.NAME, "onSkylineGlobalReady", "onSkylineWindowReady", "requireRenderContext", com.tencent.mm.plugin.appbrand.menu.y0.NAME, "onAppRoute", "onAppRouteDone"};
    public final com.tencent.luggage.sdk.jsapi.component.service.a0 L;
    public com.tencent.luggage.sdk.jsapi.component.service.v1 N;
    public com.tencent.mm.plugin.appbrand.report.quality.o0 M = com.tencent.mm.plugin.appbrand.report.quality.o0.CreateOnRuntimeInit;
    public final java.util.LinkedList P = new java.util.LinkedList();

    public y(java.lang.Class<? extends com.tencent.luggage.sdk.jsapi.component.service.a0> cls) {
        com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var = (com.tencent.luggage.sdk.jsapi.component.service.a0) new d56.b(cls, cls).d(this).f226632b;
        this.L = a0Var;
        a0Var.getClass();
    }

    @Override // com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.jsapi.e0
    public org.json.JSONObject A0() {
        org.json.JSONObject A0 = super.A0();
        K0(A0, "envPreloadType", java.lang.Integer.valueOf(this.M.ordinal()));
        return A0;
    }

    public com.tencent.luggage.sdk.jsapi.component.service.a0 A1() {
        return this.L;
    }

    public com.tencent.luggage.sdk.jsapi.component.service.v1 B1() {
        return this.N;
    }

    @Override // com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.d0
    /* renamed from: C1, reason: merged with bridge method [inline-methods] */
    public ze.n t3() {
        return (ze.n) super.t3();
    }

    public boolean D1() {
        return true;
    }

    public void E1(org.json.JSONObject jSONObject) {
        A1().p0(jSONObject);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("appLaunchInfo");
        if (optJSONObject == null) {
            optJSONObject = new org.json.JSONObject();
            K0(jSONObject, "appLaunchInfo", optJSONObject);
        }
        if (com.tencent.luggage.sdk.launching.p.HEADLESS == t3().u0().W1) {
            K0(optJSONObject, "inBackground", java.lang.Boolean.TRUE);
        }
        K0(optJSONObject, "openId", t3().E0().f47298x0);
        if (t3().u0().X1 != null && t3().u0().X1.f86101d) {
            com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode wxAppLibServerMode = t3().u0().X1;
            wxAppLibServerMode.getClass();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, wxAppLibServerMode.f86101d);
            jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, wxAppLibServerMode.f86102e.f454519d);
            K0(jSONObject, "serverMode", jSONObject2);
        }
        if (D1()) {
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("nativeFeatures");
            if (optJSONObject2 == null) {
                optJSONObject2 = new org.json.JSONObject();
                K0(jSONObject, "nativeFeatures", optJSONObject2);
            }
            K0(optJSONObject2, "batchLoadSubPackage", java.lang.Boolean.TRUE);
        }
    }

    public final void F1(com.tencent.mm.plugin.appbrand.report.quality.o0 o0Var) {
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var;
        this.M = o0Var;
        super.o1();
        I0();
        if (getJsRuntime() == null || (f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) getJsRuntime().h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class)) == null) {
            return;
        }
        f0Var.post(new com.tencent.luggage.sdk.jsapi.component.service.v(this));
    }

    public final void G1(com.tencent.mm.plugin.appbrand.report.quality.o0 o0Var, com.tencent.luggage.sdk.jsapi.component.service.v1 v1Var) {
        this.N = v1Var;
        F1(o0Var);
    }

    public void H1(com.tencent.luggage.sdk.jsapi.component.n nVar, boolean z17, long j17, long j18, java.lang.Object obj) {
    }

    public final void I1(java.lang.Runnable runnable) {
        if (getJsRuntime() != null) {
            runnable.run();
        } else {
            this.P.addLast(runnable);
        }
    }

    public void J1(boolean z17) {
        if (this.L instanceof com.tencent.luggage.sdk.jsapi.component.service.n) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandServiceLU", "setIsEarlySendSubPackageReadyAllowed %b, id:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(getComponentId()));
            com.tencent.luggage.sdk.jsapi.component.service.l1 l1Var = ((com.tencent.luggage.sdk.jsapi.component.service.n) this.L).f47482u;
            l1Var.f47470b = z17;
            if (z17 && l1Var.f47469a.f47483v) {
                l1Var.a();
            }
            com.tencent.mm.plugin.appbrand.jsapi.i iVar = this.f81586s;
            if (iVar == null || (iVar instanceof com.tencent.mm.plugin.appbrand.jsapi.r)) {
                setEvalInterceptor(new com.tencent.luggage.sdk.jsapi.component.service.p1((com.tencent.luggage.sdk.jsapi.component.service.n) this.L));
            } else {
                iz5.a.g(null, iVar instanceof com.tencent.luggage.sdk.jsapi.component.service.p1);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.e9
    public com.tencent.mm.plugin.appbrand.page.n2 P0() {
        return new com.tencent.luggage.sdk.jsapi.component.service.w(this);
    }

    @Override // com.tencent.mm.plugin.appbrand.e9
    public final void S0(java.lang.String str, java.lang.String str2, int i17, int i18) {
        if (u46.a.b(Q, str)) {
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU u07 = t3() == null ? null : t3().u0();
            if (u07 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandServiceLU", "dispatch %s, serviceId:%d, src:%d, appId:%s, instanceId:%s, sessionId:%s, data:%s", str, java.lang.Integer.valueOf(getComponentId()), java.lang.Integer.valueOf(i17), getAppId(), u07.f47277w, u07.f47276v, str2);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandServiceLU", "dispatch %s, serviceId:%d, src:%d, data:%s", str, java.lang.Integer.valueOf(getComponentId()), java.lang.Integer.valueOf(i17), str2);
            }
        }
        if (this.L.v0(str, str2, i17, i18)) {
            return;
        }
        super.S0(str, str2, i17, i18);
    }

    @Override // com.tencent.mm.plugin.appbrand.e9
    public org.json.JSONObject U0() {
        org.json.JSONObject U0 = super.U0();
        K0(U0, "appType", java.lang.Integer.valueOf(t3().u0().f47284z));
        K0(U0, "debug", java.lang.Boolean.valueOf(t3().E0().f47296w));
        K0(U0, "relaunchForProfile", java.lang.Boolean.valueOf(t3().A));
        E1(U0);
        int[] a17 = com.tencent.mm.plugin.appbrand.utils.f5.a(this);
        K0(U0, "screenWidth", java.lang.Integer.valueOf(ik1.w.e(a17[0])));
        K0(U0, "screenHeight", java.lang.Integer.valueOf(ik1.w.e(a17[1])));
        K0(U0, "supportAsyncGetSystemInfo", java.lang.Boolean.TRUE);
        K0(U0, "prerender", java.lang.Boolean.valueOf(t3().u0().W1 == com.tencent.luggage.sdk.launching.p.PRE_RENDER));
        K0(U0, "instanceId", t3().u0().f47277w);
        java.lang.String str = t3().E0().A.f47303f;
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                K0(U0, "opConfig", new org.json.JSONObject(str));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandServiceLU", "generateWxConfig() put wxConfig.opConfig, exception=%s", e17);
            }
        }
        java.lang.String str2 = t3().E0().A.f47309o;
        if (!android.text.TextUtils.isEmpty(str2)) {
            try {
                K0(U0, "globalExpt", new org.json.JSONObject(str2));
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandServiceLU", "generateWxConfig() put wxConfig.globalExpt, exception=%s", e18);
            }
        }
        U0.remove("permission");
        U0.remove("navigateToMiniProgramAppIdList");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandServiceLU", "generateWxConfig(%s): %s", getAppId(), U0.toString());
        return U0;
    }

    @Override // com.tencent.mm.plugin.appbrand.e9
    public java.lang.String X0() {
        return "https://lib/";
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void a(int i17, java.lang.String str) {
        if (this.L.u0(i17, str)) {
            return;
        }
        super.a(i17, str);
    }

    @Override // com.tencent.mm.plugin.appbrand.e9
    public java.lang.String a1(java.lang.String str) {
        java.lang.String R = this.L.R(str);
        return com.tencent.mm.sdk.platformtools.t8.K0(R) ? super.a1(str) : R;
    }

    @Override // com.tencent.mm.plugin.appbrand.e9
    public java.lang.String b1() {
        return "https://usr/";
    }

    @Override // com.tencent.mm.plugin.appbrand.e9
    public final void d1() {
        super.d1();
        this.L.W();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandService", "notifyWxConfigReadyIfNeed, hash=%d", java.lang.Integer.valueOf(getComponentId()));
        java.lang.String T0 = T0();
        if (getJsRuntime().h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class) != null) {
            ((com.tencent.mm.plugin.appbrand.jsruntime.l0) getJsRuntime().h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class)).Q(null, null, null, 0, T0, new com.tencent.mm.plugin.appbrand.i9(this));
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        getJsRuntime().evaluateJavascript(T0, new com.tencent.mm.plugin.appbrand.j9(this, java.lang.System.currentTimeMillis()));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m
    public void e0(java.util.Map map) {
        for (com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var : map.values()) {
            if (k0Var instanceof yc1.b) {
                ((yc1.b) k0Var).f460761g.f269975a.clear();
            }
        }
        map.clear();
    }

    @Override // com.tencent.mm.plugin.appbrand.e9
    public boolean f1(java.lang.String str) {
        return u46.l.c(str, "onSubPackageReady") || u46.l.c(str, "requireRenderContext") || u46.l.c(str, "onWxServiceInit");
    }

    @Override // com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.jsapi.m
    public final java.util.Map<java.lang.String, com.tencent.mm.plugin.appbrand.jsapi.k0> g0() {
        return this.L.p();
    }

    @Override // com.tencent.mm.plugin.appbrand.e9
    public boolean g1() {
        com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var = this.L;
        return a0Var != null && a0Var.a0();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            r7 = this;
            com.tencent.mm.plugin.appbrand.jsapi.audio.d r0 = com.tencent.mm.plugin.appbrand.jsapi.audio.d.INSTANCE
            java.lang.String r1 = r7.getAppId()
            r0.getClass()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            if (r2 == 0) goto L11
            goto L21
        L11:
            int r1 = r1.hashCode()
            android.util.SparseArray r2 = r0.f79173d
            monitor-enter(r2)
            android.util.SparseArray r4 = r0.f79173d     // Catch: java.lang.Throwable -> L84
            int r1 = r4.indexOfKey(r1)     // Catch: java.lang.Throwable -> L84
            if (r1 >= 0) goto L23
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L84
        L21:
            r4 = r3
            goto L31
        L23:
            android.util.SparseArray r4 = r0.f79173d     // Catch: java.lang.Throwable -> L84
            java.lang.Object r4 = r4.valueAt(r1)     // Catch: java.lang.Throwable -> L84
            gb1.a r4 = (gb1.a) r4     // Catch: java.lang.Throwable -> L84
            android.util.SparseArray r0 = r0.f79173d     // Catch: java.lang.Throwable -> L84
            r0.removeAt(r1)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L84
        L31:
            if (r4 == 0) goto L38
            java.util.concurrent.ConcurrentHashMap r0 = r4.f269975a
            r0.clear()
        L38:
            com.tencent.luggage.sdk.jsapi.component.service.a0 r0 = r7.L
            r0.J()
            super.h()
            com.tencent.luggage.sdk.jsapi.component.service.a0 r0 = r7.L
            r0.n0()
            com.tencent.mm.plugin.appbrand.o9 r0 = com.tencent.mm.plugin.appbrand.n9.f86057a
            r0.getClass()
            int r1 = r7.getComponentId()
            monitor-enter(r0)
            android.util.SparseArray r2 = r0.f86241a     // Catch: java.lang.Throwable -> L81
            int r2 = r2.indexOfKey(r1)     // Catch: java.lang.Throwable -> L81
            if (r2 < 0) goto L5c
            android.util.SparseArray r4 = r0.f86241a     // Catch: java.lang.Throwable -> L81
            r4.removeAt(r2)     // Catch: java.lang.Throwable -> L81
        L5c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = "MicroMsg.AppBrandServiceOnRuntimeReadyListenerMgr"
            java.lang.String r4 = "removeAllListeners, service:%d, already removed:%b"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6 = 0
            r5[r6] = r1
            r1 = 1
            if (r2 >= 0) goto L6f
            r6 = r1
        L6f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            r5[r1] = r2
            com.tencent.mars.xlog.Log.i(r0, r4, r5)
            r7.N0(r3)
            java.lang.Class<xh1.g> r0 = xh1.g.class
            r7.x0(r0)
            return
        L81:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L81
            throw r1
        L84:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L84
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.luggage.sdk.jsapi.component.service.y.h():void");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m
    public boolean h0() {
        com.tencent.mm.plugin.appbrand.report.quality.o0 o0Var = this.M;
        return o0Var == com.tencent.mm.plugin.appbrand.report.quality.o0.PreloadBeforeRuntimeInit || o0Var == com.tencent.mm.plugin.appbrand.report.quality.o0.CreateOnRuntimeInit;
    }

    @Override // com.tencent.mm.plugin.appbrand.e9
    public boolean h1() {
        return !(y1() instanceof com.tencent.luggage.sdk.jsapi.component.service.o1);
    }

    @Override // com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.jsapi.m
    public com.tencent.mm.plugin.appbrand.jsruntime.t i0() {
        com.tencent.mm.plugin.appbrand.jsruntime.t K = this.L.K();
        return K == null ? super.i0() : K;
    }

    @Override // com.tencent.mm.plugin.appbrand.e9
    public void i1() {
        if (G0()) {
            com.tencent.mm.plugin.appbrand.nf.b(this, getJsRuntime());
        }
        this.L.g0();
    }

    @Override // com.tencent.mm.plugin.appbrand.e9
    public void j1() {
        this.L.i0();
    }

    @Override // com.tencent.mm.plugin.appbrand.e9
    public final void k1() {
        new com.tencent.luggage.sdk.jsapi.component.service.x(this).x(t3());
        this.L.j0();
    }

    @Override // com.tencent.mm.plugin.appbrand.e9
    public void l1(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        super.l1(appBrandRuntime);
        setInterceptor(u1());
        this.L.q0(appBrandRuntime);
    }

    @Override // com.tencent.mm.plugin.appbrand.e9
    public final void m1(boolean z17, boolean z18) {
        super.m1(z17, z18);
        this.L.k0();
    }

    @Override // com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public android.content.Context n() {
        return getContext();
    }

    public com.tencent.mm.plugin.appbrand.jsapi.k u1() {
        return new com.tencent.mm.plugin.appbrand.x(t3(), this, t3().X1);
    }

    @Override // com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.d0, uh1.v
    public /* bridge */ /* synthetic */ uh1.u v() {
        return super.v();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m
    public final void v0() {
        this.L.o0();
        while (true) {
            java.util.LinkedList linkedList = this.P;
            if (linkedList.isEmpty()) {
                return;
            } else {
                ((java.lang.Runnable) linkedList.poll()).run();
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.e9
    /* renamed from: v1, reason: merged with bridge method [inline-methods] */
    public em1.b Q0() {
        return new em1.b(this);
    }

    public final com.tencent.mm.plugin.appbrand.report.quality.o0 w1() {
        return this.M;
    }

    @Override // com.tencent.mm.plugin.appbrand.e9
    /* renamed from: x1, reason: merged with bridge method [inline-methods] */
    public com.tencent.luggage.sdk.jsapi.component.b V0() {
        return (com.tencent.luggage.sdk.jsapi.component.b) super.W0(com.tencent.luggage.sdk.jsapi.component.b.class);
    }

    @Override // ph1.s
    public boolean y(java.lang.String str) {
        return this.L.y(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.jsapi.e0
    public void y0(org.json.JSONObject wxConfig) {
        super.y0(wxConfig);
        com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var = this.L;
        a0Var.I(wxConfig);
        K0(wxConfig, "isIsolateContext", java.lang.Boolean.valueOf(a0Var.c0()));
        K0(wxConfig, "version", com.tencent.mm.sdk.platformtools.a0.a(null, com.tencent.mm.sdk.platformtools.z.f193112h));
        K0(wxConfig, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, com.tencent.mm.sdk.platformtools.m2.f(getContext()));
        if (x() instanceof com.tencent.mm.plugin.appbrand.appcache.AbsReader) {
            pe.e K1 = ((com.tencent.mm.plugin.appbrand.appcache.AbsReader) x()).K1();
            K1.getClass();
            kotlin.jvm.internal.o.g(wxConfig, "wxConfig");
            java.util.HashMap hashMap = K1.f353591a;
            if (!hashMap.isEmpty()) {
                try {
                    wxConfig.put("expt", new org.json.JSONObject(hashMap));
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("Luggage.ExptMapping", "applyToWxConfig get exception:" + e17, e17);
                }
            }
        }
        K0(wxConfig, "supportInvokeWithAppId", java.lang.Boolean.TRUE);
    }

    public final com.tencent.luggage.sdk.jsapi.component.service.a0 y1() {
        return this.L;
    }

    @Override // com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.jsapi.e0
    public void z0(org.json.JSONObject jSONObject) {
        new com.tencent.luggage.sdk.jsapi.component.service.y1().a(jSONObject);
    }

    public final <T> T z1(java.lang.Class<T> cls) {
        if (cls.isInstance(this)) {
            return cls.cast(this);
        }
        com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var = this.L;
        return cls.isInstance(a0Var) ? cls.cast(a0Var) : cls.cast(a0Var.r(cls));
    }
}
