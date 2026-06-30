package ms3;

/* loaded from: classes.dex */
public class g extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f412525d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f412526e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f412527f;

    public g(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 11480;
        lVar.f152199c = "/cgi-bin/xmmailbroker/mb_updatemailstatus";
        ks3.p1 p1Var = new ks3.p1();
        p1Var.f393269e.add(str);
        p1Var.f393268d = gm0.j1.b().h();
        p1Var.f393270f = i17;
        lVar.f152197a = p1Var;
        lVar.f152198b = new ks3.q1();
        this.f412525d = lVar.a();
        this.f412527f = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f412526e = u0Var;
        return mo9409x10f9447a(sVar, this.f412525d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 11480;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f412526e.mo815x76e0bfae(i18, i19, str, this);
    }
}
