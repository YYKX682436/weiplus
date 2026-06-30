package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class zf extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v25, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r12v38, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.StringBuilder] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public java.lang.String A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y env, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var) {
        org.json.JSONObject jSONObject2;
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 c3899xf952a052;
        java.lang.String str;
        java.lang.String str2;
        org.json.JSONObject jSONObject3;
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 c3899xf952a0522;
        ?? r122;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        java.lang.String optString = jSONObject != null ? jSONObject.optString("experimentType") : null;
        if (!u46.l.c("opConfig", optString)) {
            if (!u46.l.c("globalExpt", optString)) {
                java.lang.String z17 = super.z(env, jSONObject);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z17, "invoke(...)");
                return z17;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = env.mo32091x9a3f0ba2();
            if (mo32091x9a3f0ba2 == null || (c3899xf952a052 = (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052) mo32091x9a3f0ba2.p0(com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052.class, false)) == null || (str = c3899xf952a052.A.f128842o) == null) {
                jSONObject2 = new org.json.JSONObject();
            } else {
                try {
                    if (android.text.TextUtils.isEmpty(str)) {
                        jSONObject2 = new org.json.JSONObject();
                    } else {
                        jSONObject2 = new org.json.JSONObject(str);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAJsApiGetABTestConfig", "getGlobalExpt, sysConfig return " + jSONObject2);
                    }
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAJsApiGetABTestConfig", "getGlobalExpt, parse " + str + " from sysConfig get exception:" + e17);
                    jSONObject2 = null;
                }
            }
            if (jSONObject2 != null) {
                java.util.HashMap i17 = kz5.c1.i(new jz5.l("globalExpt", jSONObject2));
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                i17.put("errno", 0);
                java.lang.String t17 = t("ok", i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t17);
                return t17;
            }
            r13 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            if (r13 == null) {
                r13 = "";
            }
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            java.lang.String u17 = u(r13, jSONObject4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u17);
            return u17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba22 = env.mo32091x9a3f0ba2();
        if (mo32091x9a3f0ba22 == null || (c3899xf952a0522 = (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052) mo32091x9a3f0ba22.p0(com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052.class, false)) == null || (r122 = c3899xf952a0522.A.f128836f) == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba23 = env.mo32091x9a3f0ba2();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 u07 = mo32091x9a3f0ba23 != null ? mo32091x9a3f0ba23.u0() : null;
            com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 c3897xbc286aa1 = u07 instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 ? (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) u07 : null;
            if (c3897xbc286aa1 == null || (str2 = c3897xbc286aa1.R1) == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var2 = env instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) env : null;
                if (c0Var2 != null) {
                    r13 = c0Var2.U1();
                }
            } else {
                r13 = str2;
            }
            if (r13 == null || r13.length() == 0) {
                jSONObject3 = new org.json.JSONObject();
            } else {
                try {
                    ?? jSONObject5 = new org.json.JSONObject(r13);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAJsApiGetABTestConfig", "getOpConfig(" + env.mo48798x74292566() + "), initConfig return " + r13);
                    r13 = jSONObject5;
                } catch (org.json.JSONException e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAJsApiGetABTestConfig", "getOpConfig(" + env.mo48798x74292566() + "), parse " + r13 + " from initConfig get exception:" + e19);
                }
                org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                jSONObject6.put("expt_info", r13);
                jSONObject3 = jSONObject6;
            }
        } else {
            try {
                org.json.JSONObject jSONObject7 = new org.json.JSONObject((java.lang.String) r122);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAJsApiGetABTestConfig", "getOpConfig(" + env.mo48798x74292566() + "), sysConfig return " + jSONObject7);
                jSONObject3 = jSONObject7;
            } catch (org.json.JSONException e27) {
                if (!android.text.TextUtils.isEmpty(r122)) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6313x17a23219 c6313x17a23219 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6313x17a23219();
                    c6313x17a23219.p("opconfig|".concat(r122));
                    c6313x17a23219.k();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAJsApiGetABTestConfig", "getOpConfig(" + env.mo48798x74292566() + "), parse " + r122 + " from sysConfig get exception:" + e27);
                jSONObject3 = r122;
            }
        }
        java.util.HashMap i18 = kz5.c1.i(new jz5.l("opConfig", jSONObject3));
        java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        i18.put("errno", 0);
        java.lang.String t18 = t("ok", i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t18);
        return t18;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y service = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        return A(service, jSONObject, service.getF229341e());
    }
}
