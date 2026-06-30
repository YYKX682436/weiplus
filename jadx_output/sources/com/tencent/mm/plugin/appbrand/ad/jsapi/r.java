package com.tencent.mm.plugin.appbrand.ad.jsapi;

/* loaded from: classes.dex */
public final class r extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1170;
    public static final java.lang.String NAME = "getAdPushMsg";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.m mVar = (com.tencent.mm.plugin.appbrand.jsapi.m) lVar;
        if (com.tencent.mm.sdk.platformtools.t8.K0(jSONObject != null ? jSONObject.optString("slotid") : null) && mVar != null) {
            java.lang.String str = android.text.TextUtils.isEmpty("no slotid") ? "fail:jsapi invalid request data" : "no slotid";
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            mVar.a(i17, u(str, jSONObject2));
        }
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(jSONObject != null ? jSONObject.optString("slotid") : null), com.tencent.mm.plugin.appbrand.ad.jsapi.p.class, new com.tencent.mm.plugin.appbrand.ad.jsapi.q(mVar, i17, this));
    }
}
