package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes7.dex */
public class p0 extends gb1.h {
    private static final int CTRL_INDEX = 254;
    public static final java.lang.String NAME = "updateTextView";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    @Override // gb1.h
    public boolean K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        if (!(view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiUpdateTextView", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return false;
        }
        com.tencent.mm.plugin.appbrand.widget.s sVar = (com.tencent.mm.plugin.appbrand.widget.s) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(com.tencent.mm.plugin.appbrand.widget.s.class);
        if (sVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiUpdateTextView", "the target view(%s) is null", java.lang.Integer.valueOf(i17));
        }
        if1.j.b(sVar, jSONObject.optJSONObject("label"));
        if1.t.a(view, jSONObject.optJSONObject("style"));
        return true;
    }
}
