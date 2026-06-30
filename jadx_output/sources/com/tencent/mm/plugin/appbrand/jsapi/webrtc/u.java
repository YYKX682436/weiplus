package com.tencent.mm.plugin.appbrand.jsapi.webrtc;

/* loaded from: classes7.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f83858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f83859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.b f83860f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.webrtc.v f83861g;

    public u(android.view.View view, org.json.JSONObject jSONObject, com.tencent.luggage.sdk.jsapi.component.b bVar, com.tencent.mm.plugin.appbrand.jsapi.webrtc.v vVar) {
        this.f83858d = view;
        this.f83859e = jSONObject;
        this.f83860f = bVar;
        this.f83861g = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.jsapi.webrtc.i0 i0Var;
        android.view.KeyEvent.Callback callback = this.f83858d;
        kotlin.jvm.internal.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.webrtc.IWebRTCVideoSinkProvider");
        org.webrtc.VideoSink videoSink = ((com.tencent.mm.plugin.appbrand.jsapi.webrtc.c) ((com.tencent.mm.plugin.appbrand.jsapi.webrtc.b) callback)).f83799d;
        if (videoSink != null) {
            com.tencent.mm.plugin.appbrand.jsapi.webrtc.k0 k0Var = com.tencent.mm.plugin.appbrand.jsapi.webrtc.k0.f83847a;
            com.tencent.mm.plugin.appbrand.jsapi.webrtc.j0 j0Var = com.tencent.mm.plugin.appbrand.jsapi.webrtc.j0.f83840d;
            org.json.JSONObject jSONObject = this.f83859e;
            com.tencent.luggage.sdk.jsapi.component.b bVar = this.f83860f;
            i0Var = k0Var.a(jSONObject, videoSink, bVar, j0Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateWebRTCRendererView", "hy: webrtc update webrtc video sink with errcode " + i0Var);
            this.f83861g.M(bVar, videoSink, i0Var, jSONObject);
        } else {
            i0Var = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateWebRTCRendererView", "hy: webrtc remove result is " + i0Var);
    }
}
