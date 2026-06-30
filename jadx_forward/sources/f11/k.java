package f11;

/* loaded from: classes2.dex */
public class k extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w6 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f340097d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f340098e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f340099f;

    public k(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.g34();
        lVar.f152198b = new r45.h34();
        lVar.f152199c = "/cgi-bin/micromsg-bin/jumpemotiondetail";
        lVar.f152200d = ma1.i.f72803x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f340098e = a17;
        ((r45.g34) a17.f152243a.f152217a).f456385d = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f340097d = u0Var;
        return mo9409x10f9447a(sVar, this.f340098e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return ma1.i.f72803x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f340097d.mo815x76e0bfae(i18, i19, str, this);
    }
}
