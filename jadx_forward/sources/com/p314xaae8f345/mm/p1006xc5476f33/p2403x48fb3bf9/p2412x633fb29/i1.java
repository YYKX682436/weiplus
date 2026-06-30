package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public class i1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.o {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f264462d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f264463e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.n f264464f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f264465g;

    /* renamed from: h, reason: collision with root package name */
    public final int f264466h;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.n nVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17, java.lang.String str8, int i18, int i19, int i27) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSAPIPreVerify", "NetSceneJSAPIPreVerify doScene url[%s], appid[%s], [%s], [%s], [%s], [%s]", str, str3, str4, str5, str6, str7);
        if (nVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.webview.NetSceneJSAPIPreVerify", "JSVerifyEnd cb is null");
        }
        this.f264464f = nVar;
        this.f264465g = str;
        this.f264466h = i18;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.x14();
        lVar.f152198b = new r45.y14();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/jsapi-preverify";
        lVar.f152200d = bb1.g.f4187x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f264462d = a17;
        r45.x14 x14Var = (r45.x14) a17.f152243a.f152217a;
        x14Var.f471183d = str;
        x14Var.f471193q = str2;
        x14Var.f471184e = str3;
        x14Var.f471185f = linkedList;
        x14Var.f471192p = linkedList2;
        x14Var.f471186g = str4;
        x14Var.f471187h = str5;
        x14Var.f471188i = str6;
        x14Var.f471189m = str7;
        x14Var.f471190n = i17;
        x14Var.f471191o = str8;
        x14Var.f471194r = i19;
        x14Var.f471195s = i27;
    }

    public r45.y14 H() {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f264462d;
        if (oVar == null) {
            return null;
        }
        return (r45.y14) oVar.f152244b.f152233a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSAPIPreVerify", "doScene");
        this.f264463e = u0Var;
        return mo9409x10f9447a(sVar, this.f264462d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return bb1.g.f4187x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSAPIPreVerify", "errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f264463e.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.o
    public int s() {
        return this.f264466h;
    }
}
