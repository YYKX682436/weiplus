package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d;

/* loaded from: classes7.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f165351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f165352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b f165353f;

    public f(android.view.View view, org.json.JSONObject jSONObject, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        this.f165351d = view;
        this.f165352e = jSONObject;
        this.f165353f = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.i0 i0Var;
        android.view.KeyEvent.Callback callback = this.f165351d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.webrtc.IWebRTCVideoSinkProvider");
        org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e interfaceC29908xc6e4d18e = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.b) callback)).f165332d;
        if (interfaceC29908xc6e4d18e != null) {
            i0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.k0.f165380a.a(this.f165352e, interfaceC29908xc6e4d18e, this.f165353f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.j0.f165373d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertWebRTCRendererView", "hy: webrtc update webrtc video sink with errcode " + i0Var);
        } else {
            i0Var = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertWebRTCRendererView", "hy: webrtc add result is " + i0Var);
    }
}
