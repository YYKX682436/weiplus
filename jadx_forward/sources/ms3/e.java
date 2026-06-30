package ms3;

/* loaded from: classes8.dex */
public class e extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f412519d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f412520e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f412521f;

    public e(java.lang.String str, ks3.z0 z0Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 11166;
        lVar.f152199c = "/cgi-bin/xmmailbroker/mb_sendmail";
        ks3.k1 k1Var = new ks3.k1();
        k1Var.f393244d = gm0.j1.b().h();
        k1Var.f393245e = z0Var;
        lVar.f152197a = k1Var;
        lVar.f152198b = new ks3.l1();
        this.f412519d = lVar.a();
        this.f412521f = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f412520e = u0Var;
        return mo9409x10f9447a(sVar, this.f412519d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 11166;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f412520e.mo815x76e0bfae(i18, i19, str, this);
    }
}
