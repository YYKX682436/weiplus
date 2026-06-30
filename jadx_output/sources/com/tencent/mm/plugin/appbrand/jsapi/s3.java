package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes4.dex */
public final class s3 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 875;
    public static final java.lang.String NAME = "bindGroup";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String appId = lVar != null ? lVar.getAppId() : null;
        if (appId == null || appId.length() == 0) {
            if (lVar != null) {
                lVar.a(i17, o("fail:appId is null"));
                return;
            }
            return;
        }
        java.lang.String optString = jSONObject != null ? jSONObject.optString("signature") : null;
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("groupId") : null;
        java.lang.String optString3 = jSONObject != null ? jSONObject.optString("nonceStr") : null;
        vg3.i3 i3Var = new vg3.i3();
        i3Var.f436712d = appId;
        i3Var.f436715g = optString;
        i3Var.f436713e = optString2;
        i3Var.f436714f = optString3;
        ((hn.s) ((vg3.k3) i95.n0.c(vg3.k3.class))).Ai(lVar.getContext(), i3Var, new com.tencent.mm.plugin.appbrand.jsapi.r3(lVar, i17, this));
    }
}
