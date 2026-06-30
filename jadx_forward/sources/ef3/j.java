package ef3;

/* loaded from: classes4.dex */
public class j extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f333943d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f333944e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f333945f;

    /* renamed from: g, reason: collision with root package name */
    public final int f333946g;

    public j(int i17, java.lang.String str, int i18) {
        this(i17, str, null, null, i18);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f333944e = u0Var;
        return mo9409x10f9447a(sVar, this.f333945f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.j.f33899x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetPayFunctionList", "errCode " + i19 + ", errMsg " + str);
        if (i18 == 0 && i19 == 0) {
            r45.uk3 uk3Var = (r45.uk3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetPayFunctionList", "resp.PayFunctionList wallet_regionL " + this.f333946g + " " + uk3Var.f468960d);
            try {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uk3Var.f468960d)) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(uk3Var.f468960d);
                    java.lang.String optString = jSONObject.optString("pay_func_list");
                    this.f333943d = bt4.d.h(new org.json.JSONArray(optString));
                    java.lang.String optString2 = jSONObject.optString("global_activity_list");
                    java.lang.String optString3 = jSONObject.optString("pay_banner_list");
                    java.lang.String optString4 = jSONObject.optString("type_info_list");
                    pg0.a3 a3Var = (pg0.a3) i95.n0.c(pg0.a3.class);
                    a3Var.getClass();
                    if (!gm0.j1.a()) {
                        throw new c01.c();
                    }
                    ((dt4.f) a3Var.f435495p.a()).y0(this.f333946g, optString, optString2, optString3, optString4, uk3Var.f468963g);
                    ef3.r.wi().f333961d.clear();
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetPayFunctionList", e17, "", new java.lang.Object[0]);
            }
        }
        this.f333944e.mo815x76e0bfae(i18, i19, str, this);
    }

    public j(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18) {
        this(i17, str, str3, java.lang.String.format("appid=%s&funcid=%s&url=%s", str2, str3, java.net.URLEncoder.encode(str4, com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a).toString()), i18);
    }

    public j(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18) {
        java.util.ArrayList<java.lang.String> arrayList = null;
        this.f333943d = null;
        this.f333946g = 0;
        this.f333946g = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.tk3();
        lVar.f152198b = new r45.uk3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getpayfunctionlist";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.j.f33899x366c91de;
        lVar.f152201e = 227;
        lVar.f152202f = 1000000227;
        lVar.f152211o = 1;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f333945f = a17;
        r45.tk3 tk3Var = (r45.tk3) a17.f152243a.f152217a;
        tk3Var.f468050d = str;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f27 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27) ((java.util.HashMap) bt4.f.b().f106003a).get(str2);
            if (c19101x8593f27 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19101x8593f27.f261368h)) {
                arrayList = new java.util.ArrayList();
                arrayList.add(c19101x8593f27.f261368h);
            }
        } else {
            bt4.f b17 = bt4.f.b();
            b17.getClass();
            arrayList = new java.util.ArrayList();
            for (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f272 : ((java.util.HashMap) b17.f106003a).values()) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19101x8593f272.f261368h)) {
                    arrayList.add(c19101x8593f272.f261368h);
                }
            }
            arrayList.size();
        }
        if (arrayList != null && arrayList.size() > 0) {
            java.lang.String str4 = "";
            for (java.lang.String str5 : arrayList) {
                r45.du5 du5Var = new r45.du5();
                du5Var.c(str5);
                linkedList.add(du5Var);
                str4 = str4 + "; + " + str5;
            }
        }
        tk3Var.f468052f = linkedList;
        tk3Var.f468051e = linkedList.size();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            tk3Var.f468053g = java.lang.String.format("tpa_country=%s", java.lang.Integer.valueOf(i17));
        } else {
            tk3Var.f468053g = java.lang.String.format("%s&tpa_country=%s", str3, java.lang.Integer.valueOf(i17));
        }
        tk3Var.f468054h = i18;
    }
}
