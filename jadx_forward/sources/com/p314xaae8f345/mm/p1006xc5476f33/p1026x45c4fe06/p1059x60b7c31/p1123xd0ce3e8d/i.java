package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d;

/* loaded from: classes7.dex */
public class i extends gb1.d {

    /* renamed from: CTRL_INDEX */
    public static final int f34964x366c91de = 1117;

    /* renamed from: NAME */
    public static final java.lang.String f34965x24728b = "insertWebRTCRendererView";

    @Override // gb1.i
    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) component).v3().y1().w0();
    }

    @Override // gb1.i
    public java.lang.Boolean G(org.json.JSONObject jSONObject) {
        java.lang.Boolean bool = null;
        if (jSONObject != null) {
            try {
                bool = java.lang.Boolean.valueOf(jSONObject.getBoolean("underGameView"));
            } catch (org.json.JSONException unused) {
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertWebRTCRendererView", "getUnderView " + bool);
        return bool;
    }

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return data.getInt("viewId");
    }

    @Override // gb1.d
    public android.view.View K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) tVar;
        if (bVar == null) {
            return null;
        }
        android.content.Context mo50352x76847179 = bVar.mo50352x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo50352x76847179, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.c(this, mo50352x76847179);
        cVar.setBackgroundColor(-1);
        return cVar;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.e P() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.e.f165336e;
    }

    public void Q(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b component, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertWebRTCRendererView", "hy: on first frame rendered " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.d();
        dVar.p(component.v3());
        dVar.s("viewId", java.lang.Integer.valueOf(i17));
        dVar.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [org.webrtc.TextureViewRenderer] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.tencent.mm.plugin.appbrand.jsapi.webrtc.i] */
    @Override // gb1.d
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void N(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        org.p3371xd0ce3e8d.SurfaceHolderCallbackC29872xa9e6d7b5 surfaceHolderCallbackC29872xa9e6d7b5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t mo50357xcd94f799;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertWebRTCRendererView", "hy: try insert webrtc view " + i17);
        if (bVar != null) {
            int[] iArr = org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75304xe0dfc26d;
            org.p3371xd0ce3e8d.InterfaceC29759xf7e285db m155431xaf65a0fc = org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.EglBaseStatic.m155431xaf65a0fc(null, iArr);
            int ordinal = P().ordinal();
            if (ordinal == 0) {
                surfaceHolderCallbackC29872xa9e6d7b5 = new org.p3371xd0ce3e8d.SurfaceHolderCallbackC29872xa9e6d7b5(bVar.mo50352x76847179());
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                surfaceHolderCallbackC29872xa9e6d7b5 = new org.p3371xd0ce3e8d.TextureViewSurfaceTextureListenerC29879xa98b8b23(bVar.mo50352x76847179());
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m155431xaf65a0fc);
            surfaceHolderCallbackC29872xa9e6d7b5.mo155621x316510(m155431xaf65a0fc.mo155413x66100c2a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.h(this, bVar, i17), iArr, new org.p3371xd0ce3e8d.C29781x502b66da());
            S(bVar, surfaceHolderCallbackC29872xa9e6d7b5, i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.webrtc.JsApiInsertWebRTCRendererView.HolderView");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.c) view;
            cVar.m51487xab33e36c(surfaceHolderCallbackC29872xa9e6d7b5);
            cVar.addView(surfaceHolderCallbackC29872xa9e6d7b5, new android.view.ViewGroup.LayoutParams(-1, -1));
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y v37 = bVar.v3();
            if (v37 == null || (mo50357xcd94f799 = v37.mo50357xcd94f799()) == null || (f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) mo50357xcd94f799.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class)) == null) {
                return;
            }
            f0Var.mo51545x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.f(view, jSONObject, bVar));
        }
    }

    public void S(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar, org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c renderView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderView, "renderView");
    }
}
