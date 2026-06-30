package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public class j extends com.tencent.luggage.sdk.jsapi.component.service.n implements ae.r {
    public ud.c I;

    /* renamed from: J, reason: collision with root package name */
    public int f88688J;
    public com.tencent.mm.mnxnet.WeXNetJSBinding K;
    public com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader L;
    public com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo M;
    public boolean N;
    public java.lang.Boolean P;
    public java.lang.Boolean Q;
    public final com.tencent.mm.plugin.appbrand.service.d7 R;

    static {
        gf.q0.f271165a = new com.tencent.mm.plugin.appbrand.service.k();
    }

    public j(com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        super(c0Var);
        this.I = null;
        this.f88688J = 0;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.P = null;
        this.Q = null;
        this.R = new com.tencent.mm.plugin.appbrand.service.d7((com.tencent.mm.plugin.appbrand.e9) F(), 0);
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_disable_node_js, 0) == 1;
        this.f47370q = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "[no-node] ctor, mIsNodeDisabled = %b", java.lang.Boolean.valueOf(z17));
        G(ae.r.class, this);
        G(com.tencent.luggage.sdk.jsapi.component.service.z.class, new com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl(c0Var));
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.n
    public com.tencent.luggage.sdk.jsapi.component.service.t A0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "fetchLibBootstrap, isUsingIsolateContext: %b, mainContextIsSnapshot: %b", java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(this.N));
        if (!this.N) {
            return super.A0();
        }
        P0(new com.tencent.mm.plugin.appbrand.service.j$$d(com.tencent.mm.plugin.appbrand.v8_snapshot.t1.f90823d));
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3 j3Var = com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = this.L;
        com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = this.M;
        java.util.Objects.requireNonNull(wxaPkgV8SnapshotInfo);
        j3Var.j(iCommLibReader, wxaPkgV8SnapshotInfo);
        com.tencent.luggage.sdk.jsapi.component.service.t tVar = new com.tencent.luggage.sdk.jsapi.component.service.t();
        tVar.f47531a = "WAServiceMainContextReady.js";
        tVar.f47533c = ";WeixinSnapshot.snapshotContextReady();";
        tVar.f47534d = true;
        return tVar;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.n, com.tencent.mm.plugin.appbrand.debugger.v0
    public void B(java.lang.String params) {
        yb1.p pVar;
        int i17;
        jz5.f0 f0Var;
        ze.n S = S();
        if (S != null && (pVar = (yb1.p) S.K1(yb1.p.class)) != null) {
            yb1.o oVar = (yb1.o) pVar;
            kotlin.jvm.internal.o.g(params, "params");
            boolean z17 = false;
            if (!oVar.b().isEmpty()) {
                try {
                    i17 = new org.json.JSONObject(params).optInt("callbackID", -1);
                } catch (java.lang.Exception unused) {
                    i17 = -1;
                }
                if (i17 != -1 && oVar.b().containsKey(java.lang.Integer.valueOf(i17))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GetPageContentService", "processDebugInfo callbackId:" + i17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.GetPageContentService", "notifyPageContent callbackId:" + i17 + ", content:" + params);
                    yz5.l lVar = (yz5.l) oVar.b().remove(java.lang.Integer.valueOf(i17));
                    if (lVar != null) {
                        lVar.invoke(params);
                        f0Var = jz5.f0.f302826a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.GetPageContentService", "notifyPageContent not found");
                    }
                    z17 = true;
                }
            }
            if (z17) {
                return;
            }
        }
        super.B(params);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.n
    public java.lang.String B0() {
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17;
        java.lang.String str = "";
        java.lang.String str2 = ("" + super.B0()) + ik1.f.e("wxa_library/puppet_wrapper.js");
        if (F() instanceof com.tencent.mm.plugin.appbrand.service.u6) {
            java.lang.String wxAutoTestMainContextJs = ((com.tencent.mm.plugin.appbrand.service.u6) F()).getWxAutoTestMainContextJs();
            if (!android.text.TextUtils.isEmpty(wxAutoTestMainContextJs)) {
                str2 = str2 + "\n" + wxAutoTestMainContextJs;
            }
        }
        if (this.f47371r == null) {
            return str2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        com.tencent.mm.plugin.appbrand.profile.o oVar = this.f47371r;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) F();
        if (oVar.f87695d) {
            java.lang.String M = (e9Var == null || (x17 = e9Var.x()) == null) ? null : x17.M("WAServiceRemoteDebug.js");
            if (M != null) {
                str = M;
            }
        }
        sb6.append(str);
        return sb6.toString();
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.n
    public int C0() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_common_lib_code_cache_type, 0);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.n
    public boolean F0() {
        if (this.Q == null) {
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            boolean z17 = false;
            if (e0Var != null) {
                if (((h62.d) e0Var).rj(e42.c0.clicfg_android_wxa_enable_cronet_http_binding, 0) > 0) {
                    z17 = true;
                }
            }
            this.Q = java.lang.Boolean.valueOf(z17);
        }
        return this.Q.booleanValue();
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.n
    public boolean G0() {
        if (this.P == null) {
            this.P = java.lang.Boolean.valueOf(com.tencent.mm.plugin.appbrand.networking.j0.f86092a.a());
        }
        return this.P.booleanValue();
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.n
    public com.tencent.luggage.sdk.jsapi.component.service.f H0(com.tencent.mm.plugin.appbrand.jsruntime.t tVar, com.tencent.mm.plugin.appbrand.jsruntime.j0 j0Var) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) F();
        java.util.Objects.requireNonNull(c0Var);
        return new com.tencent.mm.plugin.appbrand.service.a(c0Var, j0Var);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void I(org.json.JSONObject jSONObject) {
        try {
            jSONObject.put("clientVersion", o45.wf.f343029g);
            com.tencent.mm.plugin.appbrand.jsruntime.t f147808e = ((com.tencent.mm.plugin.appbrand.service.c0) F()).getF147808e();
            jSONObject.put("JSEngineName", f147808e instanceof com.tencent.mm.plugin.appbrand.jsruntime.g ? "J2V8-Package" : f147808e instanceof com.tencent.mm.plugin.appbrand.jsruntime.o0 ? "NodeJS" : com.eclipsesource.mmv8.Platform.UNKNOWN);
            hm1.m mVar = hm1.m.f282203a;
            com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "useXWebVideo", java.lang.Boolean.TRUE);
            com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "XWebVideoMinVersion", 300);
            com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "supportXWebTouch", java.lang.Boolean.valueOf(com.tencent.xweb.a3.m()));
            com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "useXWebMap", java.lang.Boolean.valueOf(hm1.m.d()));
            com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "useXWebTextarea", java.lang.Boolean.valueOf(((java.lang.Boolean) ((jz5.n) hm1.m.f282208f).getValue()).booleanValue()));
            hm1.m mVar2 = hm1.m.f282203a;
            com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "supportXWebTextarea", java.lang.Boolean.valueOf(mVar2.c()));
            com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "useXWebInput", java.lang.Boolean.valueOf(((java.lang.Boolean) ((jz5.n) hm1.m.f282210h).getValue()).booleanValue()));
            com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "supportXWebInput", java.lang.Boolean.valueOf(mVar2.b()));
            boolean m17 = com.tencent.xweb.a3.m();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.XWebABTests", "openXWebSameLayerRendering for Live:%b", java.lang.Boolean.valueOf(m17));
            com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "useXWebLive", java.lang.Boolean.valueOf(m17));
            com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "abtestXWebCameraEnable", java.lang.Boolean.valueOf(mVar2.a()));
            com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "useXWebCamera", java.lang.Boolean.valueOf(((java.lang.Boolean) ((jz5.n) hm1.m.f282212j).getValue()).booleanValue()));
            com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "useXWebVoipRoom", java.lang.Boolean.valueOf(hm1.m.e()));
            jSONObject.put("useXWebWebGLCanvas", hm1.m.f());
            jSONObject.put("useSkiaCanvasRaf", hm1.m.h());
            jSONObject.put("useNewXWebCanvasToTFP", hm1.m.g());
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", e17, "attachCommonConfig error", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.n
    public void I0(boolean z17, java.lang.String str, cl.k1 k1Var) {
        if (!this.N) {
            com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.h(this.L, str, z17, k1Var, (com.tencent.luggage.sdk.jsapi.component.service.y) F());
            return;
        }
        P0(new com.tencent.mm.plugin.appbrand.service.j$$c(com.tencent.mm.plugin.appbrand.v8_snapshot.t1.f90823d));
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3 j3Var = com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = this.L;
        com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = this.M;
        java.util.Objects.requireNonNull(wxaPkgV8SnapshotInfo);
        j3Var.i(iCommLibReader, wxaPkgV8SnapshotInfo, z17, k1Var, (com.tencent.luggage.sdk.jsapi.component.service.y) F());
        jz5.g gVar = com.tencent.mm.plugin.appbrand.utils.s.f90548a;
        if (((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.appbrand.utils.s.f90549b).getValue()).booleanValue()) {
            e0();
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.n, com.tencent.luggage.sdk.jsapi.component.service.a0
    public void J() {
        super.J();
        ud.c cVar = this.I;
        if (cVar != null) {
            cVar.b();
        }
        if (this.K != null) {
            ((com.tencent.mm.plugin.appbrand.jsruntime.y) D0().h0(com.tencent.mm.plugin.appbrand.jsruntime.y.class)).r(new com.tencent.mm.plugin.appbrand.service.p(this));
        }
        this.R.d();
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.n
    public void J0(java.lang.String str, java.lang.String str2) {
        try {
            com.tencent.mm.plugin.appbrand.report.x0.b((com.tencent.mm.plugin.appbrand.service.c0) F(), str, str2);
        } catch (java.lang.Throwable unused) {
        }
        try {
            ((com.tencent.mm.plugin.appbrand.o6) S()).R2.f88201c = str + "\n" + str2;
        } catch (java.lang.NullPointerException unused2) {
        }
        if (this.N) {
            com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.r(this.L, "app:main", str, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    @Override // com.tencent.luggage.sdk.jsapi.component.service.n, com.tencent.luggage.sdk.jsapi.component.service.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.appbrand.jsruntime.t K() {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.service.j.K():com.tencent.mm.plugin.appbrand.jsruntime.t");
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.n
    public boolean K0() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_read_comm_lib_by_fd, 1) == 1;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.n
    public final boolean M0() {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) F();
        java.util.Objects.requireNonNull(c0Var);
        com.tencent.mm.plugin.appbrand.o6 t37 = c0Var.t3();
        kotlin.jvm.internal.o.f(t37, "getRuntime(...)");
        return t37.e3();
    }

    public final synchronized void N0() {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "hy: start create magicbrush", new java.lang.Object[0]);
        boolean z17 = true;
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (this.I == null) {
            z17 = false;
        }
        objArr[0] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "setup magicbrush. loaded?[%b]", objArr);
        if (this.I != null) {
            return;
        }
        if (F() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "hy: component lost");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.t f147808e = ((com.tencent.mm.plugin.appbrand.service.c0) F()).getF147808e();
        if (f147808e == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "createMagicBrushIfNeed jsRuntime is null");
            return;
        }
        ah.d.a();
        android.content.Context f147807d = ((com.tencent.mm.plugin.appbrand.service.c0) F()).t3() != null ? ((com.tencent.mm.plugin.appbrand.service.c0) F()).t3().f74795d : ((com.tencent.mm.plugin.appbrand.service.c0) F()).getF147807d();
        com.tencent.mm.plugin.appbrand.service.v vVar = new com.tencent.mm.plugin.appbrand.service.v(this, f147807d, f147808e, f147807d);
        this.I = vVar;
        vVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "hy: magicbrush create done");
        if (((com.tencent.mm.plugin.appbrand.service.c0) F()).isRunning()) {
            ud.c cVar = this.I;
            com.tencent.mm.plugin.appbrand.o6 runtime = ((com.tencent.mm.plugin.appbrand.service.c0) F()).t3();
            cVar.getClass();
            kotlin.jvm.internal.o.g(runtime, "runtime");
            cVar.c(runtime);
        }
        int i17 = com.tencent.magicbrush.MBRuntime.f48576j;
        f147808e.addJavascriptInterface(new com.tencent.mm.plugin.appbrand.service.y(this, null), "MagicBrushViewIdTransfer");
        f147808e.evaluateJavascript(ik1.f.e("wxa_library/NativeGlobal-WAService.js"), new com.tencent.mm.plugin.appbrand.service.w(this));
    }

    public final void O0(java.lang.String str) {
        N0();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (w() != null) {
            w().t(str);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "hy: create magicbrush failed! %s", str);
        }
    }

    public final void P0(final com.tencent.mm.plugin.appbrand.service.x xVar) {
        final com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) F();
        if (c0Var == null) {
            return;
        }
        if ((com.tencent.mm.plugin.appbrand.report.quality.o0.PreloadOnProcessCreated == c0Var.w1()) || (wxaPkgV8SnapshotInfo = this.M) == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).r(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.service.j$$e
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.service.x.this.a(wxaPkgV8SnapshotInfo);
            }
        }, "WxaCommLibV8SnapshotClient#flushSnapshotInfo");
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public java.lang.String T() {
        return com.tencent.mm.plugin.appbrand.jsruntime.d2.a();
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public final int U() {
        int i17;
        if (com.tencent.mm.sdk.platformtools.x2.i() != null && (i17 = com.tencent.mm.sdk.platformtools.x2.i().getInt("appbrand_wasm_opt", -2)) != -2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "wasm opt set to %d by cmd", java.lang.Integer.valueOf(i17));
            return i17;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_wasm_opt_state, -2);
        if (Ni == -2) {
            return -2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "wasm opt set to %d by abtest", java.lang.Integer.valueOf(Ni));
        return Ni;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public boolean X() {
        return !(F() instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.f);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public boolean Y() {
        return com.tencent.mm.plugin.appbrand.service.k7.f88707a;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public boolean b0() {
        if (F0() || (F() instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.f)) {
            return false;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            return com.tencent.mm.sdk.platformtools.o4.N("weixin_mini_program_debug_info", 2, null).getString("weixin_mini_program_debug_host", "").isEmpty();
        }
        return true;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.n, com.tencent.luggage.sdk.jsapi.component.service.a0
    public boolean d0(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 == 0) {
            if ("MediaToolKit".equals(str)) {
                O0(null);
                return true;
            }
            if ("Image".equals(str)) {
                O0(null);
                return true;
            }
            if ("OffscreenCanvas".equals(str)) {
                O0(null);
                return true;
            }
            if ("Profiler".equals(str)) {
                O0(null);
                return true;
            }
            if ("ARSession".equals(str)) {
                O0(null);
                return super.d0(i17, str, jSONObject);
            }
            if ("Box2D".equals(str)) {
                int i18 = com.tencent.magicbrush.MagicBrush.f48586q;
                O0("mmbox2d");
                return true;
            }
            if ("Phys3D".equals(str)) {
                int i19 = com.tencent.magicbrush.MagicBrush.f48586q;
                O0("mmphysx");
                return true;
            }
            if ("XInference".equals(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "[MNXNET] LAZY_LOAD_WEXNET");
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "[MNXNET] lazyLoadWeXNetSync called");
                if (this.K != null) {
                    return true;
                }
                try {
                    com.tencent.mm.wexnet.WeXNet.tryLoadLib();
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "[MNXNET] load libmnxnet.so success");
                    this.K = new com.tencent.mm.mnxnet.WeXNetJSBinding();
                    com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var = (com.tencent.mm.plugin.appbrand.jsruntime.l0) D0().h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class);
                    this.K.bindTo(l0Var.L(), l0Var.G(), l0Var.z());
                    this.K.setWeXNetCallback(new com.tencent.mm.plugin.appbrand.service.o(this));
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "[MNXNET] lazyLoadWeXNetSync end");
                    return true;
                } catch (java.lang.Throwable unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "[MNXNET] load libmnxnet.so failed");
                    return false;
                }
            }
        }
        return super.d0(i17, str, jSONObject);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.n, com.tencent.luggage.sdk.jsapi.component.service.a0
    public void g0() {
        super.g0();
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) F();
        com.tencent.mm.plugin.appbrand.jsruntime.t f147808e = c0Var != null ? c0Var.getF147808e() : null;
        if (c0Var == null || f147808e == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.report.k0.a(c0Var, f147808e);
    }

    @Override // ae.r
    public int h() {
        return this.f88688J;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void h0(int i17, java.lang.String str) {
        this.R.c(str);
        com.tencent.mm.plugin.appbrand.profile.o oVar = this.f47371r;
        if (oVar instanceof com.tencent.mm.plugin.appbrand.profile.v) {
            oVar.b(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.luggage.sdk.jsapi.component.service.n, com.tencent.luggage.sdk.jsapi.component.service.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i0() {
        /*
            r6 = this;
            super.i0()
            com.tencent.mm.plugin.appbrand.jsapi.l r0 = r6.F()
            com.tencent.mm.plugin.appbrand.service.c0 r0 = (com.tencent.mm.plugin.appbrand.service.c0) r0
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r3 = 0
            r1[r3] = r2
            r2 = 1
            if (r0 == 0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = r3
        L17:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1[r2] = r4
            if (r0 == 0) goto L35
            com.tencent.luggage.sdk.jsapi.component.service.v1 r4 = r0.B1()
            if (r4 == 0) goto L2f
            com.tencent.luggage.sdk.jsapi.component.service.v1 r4 = r0.B1()
            boolean r4 = r4.f47558b
            if (r4 == 0) goto L2f
            r4 = r2
            goto L30
        L2f:
            r4 = r3
        L30:
            r4 = r4 ^ r2
            if (r4 == 0) goto L35
            r4 = r2
            goto L36
        L35:
            r4 = r3
        L36:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5 = 2
            r1[r5] = r4
            java.lang.String r4 = "MicroMsg.AppBrandMiniProgramServiceLogicImpWC"
            java.lang.String r5 = "before try requireWARenderContext, preloadSkyline: %b serviceWC: %b, serviceWC.shouldPreload: %b"
            com.tencent.mars.xlog.Log.i(r4, r5, r1)
            if (r0 == 0) goto L5c
            com.tencent.luggage.sdk.jsapi.component.service.v1 r1 = r0.B1()
            if (r1 == 0) goto L55
            com.tencent.luggage.sdk.jsapi.component.service.v1 r1 = r0.B1()
            boolean r1 = r1.f47558b
            if (r1 == 0) goto L55
            r3 = r2
        L55:
            r1 = r3 ^ 1
            if (r1 == 0) goto L5c
            r0.Z1()
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.service.j.i0():void");
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.n, com.tencent.luggage.sdk.jsapi.component.service.a0
    public void j0() {
        super.j0();
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) F();
        com.tencent.mm.weapp_core.JsThreadMonitor jsThreadMonitor = com.tencent.mm.plugin.appbrand.report.k0.f87890a;
        if (jsThreadMonitor == null) {
            return;
        }
        jsThreadMonitor.setAppBackground(c0Var.getAppId());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsThreadHangMonitor", "onRuntimePause appId:%s", c0Var.getAppId());
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.n, com.tencent.luggage.sdk.jsapi.component.service.a0
    public void k0() {
        super.k0();
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) F();
        com.tencent.mm.weapp_core.JsThreadMonitor jsThreadMonitor = com.tencent.mm.plugin.appbrand.report.k0.f87890a;
        if (jsThreadMonitor == null) {
            return;
        }
        jsThreadMonitor.setAppForeground(c0Var.getAppId());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsThreadHangMonitor", "onRuntimeResume appId:%s", c0Var.getAppId());
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.n, com.tencent.luggage.sdk.jsapi.component.service.a0
    public void n0() {
        super.n0();
        com.tencent.mm.plugin.appbrand.profile.o oVar = this.f47371r;
        if (oVar != null) {
            oVar.d();
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.n, com.tencent.luggage.sdk.jsapi.component.service.a0
    public void o0() {
        super.o0();
        if (com.tencent.mm.plugin.appbrand.jsruntime.m1.d((com.tencent.mm.plugin.appbrand.e9) F())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "service initNativeTransLogic");
            com.tencent.mm.plugin.appbrand.jsruntime.m1.a(((com.tencent.mm.plugin.appbrand.service.c0) F()).getF147808e(), ((com.tencent.mm.plugin.appbrand.service.c0) F()).getComponentId(), N());
            com.tencent.mm.plugin.appbrand.jsruntime.m1.b(((com.tencent.mm.plugin.appbrand.service.c0) F()).getF147808e(), ((com.tencent.mm.plugin.appbrand.service.c0) F()).getComponentId(), ((com.tencent.mm.plugin.appbrand.service.c0) F()).getComponentId(), N());
        }
        this.R.b();
        if (this.f47371r == null) {
            if (S() != null && S().s2()) {
                if (!android.text.TextUtils.isEmpty(com.tencent.luggage.sdk.jsapi.component.service.h2.f47439a.c(com.tencent.luggage.sdk.jsapi.component.service.z1.f47567a))) {
                    this.f47371r = new com.tencent.mm.plugin.appbrand.profile.y();
                    sj1.l.d(P() + "", true);
                }
            }
            this.f47371r = new com.tencent.mm.plugin.appbrand.profile.v();
            sj1.l.d(P() + "", false);
        }
        com.tencent.mm.plugin.appbrand.profile.o oVar = this.f47371r;
        if (oVar != null) {
            oVar.a((com.tencent.mm.plugin.appbrand.e9) F());
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public java.util.Map p() {
        if (!(F() instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.f)) {
            return (java.util.Map) cf.i.a("AppBrandMiniProgramServiceLogicImpWC.onCreateJsApiPool()", new yz5.a() { // from class: com.tencent.mm.plugin.appbrand.service.j$$a
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    com.tencent.mm.plugin.appbrand.service.j jVar = com.tencent.mm.plugin.appbrand.service.j.this;
                    jVar.getClass();
                    com.tencent.mm.plugin.appbrand.jsapi.p0 p0Var = new com.tencent.mm.plugin.appbrand.jsapi.p0();
                    p0Var.g();
                    java.util.Map map = p0Var.f82482c;
                    com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = jVar.L;
                    if (iCommLibReader != null && gf.l0.f271115a.a(iCommLibReader)) {
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.putAll(gf.q0.f271165a.a());
                        ((java.util.HashMap) map).putAll(hashMap);
                    }
                    return map;
                }
            });
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(com.tencent.mm.plugin.appbrand.jsapi.p0.e());
        com.tencent.mm.plugin.appbrand.jsapi.p0 p0Var = new com.tencent.mm.plugin.appbrand.jsapi.p0();
        p0Var.g();
        hashMap.putAll(p0Var.f82482c);
        for (com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var : kz5.c0.i(new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.p(), new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.s(), new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.v(), new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.y())) {
            hashMap.put(k0Var.k(), k0Var);
        }
        return hashMap;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.n, com.tencent.luggage.sdk.jsapi.component.service.a0
    public void p0(org.json.JSONObject jSONObject) {
        super.p0(jSONObject);
        boolean M0 = M0();
        try {
            jSONObject.put("exportBaseMethods", M0);
            int i17 = 1;
            jSONObject.put("supressOffscreenPatch", true);
            org.json.JSONObject jSONObject2 = (jSONObject.has("network") && (jSONObject.get("network") instanceof org.json.JSONObject)) ? jSONObject.getJSONObject("network") : new org.json.JSONObject();
            if (!G0()) {
                i17 = 0;
            }
            jSONObject2.put("wssVersion", i17);
            jSONObject.put("network", jSONObject2);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "exportBaseMethods e:%s", e17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "exportBaseMethods:%b", java.lang.Boolean.valueOf(M0));
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.n, com.tencent.luggage.sdk.jsapi.component.service.a0
    public void q0(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        super.q0(appBrandRuntime);
        ud.c cVar = this.I;
        if (cVar != null) {
            cVar.getClass();
            cVar.c(appBrandRuntime);
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJniParams r0() {
        com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJniParams r07 = super.r0();
        if (r07 == null) {
            return null;
        }
        boolean z17 = true;
        if (!com.tencent.mm.plugin.appbrand.service.k7.f88707a) {
            int i17 = sj1.l.f408371a;
            if (!(i17 == 0 || 3 == i17)) {
                z17 = false;
            }
        }
        r07.enableInspector = z17;
        return r07;
    }

    @Override // ae.r
    public void s(int i17) {
        this.f88688J = i17;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public final boolean u0(int i17, java.lang.String str) {
        return F() instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.f;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public final boolean v0(java.lang.String str, java.lang.String str2, int i17, int i18) {
        return F() instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.f;
    }

    @Override // ae.r
    public com.tencent.magicbrush.MagicBrush w() {
        N0();
        ud.c cVar = this.I;
        if (cVar == null) {
            return null;
        }
        com.tencent.magicbrush.MagicBrush magicBrush = cVar.f426569c;
        kotlin.jvm.internal.o.d(magicBrush);
        return magicBrush;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public synchronized boolean w0() {
        ym0.l.f463130a = new com.tencent.mm.plugin.appbrand.service.l(this);
        ym0.c.f463127a = new com.tencent.mm.plugin.appbrand.service.j$$b();
        return super.w0();
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.n
    public void y0(com.tencent.mm.plugin.appbrand.profile.b bVar) {
        com.tencent.mm.plugin.appbrand.profile.o oVar = this.f47371r;
        if (oVar instanceof com.tencent.mm.plugin.appbrand.profile.y) {
            ((com.tencent.mm.plugin.appbrand.profile.y) oVar).f87715o = bVar;
        }
    }
}
