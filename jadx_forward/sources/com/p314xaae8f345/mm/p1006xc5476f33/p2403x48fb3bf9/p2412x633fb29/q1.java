package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes9.dex */
public class q1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f264601d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f264602e;

    public q1(java.lang.String str, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Req req, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, r45.u15 u15Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.wv5();
        lVar.f152198b = new r45.xv5();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/sdk_oauth_authorize";
        lVar.f152200d = 1388;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f264601d = a17;
        r45.wv5 wv5Var = (r45.wv5) a17.f152243a.f152217a;
        wv5Var.f471062d = str;
        wv5Var.f471063e = req.f33033x6833e54;
        wv5Var.f471064f = req.f33034x68ac491;
        wv5Var.f471068m = req.f33029xb21df56b;
        wv5Var.f471066h = str2;
        wv5Var.f471067i = str3;
        wv5Var.f471072q = req.f33030x92f7cdd2;
        wv5Var.f471074s = req.f33031xb0417dde;
        if (str4 != null) {
            wv5Var.f471070o = str4;
        }
        wv5Var.f471071p = i17;
        try {
            wv5Var.f471073r = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(u15Var.mo14344x5f01b1f6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSDKOauthAuthorize", "toByteArray ex %s", e17.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSDKOauthAuthorize", "NetSceneSDKOauthAuthorize isOption1=%b, token=%s, authenticationResult= %d, nonAutomatic=%b", java.lang.Boolean.valueOf(req.f33030x92f7cdd2), wv5Var.f471070o, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(wv5Var.f471074s));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f264602e = u0Var;
        return mo9409x10f9447a(sVar, this.f264601d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1388;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f264602e.mo815x76e0bfae(i18, i19, str, this);
    }
}
