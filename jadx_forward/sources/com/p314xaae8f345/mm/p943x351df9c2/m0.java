package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes11.dex */
public class m0 implements com.p314xaae8f345.mm.p944x882e457a.u0, kv.h0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p943x351df9c2.r0 f152015d = null;

    /* renamed from: e, reason: collision with root package name */
    public kv.g0 f152016e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p943x351df9c2.u0 f152017f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f152018g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f152019h = true;

    /* renamed from: i, reason: collision with root package name */
    public android.os.Handler f152020i = null;

    public m0() {
        gm0.j1.d().a(158, this);
    }

    public int a(java.lang.String str, kv.g0 g0Var) {
        iz5.a.g("GetHDHeadImg must set callback", g0Var != null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            g0Var.a(3, -101);
            return -101;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17.s2() || n17.o2()) {
            g0Var.a(3, -104);
            return -104;
        }
        this.f152016e = g0Var;
        java.lang.String Y4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(str) ? com.p314xaae8f345.mm.p2621x8fb0427b.z3.Y4(str) : str;
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(Y4);
        this.f152015d = n07;
        if (n07 == null || !n07.e().equals(Y4)) {
            com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
            this.f152015d = r0Var;
            r0Var.f152062a = Y4;
            if (!android.text.TextUtils.isEmpty("")) {
                this.f152015d.f152066e = "";
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f152015d.c())) {
            com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var2 = this.f152015d;
            if (this.f152020i == null) {
                this.f152020i = new android.os.Handler(android.os.Looper.myLooper());
            }
            ((ku5.t0) ku5.t0.f394148d).r(new com.p314xaae8f345.mm.p943x351df9c2.l0(this, r0Var2), "get-hd-headimg");
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetHDHeadImgHelper", "dkhurl [%s] has NO URL flag:%d !", str, java.lang.Integer.valueOf(this.f152015d.f152063b));
        this.f152017f = new com.p314xaae8f345.mm.p943x351df9c2.u0(Y4);
        if (gm0.j1.d().h(this.f152017f, 0)) {
            return 0;
        }
        g0Var.a(3, -102);
        return -102;
    }

    public void b() {
        gm0.j1.d().q(158, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        kv.g0 g0Var = this.f152016e;
        if (g0Var != null) {
            g0Var.a(i17, i18);
        }
    }
}
