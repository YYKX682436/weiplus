package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class i0 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f238386d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f238387e;

    /* renamed from: f, reason: collision with root package name */
    public r45.hs f238388f;

    public i0(r45.yr yrVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePersonalPaySuccPage", "personalpay_order_id = %s ,trans_id = %s ,total_amount = %s，placeorder_ext = %s", yrVar.f472843d, yrVar.f472844e, java.lang.Long.valueOf(yrVar.f472845f), yrVar.f472846g);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.gs();
        lVar.f152198b = new r45.hs();
        lVar.f152200d = 4587;
        lVar.f152199c = "/cgi-bin/mmpay-bin/personalpaysuccpage";
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f238386d = a17;
        ((r45.gs) a17.f152243a.f152217a).f457040d = yrVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f238387e = u0Var;
        return mo9409x10f9447a(sVar, this.f238386d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4587;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePersonalPaySuccPage", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f238388f = (r45.hs) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f238387e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
