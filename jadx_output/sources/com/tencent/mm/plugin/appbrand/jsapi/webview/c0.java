package com.tencent.mm.plugin.appbrand.jsapi.webview;

/* loaded from: classes7.dex */
public class c0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1418;
    private static final java.lang.String NAME = "translateHTMLWebView";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.o6 t37;
        com.tencent.mm.plugin.appbrand.o6 t38;
        com.tencent.mm.plugin.appbrand.page.d5 x07;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mars.xlog.Log.i("Luggage.JsApiTranslateHTMLWebView", "translateHTMLWebView data: " + jSONObject);
        boolean optBoolean = jSONObject != null ? jSONObject.optBoolean("translate", true) : true;
        com.tencent.mm.plugin.appbrand.page.v5 pageView = (c0Var == null || (t38 = c0Var.t3()) == null || (x07 = t38.x0()) == null) ? null : x07.getPageView();
        kotlin.jvm.internal.o.e(pageView, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.page.AppBrandPageViewWC");
        of1.w1 s37 = ((com.tencent.mm.plugin.appbrand.page.n7) pageView).s3();
        if (c0Var == null || (t37 = c0Var.t3()) == null) {
            return;
        }
        t37.m(new com.tencent.mm.plugin.appbrand.jsapi.webview.b0(optBoolean, s37, c0Var, i17, this));
    }
}
