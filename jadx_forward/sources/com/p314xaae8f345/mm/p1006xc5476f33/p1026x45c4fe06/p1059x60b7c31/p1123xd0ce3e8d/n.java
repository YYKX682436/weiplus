package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d;

/* loaded from: classes7.dex */
public class n extends gb1.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34972x366c91de = 1118;

    /* renamed from: NAME */
    public static final java.lang.String f34973x24728b = "removeWebRTCRendererView";

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return data.getInt("viewId");
    }

    @Override // gb1.f
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public boolean J(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y v37;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f229341e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRemoveWebRTCRendererView", "hy: try remove webrtc view " + i17);
        if (bVar == null || (v37 = bVar.v3()) == null || (f229341e = v37.getF229341e()) == null || (f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) f229341e.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class)) == null) {
            return true;
        }
        f0Var.mo51545x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.m(view, jSONObject, bVar));
        return true;
    }
}
