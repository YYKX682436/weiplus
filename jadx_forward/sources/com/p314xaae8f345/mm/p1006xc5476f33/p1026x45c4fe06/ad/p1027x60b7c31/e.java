package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31;

/* loaded from: classes7.dex */
public final class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f33379x366c91de = 1253;

    /* renamed from: NAME */
    public static final java.lang.String f33380x24728b = "enableSplashAdHotStart";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        if (c0Var == null || jSONObject == null) {
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("isShow");
        long optLong = jSONObject.optLong("intervalThreshold");
        i81.z zVar = i81.a0.f371049c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = c0Var.t3();
        i81.e eVar = t37 == null ? null : zVar.a(t37).f371052a;
        if (eVar != null) {
            eVar.f371112w = optBoolean;
            eVar.f371113x = optLong;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            eVar.f371111v = java.lang.System.currentTimeMillis();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[AppBrandSplashAd] enable ad hot start, isShow = ");
        sb6.append(optBoolean);
        sb6.append(", intervalThreshold = ");
        sb6.append(optLong);
        sb6.append(", hotStartBaselineTime = ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t38 = c0Var.t3();
        i81.e eVar2 = t38 == null ? null : zVar.a(t38).f371052a;
        sb6.append(eVar2 != null ? java.lang.Long.valueOf(eVar2.f371111v) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiEnableSplashAdHotStart", sb6.toString());
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        c0Var.a(i17, u(str, jSONObject2));
    }
}
