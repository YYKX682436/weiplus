package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public class c1 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f295406d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f295407e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f295408f;

    /* renamed from: g, reason: collision with root package name */
    public int f295409g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f295410h;

    /* renamed from: i, reason: collision with root package name */
    public int f295411i;

    public c1(java.lang.String str, int i17, int i18, int i19, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.f295408f = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.wx6();
        lVar.f152198b = new r45.xx6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/verifypurchase";
        lVar.f152200d = 414;
        lVar.f152201e = 215;
        lVar.f152202f = 1000000215;
        lVar.f152211o = 1;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f295406d = a17;
        r45.wx6 wx6Var = (r45.wx6) a17.f152243a.f152217a;
        this.f295408f = str;
        wx6Var.f471089e = str;
        wx6Var.f471090f = i17;
        wx6Var.f471097p = i19;
        wx6Var.f471091g = i18;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
            wx6Var.f471092h = str6;
            wx6Var.f471093i = str5;
        }
        wx6Var.f471094m = str2;
        wx6Var.f471096o = str4;
        if (str3 != null) {
            byte[] bytes = str3.getBytes();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(bytes);
            wx6Var.f471088d = cu5Var;
        } else {
            wx6Var.f471088d = new r45.cu5();
        }
        wx6Var.f471095n = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyPurchase", "productId:" + str + ",verifyType:" + i17 + ",payType:" + i18 + ",count:%s" + i19 + ",payload:" + str2 + ",purchaseData:" + str3 + ",dataSignature:" + str4 + ",currencyType:" + str5 + ",price:" + str6);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f295407e = u0Var;
        return mo9409x10f9447a(sVar, this.f295406d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 414;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneVerifyPurchase", "ErrType:" + i18 + "   errCode:" + i19);
        this.f295411i = 0;
        if (i18 != 0 || i19 != 0) {
            this.f295411i = -1;
            this.f295407e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        r45.xx6 xx6Var = (r45.xx6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (xx6Var.f76492x92037252 != null) {
            this.f295409g = xx6Var.f472121f;
            this.f295410h = xx6Var.f472119d;
        }
        this.f295407e.mo815x76e0bfae(i18, i19, str, this);
    }

    public c1(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4) {
        this.f295408f = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.wx6();
        lVar.f152198b = new r45.xx6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/verifypurchase";
        lVar.f152200d = 414;
        lVar.f152201e = 215;
        lVar.f152202f = 1000000215;
        lVar.f152211o = 1;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f295406d = a17;
        r45.wx6 wx6Var = (r45.wx6) a17.f152243a.f152217a;
        this.f295408f = str;
        wx6Var.f471089e = str;
        wx6Var.f471091g = i17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            wx6Var.f471092h = str3;
        }
        wx6Var.f471094m = str2;
        wx6Var.f471090f = i18;
        if (str4 != null) {
            byte[] bytes = str4.getBytes();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(bytes);
            wx6Var.f471088d = cu5Var;
        } else {
            wx6Var.f471088d = new r45.cu5();
        }
        wx6Var.f471095n = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyPurchase", "ProductID:%s, Price:%s, PayType:%s, BillNo:%s", str, str3, java.lang.Integer.valueOf(i17), str2);
    }
}
