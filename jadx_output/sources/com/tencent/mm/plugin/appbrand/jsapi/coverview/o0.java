package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes15.dex */
public class o0 extends gb1.h {
    private static final int CTRL_INDEX = 447;
    public static final java.lang.String NAME = "updateScrollView";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    @Override // gb1.h
    public boolean K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        if (!(view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.WxaScrollView)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiUpdateScrollView", "the view(%s) is not a instance of WxaScrollView", java.lang.Integer.valueOf(i17));
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.coverview.WxaScrollView wxaScrollView = (com.tencent.mm.plugin.appbrand.jsapi.coverview.WxaScrollView) view;
        if1.t.a(view, jSONObject.optJSONObject("style"));
        try {
            if (jSONObject.getBoolean("needScrollEvent")) {
                wxaScrollView.setOnScrollChangedListener(new com.tencent.mm.plugin.appbrand.jsapi.coverview.n0(this, tVar, jSONObject, i17));
            } else {
                wxaScrollView.setOnScrollChangedListener(null);
            }
        } catch (org.json.JSONException unused) {
        }
        jSONObject.optInt("scrollLeft", 0);
        if (jSONObject.has("scrollX")) {
            boolean optBoolean = jSONObject.optBoolean("scrollX", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateScrollView", "scrollHorizontal:%b", java.lang.Boolean.valueOf(optBoolean));
            wxaScrollView.setScrollHorizontal(optBoolean);
        }
        if (jSONObject.has("scrollY")) {
            boolean optBoolean2 = jSONObject.optBoolean("scrollY", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateScrollView", "scrollVertical:%b", java.lang.Boolean.valueOf(optBoolean2));
            wxaScrollView.setScrollVertical(optBoolean2);
        }
        if (jSONObject.has("scrollX") || jSONObject.has("scrollY")) {
            wxaScrollView.b();
        }
        if (jSONObject.has("scrollTop")) {
            int j17 = ik1.w.j(jSONObject, "scrollTop", wxaScrollView.getScrollY());
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateScrollView", "scrollTop:%d", java.lang.Integer.valueOf(j17));
            wxaScrollView.scrollTo(wxaScrollView.getScrollX(), j17);
        }
        if (jSONObject.has("hideScrollBar")) {
            boolean optBoolean3 = jSONObject.optBoolean("hideScrollBar", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateScrollView", "hideScrollBar:%b", java.lang.Boolean.valueOf(optBoolean3));
            boolean z17 = !optBoolean3;
            wxaScrollView.f80649e.setVerticalScrollBarEnabled(z17);
            wxaScrollView.f80650f.setHorizontalScrollBarEnabled(z17);
        }
        return true;
    }
}
