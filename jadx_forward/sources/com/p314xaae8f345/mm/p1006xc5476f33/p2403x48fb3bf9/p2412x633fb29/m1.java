package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes.dex */
public class m1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f264539d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f264540e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f264541f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f264542g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f264543h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f264544i;

    /* renamed from: m, reason: collision with root package name */
    public int f264545m;

    public m1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ue4();
        lVar.f152198b = new r45.ve4();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/usrmsg/mmbizjsapi_getuseropenid";
        lVar.f152200d = 1177;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f264540e = a17;
        r45.ue4 ue4Var = (r45.ue4) a17.f152243a.f152217a;
        ue4Var.f468832d = str;
        ue4Var.f468833e = str2;
        ue4Var.f468834f = str3;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f264539d = u0Var;
        return mo9409x10f9447a(sVar, this.f264540e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1177;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMMBizGetUserOpenId", "errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            r45.ve4 ve4Var = (r45.ve4) this.f264540e.f152244b.f152233a;
            this.f264541f = ve4Var.f469694d;
            this.f264542g = ve4Var.f469697g;
            this.f264543h = ve4Var.f469696f;
            this.f264544i = ve4Var.f469695e;
            this.f264545m = ve4Var.f469698h;
        }
        this.f264539d.mo815x76e0bfae(i18, i19, str, this);
    }
}
