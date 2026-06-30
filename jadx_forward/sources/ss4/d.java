package ss4;

/* loaded from: classes9.dex */
public class d extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f493561d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f493562e;

    /* renamed from: f, reason: collision with root package name */
    public r45.y10 f493563f = null;

    public d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17, java.lang.String str8, int i18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.x10();
        lVar.f152198b = new r45.y10();
        lVar.f152199c = "/cgi-bin/mmpay-bin/checkpayjsapi";
        lVar.f152200d = 580;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f493562e = a17;
        r45.x10 x10Var = (r45.x10) a17.f152243a.f152217a;
        x10Var.f471166d = str;
        x10Var.f471168f = str2;
        x10Var.f471167e = str3;
        x10Var.f471169g = str4;
        x10Var.f471171i = str5;
        x10Var.f471170h = str6;
        x10Var.f471172m = str7;
        x10Var.f471173n = i17;
        x10Var.f471174o = at4.g0.c();
        if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295447a) {
            x10Var.f471175p = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295449c;
        }
        x10Var.f471178s = 1;
        x10Var.f471180u = str8;
        x10Var.f471179t = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckPayJsapi", "appId: %s, url: %s, jsapiScene: %s", str, str7, java.lang.Integer.valueOf(i17));
    }

    public java.lang.String H() {
        return ((r45.y10) this.f493562e.f152244b.f152233a).f472237h;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f493561d = u0Var;
        return mo9409x10f9447a(sVar, this.f493562e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 580;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        java.lang.String str2;
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = (com.p314xaae8f345.mm.p944x882e457a.o) v0Var;
            r45.y10 y10Var = (r45.y10) oVar.f152244b.f152233a;
            this.f493563f = y10Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckPayJsapi", "NetSceneCheckPayJsapi resp.ErrCode is " + y10Var.f472233d + " resp.ErrMsg is " + y10Var.f472234e);
            r45.x10 x10Var = (r45.x10) oVar.f152243a.f152217a;
            java.lang.String str3 = x10Var.f471172m;
            if (str3 != null) {
                java.lang.String queryParameter = android.net.Uri.parse(str3).getQueryParameter("appid");
                if (queryParameter != x10Var.f471166d) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14954, y10Var.f472237h, "", java.lang.Integer.valueOf(x10Var.f471173n), x10Var.f471180u, x10Var.f471166d, java.lang.Integer.valueOf(x10Var.f471178s), java.lang.Integer.valueOf(x10Var.f471179t), x10Var.f471172m, queryParameter);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14954, y10Var.f472237h, "", java.lang.Integer.valueOf(x10Var.f471173n), x10Var.f471180u, x10Var.f471166d, java.lang.Integer.valueOf(x10Var.f471178s), java.lang.Integer.valueOf(x10Var.f471179t), x10Var.f471172m);
                }
            } else if (x10Var.f471176q != null && x10Var.f471177r != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14954, y10Var.f472237h, "", java.lang.Integer.valueOf(x10Var.f471173n), x10Var.f471180u, x10Var.f471166d, java.lang.Integer.valueOf(x10Var.f471178s), java.lang.Integer.valueOf(x10Var.f471179t), x10Var.f471177r, x10Var.f471176q);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckPayJsapi", "NetSceneCheckPayJsapi resp.ErrCode is " + y10Var.f472233d + " resp.ErrMsg is " + y10Var.f472234e);
            str2 = y10Var.f472234e;
        } else {
            str2 = str;
        }
        this.f493561d.mo815x76e0bfae(i18, i19, str2, this);
    }

    public d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i17, java.lang.String str7, java.lang.String str8, java.lang.String str9, int i18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.x10();
        lVar.f152198b = new r45.y10();
        lVar.f152199c = "/cgi-bin/mmpay-bin/checkpayjsapi";
        lVar.f152200d = 580;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f493562e = a17;
        r45.x10 x10Var = (r45.x10) a17.f152243a.f152217a;
        x10Var.f471166d = str;
        x10Var.f471168f = str2;
        x10Var.f471167e = str3;
        x10Var.f471169g = str4;
        x10Var.f471171i = str5;
        x10Var.f471170h = str6;
        x10Var.f471173n = i17;
        x10Var.f471176q = str7;
        x10Var.f471177r = str8;
        x10Var.f471178s = 2;
        x10Var.f471180u = str9;
        x10Var.f471179t = i18;
        x10Var.f471174o = at4.g0.c();
        if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295447a) {
            x10Var.f471175p = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295449c;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckPayJsapi", "appId: %s, UserName: %s, path: %s，requestCode：%s", str, str7, str8, str9);
    }
}
