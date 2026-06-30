package mq4;

/* loaded from: classes12.dex */
public abstract class e0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f412326d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f412327e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f412328f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 f412329g = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h1.a();

    public int H() {
        return 0;
    }

    public void I(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
    }

    public abstract com.p314xaae8f345.mm.p944x882e457a.u0 J();

    public java.lang.Object K() {
        return this.f412326d.f152244b.f152233a;
    }

    public void L() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipNetSceneBase", "netscene " + getClass().getSimpleName() + '@' + java.lang.Integer.toHexString(hashCode()) + " is started.");
        gm0.j1.d().g(this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        int H = H();
        if (H != 0) {
            return H;
        }
        this.f412328f = u0Var;
        this.f412327e = J();
        return mo9409x10f9447a(sVar, this.f412326d, this);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        I(i17, i18, i19, str, v0Var, bArr);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f412328f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        if (this.f412327e != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new mq4.d0(this, i18, i19, str));
        }
    }
}
