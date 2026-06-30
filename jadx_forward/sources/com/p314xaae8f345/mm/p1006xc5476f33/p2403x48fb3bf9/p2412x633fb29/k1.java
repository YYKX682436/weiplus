package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public class k1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.o {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f264509d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f264510e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.g14 f264511f;

    /* renamed from: g, reason: collision with root package name */
    public final int f264512g;

    public k1(r45.g14 g14Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, java.util.LinkedList linkedList, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSAPISetAuth", "NetSceneJSAPISetAuth doScene url[%s], appid[%s], jsapiName[%s], [%s], [%s], [%s], [%s], [%s]", str, str3, str4, str5, str6, str7, str8, java.lang.Integer.valueOf(i17));
        this.f264511f = g14Var;
        this.f264512g = i18;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.b24();
        lVar.f152198b = new r45.c24();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/jsapi-setauth";
        lVar.f152200d = 1096;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f264509d = a17;
        r45.b24 b24Var = (r45.b24) a17.f152243a.f152217a;
        b24Var.f451986d = str;
        b24Var.f451996q = str2;
        b24Var.f451987e = str3;
        b24Var.f451988f = str4;
        b24Var.f451989g = str5;
        b24Var.f451990h = str6;
        b24Var.f451991i = str7;
        b24Var.f451992m = str8;
        b24Var.f451994o = i17;
        b24Var.f451993n = gVar;
        b24Var.f451995p = linkedList;
        b24Var.f451997r = i19;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSAPISetAuth", "doScene");
        this.f264510e = u0Var;
        return mo9409x10f9447a(sVar, this.f264509d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1096;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSAPISetAuth", "errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f264510e.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.o
    public int s() {
        return this.f264512g;
    }
}
