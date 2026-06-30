package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d;

/* loaded from: classes7.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f165391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f165392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b f165393f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.v f165394g;

    public u(android.view.View view, org.json.JSONObject jSONObject, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.v vVar) {
        this.f165391d = view;
        this.f165392e = jSONObject;
        this.f165393f = bVar;
        this.f165394g = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.i0 i0Var;
        android.view.KeyEvent.Callback callback = this.f165391d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.webrtc.IWebRTCVideoSinkProvider");
        org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e interfaceC29908xc6e4d18e = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.b) callback)).f165332d;
        if (interfaceC29908xc6e4d18e != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.k0 k0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.k0.f165380a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.j0 j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.j0.f165373d;
            org.json.JSONObject jSONObject = this.f165392e;
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar = this.f165393f;
            i0Var = k0Var.a(jSONObject, interfaceC29908xc6e4d18e, bVar, j0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateWebRTCRendererView", "hy: webrtc update webrtc video sink with errcode " + i0Var);
            this.f165394g.M(bVar, interfaceC29908xc6e4d18e, i0Var, jSONObject);
        } else {
            i0Var = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateWebRTCRendererView", "hy: webrtc remove result is " + i0Var);
    }
}
