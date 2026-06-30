package k91;

/* loaded from: classes4.dex */
public class m4 extends k91.j4 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f387212e = {l75.n0.m145250x3fdc6f77(k91.v5.E1, "WxaAttributesTable")};

    public m4(l75.k0 k0Var) {
        super(k0Var, "WxaAttributesTable", dm.vc.F);
        if (!D0() || gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.APPBRAND_SHORTCUT_URL_UPGRADE_FIXED_BOOLEAN_SYNC, false)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaAttributeDesktopURLFix", "before fix");
        android.database.Cursor f17 = k0Var.f("select appInfo from WxaAttributesTable", null, 2);
        if (f17 == null || f17.isClosed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.WxaAttributeDesktopURLFix", "try fix but db not working");
            return;
        }
        if (f17.moveToFirst()) {
            java.util.LinkedList<android.util.Pair> linkedList = new java.util.LinkedList();
            do {
                java.lang.String string = f17.getString(0);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                        java.lang.String optString = jSONObject.optString("Appid");
                        java.lang.String optString2 = jSONObject.optString("RoundedSquareIconUrl");
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                            android.content.ContentValues contentValues = new android.content.ContentValues(1);
                            contentValues.put("roundedSquareIconURL", optString2);
                            linkedList.add(android.util.Pair.create(optString, contentValues));
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
            } while (f17.moveToNext());
            f17.close();
            long F = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            for (android.util.Pair pair : linkedList) {
                k0Var.p("WxaAttributesTable", (android.content.ContentValues) pair.second, "appId=?", new java.lang.String[]{(java.lang.String) pair.first});
            }
            k0Var.w(java.lang.Long.valueOf(F));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaAttributeDesktopURLFix", "fix done");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaAttributeDesktopURLFix", "no contacts available");
        }
        if (!f17.isClosed()) {
            f17.close();
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.APPBRAND_SHORTCUT_URL_UPGRADE_FIXED_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
    }

    public static void z1(k91.m4 m4Var, k91.v5 v5Var) {
        m4Var.getClass();
        if (gm0.j1.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c2 c2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c2();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v5Var.f68904x28d45f97)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaAttrStorageWC", "update mess info, appId is null");
                return;
            }
            c2Var.f66029x28d45f97 = v5Var.f68904x28d45f97;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(v5Var.f68905x453b082a);
                c2Var.f66033xb52fe423 = jSONObject.optInt("WechatPluginApp", 0);
                c2Var.f66030xec8a2093 = jSONObject.optInt("AppServiceType", 0);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaAttrStorageWC", "parse app info json error", e17);
            }
            try {
                org.json.JSONObject optJSONObject = new org.json.JSONObject(v5Var.f68911x5c4f59c8).optJSONObject("NewSetting");
                if (optJSONObject != null) {
                    c2Var.f66032x28f6ab61 = optJSONObject.optInt("Uint32MaxFileStorageSizeInMB", 10);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaAttrStorageWC", "can't fetch new setting field from json");
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaAttrStorageWC", "parse dynamic info json error", e18);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d2 d2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d2.class);
            d2Var.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c2Var.f66029x28d45f97)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMessInfoStorage", "update info, appId is null");
                return;
            }
            boolean z17 = d2Var.get(c2Var, new java.lang.String[0]);
            c2Var.f66029x28d45f97 = c2Var.f66029x28d45f97;
            c2Var.f66033xb52fe423 = c2Var.f66033xb52fe423;
            c2Var.f66030xec8a2093 = c2Var.f66030xec8a2093;
            c2Var.f66032x28f6ab61 = c2Var.f66032x28f6ab61;
            if (z17) {
                d2Var.mo9952xce0038c9(c2Var, new java.lang.String[0]);
            } else {
                d2Var.mo880xb970c2b9(c2Var);
            }
        }
    }

    public void C1(k91.v5 v5Var) {
        boolean z17;
        if (gm0.j1.a()) {
            java.lang.String str = v5Var.f68924xdec927b;
            java.lang.String str2 = v5Var.f68913x21f9b213;
            java.lang.String str3 = v5Var.f68907x6b8edeb4;
            java.lang.String str4 = v5Var.f68920x68aa7b8d;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(str);
            boolean z18 = false;
            boolean z19 = true;
            if (n07 == null) {
                n07 = new com.p314xaae8f345.mm.p943x351df9c2.r0();
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (!(str4 == null ? "" : str4).equals(n07.d())) {
                n07.f152065d = str4;
                z17 = true;
            }
            if (!(str3 != null ? str3 : "").equals(n07.c())) {
                n07.f152066e = str3;
                z17 = true;
            }
            if (z17) {
                n07.f152062a = str;
                n07.f152067f = 1;
                n07.f152070i = 31;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(n07);
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (n17 == null) {
                n17 = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            }
            if (((int) n17.E2) == 0) {
                n17.X1(str);
                z18 = true;
            }
            if (str2.equals(n17.P0())) {
                z19 = z18;
            } else {
                n17.M1(str2);
                try {
                    n17.R1(x51.k.b(str2));
                } catch (java.lang.UnsatisfiedLinkError unused) {
                }
                try {
                    n17.S1(x51.k.a(str2));
                } catch (java.lang.UnsatisfiedLinkError unused2) {
                }
            }
            if (z19) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().m0(n17);
            }
        }
    }

    @Override // k91.j4, l75.n0, l75.g0
    /* renamed from: J0 */
    public boolean mo49766xb06685ab(k91.v5 v5Var, boolean z17, java.lang.String... strArr) {
        k91.v5 v5Var2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v5Var.f68924xdec927b)) {
            v5Var2 = null;
        } else {
            v5Var.f68925x483b1229 = v5Var.f68924xdec927b.hashCode();
            v5Var2 = n1(v5Var.f68924xdec927b, "appId");
        }
        boolean mo49766xb06685ab = super.mo49766xb06685ab(v5Var, z17, strArr);
        if (mo49766xb06685ab && v5Var2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v5Var2.f68904x28d45f97)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d2.class)).D0(v5Var2.f68904x28d45f97);
        }
        return mo49766xb06685ab;
    }

    @Override // k91.j4
    public boolean W0(java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.util.List list, boolean z17) {
        if (!gm0.j1.b().f354787q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAttrStorageWC", "flushAttrs username[%s], account().isInitializedNotifyAllDone()==FALSE", str);
            return false;
        }
        boolean W0 = super.W0(str, gVar, list, z17);
        if (W0) {
            ((ku5.t0) ku5.t0.f394148d).h(new k91.n4(this, str), "MicroMsg.WxaAttrStorageWCTHREAD_TAG_POST_FLUSH_ATTRS");
        }
        return W0;
    }

    @Override // l75.s0, l75.l0
    public void add(l75.q0 q0Var) {
        super.add("MicroMsg.WxaAttrStorageWC.WORKER", q0Var);
    }

    @Override // k91.j4
    public boolean y0(final k91.v5 v5Var, final r45.yc7 yc7Var) {
        boolean y07 = super.y0(v5Var, yc7Var);
        if (y07 && "WxaAppInfo".equals(yc7Var.f472504d)) {
            java.lang.String str = v5Var.f68904x28d45f97;
            java.lang.String str2 = yc7Var.f472505e;
            ((ku5.t0) ku5.t0.f394148d).h(new k91.o4(this, str2, str), "MicroMsg.WxaAttrStorageWCTHREAD_TAG_POST_FLUSH_ATTRS");
        } else if (y07 && "PassThroughInfo".equals(yc7Var.f472504d) && !android.text.TextUtils.isEmpty(yc7Var.f472505e)) {
            ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: k91.m4$$a
                @Override // java.lang.Runnable
                public final void run() {
                    r45.yc7 yc7Var2 = r45.yc7.this;
                    k91.v5 v5Var2 = v5Var;
                    try {
                        java.lang.String optString = new org.json.JSONObject(yc7Var2.f472505e).optString("expt_info");
                        if (android.text.TextUtils.isEmpty(optString)) {
                            return;
                        }
                        ((k91.x3) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(k91.x3.class)).J0(v5Var2.f68904x28d45f97, optString, k91.u3.f387314g);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAttrStorageWC", "try updateExptInfo from attr(%s), get exception:%s", v5Var2.f68904x28d45f97, e17);
                    }
                }
            }, "MicroMsg.WxaAttrStorageWCTHREAD_TAG_POST_FLUSH_ATTRS");
        }
        return y07;
    }
}
