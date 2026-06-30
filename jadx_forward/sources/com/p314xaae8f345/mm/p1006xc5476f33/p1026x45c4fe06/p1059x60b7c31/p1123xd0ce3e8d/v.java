package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d;

/* loaded from: classes7.dex */
public class v extends gb1.h {

    /* renamed from: CTRL_INDEX */
    public static final int f34976x366c91de = 1119;

    /* renamed from: NAME */
    public static final java.lang.String f34977x24728b = "updateWebRTCRendererView";

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return data.getInt("viewId");
    }

    @Override // gb1.h
    public boolean K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y v37;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t mo50357xcd94f799;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) tVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateWebRTCRendererView", "hy: try update webrtc view " + i17);
        if (bVar == null || (v37 = bVar.v3()) == null || (mo50357xcd94f799 = v37.mo50357xcd94f799()) == null || (f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) mo50357xcd94f799.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class)) == null) {
            return true;
        }
        f0Var.mo51545x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.u(view, jSONObject, bVar, this));
        return true;
    }

    public void M(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l appBrandComponent, org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e videoSink, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.i0 videoSinkErrCode, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBrandComponent, "appBrandComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoSink, "videoSink");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoSinkErrCode, "videoSinkErrCode");
    }
}
