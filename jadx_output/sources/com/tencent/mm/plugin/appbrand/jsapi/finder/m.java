package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public class m extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "endorsementFinished";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiFinderEndorsementFinished", NAME);
        if (jSONObject == null) {
            e9Var.a(i17, "fail:data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("finderUserName", "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            e9Var.a(i17, "fail:finderUserName is null");
        } else {
            new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiFinderEndorsementFinished$FinderUserPageTask(optString).d();
        }
    }
}
