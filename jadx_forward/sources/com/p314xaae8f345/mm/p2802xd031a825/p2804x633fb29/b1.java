package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes8.dex */
public class b1 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f295396d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f295397e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f295398f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f295399g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f295400h;

    public b1(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.dc5();
        lVar.f152198b = new r45.ec5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/preparepurchase";
        lVar.f152200d = com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60863x5f3ec0e3;
        lVar.f152201e = 214;
        lVar.f152202f = 1000000214;
        lVar.f152211o = 1;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f295396d = a17;
        r45.dc5 dc5Var = (r45.dc5) a17.f152243a.f152217a;
        this.f295398f = str;
        dc5Var.f453841d = str;
        this.f295400h = str2;
        dc5Var.f453842e = str2;
        this.f295399g = str3;
        dc5Var.f453843f = str3;
        dc5Var.f453844g = i18;
        dc5Var.f453846i = i17;
        dc5Var.f453845h = str4;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f295397e = u0Var;
        return mo9409x10f9447a(sVar, this.f295396d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60863x5f3ec0e3;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetScenePreparePurchase", "ErrType:" + i18 + ",errCode:" + i19 + ",errMsg:" + str);
        if (i18 == 0 && i19 == 0) {
            this.f295397e.mo815x76e0bfae(i18, i19, str, this);
        } else {
            this.f295397e.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    public b1(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.dc5();
        lVar.f152198b = new r45.ec5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/preparepurchase";
        lVar.f152200d = com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60863x5f3ec0e3;
        lVar.f152201e = 214;
        lVar.f152202f = 1000000214;
        lVar.f152211o = 1;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f295396d = a17;
        r45.dc5 dc5Var = (r45.dc5) a17.f152243a.f152217a;
        this.f295398f = str;
        dc5Var.f453841d = str;
        this.f295400h = str2;
        dc5Var.f453842e = str2;
        dc5Var.f453844g = i17;
    }
}
