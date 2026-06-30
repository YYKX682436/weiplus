package com.tencent.mm.plugin.appbrand.jsapi.webrtc;

/* loaded from: classes7.dex */
public class v extends gb1.h {
    public static final int CTRL_INDEX = 1119;
    public static final java.lang.String NAME = "updateWebRTCRendererView";

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data.getInt("viewId");
    }

    @Override // gb1.h
    public boolean K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.luggage.sdk.jsapi.component.service.y v37;
        com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime;
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var;
        com.tencent.luggage.sdk.jsapi.component.b bVar = (com.tencent.luggage.sdk.jsapi.component.b) tVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateWebRTCRendererView", "hy: try update webrtc view " + i17);
        if (bVar == null || (v37 = bVar.v3()) == null || (jsRuntime = v37.getJsRuntime()) == null || (f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) jsRuntime.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class)) == null) {
            return true;
        }
        f0Var.post(new com.tencent.mm.plugin.appbrand.jsapi.webrtc.u(view, jSONObject, bVar, this));
        return true;
    }

    public void M(com.tencent.mm.plugin.appbrand.jsapi.l appBrandComponent, org.webrtc.VideoSink videoSink, com.tencent.mm.plugin.appbrand.jsapi.webrtc.i0 videoSinkErrCode, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(appBrandComponent, "appBrandComponent");
        kotlin.jvm.internal.o.g(videoSink, "videoSink");
        kotlin.jvm.internal.o.g(videoSinkErrCode, "videoSinkErrCode");
    }
}
