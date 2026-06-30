package su4;

/* loaded from: classes12.dex */
public class p1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f494567d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f494568e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.h55 f494569f;

    public p1(r45.g55 g55Var) {
        g55Var.f456429n = com.p314xaae8f345.mm.ui.bk.C() ? 1 : 0;
        g55Var.f456423e = su4.r2.i();
        g55Var.f456432q = su4.r2.g();
        r45.h55 h55Var = new r45.h55();
        this.f494569f = h55Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1076;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/pardussearch";
        lVar.f152197a = g55Var;
        lVar.f152198b = h55Var;
        this.f494568e = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f494567d = u0Var;
        return mo9409x10f9447a(sVar, this.f494568e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1076;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.NetScenePardusSearch", "netId %d errType %d errCode %d errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f494567d.mo815x76e0bfae(i18, i19, str, this);
    }
}
