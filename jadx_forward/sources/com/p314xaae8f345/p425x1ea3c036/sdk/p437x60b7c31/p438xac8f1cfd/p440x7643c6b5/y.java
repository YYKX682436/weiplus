package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public class y extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 implements ph1.s, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.o {
    public static final java.lang.String[] Q = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n2.f35136x24728b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.m2.f35134x24728b, "onSkylineGlobalReady", "onSkylineWindowReady", "requireRenderContext", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.y0.f35116x24728b, "onAppRoute", "onAppRouteDone"};
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 L;
    public com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.v1 N;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 M = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0.CreateOnRuntimeInit;
    public final java.util.LinkedList P = new java.util.LinkedList();

    public y(java.lang.Class<? extends com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0> cls) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 a0Var = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0) new d56.b(cls, cls).d(this).f308165b;
        this.L = a0Var;
        a0Var.getClass();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0
    public org.json.JSONObject A0() {
        org.json.JSONObject A0 = super.A0();
        K0(A0, "envPreloadType", java.lang.Integer.valueOf(this.M.ordinal()));
        return A0;
    }

    public com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 A1() {
        return this.L;
    }

    public com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.v1 B1() {
        return this.N;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
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
        if (com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p.HEADLESS == t3().u0().W1) {
            K0(optJSONObject, "inBackground", java.lang.Boolean.TRUE);
        }
        K0(optJSONObject, "openId", t3().E0().f128831x0);
        if (t3().u0().X1 != null && t3().u0().X1.f167634d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p1163x88633665.C12444x48c806b c12444x48c806b = t3().u0().X1;
            c12444x48c806b.getClass();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54512xc618a7cf, c12444x48c806b.f167634d);
            jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, c12444x48c806b.f167635e.f536052d);
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

    public final void F1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 o0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var;
        this.M = o0Var;
        super.o1();
        I0();
        if (mo50357xcd94f799() == null || (f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) mo50357xcd94f799().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class)) == null) {
            return;
        }
        f0Var.mo51545x3498a0(new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.v(this));
    }

    public final void G1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 o0Var, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.v1 v1Var) {
        this.N = v1Var;
        F1(o0Var);
    }

    public void H1(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n nVar, boolean z17, long j17, long j18, java.lang.Object obj) {
    }

    public final void I1(java.lang.Runnable runnable) {
        if (mo50357xcd94f799() != null) {
            runnable.run();
        } else {
            this.P.addLast(runnable);
        }
    }

    public void J1(boolean z17) {
        if (this.L instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandServiceLU", "setIsEarlySendSubPackageReadyAllowed %b, id:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(mo50260x9f1221c2()));
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.l1 l1Var = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n) this.L).f129015u;
            l1Var.f129003b = z17;
            if (z17 && l1Var.f129002a.f129016v) {
                l1Var.a();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i iVar = this.f163119s;
            if (iVar == null || (iVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r)) {
                m51033x1e742f27(new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.p1((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n) this.L));
            } else {
                iz5.a.g(null, iVar instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.p1);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n2 P0() {
        return new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.w(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9
    public final void S0(java.lang.String str, java.lang.String str2, int i17, int i18) {
        if (u46.a.b(Q, str)) {
            com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 u07 = t3() == null ? null : t3().u0();
            if (u07 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandServiceLU", "dispatch %s, serviceId:%d, src:%d, appId:%s, instanceId:%s, sessionId:%s, data:%s", str, java.lang.Integer.valueOf(mo50260x9f1221c2()), java.lang.Integer.valueOf(i17), mo48798x74292566(), u07.f128810w, u07.f128809v, str2);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandServiceLU", "dispatch %s, serviceId:%d, src:%d, data:%s", str, java.lang.Integer.valueOf(mo50260x9f1221c2()), java.lang.Integer.valueOf(i17), str2);
            }
        }
        if (this.L.v0(str, str2, i17, i18)) {
            return;
        }
        super.S0(str, str2, i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9
    public org.json.JSONObject U0() {
        org.json.JSONObject U0 = super.U0();
        K0(U0, "appType", java.lang.Integer.valueOf(t3().u0().f128817z));
        K0(U0, "debug", java.lang.Boolean.valueOf(t3().E0().f128829w));
        K0(U0, "relaunchForProfile", java.lang.Boolean.valueOf(t3().A));
        E1(U0);
        int[] a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f5.a(this);
        K0(U0, "screenWidth", java.lang.Integer.valueOf(ik1.w.e(a17[0])));
        K0(U0, "screenHeight", java.lang.Integer.valueOf(ik1.w.e(a17[1])));
        K0(U0, "supportAsyncGetSystemInfo", java.lang.Boolean.TRUE);
        K0(U0, "prerender", java.lang.Boolean.valueOf(t3().u0().W1 == com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p.PRE_RENDER));
        K0(U0, "instanceId", t3().u0().f128810w);
        java.lang.String str = t3().E0().A.f128836f;
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                K0(U0, "opConfig", new org.json.JSONObject(str));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandServiceLU", "generateWxConfig() put wxConfig.opConfig, exception=%s", e17);
            }
        }
        java.lang.String str2 = t3().E0().A.f128842o;
        if (!android.text.TextUtils.isEmpty(str2)) {
            try {
                K0(U0, "globalExpt", new org.json.JSONObject(str2));
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandServiceLU", "generateWxConfig() put wxConfig.globalExpt, exception=%s", e18);
            }
        }
        U0.remove("permission");
        U0.remove("navigateToMiniProgramAppIdList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandServiceLU", "generateWxConfig(%s): %s", mo48798x74292566(), U0.toString());
        return U0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9
    public java.lang.String X0() {
        return "https://lib/";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public void a(int i17, java.lang.String str) {
        if (this.L.u0(i17, str)) {
            return;
        }
        super.a(i17, str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9
    public java.lang.String a1(java.lang.String str) {
        java.lang.String R = this.L.R(str);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(R) ? super.a1(str) : R;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9
    public java.lang.String b1() {
        return "https://usr/";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9
    public final void d1() {
        super.d1();
        this.L.W();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandService", "notifyWxConfigReadyIfNeed, hash=%d", java.lang.Integer.valueOf(mo50260x9f1221c2()));
        java.lang.String T0 = T0();
        if (mo50357xcd94f799().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0) mo50357xcd94f799().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class)).Q(null, null, null, 0, T0, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.i9(this));
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        mo50357xcd94f799().mo14660x738236e6(T0, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j9(this, java.lang.System.currentTimeMillis()));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m
    public void e0(java.util.Map map) {
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var : map.values()) {
            if (k0Var instanceof yc1.b) {
                ((yc1.b) k0Var).f542294g.f351508a.clear();
            }
        }
        map.clear();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9
    public boolean f1(java.lang.String str) {
        return u46.l.c(str, "onSubPackageReady") || u46.l.c(str, "requireRenderContext") || u46.l.c(str, "onWxServiceInit");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m
    public final java.util.Map<java.lang.String, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0> g0() {
        return this.L.p();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9
    public boolean g1() {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 a0Var = this.L;
        return a0Var != null && a0Var.a0();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            r7 = this;
            com.tencent.mm.plugin.appbrand.jsapi.audio.d r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d.INSTANCE
            java.lang.String r1 = r7.mo48798x74292566()
            r0.getClass()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            if (r2 == 0) goto L11
            goto L21
        L11:
            int r1 = r1.hashCode()
            android.util.SparseArray r2 = r0.f160706d
            monitor-enter(r2)
            android.util.SparseArray r4 = r0.f160706d     // Catch: java.lang.Throwable -> L84
            int r1 = r4.indexOfKey(r1)     // Catch: java.lang.Throwable -> L84
            if (r1 >= 0) goto L23
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L84
        L21:
            r4 = r3
            goto L31
        L23:
            android.util.SparseArray r4 = r0.f160706d     // Catch: java.lang.Throwable -> L84
            java.lang.Object r4 = r4.valueAt(r1)     // Catch: java.lang.Throwable -> L84
            gb1.a r4 = (gb1.a) r4     // Catch: java.lang.Throwable -> L84
            android.util.SparseArray r0 = r0.f160706d     // Catch: java.lang.Throwable -> L84
            r0.removeAt(r1)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L84
        L31:
            if (r4 == 0) goto L38
            java.util.concurrent.ConcurrentHashMap r0 = r4.f351508a
            r0.clear()
        L38:
            com.tencent.luggage.sdk.jsapi.component.service.a0 r0 = r7.L
            r0.J()
            super.h()
            com.tencent.luggage.sdk.jsapi.component.service.a0 r0 = r7.L
            r0.n0()
            com.tencent.mm.plugin.appbrand.o9 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n9.f167590a
            r0.getClass()
            int r1 = r7.mo50260x9f1221c2()
            monitor-enter(r0)
            android.util.SparseArray r2 = r0.f167774a     // Catch: java.lang.Throwable -> L81
            int r2 = r2.indexOfKey(r1)     // Catch: java.lang.Throwable -> L81
            if (r2 < 0) goto L5c
            android.util.SparseArray r4 = r0.f167774a     // Catch: java.lang.Throwable -> L81
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r4, r5)
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y.h():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m
    public boolean h0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 o0Var = this.M;
        return o0Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0.PreloadBeforeRuntimeInit || o0Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0.CreateOnRuntimeInit;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9
    public boolean h1() {
        return !(y1() instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.o1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t i0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t K = this.L.K();
        return K == null ? super.i0() : K;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9
    public void i1() {
        if (G0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.nf.b(this, mo50357xcd94f799());
        }
        this.L.g0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9
    public void j1() {
        this.L.i0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9
    public final void k1() {
        new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.x(this).x(t3());
        this.L.j0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9
    public void l1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        super.l1(c11510xdd90c2f2);
        m51034xe1aac063(u1());
        this.L.q0(c11510xdd90c2f2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9
    public final void m1(boolean z17, boolean z18) {
        super.m1(z17, z18);
        this.L.k0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t
    public android.content.Context n() {
        return mo50352x76847179();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k u1() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x(t3(), this, t3().X1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, uh1.v
    public /* bridge */ /* synthetic */ uh1.u v() {
        return super.v();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m
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

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9
    /* renamed from: v1, reason: merged with bridge method [inline-methods] */
    public em1.b Q0() {
        return new em1.b(this);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 w1() {
        return this.M;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9
    /* renamed from: x1, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b V0() {
        return (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) super.W0(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b.class);
    }

    @Override // ph1.s
    public boolean y(java.lang.String str) {
        return this.L.y(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0
    public void y0(org.json.JSONObject wxConfig) {
        super.y0(wxConfig);
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 a0Var = this.L;
        a0Var.I(wxConfig);
        K0(wxConfig, "isIsolateContext", java.lang.Boolean.valueOf(a0Var.c0()));
        K0(wxConfig, "version", com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.a(null, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h));
        K0(wxConfig, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(mo50352x76847179()));
        if (x() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.AbstractC11652xbeaa3fb5) {
            pe.e K1 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.AbstractC11652xbeaa3fb5) x()).K1();
            K1.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxConfig, "wxConfig");
            java.util.HashMap hashMap = K1.f435124a;
            if (!hashMap.isEmpty()) {
                try {
                    wxConfig.put("expt", new org.json.JSONObject(hashMap));
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.ExptMapping", "applyToWxConfig get exception:" + e17, e17);
                }
            }
        }
        K0(wxConfig, "supportInvokeWithAppId", java.lang.Boolean.TRUE);
    }

    public final com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 y1() {
        return this.L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0
    public void z0(org.json.JSONObject jSONObject) {
        new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y1().a(jSONObject);
    }

    public final <T> T z1(java.lang.Class<T> cls) {
        if (cls.isInstance(this)) {
            return cls.cast(this);
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 a0Var = this.L;
        return cls.isInstance(a0Var) ? cls.cast(a0Var) : cls.cast(a0Var.r(cls));
    }
}
