package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes7.dex */
public class u extends gb1.d {
    private static final int CTRL_INDEX = 253;
    public static final java.lang.String NAME = "insertImageView";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    @Override // gb1.d
    public android.view.View K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, org.json.JSONObject jSONObject) {
        gl1.a aVar;
        android.content.Context context = tVar.getContext();
        if (nd.f.a(gl1.b.class) != null) {
            com.tencent.mm.plugin.appbrand.luggage.customize.i0 i0Var = (com.tencent.mm.plugin.appbrand.luggage.customize.i0) ((gl1.b) nd.f.a(gl1.b.class));
            i0Var.getClass();
            aVar = new com.tencent.mm.plugin.appbrand.luggage.customize.h0(i0Var, context);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertImageView", "view is null, may not support IGifCoverViewFactory.");
            aVar = new gl1.e(context);
        }
        aVar.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        return new com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer(context, aVar.getView());
    }

    @Override // gb1.d
    public void N(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.jsapi.coverview.u uVar;
        com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer coverViewContainer;
        com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer coverViewContainer2 = (com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view;
        gl1.a aVar = (gl1.a) coverViewContainer2.d(gl1.a.class);
        if (aVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiInsertImageView", "onInsertView(viewId : %d) failed, targetView is null", java.lang.Integer.valueOf(i17));
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("clickable");
        boolean optBoolean2 = jSONObject.optBoolean("gesture");
        boolean optBoolean3 = jSONObject.optBoolean("draggable", false);
        boolean optBoolean4 = jSONObject.optBoolean("transEvt");
        java.lang.String optString = jSONObject.optString("sendTo", "appservice");
        java.lang.String e17 = c75.c.e(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("style");
        c01.l2 b17 = tVar.M(jSONObject.optBoolean("independent", false)).b(i17, true);
        b17.i(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, e17);
        b17.i("sendTo", optString);
        b17.i("transEvt", java.lang.Boolean.valueOf(optBoolean4));
        b17.i("clickable", java.lang.Boolean.valueOf(optBoolean));
        aVar.setKeyValueSet(b17);
        if1.t.a(view, optJSONObject);
        if1.j.a(tVar, i17, aVar, jSONObject, new com.tencent.mm.plugin.appbrand.jsapi.coverview.f(i17, b17, tVar));
        if1.d.a(aVar.getView(), jSONObject);
        boolean z17 = false;
        boolean optBoolean5 = jSONObject.optBoolean("independent", false);
        int i18 = -1;
        if (optBoolean5) {
            int optInt = jSONObject.optInt("parentId", 0);
            if (optInt != 0) {
                z17 = ((com.tencent.mm.plugin.appbrand.page.ia) tVar.M(optBoolean5)).q(optInt);
                i18 = ((com.tencent.mm.plugin.appbrand.page.ia) tVar.M(optBoolean5)).l(optInt);
            }
            b17.k("sendTo", "appservice");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertImageView", "clickable:%b, gesture:%b, draggable:%b， independent:%b, isParentCanDrag:%b", java.lang.Boolean.valueOf(optBoolean), java.lang.Boolean.valueOf(optBoolean2), java.lang.Boolean.valueOf(optBoolean3), java.lang.Boolean.valueOf(optBoolean5), java.lang.Boolean.valueOf(z17));
        if (optBoolean5 && (z17 || optBoolean3)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertImageView", "CoverViewContainer setOnClickListener");
            if (optBoolean) {
                coverViewContainer = coverViewContainer2;
                coverViewContainer.f80636q = i17;
                coverViewContainer.f80637r = i18;
                coverViewContainer.setIsInterceptEvent(true);
                uVar = this;
                coverViewContainer.setOnCustomerClickListener(new com.tencent.mm.plugin.appbrand.jsapi.coverview.p(uVar, b17, tVar));
            } else {
                uVar = this;
                coverViewContainer = coverViewContainer2;
            }
            coverViewContainer.setDragEventCallback(new com.tencent.mm.plugin.appbrand.jsapi.coverview.q(uVar, b17, tVar));
        } else {
            uVar = this;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertImageView", "targetView setOnClickListener");
            aVar.getView().setOnClickListener(new com.tencent.mm.plugin.appbrand.jsapi.coverview.r(uVar, b17, tVar));
            aVar.getView().setClickable(optBoolean);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertImageView", "clickable:%b, gesture:%b, draggable:%b", java.lang.Boolean.valueOf(optBoolean), java.lang.Boolean.valueOf(optBoolean2), java.lang.Boolean.valueOf(optBoolean3));
        if (optBoolean || !optBoolean2 || optBoolean3) {
            return;
        }
        view.setDuplicateParentStateEnabled(true);
        aVar.getView().setDuplicateParentStateEnabled(true);
        aVar.getView().setOnTouchListener(new com.tencent.mm.plugin.appbrand.jsapi.coverview.s(uVar, b17, tVar, i17));
    }
}
