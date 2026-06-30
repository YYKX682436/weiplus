package it1;

/* loaded from: classes5.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f376029d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f376030e;

    /* renamed from: f, reason: collision with root package name */
    public final int f376031f;

    /* renamed from: g, reason: collision with root package name */
    public final xg3.q0 f376032g;

    public a(xg3.q0 q0Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.or();
        lVar.f152198b = new r45.pr();
        lVar.f152199c = "/cgi-bin/micromsg-bin/bypoplog";
        lVar.f152200d = 12607;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f376030e = a17;
        int i17 = q0Var.f535960f;
        this.f376031f = i17;
        this.f376032g = q0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBypOPLog", "opType: %d", java.lang.Integer.valueOf(i17));
        r45.or orVar = (r45.or) a17.f152243a.f152217a;
        orVar.set(1, java.lang.Integer.valueOf((int) q0Var.f535961g));
        orVar.set(2, java.lang.Integer.valueOf(i17));
        orVar.set(3, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(q0Var.a()));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f376029d = u0Var;
        return mo9409x10f9447a(sVar, this.f376030e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getReqResp */
    public com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558() {
        return this.f376030e;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 12607;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBypOPLog", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, opType:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Integer.valueOf(this.f376031f));
        this.f376029d.mo815x76e0bfae(i18, i19, str, this);
    }
}
