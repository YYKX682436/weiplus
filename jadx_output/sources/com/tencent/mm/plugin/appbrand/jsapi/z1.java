package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class z1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 435;
    public static final java.lang.String NAME = "adDataReport";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject d17 = com.tencent.mm.plugin.appbrand.l.d(lVar.getAppId());
        if (d17 != null) {
            optString = d17.f87790f + "," + d17.f87791g + "," + d17.f87788d + "," + d17.f87789e + "," + jSONObject.optString("adInfo");
        } else {
            optString = jSONObject.optString("adInfo");
        }
        com.tencent.mm.plugin.appbrand.report.model.f.a(15175, optString + "," + wo.w0.g(false), new com.tencent.mm.plugin.appbrand.jsapi.y1(this, lVar, i17));
    }
}
