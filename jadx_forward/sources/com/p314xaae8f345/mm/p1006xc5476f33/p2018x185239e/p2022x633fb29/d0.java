package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes4.dex */
public class d0 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f238335d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f238336e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cl4 f238337f;

    public d0(java.lang.String str, double d17, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.bl4();
        lVar.f152198b = new r45.cl4();
        lVar.f152200d = 4954;
        lVar.f152199c = "/cgi-bin/mmpay-bin/sjtpaypurchase";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f238336e = a17;
        r45.bl4 bl4Var = (r45.bl4) a17.f152243a.f152217a;
        bl4Var.f452385d = str;
        long i07 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i0(d17 + "", "100");
        bl4Var.f452386e = i07;
        bl4Var.f452387f = str2;
        bl4Var.f452389h = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMerchantPayPlaceOrder", "scanId: %s, totalAmount: %s , payerRemark：%s , qrcodeSenderUsername：%s", str, java.lang.Long.valueOf(i07), str2, str3);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f238335d = u0Var;
        return mo9409x10f9447a(sVar, this.f238336e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4954;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMerchantPayPlaceOrder", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.cl4 cl4Var = (r45.cl4) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f238337f = cl4Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMerchantPayPlaceOrder", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(cl4Var.f453184d), this.f238337f.f453185e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f238335d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
