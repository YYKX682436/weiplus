package com.tencent.mm.plugin.appbrand.jsapi.h5_interact;

/* loaded from: classes7.dex */
public class e extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 459;
    private static final java.lang.String NAME = "sendDataToH5";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (!jSONObject.has("webviewId")) {
            c0Var.a(i17, o("fail:invalid data"));
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiSendDataToH5", "invoke with nil webviewId");
            return;
        }
        java.lang.String appId = c0Var.getAppId();
        int optInt = jSONObject.optInt("webviewId");
        java.lang.String optString = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToH5FromMiniProgramEvent sendDataToH5FromMiniProgramEvent = new com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToH5FromMiniProgramEvent();
        sendDataToH5FromMiniProgramEvent.f81268g = appId;
        sendDataToH5FromMiniProgramEvent.f81269h = optString;
        sendDataToH5FromMiniProgramEvent.f81270i = optInt;
        if (com.tencent.mm.pluginsdk.model.g4.b()) {
            ((h80.k) ((com.tencent.mm.ipcinvoker.wx_extension.j0) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.j0.class))).getClass();
            com.tencent.mm.ipcinvoker.d0.e(com.tencent.mm.ipcinvoker.wx_extension.service.MainProcessIPCService.f68459e, sendDataToH5FromMiniProgramEvent, com.tencent.mm.plugin.appbrand.jsapi.h5_interact.d.class, null, null);
        } else {
            ((h80.k) ((com.tencent.mm.ipcinvoker.wx_extension.j0) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.j0.class))).getClass();
            com.tencent.mm.ipcinvoker.d0.e(com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService.f68462e, sendDataToH5FromMiniProgramEvent, com.tencent.mm.plugin.appbrand.jsapi.h5_interact.d.class, null, null);
        }
        c0Var.a(i17, o("ok"));
    }
}
