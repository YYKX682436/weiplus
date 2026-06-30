package va3;

/* loaded from: classes8.dex */
public class y extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f515917d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f515918e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f515919f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f515920g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f515921h;

    public y(double d17, double d18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.zd3();
        lVar.f152198b = new r45.ae3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getcurlocation";
        lVar.f152200d = 665;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f515918e = a17;
        r45.zd3 zd3Var = (r45.zd3) a17.f152243a.f152217a;
        zd3Var.f473464e = d17;
        zd3Var.f473463d = d18;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f515917d = u0Var;
        return mo9409x10f9447a(sVar, this.f515918e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 665;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.ae3 ae3Var = (r45.ae3) this.f515918e.f152244b.f152233a;
            this.f515921h = ae3Var.f451501f;
            this.f515919f = ae3Var.f451499d;
            this.f515920g = ae3Var.f451500e;
        }
        this.f515917d.mo815x76e0bfae(i18, i19, str, this);
    }
}
