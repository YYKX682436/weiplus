package com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi;

/* loaded from: classes7.dex */
public final class i extends com.tencent.mm.plugin.appbrand.jsapi.channels.i0 {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.channels.i0, com.tencent.mm.plugin.appbrand.jsapi.channels.m
    public void C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i17) {
        if (jSONObject2 == null) {
            jSONObject2 = new org.json.JSONObject();
        }
        java.lang.String optString = jSONObject != null ? jSONObject.optString("appId", "") : null;
        jSONObject2.put("appId", optString != null ? optString : "");
        super.C(lVar, jSONObject, jSONObject2, i17);
    }
}
