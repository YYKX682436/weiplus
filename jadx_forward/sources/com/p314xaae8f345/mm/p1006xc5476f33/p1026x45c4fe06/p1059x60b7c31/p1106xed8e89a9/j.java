package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9;

/* loaded from: classes7.dex */
public abstract class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: g, reason: collision with root package name */
    public int f164342g = 3;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f164343h;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        ((mq0.s0) ((mq0.d0) i95.n0.c(mq0.d0.class))).wi(mq0.g0.f412097m);
        D(lVar, jSONObject, mq0.z.f412180u, "");
        if (lVar == null) {
            return;
        }
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.OpenWeComUserProfile", "invoke, context is null");
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str2, jSONObject2));
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.OpenWeComUserProfile", "invoke, data is null");
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, u(str2, jSONObject3));
            return;
        }
        this.f164342g = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 3);
        this.f164343h = jSONObject.optString("bizInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OpenWeComUserProfile", "invoke, data: " + jSONObject);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c C = C(lVar, jSONObject, i17);
        if (C == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.i iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.i(this, lVar, i17, jSONObject);
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(mo50352x76847179, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, C, iVar, null);
    }

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17);

    public final void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, mq0.z zVar, java.lang.String str) {
        java.lang.String optString;
        if (jSONObject != null) {
            try {
                optString = jSONObject.optString("bizInfo", "");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBADFullLinkReporter", "[MBAd] report full-link failed", e17);
                return;
            }
        } else {
            optString = null;
        }
        if (optString == null) {
            optString = "";
        }
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("traceId", "") : null;
        java.lang.String str2 = optString2 == null ? "" : optString2;
        java.lang.String optString3 = jSONObject != null ? jSONObject.optString("frameSetName", "") : null;
        java.lang.String str3 = optString3 == null ? "" : optString3;
        java.lang.String optString4 = jSONObject != null ? jSONObject.optString("implType", "") : null;
        java.lang.String str4 = optString4 == null ? "" : optString4;
        java.lang.String optString5 = jSONObject != null ? jSONObject.optString("bizName", "") : null;
        java.lang.String str5 = optString5 == null ? "" : optString5;
        java.lang.String optString6 = jSONObject != null ? jSONObject.optString("bizScene", "") : null;
        java.lang.String str6 = optString6 == null ? "" : optString6;
        mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
        if (c0Var == null) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("apiName", "openWeComUserProfile");
        boolean z17 = true;
        if (optString.length() > 0) {
            linkedHashMap.put("uxinfo", optString);
        }
        if (str.length() <= 0) {
            z17 = false;
        }
        if (z17) {
            linkedHashMap.put("errMsg", str);
        }
        mq0.c0.ig(c0Var, zVar, str5, str6, str2, str3, str4, null, linkedHashMap, 64, null);
    }
}
