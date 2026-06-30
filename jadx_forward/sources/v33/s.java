package v33;

/* loaded from: classes4.dex */
public class s extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f514678d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f514679e;

    /* renamed from: f, reason: collision with root package name */
    public final int f514680f;

    public s(java.lang.String str, long j17, java.lang.String str2, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15805x42667c84();
        lVar.f152198b = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15806xd90c8ec();
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/receivechatroommsg";
        lVar.f152200d = 4302;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152206j = true;
        lVar.f152207k = 25000;
        this.f514680f = i17;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f514679e = a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15805x42667c84 c15805x42667c84 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15805x42667c84) a17.f152243a.f152217a;
        c15805x42667c84.f36835x3923b317 = str;
        c15805x42667c84.seq = j17;
        c15805x42667c84.f36836x14f51cd8 = str2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f514678d = u0Var;
        return mo9409x10f9447a(sVar, this.f514679e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4302;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f514678d.mo815x76e0bfae(i18, i19, str, this);
    }
}
