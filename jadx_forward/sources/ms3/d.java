package ms3;

/* loaded from: classes4.dex */
public class d extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f412516d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f412517e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f412518f;

    public d(java.lang.String str) {
        this.f412518f = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 11016;
        lVar.f152199c = "/cgi-bin/xmmailbroker/mb_searchmailaddr";
        ks3.i1 i1Var = new ks3.i1();
        i1Var.f393221d = gm0.j1.b().h();
        i1Var.f393222e = str;
        lVar.f152197a = i1Var;
        lVar.f152198b = new ks3.j1();
        this.f412516d = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f412517e = u0Var;
        return mo9409x10f9447a(sVar, this.f412516d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 11016;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f412517e.mo815x76e0bfae(i18, i19, str, this);
    }
}
