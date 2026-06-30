package su4;

/* loaded from: classes.dex */
public class l1 extends su4.a implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f494513i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f494514m;

    /* renamed from: n, reason: collision with root package name */
    public r45.qn3 f494515n;

    public l1(su4.r1 r1Var) {
        this.f494338g = r1Var.f494618y;
        r45.pn3 pn3Var = new r45.pn3();
        pn3Var.f464758d = r1Var.f494599f;
        pn3Var.f464759e = r1Var.B;
        pn3Var.f464760f = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0);
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(r1Var.f494599f), r1Var.B};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneGetSearchResult", "create NetSceneGetSearchResult scene:%s requestKey:%s", objArr);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1003;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/getsearchresult";
        lVar.f152197a = pn3Var;
        lVar.f152198b = new r45.qn3();
        this.f494514m = lVar.a();
    }

    @Override // su4.a
    public java.lang.String H() {
        r45.qn3 qn3Var = this.f494515n;
        if (qn3Var != null) {
            return qn3Var.f465639d;
        }
        return null;
    }

    @Override // su4.a
    public int J() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f494513i = u0Var;
        return mo9409x10f9447a(sVar, this.f494514m, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1003;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str};
        int i27 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneGetSearchResult", "netId: %s errType:%s errCode:%s errMsg:%s", objArr);
        if (i18 == 0 && i19 == 0) {
            this.f494515n = (r45.qn3) this.f494514m.f152244b.f152233a;
        }
        this.f494513i.mo815x76e0bfae(i18, i19, str, this);
    }
}
