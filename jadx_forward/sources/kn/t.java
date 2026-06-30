package kn;

/* loaded from: classes.dex */
public class t extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f390994d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f390995e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f390996f;

    /* renamed from: g, reason: collision with root package name */
    public int f390997g;

    public t(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.yc3();
        lVar.f152198b = new r45.zc3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getchatroomupgradestatus";
        lVar.f152200d = md1.e1.f72846x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f390994d = a17;
        ((r45.yc3) a17.f152243a.f152217a).f472494d = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f390995e = u0Var;
        return mo9409x10f9447a(sVar, this.f390994d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return md1.e1.f72846x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.zc3 zc3Var = (r45.zc3) this.f390994d.f152244b.f152233a;
        this.f390996f = zc3Var.f473436d;
        this.f390997g = zc3Var.f473442m;
        this.f390995e.mo815x76e0bfae(i18, i19, str, this);
    }
}
