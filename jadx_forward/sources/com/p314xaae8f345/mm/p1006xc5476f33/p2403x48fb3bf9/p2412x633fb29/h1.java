package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public class h1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.o {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f264439d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f264440e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.n f264441f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f264442g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f264443h;

    /* renamed from: i, reason: collision with root package name */
    public final int f264444i;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.n nVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, byte[] bArr, int i17, java.lang.String str9, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSAPIAuth", "NetSceneJSAPIAuth doScene appid[%s], jsapiName[%s], [%s], [%s], [%s], [%s], [%s], [%s]", str3, str4, str5, str6, str7, str8, java.lang.Integer.valueOf(i17), str9);
        this.f264441f = nVar;
        this.f264442g = str4;
        this.f264443h = str;
        this.f264444i = i18;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.h14();
        lVar.f152198b = new r45.i14();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/jsapi-auth";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.j.f34002x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f264439d = a17;
        r45.h14 h14Var = (r45.h14) a17.f152243a.f152217a;
        h14Var.f457282d = str;
        h14Var.f457292q = str2;
        h14Var.f457283e = str3;
        h14Var.f457284f = str4;
        h14Var.f457285g = str5;
        h14Var.f457286h = str6;
        h14Var.f457287i = str7;
        h14Var.f457288m = str8;
        h14Var.f457289n = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
        h14Var.f457290o = i17;
        h14Var.f457291p = str9;
        h14Var.f457293r = i19;
    }

    public r45.i14 H() {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f264439d;
        if (oVar == null) {
            return null;
        }
        return (r45.i14) oVar.f152244b.f152233a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSAPIAuth", "doScene");
        this.f264440e = u0Var;
        return mo9409x10f9447a(sVar, this.f264439d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.j.f34002x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSAPIAuth", "errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f264440e.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.o
    public int s() {
        return this.f264444i;
    }
}
