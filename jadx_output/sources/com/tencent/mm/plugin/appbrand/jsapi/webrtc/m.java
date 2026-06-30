package com.tencent.mm.plugin.appbrand.jsapi.webrtc;

/* loaded from: classes7.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f83849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f83850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.b f83851f;

    public m(android.view.View view, org.json.JSONObject jSONObject, com.tencent.luggage.sdk.jsapi.component.b bVar) {
        this.f83849d = view;
        this.f83850e = jSONObject;
        this.f83851f = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.jsapi.webrtc.i0 i0Var;
        android.view.KeyEvent.Callback callback = this.f83849d;
        kotlin.jvm.internal.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.webrtc.IWebRTCVideoSinkProvider");
        org.webrtc.VideoSink videoSink = ((com.tencent.mm.plugin.appbrand.jsapi.webrtc.c) ((com.tencent.mm.plugin.appbrand.jsapi.webrtc.b) callback)).f83799d;
        if (videoSink != null) {
            i0Var = com.tencent.mm.plugin.appbrand.jsapi.webrtc.k0.f83847a.a(this.f83850e, videoSink, this.f83851f, com.tencent.mm.plugin.appbrand.jsapi.webrtc.j0.f83841e);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRemoveWebRTCRendererView", "hy: webrtc update webrtc video sink with errcode " + i0Var);
        } else {
            i0Var = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRemoveWebRTCRendererView", "hy: webrtc remove result is " + i0Var);
    }
}
