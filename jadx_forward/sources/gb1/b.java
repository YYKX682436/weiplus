package gb1;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f351509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 f351510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gb1.n f351511f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f351512g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gb1.d f351513h;

    public b(gb1.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var, gb1.n nVar, org.json.JSONObject jSONObject) {
        this.f351513h = dVar;
        this.f351509d = tVar;
        this.f351510e = c0Var;
        this.f351511f = nVar;
        this.f351512g = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        boolean z17;
        gb1.n nVar;
        java.lang.String str2;
        boolean z18;
        java.lang.String str3;
        android.view.View view;
        int i17;
        gb1.d dVar;
        gb1.n nVar2;
        java.lang.String str4;
        int i18;
        java.lang.Boolean bool;
        java.lang.Boolean bool2;
        java.lang.String str5;
        org.json.JSONObject jSONObject = this.f351512g;
        gb1.d dVar2 = this.f351513h;
        java.lang.String k17 = dVar2.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = this.f351509d;
        if (!tVar.c(k17, this.f351510e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseInsertViewJsApi", "fail, component is not running");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s mo51311x3eebbc35 = tVar.mo51311x3eebbc35();
        gb1.n nVar3 = this.f351511f;
        if (mo51311x3eebbc35 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseInsertViewJsApi", "fail, component custom view container is null");
            str5 = android.text.TextUtils.isEmpty("fail:insert view failed") ? "fail:internal error" : "fail:insert view failed";
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            nVar3.a(dVar2.u(str5, jSONObject2));
            return;
        }
        try {
            int H = dVar2.H(jSONObject);
            android.view.View L = dVar2.L(tVar, jSONObject, H);
            if (L == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseInsertViewJsApi", "inflate view return null.");
                str5 = android.text.TextUtils.isEmpty("fail:inflate view failed") ? "fail:internal error" : "fail:inflate view failed";
                java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 4);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                nVar3.a(dVar2.u(str5, jSONObject3));
                return;
            }
            boolean optBoolean = jSONObject.optBoolean("independent", false);
            if ((L instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) && jSONObject.has("draggable")) {
                boolean optBoolean2 = jSONObject.optBoolean("draggable", false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505 c12072x6098f505 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) L;
                str = "fail:internal error";
                java.lang.String e19 = c75.c.e(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                c12072x6098f505.f162167o = optBoolean2;
                c12072x6098f505.f162169q = H;
                java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505.C;
                if (optBoolean2) {
                    c12072x6098f505.f162168p = e19;
                    hashMap.put(java.lang.Integer.valueOf(H), c12072x6098f505);
                } else {
                    hashMap.remove(java.lang.Integer.valueOf(H));
                }
                c12072x6098f505.m50857xad26eb98(jSONObject.optString("dragConfig"));
            } else {
                str = "fail:internal error";
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia) tVar.M(optBoolean)).p(H) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseInsertViewJsApi", "insert view(%d) failed, it has been inserted before.", java.lang.Integer.valueOf(H));
                java.lang.String str8 = android.text.TextUtils.isEmpty("fail:the view has already exist") ? str : "fail:the view has already exist";
                java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                try {
                    jSONObject4.put("errno", 4);
                } catch (java.lang.Exception e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                }
                nVar3.a(dVar2.u(str8, jSONObject4));
                return;
            }
            nVar3.f351531c = L;
            int optInt = jSONObject.optInt("parentId", 0);
            try {
                float[] F = dVar2.F(jSONObject);
                try {
                    i18 = jSONObject.getBoolean("hide") ? 4 : 0;
                } catch (org.json.JSONException unused) {
                    i18 = -1;
                }
                try {
                    bool = java.lang.Boolean.valueOf(jSONObject.getBoolean("fixed"));
                } catch (org.json.JSONException unused2) {
                    bool = null;
                }
                try {
                    bool2 = java.lang.Boolean.valueOf(jSONObject.getBoolean("fullscreen"));
                } catch (org.json.JSONException unused3) {
                    bool2 = null;
                }
                java.lang.Boolean G = dVar2.G(jSONObject);
                z17 = tVar.M(optBoolean).c(L, H, optInt, F, i18, bool != null && bool.booleanValue(), bool2 != null && bool2.booleanValue(), G != null && G.booleanValue());
            } catch (org.json.JSONException e28) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseInsertViewJsApi", "parse position error. Exception :%s", e28);
                z17 = false;
            }
            boolean M = dVar2.M();
            if (z17) {
                if (dVar2.I()) {
                    c01.l2 b17 = tVar.M(optBoolean).b(H, true);
                    nVar = nVar3;
                    str2 = "errno";
                    z18 = false;
                    b17.j("disableScroll", jSONObject.optBoolean("disableScroll", false));
                    b17.j("enableLongClick", dVar2.J());
                    b17.k(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, c75.c.e(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306));
                    if (jSONObject.optBoolean("gesture", false)) {
                        L.setOnTouchListener(new if1.l(tVar, b17));
                    }
                } else {
                    nVar = nVar3;
                    str2 = "errno";
                    z18 = false;
                }
                if (M) {
                    this.f351513h.O(this.f351509d, H, L, this.f351512g, this.f351511f);
                } else {
                    dVar2.N(tVar, H, L, jSONObject);
                }
            } else {
                nVar = nVar3;
                str2 = "errno";
                z18 = false;
            }
            c01.l2 b18 = tVar.M(optBoolean).b(H, true);
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w) b18.c("baseViewDestroyListener", null)) == null) {
                str3 = null;
                view = L;
                i17 = H;
                nVar2 = nVar;
                dVar = dVar2;
                str4 = str2;
                gb1.c cVar = new gb1.c(dVar2, tVar, optBoolean, i17, b18);
                b18.i("baseViewDestroyListener", cVar);
                tVar.w(cVar);
            } else {
                str3 = null;
                view = L;
                i17 = H;
                dVar = dVar2;
                nVar2 = nVar;
                str4 = str2;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseInsertViewJsApi", "insert view(parentId : %s, viewId : %s, view : %s, r : %s)", java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(view.hashCode()), java.lang.Boolean.valueOf(z17));
            if (M) {
                return;
            }
            if (z17) {
                java.lang.String str10 = android.text.TextUtils.isEmpty(str3) ? "ok" : str3;
                if (str10 == null) {
                    str10 = "";
                }
                java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                try {
                    jSONObject5.put(str4, 0);
                } catch (java.lang.Exception e29) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e29);
                }
                nVar2.a(dVar.u(str10, jSONObject5));
                return;
            }
            gb1.d dVar3 = dVar;
            gb1.n nVar4 = nVar2;
            java.lang.String str12 = android.text.TextUtils.isEmpty("fail:insert view fail") ? str : "fail:insert view fail";
            java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            try {
                jSONObject6.put(str4, 4);
            } catch (java.lang.Exception e37) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e37);
            }
            nVar4.a(dVar3.u(str12, jSONObject6));
        } catch (org.json.JSONException unused4) {
            java.lang.String str14 = android.text.TextUtils.isEmpty("fail:invalid view id") ? "fail:internal error" : "fail:invalid view id";
            java.lang.String str15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject7 = new org.json.JSONObject();
            try {
                jSONObject7.put("errno", 4);
            } catch (java.lang.Exception e38) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e38);
            }
            nVar3.a(dVar2.u(str14, jSONObject7));
        }
    }
}
