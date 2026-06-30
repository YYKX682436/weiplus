package t21;

/* loaded from: classes12.dex */
public class r0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f496436d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f496437e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f496438f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f496439g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f496440h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f496441i;

    /* renamed from: n, reason: collision with root package name */
    public dn.o f496443n;

    /* renamed from: m, reason: collision with root package name */
    public t21.v2 f496442m = null;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f496444o = "";

    /* renamed from: p, reason: collision with root package name */
    public long f496445p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f496446q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f496447r = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f496448s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f496449t = true;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f496450u = null;

    /* renamed from: v, reason: collision with root package name */
    public int f496451v = 0;

    /* renamed from: w, reason: collision with root package name */
    public long f496452w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final dn.k f496453x = new t21.o0(this);

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f496454y = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new t21.q0(this), false);

    public r0(java.lang.String str, boolean z17) {
        iz5.a.g(null, str != null);
        this.f496438f = str;
        this.f496440h = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVideo", "%s NetSceneDownloadVideo:  file [%s] isCompleteOnlineVideo [%b]", J(), str, java.lang.Boolean.valueOf(z17));
    }

    public final void H(int i17) {
        boolean z17;
        t21.v2 h17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27;
        tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
        bm5.f0 f0Var = bm5.f0.f104104s;
        java.lang.String str = this.f496438f;
        java.lang.String wi6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).wi(((k90.b) u0Var).rj(null, f0Var, str, false));
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, f0Var, str, true);
        if (this.f496449t) {
            z17 = vf0.c.fj(wi6, rj6);
        } else {
            com.p314xaae8f345.mm.vfs.w6.h(wi6);
            z17 = true;
        }
        if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_c2c_video_retransmit_use_link_enable, bm5.h0.RepairerConfig_Media_C2CVideoReTransmitUseLink_Int, 0) == 1) && (h17 = t21.d3.h(str)) != null && (o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(h17.h(), h17.f496537c)) != null) {
            java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(o27, f0Var, h17.d(), false);
            java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(o27, h17.d(), false);
            if (com.p314xaae8f345.mm.vfs.w6.j(rj7)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVideo", "check c2c video recv dup, ret = " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(rj7, o27.mo78013xfb85f7b0(), com.p314xaae8f345.mm.vfs.w6.p(rj7), null).f559224a);
            }
            if (com.p314xaae8f345.mm.vfs.w6.j(tj6)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVideo", "check c2c video thumb recv dup, ret = " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(tj6, o27.mo78013xfb85f7b0(), com.p314xaae8f345.mm.vfs.w6.p(tj6), null).f559224a);
            }
        }
        gm0.j1.e().j(new t21.p0(this, z17, i17));
    }

    public final boolean I() {
        boolean z17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f496439g)) {
            z17 = false;
        } else {
            if (this.f496440h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVideo", "%s cancel online video task.", J());
                t21.o2.Di().g(this.f496439g, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVideo", "%s cancel offline video task.", J());
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(this.f496439g);
            }
            z17 = true;
        }
        this.f496448s = true;
        return z17;
    }

    public final java.lang.String J() {
        return this.f496438f + "_" + hashCode();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: cancel */
    public void mo9408xae7a2e7a() {
        I();
        super.mo9408xae7a2e7a();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x060b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x060d  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s r35, com.p314xaae8f345.mm.p944x882e457a.u0 r36) {
        /*
            Method dump skipped, instructions count: 2011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.r0.mo807x6c193ac1(com.tencent.mm.network.s, com.tencent.mm.modelbase.u0):int");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 150;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04c5  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r24, int r25, int r26, java.lang.String r27, com.p314xaae8f345.mm.p971x6de15a2e.v0 r28, byte[] r29) {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.r0.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 2500;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCountReach */
    public boolean mo48014x3a8bbc5f() {
        boolean mo48014x3a8bbc5f = super.mo48014x3a8bbc5f();
        if (mo48014x3a8bbc5f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 210L, 1L, false);
        }
        return mo48014x3a8bbc5f;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        int i17;
        int i18;
        r45.tf0 tf0Var = (r45.tf0) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152243a.f152217a;
        if (tf0Var.f467904i > 0 && (i17 = tf0Var.f467901f) >= 0 && (i18 = tf0Var.f467900e) > 0 && i18 > i17) {
            return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ERR: SECURITY CHECK FAILED [");
        java.lang.String str = this.f496438f;
        sb6.append(str);
        sb6.append(",");
        sb6.append(this.f496442m.f496537c);
        sb6.append(",");
        sb6.append(this.f496442m.e());
        sb6.append(",");
        sb6.append(this.f496442m.h());
        sb6.append("] ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadVideo", sb6.toString());
        t21.d3.G(str);
        return com.p314xaae8f345.mm.p944x882e457a.o1.EFailed;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: setSecurityCheckError */
    public void mo14485xb35c0942(com.p314xaae8f345.mm.p944x882e457a.n1 n1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 211L, 1L, false);
        t21.d3.G(this.f496438f);
    }
}
