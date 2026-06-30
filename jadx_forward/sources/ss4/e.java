package ss4;

/* loaded from: classes9.dex */
public class e extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f493566d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f493567e;

    /* renamed from: f, reason: collision with root package name */
    public r45.v20 f493568f;

    public e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17, java.lang.String str8, int i18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.u20();
        lVar.f152198b = new r45.v20();
        lVar.f152199c = "/cgi-bin/mmpay-bin/checkuserauthjsapi";
        lVar.f152200d = 2728;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f493567e = a17;
        r45.u20 u20Var = (r45.u20) a17.f152243a.f152217a;
        u20Var.f468487d = str;
        u20Var.f468489f = str2;
        u20Var.f468488e = str3;
        u20Var.f468490g = str4;
        u20Var.f468492i = str5;
        u20Var.f468491h = str6;
        u20Var.f468493m = str7;
        u20Var.f468494n = i17;
        u20Var.f468495o = at4.g0.c();
        u20Var.f468498r = 1;
        u20Var.f468496p = null;
        u20Var.f468497q = null;
        u20Var.f468504x = str8;
        u20Var.f468503w = i18;
        mz2.a aVar = (mz2.a) ((pz2.a) gm0.j1.s(pz2.a.class));
        boolean a18 = aVar.a();
        re4.v a19 = re4.u.a();
        u20Var.f468499s = aVar.mo148657xb9a85d2c() ? 1 : 0;
        u20Var.f468500t = a19.f476086a;
        u20Var.f468501u = a19.f476087b;
        u20Var.f468502v = a18 ? 1 : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckUserAuthJsapi", "appId: %s, url: %s, jsapiScene: %s, isOpenTouchPay: %b", str, str7, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(a18));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f493566d = u0Var;
        return mo9409x10f9447a(sVar, this.f493567e, this);
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
            r45.v20 v20Var = (r45.v20) oVar.f152244b.f152233a;
            this.f493568f = v20Var;
            r45.u20 u20Var = (r45.u20) oVar.f152243a.f152217a;
            java.lang.String str3 = u20Var.f468493m;
            if (str3 != null) {
                java.lang.String queryParameter = android.net.Uri.parse(str3).getQueryParameter("appid");
                if (queryParameter != u20Var.f468487d) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14954, this.f493568f.f469356h, "", java.lang.Integer.valueOf(u20Var.f468494n), u20Var.f468504x, u20Var.f468487d, java.lang.Integer.valueOf(u20Var.f468498r), java.lang.Integer.valueOf(u20Var.f468503w), u20Var.f468493m, queryParameter);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14954, this.f493568f.f469356h, "", java.lang.Integer.valueOf(u20Var.f468494n), u20Var.f468504x, u20Var.f468487d, java.lang.Integer.valueOf(u20Var.f468498r), java.lang.Integer.valueOf(u20Var.f468503w), u20Var.f468493m);
                }
            } else if (u20Var.f468496p != null && u20Var.f468497q != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14954, v20Var.f469356h, "", java.lang.Integer.valueOf(u20Var.f468494n), u20Var.f468504x, u20Var.f468487d, java.lang.Integer.valueOf(u20Var.f468498r), java.lang.Integer.valueOf(u20Var.f468503w), u20Var.f468497q, u20Var.f468496p);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckUserAuthJsapi", "CheckUserAuthJsapiResponse resp.ErrCode is " + this.f493568f.f469352d + " resp.ErrMsg is " + this.f493568f.f469353e);
            str2 = this.f493568f.f469353e;
        } else {
            str2 = str;
        }
        this.f493566d.mo815x76e0bfae(i18, i19, str2, this);
    }
}
