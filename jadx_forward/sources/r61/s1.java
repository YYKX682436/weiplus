package r61;

/* loaded from: classes2.dex */
public class s1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f474483d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f474484e;

    public s1(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.a26();
        lVar.f152198b = new r45.b26();
        lVar.f152199c = "/cgi-bin/micromsg-bin/newsetemailpwd";
        lVar.f152200d = 382;
        lVar.f152201e = 181;
        lVar.f152202f = 1000000181;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f474484e = a17;
        ((r45.a26) a17.f152243a.f152217a).f451204d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A(str);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f474483d = u0Var;
        return mo9409x10f9447a(sVar, this.f474484e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 382;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f474483d.mo815x76e0bfae(i18, i19, str, this);
    }
}
