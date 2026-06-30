package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class wc extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a implements ni1.i {
    public static final java.lang.String[] G = {"custom_event_GenerateFuncReady", "custom_event_tapAnyWhere", "custom_event_vdSync", "onAppRoute", "onAppRouteDone"};
    public ni1.f A;
    public java.lang.String B;
    public boolean C;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.vc D;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.cd E;
    public boolean F;

    /* renamed from: x, reason: collision with root package name */
    public boolean f168752x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f168753y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f168754z;

    public wc(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        super(bVar);
        this.f168752x = false;
        this.f168753y = false;
        this.f168754z = false;
        this.A = null;
        this.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.uc(this);
        this.F = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.hb R() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc.W():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a
    public void X(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n nVar, boolean z17, long j17, long j18, java.lang.Object obj) {
        if ("WAPageFrame.html".equals(nVar.f128885i) && !android.text.TextUtils.isEmpty(H())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.f(H(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35225x6746d709, "", j17, j18);
        }
        if (this.f168754z || F() == null || ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).t3() == null || !N("checkIsAppSharedPageFrameExecutionFinished").c(nVar.f128885i)) {
            return;
        }
        this.f168754z = true;
    }

    public boolean a0() {
        return f0() != null && f0().Y();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dd S(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ed edVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ed(c0(context));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.cd cdVar = this.E;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.uc) cdVar).f168683d.F();
        edVar.f168112e = v5Var;
        edVar.f168113f = cdVar;
        edVar.f168114g.f168786a = v5Var;
        edVar.f168117m.clear();
        G(se.a.class, edVar);
        return edVar;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb c0(android.content.Context context) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wa(context, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a, ni1.d
    public boolean d(java.lang.String str, java.lang.String str2, int[] iArr) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar;
        if (u46.a.b(G, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageViewRenderer", "publish critical appId[%s] url[%s] event[%s]", H(), this.f167908m, str);
            if (F() != null && ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).j2() && "custom_event_GenerateFuncReady".equals(str)) {
                this.f168753y = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.g(H(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35214x15f2f8d7);
                if (this.f168752x) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.e(H(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35214x15f2f8d7);
                    this.f168753y = false;
                }
            }
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.vd.f168718a.contains(str) && (bVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()) != null) {
            bVar.e(str, str2, bVar.mo50260x9f1221c2());
        }
        return false;
    }

    public void d0(java.lang.String str, long j17, long j18) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a, ni1.d
    public boolean e(java.lang.String str, java.lang.String str2, int i17) {
        if (!this.C && str.startsWith("custom_event_")) {
            if (str.startsWith("custom_event_vdSync") || str.startsWith("custom_event_vdSyncBatch")) {
                if (((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).j2()) {
                    if (!this.f168752x) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.e(H(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35254xa4fa4055);
                        this.f168752x = true;
                    }
                    if (this.f168753y) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.e(H(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35214x15f2f8d7);
                        this.f168753y = false;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageViewRenderer", "dispatch critical vdSync appId[%s] url[%s] event[%s] content[%s] src[%d]", H(), this.f167908m, str, u46.l.t(str2, 0, 20), java.lang.Integer.valueOf(i17));
            } else {
                java.lang.Object[] objArr = new java.lang.Object[5];
                objArr[0] = H();
                objArr[1] = this.f167908m;
                objArr[2] = str;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str2 == null) {
                    str2 = "";
                }
                objArr[3] = java.lang.Integer.valueOf(str2.length());
                objArr[4] = java.lang.Integer.valueOf(i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageViewRenderer", "dispatch critical appId[%s] url[%s] event[%s] size[%d] src[%d]", objArr);
            }
        }
        return false;
    }

    public final void e0(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String k17 = u46.l.k(new java.lang.String[]{str, str2, str3}, ":");
        if (android.text.TextUtils.isEmpty(k17)) {
            return;
        }
        this.B = k17;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("appId", str);
        hashMap.put("appUrl", str2);
        hashMap.put("appStatus", str3);
        f0().mo14670xce3b1136(hashMap);
        if (f0().b0()) {
            f0().mo14660x738236e6("document.title=\"" + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w2.a(k17) + "\"", null);
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dd f0() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dd) this.f167905g;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public boolean j(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        this.C = false;
        this.f168752x = false;
        this.f168753y = false;
        f0().J(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.pc(this));
        boolean j17 = super.j(str, wdVar);
        e0(H(), this.f167908m, "INITIAL");
        return j17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a, re.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void k() {
        super.k();
        e0(H(), this.f167908m, "INVISIBLE");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a, re.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageViewRenderer", "dispatchForeground appId[%s] url[%s]", H(), this.f167908m);
        super.n();
        e0(H(), this.f167908m, "VISIBLE");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.a
    public java.lang.Object r(java.lang.Class cls) {
        ni1.f fVar;
        if (ni1.f.class != cls) {
            return super.r(cls);
        }
        if (this.A != null || (fVar = (ni1.f) this.f167905g.h0(ni1.f.class)) == null) {
            return cls.cast(this.A);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.nc ncVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.nc(this, fVar);
        this.A = ncVar;
        return cls.cast(ncVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // re.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(java.util.Map r5, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd r6) {
        /*
            r4 = this;
            com.tencent.mm.plugin.appbrand.jsapi.l r0 = r4.F()
            com.tencent.luggage.sdk.jsapi.component.b r0 = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) r0
            java.util.Objects.requireNonNull(r0)
            com.tencent.mm.plugin.appbrand.page.wd r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.NAVIGATE_BACK
            if (r0 == r6) goto L5a
            com.tencent.mm.plugin.appbrand.jsapi.l r6 = r4.F()
            com.tencent.luggage.sdk.jsapi.component.b r6 = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) r6
            java.lang.Class<ri1.a> r0 = ri1.a.class
            nd.b r6 = r6.q(r0)
            ri1.a r6 = (ri1.a) r6
            if (r6 == 0) goto L5a
            java.lang.String r0 = r4.f167908m
            ri1.p r6 = (ri1.p) r6
            boolean r1 = r6.f477569e
            r2 = 0
            if (r1 == 0) goto L3e
            if (r0 == 0) goto L31
            int r1 = r0.length()
            if (r1 != 0) goto L2f
            goto L31
        L2f:
            r1 = r2
            goto L32
        L31:
            r1 = 1
        L32:
            if (r1 == 0) goto L35
            goto L3e
        L35:
            r45.o8 r6 = r6.a(r0)
            if (r6 == 0) goto L3e
            java.lang.String r6 = r6.f463550f
            goto L3f
        L3e:
            r6 = 0
        L3f:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L5a
            java.lang.String r0 = "initialRenderingCacheData"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L50
            r1.<init>(r6)     // Catch: java.lang.Exception -> L50
            r5.put(r0, r1)     // Catch: java.lang.Exception -> L50
            goto L5a
        L50:
            r6 = move-exception
            java.lang.String r0 = "onFillRouteInEventData when parsing initialRenderingCacheData"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "Luggage.MPPageViewRenderer"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r6, r0, r1)
        L5a:
            java.lang.String r6 = "qualityData"
            java.lang.Object r0 = r5.get(r6)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L6c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.put(r6, r0)
        L6c:
            java.util.Locale r6 = java.util.Locale.ENGLISH
            com.tencent.mm.plugin.appbrand.jsapi.l r1 = r4.F()
            com.tencent.luggage.sdk.jsapi.component.b r1 = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) r1
            int r1 = r1.mo50260x9f1221c2()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "%d_%d"
            java.lang.String r6 = java.lang.String.format(r6, r2, r1)
            java.lang.String r1 = "navId"
            r0.put(r1, r6)
            com.tencent.mm.plugin.appbrand.page.dd r6 = r4.f0()
            boolean r6 = r6.q()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.String r1 = "isWebviewPreload"
            r0.put(r1, r6)
            boolean r6 = r4.f168754z
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.String r1 = "isPreloadPageFrame"
            r0.put(r1, r6)
            ze.n r6 = r4.J()
            boolean r6 = r6.a2()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "prerender"
            r5.put(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc.u(java.util.Map, com.tencent.mm.plugin.appbrand.page.wd):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a, re.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void v() {
        super.v();
        f0().D();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageViewRenderer", "dispatchPageReady url[%s]", this.f167908m);
        this.C = true;
        super.x();
        this.f167904f.invalidate();
        if (((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).j2()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.e(H(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35237xeb19c6e8);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.e(H(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35233x62683b2b);
        }
    }
}
