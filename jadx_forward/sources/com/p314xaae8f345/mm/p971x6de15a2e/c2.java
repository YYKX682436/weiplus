package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public class c2 extends com.p314xaae8f345.mm.p971x6de15a2e.j0 implements com.p314xaae8f345.mm.p971x6de15a2e.o0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.g1 f153506d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 f153507e;

    /* renamed from: f, reason: collision with root package name */
    public int f153508f = 0;

    public c2(com.p314xaae8f345.mm.p971x6de15a2e.g1 g1Var, com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 c4549xd1736fd9) {
        this.f153506d = g1Var;
        this.f153507e = c4549xd1736fd9;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.o0
    public void j4(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.z0 z0Var, byte[] bArr, int i27, int i28) {
        com.p314xaae8f345.mm.p971x6de15a2e.g1 g1Var = this.f153506d;
        if (i27 == 252 || i27 == 701) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "summerauth IOnAutoAuth onGYNetEnd manual auth");
            if (i28 != 0 || i18 != 0) {
                jx3.f.INSTANCE.mo68477x336bdfd8(148L, -102 == i19 ? 30L : 29L, 1L, false);
            } else if (z0Var.Zc() == 2) {
                jx3.f.INSTANCE.mo68477x336bdfd8(148L, 28L, 1L, false);
                int i29 = this.f153508f + 1;
                this.f153508f = i29;
                if (i29 > 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "summerauth manualLoginDecodeFailedTry beyond 1 no more try!");
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    g1Var.T(i18, i19, "auth_decode_failed_".concat(str == null ? "" : str));
                } else {
                    z0Var.Bg(this, 0, 0);
                }
            } else {
                this.f153508f = 0;
                z0Var.G2(this, i18, i19, str);
                int mo48063xb5887524 = z0Var.mo48050x7f35c2d1().mo48063xb5887524();
                if (mo48063xb5887524 != 0) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0.class)).a(mo48063xb5887524);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "newUin invalid");
                }
            }
        }
        if (i28 == 0 && i18 == 0) {
            z0Var.G2(this, i18, i19, str);
            int mo48063xb58875242 = z0Var.mo48050x7f35c2d1().mo48063xb5887524();
            if (mo48063xb58875242 != 0) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0.class)).a(mo48063xb58875242);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "newUin invalid");
                return;
            }
        }
        if (-102 == i19) {
            g1Var.f153530r = i17;
            z0Var.Re(g1Var.f153526n, g1Var.f153528p, 0, 0);
            return;
        }
        if (-301 == i19) {
            z0Var.G2(this, i18, i19, str);
        } else if (-105 == i19) {
            z0Var.G2(this, i18, i19, str);
        } else if (-17 == i19) {
            z0Var.G2(this, i18, i19, str);
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        g1Var.T(i18, i19, "autoauth_errmsg_".concat(str != null ? str : ""));
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.k0
    public void ri(com.p314xaae8f345.mm.p971x6de15a2e.z0 z0Var, int i17, int i18, java.lang.String str) {
        this.f153507e.m40015x32c52b(com.p314xaae8f345.mm.p971x6de15a2e.g1.M(), "MMAutoAuth.IOnAutoAuth.onAutoAuth");
        new com.p314xaae8f345.mm.p971x6de15a2e.b2(this, 1000L, null, z0Var, i17, i18, str).a(this.f153506d.f153532t);
    }
}
