package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class f0 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f238346d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f238347e;

    public f0(java.lang.String str, java.lang.String str2, long j17, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePersonalPayCheck", "personalpay_order_id = %s ,trans_id = %s ,total_amount = %s，placeorder_ext = %s", str, str2, java.lang.Long.valueOf(j17), str3);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.cs();
        lVar.f152198b = new r45.ds();
        lVar.f152200d = 5047;
        lVar.f152199c = "/cgi-bin/mmpay-bin/personalpaypaycheck";
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f238346d = a17;
        r45.cs csVar = (r45.cs) a17.f152243a.f152217a;
        r45.yr yrVar = new r45.yr();
        yrVar.f472843d = str;
        yrVar.f472844e = str2;
        yrVar.f472845f = j17;
        yrVar.f472846g = str3;
        csVar.f453334d = yrVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f238347e = u0Var;
        return mo9409x10f9447a(sVar, this.f238346d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5047;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePersonalPayCheck", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f238347e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
