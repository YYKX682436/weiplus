package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd;

/* loaded from: classes7.dex */
public abstract class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0;
        java.lang.String str;
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandPluginAsyncJsApi", "component is null");
            return;
        }
        int D = D(jSONObject);
        if (D == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandPluginAsyncJsApi", "no viewId in data");
            str = android.text.TextUtils.isEmpty("fail:no viewId in data") ? "fail:internal error" : "fail:no viewId in data";
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str, jSONObject2));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t mo50357xcd94f799 = lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 ? lVar.mo50357xcd94f799() : (!(lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) || (V0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar).V0()) == null) ? null : V0.mo50357xcd94f799();
        if (E(lVar, jSONObject, i17)) {
            return;
        }
        sf.g gVar = mo50357xcd94f799 != null ? (sf.g) mo50357xcd94f799.h0(sf.g.class) : null;
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandPluginAsyncJsApi", "invalid js runtime");
            str = android.text.TextUtils.isEmpty("fail:invalid runtime") ? "fail:internal error" : "fail:invalid runtime";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, u(str, jSONObject3));
            return;
        }
        gg.c mo52236xa4c58e8d = gVar.mo52236xa4c58e8d();
        if (mo52236xa4c58e8d != null) {
            ((gg.a) mo52236xa4c58e8d).e(C(), D, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b(i17, jSONObject, lVar, this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandPluginAsyncJsApi", "webview has no plugin client");
        str = android.text.TextUtils.isEmpty("fail:webview has no plugin client") ? "fail:internal error" : "fail:webview has no plugin client";
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        try {
            jSONObject4.put("errno", 4);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        lVar.a(i17, u(str, jSONObject4));
    }

    public abstract java.lang.String C();

    public int D(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return -1;
        }
        return jSONObject.optInt("viewId", -1);
    }

    public boolean E(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        return false;
    }
}
