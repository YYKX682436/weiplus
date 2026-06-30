package com.tencent.mm.plugin.appbrand.jsapi.webrtc;

/* loaded from: classes7.dex */
public class i extends gb1.d {
    public static final int CTRL_INDEX = 1117;
    public static final java.lang.String NAME = "insertWebRTCRendererView";

    @Override // gb1.i
    public void C(com.tencent.mm.plugin.appbrand.jsapi.l component, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(component, "component");
        ((com.tencent.luggage.sdk.jsapi.component.b) component).v3().y1().w0();
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertWebRTCRendererView", "getUnderView " + bool);
        return bool;
    }

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data.getInt("viewId");
    }

    @Override // gb1.d
    public android.view.View K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, org.json.JSONObject jSONObject) {
        com.tencent.luggage.sdk.jsapi.component.b bVar = (com.tencent.luggage.sdk.jsapi.component.b) tVar;
        if (bVar == null) {
            return null;
        }
        android.content.Context context = bVar.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.appbrand.jsapi.webrtc.c cVar = new com.tencent.mm.plugin.appbrand.jsapi.webrtc.c(this, context);
        cVar.setBackgroundColor(-1);
        return cVar;
    }

    public com.tencent.mm.plugin.appbrand.jsapi.webrtc.e P() {
        return com.tencent.mm.plugin.appbrand.jsapi.webrtc.e.f83803e;
    }

    public void Q(com.tencent.luggage.sdk.jsapi.component.b component, int i17) {
        kotlin.jvm.internal.o.g(component, "component");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertWebRTCRendererView", "hy: on first frame rendered " + i17);
        com.tencent.mm.plugin.appbrand.jsapi.webrtc.d dVar = new com.tencent.mm.plugin.appbrand.jsapi.webrtc.d();
        dVar.p(component.v3());
        dVar.s("viewId", java.lang.Integer.valueOf(i17));
        dVar.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [org.webrtc.TextureViewRenderer] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.tencent.mm.plugin.appbrand.jsapi.webrtc.i] */
    @Override // gb1.d
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void N(com.tencent.luggage.sdk.jsapi.component.b bVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        org.webrtc.SurfaceViewRenderer surfaceViewRenderer;
        com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime;
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertWebRTCRendererView", "hy: try insert webrtc view " + i17);
        if (bVar != null) {
            int[] iArr = org.webrtc.EglBase.CONFIG_PLAIN;
            org.webrtc.EglBase create = org.webrtc.EglBase.EglBaseStatic.create(null, iArr);
            int ordinal = P().ordinal();
            if (ordinal == 0) {
                surfaceViewRenderer = new org.webrtc.SurfaceViewRenderer(bVar.getContext());
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                surfaceViewRenderer = new org.webrtc.TextureViewRenderer(bVar.getContext());
            }
            kotlin.jvm.internal.o.d(create);
            surfaceViewRenderer.init(create.getEglBaseContext(), new com.tencent.mm.plugin.appbrand.jsapi.webrtc.h(this, bVar, i17), iArr, new org.webrtc.GlRectDrawer());
            S(bVar, surfaceViewRenderer, i17);
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.webrtc.JsApiInsertWebRTCRendererView.HolderView");
            com.tencent.mm.plugin.appbrand.jsapi.webrtc.c cVar = (com.tencent.mm.plugin.appbrand.jsapi.webrtc.c) view;
            cVar.setVideoSink(surfaceViewRenderer);
            cVar.addView(surfaceViewRenderer, new android.view.ViewGroup.LayoutParams(-1, -1));
            com.tencent.luggage.sdk.jsapi.component.service.y v37 = bVar.v3();
            if (v37 == null || (jsRuntime = v37.getJsRuntime()) == null || (f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) jsRuntime.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class)) == null) {
                return;
            }
            f0Var.post(new com.tencent.mm.plugin.appbrand.jsapi.webrtc.f(view, jSONObject, bVar));
        }
    }

    public void S(com.tencent.luggage.sdk.jsapi.component.b bVar, org.webrtc.IRenderer renderView, int i17) {
        kotlin.jvm.internal.o.g(renderView, "renderView");
    }
}
