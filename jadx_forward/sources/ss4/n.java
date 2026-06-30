package ss4;

/* loaded from: classes8.dex */
public class n extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ha3 f493634d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f493635e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f493636f;

    /* renamed from: g, reason: collision with root package name */
    public final long f493637g;

    public n(java.lang.String str, long j17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ga3();
        lVar.f152198b = new r45.ha3();
        lVar.f152199c = "/cgi-bin/mmpay-bin/mktgetaward";
        lVar.f152200d = 2948;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f493635e = a17;
        ((r45.ga3) a17.f152243a.f152217a).f456569d = str;
        this.f493637g = j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMktGetAward", "NetSceneMktGetAward, get_award_params: %s, activityId: %s", str, java.lang.Long.valueOf(j17));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f493636f = u0Var;
        return mo9409x10f9447a(sVar, this.f493635e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2948;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMktGetAward", "onGYNetEnd, netId: %s, errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.ha3 ha3Var = (r45.ha3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f493634d = ha3Var;
        if (i18 == 0 || i19 == 0) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(ha3Var.f457508d);
            r45.ha3 ha3Var2 = this.f493634d;
            java.lang.String str2 = ha3Var2.f457509e;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(ha3Var2.f457510f);
            r45.ha3 ha3Var3 = this.f493634d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMktGetAward", "ret_code: %s, ret_msg: %s, result_code: %s, alert_wording: %s, btn_wording: %s", valueOf, str2, valueOf2, ha3Var3.f457511g, ha3Var3.f457512h);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f493636f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
