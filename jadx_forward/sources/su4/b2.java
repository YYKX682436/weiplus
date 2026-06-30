package su4;

/* loaded from: classes.dex */
public class b2 extends su4.b implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f494351f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f494352g;

    /* renamed from: h, reason: collision with root package name */
    public r45.aa7 f494353h;

    public b2(su4.r1 r1Var) {
        java.lang.String str = r1Var.f494595b;
        this.f494347d = str;
        this.f494348e = r1Var.f494610q;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.NetSceneWebSuggest", "keyword is unavailable");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneWebSuggest", "Constructors: query=%s", r1Var.f494595b);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        if (r1Var.f494612s == 1) {
            lVar.f152200d = 1747;
            lVar.f152199c = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_weappsuggestion";
        } else {
            lVar.f152200d = 1161;
            lVar.f152199c = "/cgi-bin/mmsearch-bin/searchsuggestion";
        }
        lVar.f152197a = new r45.z97();
        lVar.f152198b = new r45.aa7();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f494352g = a17;
        r45.z97 z97Var = (r45.z97) a17.f152243a.f152217a;
        z97Var.f473355e = r1Var.f494595b;
        z97Var.f473357g = r1Var.f494597d;
        int i17 = r1Var.H;
        z97Var.f473358h = i17 == 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0) : i17;
        z97Var.f473354d = r1Var.f494594a;
        z97Var.f473359i = su4.r2.i();
        z97Var.f473361n = r1Var.f494599f;
        z97Var.A = r1Var.f494615v;
        z97Var.G = su4.r2.g();
        z97Var.f473370w = r1Var.f494608o;
        if (r1Var.f494614u != null) {
            try {
                z97Var.B = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(r1Var.f494614u.mo14344x5f01b1f6());
            } catch (java.lang.Exception unused) {
            }
        }
        if (r1Var.f494613t != null) {
            try {
                z97Var.f473373z = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(r1Var.f494613t.mo14344x5f01b1f6());
            } catch (java.io.IOException unused2) {
            }
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray((java.util.Collection) r1Var.f494605l);
            z97Var.f473367t = new java.util.LinkedList();
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                z97Var.f473367t.add(java.net.URLDecoder.decode(jSONArray.getString(i18), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.NetSceneWebSuggest", e17, "decode json error", new java.lang.Object[0]);
        }
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(r1Var.f494597d);
        objArr[1] = java.lang.Boolean.valueOf(z97Var.f473359i != null);
        objArr[2] = java.lang.Integer.valueOf(r1Var.f494599f);
        objArr[3] = java.lang.Integer.valueOf(r1Var.f494597d);
        objArr[4] = java.lang.Integer.valueOf(r1Var.f494594a);
        objArr[5] = java.lang.Integer.valueOf(r1Var.f494610q);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneWebSuggest", "businessTypeList is %d | contains location = %b | scene=%d | businessType=%d | isHomePage=%b | webViewId=%d", objArr);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f494351f = u0Var;
        return mo9409x10f9447a(sVar, this.f494352g, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1161;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneWebSuggest", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            this.f494351f.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        r45.aa7 aa7Var = (r45.aa7) this.f494352g.f152244b.f152233a;
        this.f494353h = aa7Var;
        if (aa7Var != null) {
            java.lang.String str2 = aa7Var.f451410f;
        }
        this.f494351f.mo815x76e0bfae(i18, i19, str, this);
    }
}
