package h23;

/* loaded from: classes2.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f359843d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f359844e;

    /* renamed from: f, reason: collision with root package name */
    public r45.q75 f359845f;

    public a(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.p75();
        lVar.f152198b = new r45.q75();
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152200d = 7701;
        lVar.f152211o = 2;
        lVar.f152199c = "/cgi-bin/mmpay-bin/pa/searchpaymentfunction";
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f359843d = a17;
        ((r45.p75) a17.f152243a.f152217a).f464346d = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f359844e = u0Var;
        return mo9409x10f9447a(sVar, this.f359843d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getReturnTimeout */
    public long mo48003xd8232e5b() {
        return 2000L;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 7701;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.NetSceneGetSearchFunction", "netId %d errType %d errCode %d errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f359845f = (r45.q75) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f359844e.mo815x76e0bfae(i18, i19, str, this);
    }
}
