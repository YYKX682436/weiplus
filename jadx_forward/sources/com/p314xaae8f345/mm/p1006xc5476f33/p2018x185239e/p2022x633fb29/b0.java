package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes2.dex */
public class b0 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f238321d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f238322e;

    /* renamed from: f, reason: collision with root package name */
    public r45.yk4 f238323f;

    public b0(java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.xk4();
        lVar.f152198b = new r45.yk4();
        lVar.f152200d = 4839;
        lVar.f152199c = "/cgi-bin/mmpay-bin/sjtpaystate";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f238322e = a17;
        r45.xk4 xk4Var = (r45.xk4) a17.f152243a.f152217a;
        xk4Var.f471716d = str;
        xk4Var.f471717e = i17;
        xk4Var.f471718f = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMerchantPayCheckPay", "doScene trade_no：%s, pay_stats：%s, scan_id：%s", str, java.lang.Integer.valueOf(i17), xk4Var.f471718f);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f238321d = u0Var;
        return mo9409x10f9447a(sVar, this.f238322e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4708;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMerchantPayCheckPay", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.yk4 yk4Var = (r45.yk4) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f238323f = yk4Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMerchantPayCheckPay", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(yk4Var.f472711d), this.f238323f.f472712e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f238321d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
