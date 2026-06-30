package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes.dex */
public final class q0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1394;
    public static final java.lang.String NAME = "shareFinderOrder";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Finder.JsApiShareFinderOrder", "invoke, env is null");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Finder.JsApiShareFinderOrder", "invoke, data is null");
            e9Var.a(i17, o("fail:data is null"));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiShareFinderOrder", "invoke with params " + jSONObject);
            new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderOrder$ShareFinderOrderTask(e9Var, jSONObject, i17).d();
        }
    }
}
