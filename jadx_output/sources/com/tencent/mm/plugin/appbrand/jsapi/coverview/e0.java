package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes7.dex */
public class e0 extends gb1.d {
    private static final int CTRL_INDEX = 253;
    public static final java.lang.String NAME = "insertTextView";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    @Override // gb1.d
    public android.view.View K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, org.json.JSONObject jSONObject) {
        android.content.Context context = tVar.getContext();
        return new com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer(context, new com.tencent.mm.plugin.appbrand.widget.s(context));
    }

    @Override // gb1.d
    public void N(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        boolean z17;
        int i18;
        com.tencent.mm.plugin.appbrand.jsapi.coverview.e0 e0Var;
        com.tencent.mm.plugin.appbrand.widget.s sVar;
        com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer coverViewContainer;
        int optInt;
        com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer coverViewContainer2 = (com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view;
        com.tencent.mm.plugin.appbrand.widget.s sVar2 = (com.tencent.mm.plugin.appbrand.widget.s) coverViewContainer2.d(com.tencent.mm.plugin.appbrand.widget.s.class);
        if (sVar2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiInsertTextView", "onInsertView(viewId : %d) failed, targetView is null", java.lang.Integer.valueOf(i17));
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("clickable");
        boolean optBoolean2 = jSONObject.optBoolean("transEvt");
        boolean optBoolean3 = jSONObject.optBoolean("gesture");
        boolean optBoolean4 = jSONObject.optBoolean("draggable", false);
        java.lang.String optString = jSONObject.optString("sendTo", "appservice");
        java.lang.String e17 = c75.c.e(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        if1.j.b(sVar2, jSONObject.optJSONObject("label"));
        if1.d.a(sVar2, jSONObject);
        if1.t.a(view, jSONObject.optJSONObject("style"));
        c01.l2 b17 = tVar.M(jSONObject.optBoolean("independent", false)).b(i17, true);
        b17.i(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, e17);
        b17.i("sendTo", optString);
        b17.i("transEvt", java.lang.Boolean.valueOf(optBoolean2));
        b17.i("clickable", java.lang.Boolean.valueOf(optBoolean));
        boolean optBoolean5 = jSONObject.optBoolean("independent", false);
        if (!optBoolean5 || (optInt = jSONObject.optInt("parentId", 0)) == 0) {
            z17 = false;
            i18 = -1;
        } else {
            z17 = ((com.tencent.mm.plugin.appbrand.page.ia) tVar.M(optBoolean5)).q(optInt);
            i18 = ((com.tencent.mm.plugin.appbrand.page.ia) tVar.M(optBoolean5)).l(optInt);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertTextView", "clickable:%b, gesture:%b, draggable:%b， independent:%b, isParentCanDrag:%b", java.lang.Boolean.valueOf(optBoolean), java.lang.Boolean.valueOf(optBoolean3), java.lang.Boolean.valueOf(optBoolean4), java.lang.Boolean.valueOf(optBoolean5), java.lang.Boolean.valueOf(z17));
        if (optBoolean5 && (z17 || optBoolean4)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertTextView", "CoverViewContainer setOnClickListener");
            if (optBoolean) {
                coverViewContainer = coverViewContainer2;
                coverViewContainer.f80636q = i17;
                coverViewContainer.f80637r = i18;
                coverViewContainer.setIsInterceptEvent(true);
                e0Var = this;
                coverViewContainer.setOnCustomerClickListener(new com.tencent.mm.plugin.appbrand.jsapi.coverview.y(e0Var, b17, tVar));
            } else {
                e0Var = this;
                coverViewContainer = coverViewContainer2;
            }
            coverViewContainer.setDragEventCallback(new com.tencent.mm.plugin.appbrand.jsapi.coverview.z(e0Var, b17, tVar));
            sVar = sVar2;
        } else {
            e0Var = this;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertTextView", "targetView setOnClickListener");
            sVar = sVar2;
            sVar.setOnClickListener(new com.tencent.mm.plugin.appbrand.jsapi.coverview.a0(e0Var, b17, tVar));
            sVar.setClickable(optBoolean);
        }
        if (optBoolean || !optBoolean3 || optBoolean4) {
            return;
        }
        view.setDuplicateParentStateEnabled(true);
        sVar.setDuplicateParentStateEnabled(true);
        sVar.setOnTouchListener(new com.tencent.mm.plugin.appbrand.jsapi.coverview.b0(e0Var, b17, tVar, i17));
    }
}
