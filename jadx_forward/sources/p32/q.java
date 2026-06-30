package p32;

/* loaded from: classes2.dex */
public class q extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f433046d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f433047e;

    /* renamed from: f, reason: collision with root package name */
    public final int f433048f;

    /* renamed from: g, reason: collision with root package name */
    public int f433049g;

    public q(int i17, int i18) {
        this.f433047e = null;
        this.f433048f = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ns6();
        lVar.f152198b = new r45.os6();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/rank/updateranksetting";
        lVar.f152200d = 1044;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f433047e = a17;
        r45.ns6 ns6Var = (r45.ns6) a17.f152243a.f152217a;
        ns6Var.f463186d = i17;
        ns6Var.f463187e = i18;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f433046d = u0Var;
        return mo9409x10f9447a(sVar, this.f433047e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1044;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            this.f433049g = ((r45.os6) this.f433047e.f152244b.f152233a).f464034d;
        }
        this.f433046d.mo815x76e0bfae(i18, i19, str, this);
    }
}
