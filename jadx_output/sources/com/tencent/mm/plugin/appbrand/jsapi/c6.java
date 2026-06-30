package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes4.dex */
public class c6 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 711;
    public static final java.lang.String NAME = "getOAID";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String k96 = ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).k9();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetOAID", "AppBrand getOAID, oaid=" + k96);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1896, 22);
        if (com.tencent.mm.sdk.platformtools.t8.K0(k96)) {
            lVar.a(i17, o("fail"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("result", k96);
        lVar.a(i17, p("ok", hashMap));
    }
}
