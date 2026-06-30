package su4;

/* loaded from: classes8.dex */
public class a2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f494341d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f494342e;

    /* renamed from: f, reason: collision with root package name */
    public final int f494343f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f494344g;

    public a2(r45.lq5 lq5Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1134;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/searchreport";
        lVar.f152197a = lq5Var;
        lVar.f152198b = new r45.mq5();
        this.f494342e = lVar.a();
        this.f494343f = lq5Var.f461276d;
        this.f494344g = lq5Var.f461289t;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        int i17 = this.f494343f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.NetSceneWebSearchReport", "doScene %d", java.lang.Integer.valueOf(i17));
        su4.k3.e(5);
        su4.k3.g(i17, 4, 0, 0, this.f494344g);
        this.f494341d = u0Var;
        return mo9409x10f9447a(sVar, this.f494342e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1134;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.NetSceneWebSearchReport", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            this.f494341d.mo815x76e0bfae(i18, i19, str, this);
            su4.k3.e(7);
        } else {
            this.f494341d.mo815x76e0bfae(i18, i19, str, this);
            su4.k3.e(6);
            su4.k3.g(this.f494343f, 5, i18, i19, this.f494344g);
        }
    }
}
