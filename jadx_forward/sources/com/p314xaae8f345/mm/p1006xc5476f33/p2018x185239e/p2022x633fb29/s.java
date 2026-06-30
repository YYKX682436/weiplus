package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class s extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f238541d;

    /* renamed from: e, reason: collision with root package name */
    public r45.gp f238542e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f238543f;

    public s(r45.k6 k6Var, java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.fp();
        lVar.f152198b = new r45.gp();
        lVar.f152200d = 2702;
        lVar.f152199c = "/cgi-bin/mmpay-bin/busif2funlockfavor";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f238541d = a17;
        r45.fp fpVar = (r45.fp) a17.f152243a.f152217a;
        fpVar.f456031d = k6Var;
        fpVar.f456032e = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(886, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBusiF2fUnlockFavor", "NetSceneBusiF2fUnlockFavor, f2fId: %s, transId: %s, amount: %s", k6Var.f459947d, k6Var.f459948e, java.lang.Integer.valueOf(k6Var.f459956p));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f238543f = u0Var;
        return mo9409x10f9447a(sVar, this.f238541d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2702;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBusiF2fUnlockFavor", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.gp gpVar = (r45.gp) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f238542e = gpVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBusiF2fUnlockFavor", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(gpVar.f456931d), this.f238542e.f456932e);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(886, 1);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f238543f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
