package su4;

/* loaded from: classes.dex */
public class t1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f494631d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f494632e;

    /* renamed from: f, reason: collision with root package name */
    public r45.aa7 f494633f;

    /* renamed from: g, reason: collision with root package name */
    public final su4.r1 f494634g;

    public t1(su4.r1 r1Var) {
        this.f494634g = r1Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 4858;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/mmtagsearch";
        lVar.f152197a = new r45.z97();
        lVar.f152198b = new r45.aa7();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f494632e = a17;
        r1Var.a((r45.z97) a17.f152243a.f152217a, 6, su4.r2.i(), su4.r2.g());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f494631d = u0Var;
        return mo9409x10f9447a(sVar, this.f494632e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4858;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str};
        int i27 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneTagSearch", "onGYNetEnd errType:%s errCode:%s errMsg:%s", objArr);
        this.f494633f = (r45.aa7) this.f494632e.f152244b.f152233a;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f494631d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
