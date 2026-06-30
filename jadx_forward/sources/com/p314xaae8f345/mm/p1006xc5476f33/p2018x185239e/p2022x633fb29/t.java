package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class t extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 implements np5.d, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f238547d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ip f238548e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f238549f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238550g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238551h = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f238552i;

    public t(r45.an6 an6Var, r45.k6 k6Var, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.hp();
        lVar.f152198b = new r45.ip();
        lVar.f152200d = 2682;
        lVar.f152199c = "/cgi-bin/mmpay-bin/busif2fzerocallback";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f238547d = a17;
        r45.hp hpVar = (r45.hp) a17.f152243a.f152217a;
        hpVar.f457881e = k6Var;
        hpVar.f457880d = an6Var;
        hpVar.f457882f = str;
        hpVar.f457883g = i17;
        hpVar.f457884h = str2;
        this.f238552i = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBusiF2fZeroCallback", "NetSceneBusiF2fZeroCallback, token %s AfterPlaceOrderCommReq %s zero_pay_extend: %s", str2, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.a.b(k6Var), str);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f238549f = u0Var;
        return mo9409x10f9447a(sVar, this.f238547d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2682;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBusiF2fZeroCallback", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.ip ipVar = (r45.ip) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f238548e = ipVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBusiF2fZeroCallback", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(ipVar.f458759d), this.f238548e.f458760e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f238549f;
        if (u0Var != null) {
            this.f238550g = this.f238548e.f458761f == 1;
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
