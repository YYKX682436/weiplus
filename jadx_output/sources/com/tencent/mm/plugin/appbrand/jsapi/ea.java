package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class ea extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1028;
    private static final java.lang.String NAME = "openTextStateMessage";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.JsApiOpenTextStateMessage", "invoke JsApiOpenTextStateMessage! " + data);
        if ((lVar != null ? lVar.getContext() : null) == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenTextStateMessage$OpenTextStateRequest jsApiOpenTextStateMessage$OpenTextStateRequest = new com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenTextStateMessage$OpenTextStateRequest();
        org.json.JSONObject optJSONObject = data.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        jsApiOpenTextStateMessage$OpenTextStateRequest.b(optJSONObject != null ? optJSONObject.toString() : null);
        com.tencent.mm.plugin.appbrand.jsapi.da daVar = new com.tencent.mm.plugin.appbrand.jsapi.da(lVar, i17, this);
        android.content.Context context = lVar.getContext();
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, jsApiOpenTextStateMessage$OpenTextStateRequest, daVar, null);
    }
}
