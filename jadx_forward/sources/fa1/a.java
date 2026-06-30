package fa1;

/* loaded from: classes7.dex */
public class a extends ae.a implements fa1.s {

    /* renamed from: J, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.d7 f342200J;
    public final java.util.concurrent.ConcurrentHashMap K;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.i L;
    public wd.c M;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 N;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 P;
    public boolean Q;
    public java.lang.Boolean R;
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.C11874x3ec834d0 S;
    public boolean T;
    public long U;
    public java.lang.Boolean W;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        super(c0Var);
        this.f342200J = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.d7((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) F(), 0);
        this.K = new java.util.concurrent.ConcurrentHashMap();
        this.N = null;
        this.P = null;
        this.Q = false;
        this.R = null;
        this.W = null;
        this.S = null;
        this.T = false;
        this.U = -1L;
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_disable_node_js, 0) == 1;
        this.f128903q = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGameServiceLogicImpWC", "[no-node] ctor, mIsNodeDisabled = %b", java.lang.Boolean.valueOf(z17));
        this.L = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.i();
    }

    @Override // ae.a
    public ud.b A0(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar) {
        return new fa1.j(this, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).getF229340d(), tVar, z17);
    }

    @Override // ae.a
    public ae.l C0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGameServiceLogicImpWC", "fetchLibBootstrap, mainContextIsSnapshot: %b", java.lang.Boolean.valueOf(this.Q));
        if (!this.Q) {
            return super.C0();
        }
        P0(new fa1.C28319x2ca3e0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.t1.f172356d));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3 j3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = this.N;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 c12745x1ee4df80 = this.P;
        java.util.Objects.requireNonNull(c12745x1ee4df80);
        j3Var.j(interfaceC11702x4ae7c33, c12745x1ee4df80);
        ae.l lVar = new ae.l();
        lVar.f84889a = "WAGameReady.js";
        lVar.f84890b = ";WeixinSnapshot.snapshotContextReady();";
        return lVar;
    }

    @Override // ae.a
    public java.lang.String D0() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_mmv8_disable_codecache, false)) {
            return null;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u1.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r0 == null) goto L12;
     */
    @Override // ae.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String E0() {
        /*
            r3 = this;
            java.lang.String r0 = super.E0()
            com.tencent.mm.plugin.appbrand.profile.o r1 = r3.f128904r
            if (r1 == 0) goto L37
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            com.tencent.mm.plugin.appbrand.profile.o r0 = r3.f128904r
            com.tencent.mm.plugin.appbrand.jsapi.l r2 = r3.F()
            com.tencent.mm.plugin.appbrand.e9 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) r2
            boolean r0 = r0.f169228d
            if (r0 == 0) goto L2e
            if (r2 == 0) goto L2b
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r0 = r2.x()
            if (r0 == 0) goto L2b
            java.lang.String r2 = "WAServiceRemoteDebug.js"
            java.lang.String r0 = r0.M(r2)
            goto L2c
        L2b:
            r0 = 0
        L2c:
            if (r0 != 0) goto L30
        L2e:
            java.lang.String r0 = ""
        L30:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fa1.a.E0():java.lang.String");
    }

    @Override // ae.a
    /* renamed from: F0 */
    public boolean mo180100F0() {
        if (this.W == null) {
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            boolean z17 = false;
            if (e0Var != null) {
                if (((h62.d) e0Var).rj(e42.c0.clicfg_android_wxa_enable_cronet_http_binding, 0) > 0) {
                    z17 = true;
                }
            }
            this.W = java.lang.Boolean.valueOf(z17);
        }
        return this.W.booleanValue();
    }

    @Override // ae.a
    public ae.v G0(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.j0 j0Var) {
        return new fa1.x((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) yVar, j0Var);
    }

    @Override // ae.a
    public int H0() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_common_lib_code_cache_type, 0);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void I(org.json.JSONObject jSONObject) {
        try {
            jSONObject.put("clientVersion", o45.wf.f424562g);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f229341e = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).getF229341e();
            jSONObject.put("JSEngineName", f229341e instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.g ? "J2V8-Package" : f229341e instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.o0 ? "NodeJS" : com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandGameServiceLogicImpWC", e17, "attachCommonConfig error", new java.lang.Object[0]);
        }
    }

    @Override // ae.a
    public boolean I0() {
        if (this.R == null) {
            this.R = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.j0.f167625a.a());
        }
        return this.R.booleanValue();
    }

    @Override // ae.a, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void J() {
        super.J();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.i iVar = this.L;
        iVar.f169401h.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.g(iVar));
        this.f342200J.d();
        java.util.Iterator it = this.K.values().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.d7) it.next()).d();
        }
        if (this.S != null) {
            this.S.b();
        }
    }

    @Override // ae.a
    public void J0(boolean z17, java.lang.String str, cl.k1 k1Var) {
        if (!this.Q) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a.h(this.N, str, z17, k1Var, (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F());
            return;
        }
        P0(new fa1.C28320x2ca3e1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.t1.f172356d));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3 j3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = this.N;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 c12745x1ee4df80 = this.P;
        java.util.Objects.requireNonNull(c12745x1ee4df80);
        j3Var.i(interfaceC11702x4ae7c33, c12745x1ee4df80, z17, k1Var, (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F());
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s.f172081a;
        if (((java.lang.Boolean) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s.f172082b).mo141623x754a37bb()).booleanValue()) {
            e0();
        }
    }

    @Override // ae.a, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t K() {
        this.U = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t K = super.K();
        this.f342200J.a(K);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.e0 e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.e0) K.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.e0.class);
        if (e0Var != null) {
            this.T = true;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b) e0Var).s0(new fa1.c(this, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).H0(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).mo48798x74292566()));
        }
        return K;
    }

    @Override // ae.a
    public void K0(java.lang.String str, java.lang.String str2) {
        try {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) S()).R2.f169734c = str + "\n" + str2;
        } catch (java.lang.NullPointerException unused) {
        }
        if (this.Q) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a.r(this.N, "game:main", str, str2);
        }
    }

    @Override // ae.a
    public void L0(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).mo48798x74292566(), true);
        if (b17 == null) {
            return;
        }
        b17.C.f169802a = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.p1.m52468xcee59d22()[i17];
    }

    @Override // ae.a
    public void M0() {
        new ja1.f().b();
    }

    @Override // ae.a
    public boolean O0() {
        return !((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_appbrand_game_disable_gfx, false);
    }

    public final void P0(final fa1.h hVar) {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 c12745x1ee4df80;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F();
        if (c0Var == null) {
            return;
        }
        if ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0.PreloadOnProcessCreated == c0Var.w1()) || (c12745x1ee4df80 = this.P) == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).r(new java.lang.Runnable() { // from class: fa1.a$$d
            @Override // java.lang.Runnable
            public final void run() {
                fa1.h.this.a(c12745x1ee4df80);
            }
        }, "WxaCommLibV8SnapshotClient#flushSnapshotInfo");
    }

    public void Q0(dl3.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGameServiceLogicImpWC", "setWxAudioOutputListener %s", bVar);
        if (bVar != null) {
            this.E.m32195xe68c4689(bVar);
        } else {
            this.E.m32194xf1600327();
        }
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public java.lang.String R(java.lang.String str) {
        if (!a0()) {
            return "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).t3();
        if (!t37.s2()) {
            return "";
        }
        java.lang.String p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.p(t37, str + ".map");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17)) {
            return "";
        }
        try {
            return java.lang.String.format("\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,%s", new java.lang.String(android.util.Base64.encode(p17.getBytes(), 2), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteDebugUtil", "execGameExternalScript Base64.encode %s", e17.getMessage());
            return "";
        }
    }

    public final boolean R0() {
        boolean booleanValue = ((java.lang.Boolean) ha1.q.f361317c.e()).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGameServiceLogicImpWC", "hy: isUseNodeFromConfig: %b", java.lang.Boolean.valueOf(booleanValue));
        return booleanValue;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public java.lang.String T() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d2.a();
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public final int U() {
        int i17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.i() != null && (i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.i().getInt("appbrand_wasm_opt", -2)) != -2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGameServiceLogicImpWC", "wasm opt set to %d by cmd", java.lang.Integer.valueOf(i17));
            return i17;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_wasm_opt_state, -2);
        if (Ni == -2) {
            return -2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGameServiceLogicImpWC", "wasm opt set to %d by abtest", java.lang.Integer.valueOf(Ni));
        return Ni;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public boolean Y() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k7.f170240a;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public boolean Z() {
        if (this.Q) {
            return false;
        }
        return super.Z();
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public boolean a0() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).t3() != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).t3().s2();
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public boolean b0() {
        return (mo180100F0() || (F() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.f)) ? false : true;
    }

    @Override // ae.a, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void g0() {
        super.g0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f229341e = c0Var != null ? c0Var.getF229341e() : null;
        if (c0Var == null || f229341e == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.k0.a(c0Var, f229341e);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void h0(int i17, java.lang.String str) {
        if (i17 <= 0) {
            this.f342200J.c(str);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.d7 d7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.d7) this.K.get(java.lang.Integer.valueOf(i17));
            if (d7Var != null) {
                d7Var.c(str);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.o oVar = this.f128904r;
        if (oVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.v) {
            oVar.b(str);
        }
    }

    @Override // ae.a, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void j0() {
        super.j0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F();
        com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22920xf0d5c107 abstractC22920xf0d5c107 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.k0.f169423a;
        if (abstractC22920xf0d5c107 != null) {
            abstractC22920xf0d5c107.m83349x590c58ed(c0Var.mo48798x74292566());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsThreadHangMonitor", "onRuntimePause appId:%s", c0Var.mo48798x74292566());
        }
        if (this.S != null) {
            this.S.c();
        }
    }

    @Override // ae.a, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void k0() {
        super.k0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F();
        com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22920xf0d5c107 abstractC22920xf0d5c107 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.k0.f169423a;
        if (abstractC22920xf0d5c107 != null) {
            abstractC22920xf0d5c107.m83350x1ebc6d02(c0Var.mo48798x74292566());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsThreadHangMonitor", "onRuntimeResume appId:%s", c0Var.mo48798x74292566());
        }
        if (this.S != null) {
            this.S.d();
        }
    }

    @Override // ae.a, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void l0(int i17, long j17, long j18, long j19) {
        super.l0(i17, j17, j18, j19);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.K;
        if (concurrentHashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            throw new java.lang.RuntimeException("workerId already exists");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t V = V(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.d7 d7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.d7((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) F(), i17);
        d7Var.a(V);
        d7Var.b();
        concurrentHashMap.put(java.lang.Integer.valueOf(i17), d7Var);
    }

    @Override // ae.a, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void m0(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.K;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.d7 d7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.d7) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (d7Var != null) {
            d7Var.d();
        }
        concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
        super.m0(i17);
    }

    @Override // ae.a, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void n0() {
        super.n0();
        wd.c cVar = this.M;
        if (cVar != null) {
            cVar.f526209c.mo17114xd9a06afc(cVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBImageDecodeRegistry", "MBImageDecodeRegistry unregister appid:%s,game:%b", cVar.f526210d, java.lang.Boolean.valueOf(cVar.f526207a));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.o oVar = this.f128904r;
        if (oVar != null) {
            oVar.d();
        }
    }

    @Override // ae.a, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void o0() {
        super.o0();
        this.f342200J.b();
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
        if (this.T) {
            return;
        }
        this.T = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f169705a.l(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).H0() ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WAGAME : null, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).mo48798x74292566(), this.U, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j0.MMV8);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public final java.util.Map p() {
        return (java.util.Map) cf.i.a("AppBrandGameServiceLogicImpWC.onCreateJsApiPool()", new fa1.e(this));
    }

    @Override // ae.a, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void p0(org.json.JSONObject jSONObject) {
        super.p0(jSONObject);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).K0(jSONObject, "statusBarHeight", java.lang.Integer.valueOf(he.b.a((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F())));
        k91.a3 a3Var = (k91.a3) i95.n0.c(k91.a3.class);
        int i17 = 1;
        if (a3Var != null) {
            k91.r0 Di = ((k91.u0) a3Var).Di(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).mo48798x74292566());
            if (Di != null) {
                java.util.Map map = Di.f387290a;
                java.util.Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    k91.m0 m0Var = (k91.m0) ((java.util.Map.Entry) it.next()).getValue();
                    java.util.Iterator it6 = m0Var.f387207c.values().iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        if (!((k91.q0) it6.next()).f387262a) {
                            m0Var.f387205a = true;
                            m0Var.f387206b = 100.0f;
                            break;
                        }
                    }
                }
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(map.size()));
                for (java.util.Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((k91.m0) entry.getValue()).a());
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(kz5.b1.e(new jz5.l("packageLoadInfo", linkedHashMap)));
                java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).K0(jSONObject, next, jSONObject2.opt(next));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGameServiceLogicImpWC", "postProcessConfigAfterBasic: injected packageLoadInfo for appId=%s, json=%s", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).mo48798x74292566(), jSONObject2.toString());
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap(6);
        int[] a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f5.a((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) F());
        int i18 = a17[0];
        int i19 = a17[1];
        android.graphics.Rect mo51613x2ae93e46 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).mo50261xee5260a9().mo51613x2ae93e46();
        if (mo51613x2ae93e46 != null) {
            int e17 = ik1.w.e(mo51613x2ae93e46.left);
            int e18 = ik1.w.e(mo51613x2ae93e46.top);
            int e19 = ik1.w.e(java.lang.Math.min(mo51613x2ae93e46.right, i18));
            int e27 = ik1.w.e(java.lang.Math.min(mo51613x2ae93e46.bottom, i19));
            hashMap.put("left", java.lang.Integer.valueOf(e17));
            hashMap.put("top", java.lang.Integer.valueOf(e18));
            hashMap.put("right", java.lang.Integer.valueOf(e19));
            hashMap.put("bottom", java.lang.Integer.valueOf(e27));
            hashMap.put("width", java.lang.Integer.valueOf(e19 - e17));
            hashMap.put("height", java.lang.Integer.valueOf(e27 - e18));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) F()).K0(jSONObject, "safeArea", hashMap);
        }
        try {
            org.json.JSONObject jSONObject3 = (jSONObject.has("network") && (jSONObject.get("network") instanceof org.json.JSONObject)) ? jSONObject.getJSONObject("network") : new org.json.JSONObject();
            if (!I0()) {
                i17 = 0;
            }
            jSONObject3.put("wssVersion", i17);
            jSONObject.put("network", jSONObject3);
        } catch (org.json.JSONException unused) {
        }
    }

    @Override // ae.a, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void q0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        super.q0(c11510xdd90c2f2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGameServiceLogicImpWC", "hy: wc post runtime ready");
        fa1.f fVar = new fa1.f(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.i iVar = this.L;
        iVar.f169401h.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.f(iVar, c11510xdd90c2f2, fVar));
        t0(new fa1.g(this));
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

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public synchronized boolean w0() {
        ym0.l.f544663a = new fa1.b(this);
        ym0.c.f544660a = new fa1.C28321x2ca3e2();
        return super.w0();
    }

    @Override // ae.a
    public void x0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.o oVar = this.f128904r;
        if (oVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.y) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.y) oVar).f169248o = bVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    @Override // ae.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t y0(java.lang.String r9, byte[] r10) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fa1.a.y0(java.lang.String, byte[]):com.tencent.mm.plugin.appbrand.jsruntime.t");
    }
}
