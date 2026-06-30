package su4;

/* loaded from: classes.dex */
public class x1 extends su4.a implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f494665i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f494666m;

    /* renamed from: n, reason: collision with root package name */
    public final su4.r1 f494667n;

    /* renamed from: o, reason: collision with root package name */
    public r45.u97 f494668o;

    public x1(su4.r1 r1Var) {
        this.f494667n = r1Var;
        this.f494338g = r1Var.f494618y;
        r45.t97 t97Var = new r45.t97();
        t97Var.f467756e = 1;
        t97Var.f467755d = r1Var.C;
        this.f494668o = new r45.u97();
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(r1Var.f494599f), r1Var.B};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneWebSearchAiScanImageRetrieval", "create NetSceneWebSearchAiScanImageRetrieval scene:%s requestKey:%s", objArr);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1532;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/usrmsg/aiscan_image_retrieval";
        lVar.f152197a = t97Var;
        lVar.f152198b = this.f494668o;
        this.f494666m = lVar.a();
    }

    @Override // su4.a
    public java.lang.String H() {
        return this.f494668o.f468696d;
    }

    @Override // su4.a
    public int J() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f494665i = u0Var;
        return mo9409x10f9447a(sVar, this.f494666m, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1532;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str};
        int i27 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneWebSearchAiScanImageRetrieval", "netId: %s errType:%s errCode:%s errMsg:%s", objArr);
        if (i18 == 0 || i19 == 0) {
            this.f494668o = (r45.u97) this.f494666m.f152244b.f152233a;
        }
        this.f494665i.mo815x76e0bfae(i18, i19, str, this);
    }
}
