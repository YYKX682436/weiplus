package fq4;

/* loaded from: classes2.dex */
public class p extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f347163d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f347164e;

    /* renamed from: f, reason: collision with root package name */
    public int f347165f;

    /* renamed from: g, reason: collision with root package name */
    public int f347166g;

    public p(int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ti6();
        lVar.f152198b = new r45.ui6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/switchopvoiceprint";
        lVar.f152200d = 615;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f347164e = a17;
        ((r45.ti6) a17.f152243a.f152217a).f468026d = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f347163d = u0Var;
        return mo9409x10f9447a(sVar, this.f347164e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 615;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.ui6 ui6Var = (r45.ui6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 != 0 && i19 != 0) {
            this.f347163d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        this.f347165f = ui6Var.f468939e;
        this.f347166g = ui6Var.f468938d;
        this.f347163d.mo815x76e0bfae(i18, i19, str, this);
    }
}
