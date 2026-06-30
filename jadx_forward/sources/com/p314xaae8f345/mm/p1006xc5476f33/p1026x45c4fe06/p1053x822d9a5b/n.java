package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public class n extends dp1.u {

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f159655m;

    public n(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        super(activity);
        this.f159655m = o6Var;
        o6Var.F.f169270a.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.m(this));
    }

    @Override // dp1.u, dp1.x
    public boolean c() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f159655m;
        if (o6Var != null ? o6Var.q2() : false) {
            return false;
        }
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.s2 s2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.s2.INSTANCE;
        synchronized (s2Var) {
            z17 = s2Var.f177622d;
        }
        return (z17 || ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).wi()) ? false : true;
    }

    @Override // dp1.u, dp1.x
    public boolean f() {
        if (h()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f159655m;
        if (o6Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.u uVar = o6Var.f167726y2;
            if ((uVar != null ? uVar.f159683d : null) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.u uVar2 = o6Var.f167726y2;
                if ((uVar2 != null ? uVar2.f159683d : null).L()) {
                    return false;
                }
            }
        }
        return rh1.b.a();
    }

    @Override // dp1.u, dp1.x
    /* renamed from: getActivity */
    public android.app.Activity mo50327x19263085() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f159655m;
        if (o6Var == null) {
            return null;
        }
        return o6Var.r0();
    }

    @Override // dp1.u, dp1.x
    /* renamed from: getBitmap */
    public android.graphics.Bitmap mo50328x12501425() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f159655m;
        if (o6Var != null) {
            try {
                if (o6Var.x0() != null && o6Var.x0().m52169xfdaa7672() != null && o6Var.x0().m52169xfdaa7672().mo14682x9dee9c37() != null) {
                    return o6Var.x0().m52169xfdaa7672().mo14682x9dee9c37().R1();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandFloatBallPageAdapter", e17, "appbrand getBitmap fail exception:%s", e17.getMessage());
            }
        }
        return super.mo50328x12501425();
    }

    @Override // dp1.u, dp1.x
    /* renamed from: getContentView */
    public android.view.View mo50329xc2a54588() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f159655m;
        if (o6Var != null) {
            return o6Var.f156343s;
        }
        return null;
    }

    @Override // dp1.u, dp1.x
    /* renamed from: getMaskView */
    public android.view.View mo50330x8c409d27() {
        return mo50329xc2a54588();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r0.mo48806x666b03f3() == 1) goto L10;
     */
    @Override // dp1.u, dp1.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h() {
        /*
            r3 = this;
            com.tencent.mm.plugin.appbrand.o6 r0 = r3.f159655m
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r0.u0()
            boolean r1 = r1.H2
            r2 = 0
            if (r1 == 0) goto L20
            com.tencent.mm.plugin.appbrand.hc r0 = r0.f156329e
            if (r0 == 0) goto L17
            int r0 = r0.mo48806x666b03f3()
            r1 = 1
            if (r0 != r1) goto L17
            goto L18
        L17:
            r1 = r2
        L18:
            if (r1 != 0) goto L1b
            return r2
        L1b:
            boolean r0 = rh1.b.a()
            return r0
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.n.h():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r0.mo48806x666b03f3() == 1) goto L10;
     */
    @Override // dp1.u, dp1.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i() {
        /*
            r3 = this;
            com.tencent.mm.plugin.appbrand.o6 r0 = r3.f159655m
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r0.u0()
            boolean r1 = r1.H2
            r2 = 0
            if (r1 == 0) goto L20
            com.tencent.mm.plugin.appbrand.hc r0 = r0.f156329e
            if (r0 == 0) goto L17
            int r0 = r0.mo48806x666b03f3()
            r1 = 1
            if (r0 != r1) goto L17
            goto L18
        L17:
            r1 = r2
        L18:
            if (r1 != 0) goto L1b
            return r2
        L1b:
            boolean r0 = rh1.b.a()
            return r0
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.n.i():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[Catch: Exception -> 0x009c, TryCatch #0 {Exception -> 0x009c, blocks: (B:7:0x0006, B:9:0x000c, B:11:0x0016, B:13:0x0024, B:17:0x0065, B:19:0x006b, B:22:0x0078, B:24:0x007e, B:26:0x0097, B:28:0x0070, B:29:0x003f, B:31:0x005c), top: B:6:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[Catch: Exception -> 0x009c, TryCatch #0 {Exception -> 0x009c, blocks: (B:7:0x0006, B:9:0x000c, B:11:0x0016, B:13:0x0024, B:17:0x0065, B:19:0x006b, B:22:0x0078, B:24:0x007e, B:26:0x0097, B:28:0x0070, B:29:0x003f, B:31:0x005c), top: B:6:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[Catch: Exception -> 0x009c, TryCatch #0 {Exception -> 0x009c, blocks: (B:7:0x0006, B:9:0x000c, B:11:0x0016, B:13:0x0024, B:17:0x0065, B:19:0x006b, B:22:0x0078, B:24:0x007e, B:26:0x0097, B:28:0x0070, B:29:0x003f, B:31:0x005c), top: B:6:0x0006 }] */
    @Override // dp1.u, dp1.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap n() {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.AppBrandFloatBallPageAdapter"
            com.tencent.mm.plugin.appbrand.o6 r1 = r8.f159655m
            if (r1 == 0) goto Laa
            com.tencent.mm.plugin.appbrand.page.d5 r2 = r1.x0()     // Catch: java.lang.Exception -> L9c
            if (r2 == 0) goto Laa
            com.tencent.mm.plugin.appbrand.page.d5 r2 = r1.x0()     // Catch: java.lang.Exception -> L9c
            com.tencent.mm.plugin.appbrand.page.w2 r2 = r2.m52169xfdaa7672()     // Catch: java.lang.Exception -> L9c
            if (r2 == 0) goto Laa
            com.tencent.mm.plugin.appbrand.page.d5 r2 = r1.x0()     // Catch: java.lang.Exception -> L9c
            com.tencent.mm.plugin.appbrand.page.w2 r2 = r2.m52169xfdaa7672()     // Catch: java.lang.Exception -> L9c
            com.tencent.mm.plugin.appbrand.page.v5 r2 = r2.mo14682x9dee9c37()     // Catch: java.lang.Exception -> L9c
            if (r2 == 0) goto Laa
            com.tencent.mm.plugin.appbrand.page.d5 r2 = r1.x0()     // Catch: java.lang.Exception -> L9c
            com.tencent.mm.plugin.appbrand.page.w2 r2 = r2.m52169xfdaa7672()     // Catch: java.lang.Exception -> L9c
            com.tencent.mm.plugin.appbrand.page.v5 r2 = r2.mo14682x9dee9c37()     // Catch: java.lang.Exception -> L9c
            java.lang.String r2 = r2.Z1()     // Catch: java.lang.Exception -> L9c
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2)     // Catch: java.lang.Exception -> L9c
            r4 = 1
            java.lang.String r5 = "portrait"
            if (r3 == 0) goto L3f
        L3d:
            r2 = r5
            goto L65
        L3f:
            java.lang.String r3 = "appBrandRuntime orientation:%s,isGame:%b"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L9c
            r7 = 0
            r6[r7] = r2     // Catch: java.lang.Exception -> L9c
            boolean r7 = r1.q2()     // Catch: java.lang.Exception -> L9c
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Exception -> L9c
            r6[r4] = r7     // Catch: java.lang.Exception -> L9c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r3, r6)     // Catch: java.lang.Exception -> L9c
            java.lang.String r3 = "auto"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Exception -> L9c
            if (r3 != 0) goto L3d
            java.lang.String r3 = "UNSPECIFIED"
            boolean r3 = r3.equalsIgnoreCase(r2)     // Catch: java.lang.Exception -> L9c
            if (r3 == 0) goto L65
            goto L3d
        L65:
            boolean r3 = r1.q2()     // Catch: java.lang.Exception -> L9c
            if (r3 != 0) goto L70
            android.graphics.Bitmap r1 = r1.H2(r4)     // Catch: java.lang.Exception -> L9c
            goto L74
        L70:
            android.graphics.Bitmap r1 = r8.mo50328x12501425()     // Catch: java.lang.Exception -> L9c
        L74:
            if (r1 != 0) goto L78
            r0 = 0
            return r0
        L78:
            boolean r2 = r5.equals(r2)     // Catch: java.lang.Exception -> L9c
            if (r2 == 0) goto L97
            int r2 = r1.getWidth()     // Catch: java.lang.Exception -> L9c
            float r2 = (float) r2     // Catch: java.lang.Exception -> L9c
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            float r2 = r2 / r3
            int r2 = (int) r2     // Catch: java.lang.Exception -> L9c
            int r5 = r1.getHeight()     // Catch: java.lang.Exception -> L9c
            float r5 = (float) r5     // Catch: java.lang.Exception -> L9c
            float r5 = r5 / r3
            int r3 = (int) r5     // Catch: java.lang.Exception -> L9c
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createScaledBitmap(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L9c
            r1.recycle()     // Catch: java.lang.Exception -> L9c
            return r2
        L97:
            android.graphics.Bitmap r0 = rh1.e.u(r1)     // Catch: java.lang.Exception -> L9c
            return r0
        L9c:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "appbrand getBitmap fail exception:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r1, r3, r2)
        Laa:
            android.graphics.Bitmap r0 = r8.mo50328x12501425()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.n.n():android.graphics.Bitmap");
    }

    @Override // dp1.u, dp1.x
    public boolean p() {
        return true;
    }

    @Override // dp1.u, dp1.x
    public void q(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f159655m;
        if (o6Var != null) {
            if (mo50327x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) mo50327x19263085()).A = !z17;
            }
            o6Var.G2();
        }
    }

    @Override // dp1.u, dp1.x
    public boolean r() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar = this.f159655m.f156329e;
        return hcVar != null && hcVar.mo48806x666b03f3() == 1;
    }

    @Override // dp1.u, dp1.x
    public boolean t() {
        return false;
    }
}
