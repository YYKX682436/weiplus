package lx3;

/* loaded from: classes8.dex */
public class k extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.Object f403628h = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f403629d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f403630e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.a93 f403631f;

    /* renamed from: g, reason: collision with root package name */
    public r45.q0 f403632g;

    public k(int i17, int i18) {
        this.f403631f = null;
        H(true);
        r45.p0 p0Var = new r45.p0();
        r45.a93 a93Var = new r45.a93();
        this.f403631f = a93Var;
        try {
            p0Var.f464174d = i17;
            p0Var.f464175e = i18;
            a93Var.f451389d = p0Var;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetAPMStrategy", "parse data error");
        }
    }

    public void H(boolean z17) {
        synchronized (f403628h) {
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f403630e = u0Var;
        if (!gm0.j1.b().n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneGetAPMStrategy", "get mrs strategy must go after login");
            return -1;
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152203g = false;
        lVar.f152197a = this.f403631f;
        lVar.f152198b = new r45.b93();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getapmstrategy";
        lVar.f152200d = 914;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f403629d = a17;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, a17, this);
        if (mo9409x10f9447a < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetAPMStrategy", "mark all failed. do scene %d", java.lang.Integer.valueOf(mo9409x10f9447a));
            try {
                this.f403632g = null;
                H(false);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetAPMStrategy", "onStrategyResp failed  hash:%d  , ex:%s", java.lang.Integer.valueOf(hashCode()), com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 914;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        try {
            this.f403632g = null;
            if (gm0.j1.n().f354821b != null && gm0.j1.n().f354821b.f152297d != null) {
                if (i18 == 0) {
                    this.f403632g = ((r45.b93) this.f403629d.f152244b.f152233a).f452171d;
                    this.f403630e.mo815x76e0bfae(i18, i19, str, this);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetAPMStrategy", "get report strategy err, errType:" + i18 + ", errCode:" + i19);
                this.f403630e.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.NetSceneGetAPMStrategy", "null == network().getNetSceneQueue().getDispatcher(), can't give response to kvcomm.");
            this.f403630e.mo815x76e0bfae(i18, i19, str, this);
        } finally {
            H(false);
        }
    }
}
