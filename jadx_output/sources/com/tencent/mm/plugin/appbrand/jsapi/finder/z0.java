package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public final class z0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1139;
    public static final java.lang.String NAME = "shareFinderShop";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Finder.JsApiShareFinderShop", "invoke, env is null");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Finder.JsApiShareFinderShop", "invoke, data is null");
            e9Var.a(i17, o("fail:data is null"));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderShop$ShareFinderShopRequest jsApiShareFinderShop$ShareFinderShopRequest = new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderShop$ShareFinderShopRequest();
        jsApiShareFinderShop$ShareFinderShopRequest.b(jSONObject.toString());
        com.tencent.mm.plugin.appbrand.jsapi.finder.y0 y0Var = new com.tencent.mm.plugin.appbrand.jsapi.finder.y0(e9Var, i17, this);
        android.content.Context f147807d = e9Var.getF147807d();
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(f147807d, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, jsApiShareFinderShop$ShareFinderShopRequest, y0Var, null);
    }
}
