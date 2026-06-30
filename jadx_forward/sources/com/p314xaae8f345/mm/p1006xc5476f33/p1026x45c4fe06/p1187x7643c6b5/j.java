package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

/* loaded from: classes7.dex */
public class j extends com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n implements ae.r {
    public ud.c I;

    /* renamed from: J, reason: collision with root package name */
    public int f170221J;
    public com.p314xaae8f345.mm.p938xc0468b46.C11101x514cf849 K;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 L;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 M;
    public boolean N;
    public java.lang.Boolean P;
    public java.lang.Boolean Q;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.d7 R;

    static {
        gf.q0.f352698a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k();
    }

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        super(c0Var);
        this.I = null;
        this.f170221J = 0;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.P = null;
        this.Q = null;
        this.R = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.d7((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) F(), 0);
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_disable_node_js, 0) == 1;
        this.f128903q = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "[no-node] ctor, mIsNodeDisabled = %b", java.lang.Boolean.valueOf(z17));
        G(ae.r.class, this);
        G(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.z.class, new com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe(c0Var));
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n
    public com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.t A0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "fetchLibBootstrap, isUsingIsolateContext: %b, mainContextIsSnapshot: %b", java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(this.N));
        if (!this.N) {
            return super.A0();
        }
        P0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12587x30bb3a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.t1.f172356d));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3 j3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = this.L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 c12745x1ee4df80 = this.M;
        java.util.Objects.requireNonNull(c12745x1ee4df80);
        j3Var.j(interfaceC11702x4ae7c33, c12745x1ee4df80);
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.t tVar = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.t();
        tVar.f129064a = "WAServiceMainContextReady.js";
        tVar.f129066c = ";WeixinSnapshot.snapshotContextReady();";
        tVar.f129067d = true;
        return tVar;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.v0
    public void B(java.lang.String params) {
        yb1.p pVar;
        int i17;
        jz5.f0 f0Var;
        ze.n S = S();
        if (S != null && (pVar = (yb1.p) S.K1(yb1.p.class)) != null) {
            yb1.o oVar = (yb1.o) pVar;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
            boolean z17 = false;
            if (!oVar.b().isEmpty()) {
                try {
                    i17 = new org.json.JSONObject(params).optInt("callbackID", -1);
                } catch (java.lang.Exception unused) {
                    i17 = -1;
                }
                if (i17 != -1 && oVar.b().containsKey(java.lang.Integer.valueOf(i17))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPageContentService", "processDebugInfo callbackId:" + i17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPageContentService", "notifyPageContent callbackId:" + i17 + ", content:" + params);
                    yz5.l lVar = (yz5.l) oVar.b().remove(java.lang.Integer.valueOf(i17));
                    if (lVar != null) {
                        lVar.mo146xb9724478(params);
                        f0Var = jz5.f0.f384359a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetPageContentService", "notifyPageContent not found");
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

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n
    public java.lang.String B0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 x17;
        java.lang.String str = "";
        java.lang.String str2 = ("" + super.B0()) + ik1.f.e("wxa_library/puppet_wrapper.js");
        if (F() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u6) {
            java.lang.String wxAutoTestMainContextJs = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u6) F()).getWxAutoTestMainContextJs();
            if (!android.text.TextUtils.isEmpty(wxAutoTestMainContextJs)) {
                str2 = str2 + "\n" + wxAutoTestMainContextJs;
            }
        }
        if (this.f128904r == null) {
            return str2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.o oVar = this.f128904r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) F();
        if (oVar.f169228d) {
            java.lang.String M = (e9Var == null || (x17 = e9Var.x()) == null) ? null : x17.M("WAServiceRemoteDebug.js");
            if (M != null) {
                str = M;
            }
        }
        sb6.append(str);
        return sb6.toString();
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n
    public int C0() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_common_lib_code_cache_type, 0);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n
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

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n
    public boolean G0() {
        if (this.P == null) {
            this.P = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.j0.f167625a.a());
        }
        return this.P.booleanValue();
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n
    public com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f H0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.j0 j0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F();
        java.util.Objects.requireNonNull(c0Var);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.a(c0Var, j0Var);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void I(org.json.JSONObject jSONObject) {
        try {
            jSONObject.put("clientVersion", o45.wf.f424562g);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f229341e = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).getF229341e();
            jSONObject.put("JSEngineName", f229341e instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.g ? "J2V8-Package" : f229341e instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.o0 ? "NodeJS" : com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a);
            hm1.m mVar = hm1.m.f363736a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.a.a(jSONObject, "useXWebVideo", java.lang.Boolean.TRUE);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.a.a(jSONObject, "XWebVideoMinVersion", 300);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.a.a(jSONObject, "supportXWebTouch", java.lang.Boolean.valueOf(com.p314xaae8f345.p3210x3857dc.a3.m()));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.a.a(jSONObject, "useXWebMap", java.lang.Boolean.valueOf(hm1.m.d()));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.a.a(jSONObject, "useXWebTextarea", java.lang.Boolean.valueOf(((java.lang.Boolean) ((jz5.n) hm1.m.f363741f).mo141623x754a37bb()).booleanValue()));
            hm1.m mVar2 = hm1.m.f363736a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.a.a(jSONObject, "supportXWebTextarea", java.lang.Boolean.valueOf(mVar2.c()));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.a.a(jSONObject, "useXWebInput", java.lang.Boolean.valueOf(((java.lang.Boolean) ((jz5.n) hm1.m.f363743h).mo141623x754a37bb()).booleanValue()));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.a.a(jSONObject, "supportXWebInput", java.lang.Boolean.valueOf(mVar2.b()));
            boolean m17 = com.p314xaae8f345.p3210x3857dc.a3.m();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.XWebABTests", "openXWebSameLayerRendering for Live:%b", java.lang.Boolean.valueOf(m17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.a.a(jSONObject, "useXWebLive", java.lang.Boolean.valueOf(m17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.a.a(jSONObject, "abtestXWebCameraEnable", java.lang.Boolean.valueOf(mVar2.a()));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.a.a(jSONObject, "useXWebCamera", java.lang.Boolean.valueOf(((java.lang.Boolean) ((jz5.n) hm1.m.f363745j).mo141623x754a37bb()).booleanValue()));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.a.a(jSONObject, "useXWebVoipRoom", java.lang.Boolean.valueOf(hm1.m.e()));
            jSONObject.put("useXWebWebGLCanvas", hm1.m.f());
            jSONObject.put("useSkiaCanvasRaf", hm1.m.h());
            jSONObject.put("useNewXWebCanvasToTFP", hm1.m.g());
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", e17, "attachCommonConfig error", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n
    public void I0(boolean z17, java.lang.String str, cl.k1 k1Var) {
        if (!this.N) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a.h(this.L, str, z17, k1Var, (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F());
            return;
        }
        P0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12586x30bb39(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.t1.f172356d));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3 j3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = this.L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 c12745x1ee4df80 = this.M;
        java.util.Objects.requireNonNull(c12745x1ee4df80);
        j3Var.i(interfaceC11702x4ae7c33, c12745x1ee4df80, z17, k1Var, (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F());
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s.f172081a;
        if (((java.lang.Boolean) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s.f172082b).mo141623x754a37bb()).booleanValue()) {
            e0();
        }
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void J() {
        super.J();
        ud.c cVar = this.I;
        if (cVar != null) {
            cVar.b();
        }
        if (this.K != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y) D0().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y.class)).r(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.p(this));
        }
        this.R.d();
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n
    public void J0(java.lang.String str, java.lang.String str2) {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.x0.b((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F(), str, str2);
        } catch (java.lang.Throwable unused) {
        }
        try {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) S()).R2.f169734c = str + "\n" + str2;
        } catch (java.lang.NullPointerException unused2) {
        }
        if (this.N) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a.r(this.L, "app:main", str, str2);
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
    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t K() {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j.K():com.tencent.mm.plugin.appbrand.jsruntime.t");
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n
    public boolean K0() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_read_comm_lib_by_fd, 1) == 1;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n
    public final boolean M0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F();
        java.util.Objects.requireNonNull(c0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = c0Var.t3();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t37, "getRuntime(...)");
        return t37.e3();
    }

    public final synchronized void N0() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "hy: start create magicbrush", new java.lang.Object[0]);
        boolean z17 = true;
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (this.I == null) {
            z17 = false;
        }
        objArr[0] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "setup magicbrush. loaded?[%b]", objArr);
        if (this.I != null) {
            return;
        }
        if (F() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "hy: component lost");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f229341e = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).getF229341e();
        if (f229341e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "createMagicBrushIfNeed jsRuntime is null");
            return;
        }
        ah.d.a();
        android.content.Context f229340d = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).t3() != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).t3().f156328d : ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).getF229340d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.v vVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.v(this, f229340d, f229341e, f229340d);
        this.I = vVar;
        vVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "hy: magicbrush create done");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).mo50262x39e05d35()) {
            ud.c cVar = this.I;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).t3();
            cVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
            cVar.c(runtime);
        }
        int i17 = com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83.f130109j;
        f229341e.mo14658x74041feb(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.y(this, null), "MagicBrushViewIdTransfer");
        f229341e.mo14660x738236e6(ik1.f.e("wxa_library/NativeGlobal-WAService.js"), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.w(this));
    }

    public final void O0(java.lang.String str) {
        N0();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (w() != null) {
            w().t(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "hy: create magicbrush failed! %s", str);
        }
    }

    public final void P0(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x xVar) {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 c12745x1ee4df80;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F();
        if (c0Var == null) {
            return;
        }
        if ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0.PreloadOnProcessCreated == c0Var.w1()) || (c12745x1ee4df80 = this.M) == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).r(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.service.j$$e
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x.this.a(c12745x1ee4df80);
            }
        }, "WxaCommLibV8SnapshotClient#flushSnapshotInfo");
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public java.lang.String T() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d2.a();
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public final int U() {
        int i17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.i() != null && (i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.i().getInt("appbrand_wasm_opt", -2)) != -2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "wasm opt set to %d by cmd", java.lang.Integer.valueOf(i17));
            return i17;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_wasm_opt_state, -2);
        if (Ni == -2) {
            return -2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "wasm opt set to %d by abtest", java.lang.Integer.valueOf(Ni));
        return Ni;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public boolean X() {
        return !(F() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.f);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public boolean Y() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k7.f170240a;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public boolean b0() {
        if (F0() || (F() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.f)) {
            return false;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("weixin_mini_program_debug_info", 2, null).getString("weixin_mini_program_debug_host", "").isEmpty();
        }
        return true;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
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
                int i18 = com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad.f130119q;
                O0("mmbox2d");
                return true;
            }
            if ("Phys3D".equals(str)) {
                int i19 = com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad.f130119q;
                O0("mmphysx");
                return true;
            }
            if ("XInference".equals(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "[MNXNET] LAZY_LOAD_WEXNET");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "[MNXNET] lazyLoadWeXNetSync called");
                if (this.K != null) {
                    return true;
                }
                try {
                    com.p314xaae8f345.mm.p2818xd0d82df3.C22945x9a2e1613.m83549x4877f184();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "[MNXNET] load libmnxnet.so success");
                    this.K = new com.p314xaae8f345.mm.p938xc0468b46.C11101x514cf849();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0) D0().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class);
                    this.K.m47881xad361398(l0Var.L(), l0Var.G(), l0Var.z());
                    this.K.m47893x5aaa405a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o(this));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "[MNXNET] lazyLoadWeXNetSync end");
                    return true;
                } catch (java.lang.Throwable unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "[MNXNET] load libmnxnet.so failed");
                    return false;
                }
            }
        }
        return super.d0(i17, str, jSONObject);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void g0() {
        super.g0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f229341e = c0Var != null ? c0Var.getF229341e() : null;
        if (c0Var == null || f229341e == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.k0.a(c0Var, f229341e);
    }

    @Override // ae.r
    public int h() {
        return this.f170221J;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void h0(int i17, java.lang.String str) {
        this.R.c(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.o oVar = this.f128904r;
        if (oVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.v) {
            oVar.b(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i0() {
        /*
            r6 = this;
            super.i0()
            com.tencent.mm.plugin.appbrand.jsapi.l r0 = r6.F()
            com.tencent.mm.plugin.appbrand.service.c0 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) r0
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
            boolean r4 = r4.f129091b
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5, r1)
            if (r0 == 0) goto L5c
            com.tencent.luggage.sdk.jsapi.component.service.v1 r1 = r0.B1()
            if (r1 == 0) goto L55
            com.tencent.luggage.sdk.jsapi.component.service.v1 r1 = r0.B1()
            boolean r1 = r1.f129091b
            if (r1 == 0) goto L55
            r3 = r2
        L55:
            r1 = r3 ^ 1
            if (r1 == 0) goto L5c
            r0.Z1()
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j.i0():void");
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void j0() {
        super.j0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F();
        com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22920xf0d5c107 abstractC22920xf0d5c107 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.k0.f169423a;
        if (abstractC22920xf0d5c107 == null) {
            return;
        }
        abstractC22920xf0d5c107.m83349x590c58ed(c0Var.mo48798x74292566());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsThreadHangMonitor", "onRuntimePause appId:%s", c0Var.mo48798x74292566());
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void k0() {
        super.k0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F();
        com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22920xf0d5c107 abstractC22920xf0d5c107 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.k0.f169423a;
        if (abstractC22920xf0d5c107 == null) {
            return;
        }
        abstractC22920xf0d5c107.m83350x1ebc6d02(c0Var.mo48798x74292566());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsThreadHangMonitor", "onRuntimeResume appId:%s", c0Var.mo48798x74292566());
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void n0() {
        super.n0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.o oVar = this.f128904r;
        if (oVar != null) {
            oVar.d();
        }
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void o0() {
        super.o0();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.m1.d((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) F())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "service initNativeTransLogic");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.m1.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).getF229341e(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).mo50260x9f1221c2(), N());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.m1.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).getF229341e(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).mo50260x9f1221c2(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).mo50260x9f1221c2(), N());
        }
        this.R.b();
        if (this.f128904r == null) {
            if (S() != null && S().s2()) {
                if (!android.text.TextUtils.isEmpty(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.h2.f128972a.c(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.z1.f129100a))) {
                    this.f128904r = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.y();
                    sj1.l.d(P() + "", true);
                }
            }
            this.f128904r = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.v();
            sj1.l.d(P() + "", false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.o oVar = this.f128904r;
        if (oVar != null) {
            oVar.a((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) F());
        }
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public java.util.Map p() {
        if (!(F() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.f)) {
            return (java.util.Map) cf.i.a("AppBrandMiniProgramServiceLogicImpWC.onCreateJsApiPool()", new yz5.a() { // from class: com.tencent.mm.plugin.appbrand.service.j$$a
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j.this;
                    jVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p0 p0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p0();
                    p0Var.g();
                    java.util.Map map = p0Var.f164015c;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = jVar.L;
                    if (interfaceC11702x4ae7c33 != null && gf.l0.f352648a.a(interfaceC11702x4ae7c33)) {
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.putAll(gf.q0.f352698a.a());
                        ((java.util.HashMap) map).putAll(hashMap);
                    }
                    return map;
                }
            });
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p0.e());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p0 p0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p0();
        p0Var.g();
        hashMap.putAll(p0Var.f164015c);
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var : kz5.c0.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.p(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.s(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.v(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.y())) {
            hashMap.put(k0Var.k(), k0Var);
        }
        return hashMap;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "exportBaseMethods e:%s", e17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "exportBaseMethods:%b", java.lang.Boolean.valueOf(M0));
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void q0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        super.q0(c11510xdd90c2f2);
        ud.c cVar = this.I;
        if (cVar != null) {
            cVar.getClass();
            cVar.c(c11510xdd90c2f2);
        }
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5129xb513d637 r0() {
        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5129xb513d637 r07 = super.r0();
        if (r07 == null) {
            return null;
        }
        boolean z17 = true;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k7.f170240a) {
            int i17 = sj1.l.f489904a;
            if (!(i17 == 0 || 3 == i17)) {
                z17 = false;
            }
        }
        r07.f21467x7687b8b4 = z17;
        return r07;
    }

    @Override // ae.r
    public void s(int i17) {
        this.f170221J = i17;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public final boolean u0(int i17, java.lang.String str) {
        return F() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.f;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public final boolean v0(java.lang.String str, java.lang.String str2, int i17, int i18) {
        return F() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.f;
    }

    @Override // ae.r
    public com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad w() {
        N0();
        ud.c cVar = this.I;
        if (cVar == null) {
            return null;
        }
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = cVar.f508102c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4209xd2d3ddad);
        return c4209xd2d3ddad;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public synchronized boolean w0() {
        ym0.l.f544663a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.l(this);
        ym0.c.f544660a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12585x30bb38();
        return super.w0();
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n
    public void y0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.o oVar = this.f128904r;
        if (oVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.y) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.y) oVar).f169248o = bVar;
        }
    }
}
