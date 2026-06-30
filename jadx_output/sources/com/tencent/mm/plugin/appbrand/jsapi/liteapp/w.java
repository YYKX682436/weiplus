package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes7.dex */
public final class w extends gb1.f {
    public static final int CTRL_INDEX = 1333;
    public static final java.lang.String NAME = "removeLiteAppView";

    @Override // gb1.f, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRemoveLiteAppView", "invoke");
        B(lVar, data, i17, lVar.getJsRuntime());
    }

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data.getInt("viewId");
    }

    @Override // gb1.f
    public boolean J(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRemoveLiteAppView", "onRemoveView(viewId : %s, %s)", java.lang.Integer.valueOf(i17), jSONObject);
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer");
        com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView = (com.tencent.liteapp.ui.WxaLiteAppBaseView) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(com.tencent.liteapp.ui.WxaLiteAppBaseView.class);
        if (wxaLiteAppBaseView == null) {
            return true;
        }
        wxaLiteAppBaseView.g();
        return true;
    }
}
