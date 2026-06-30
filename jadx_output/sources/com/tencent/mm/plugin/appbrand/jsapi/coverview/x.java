package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes15.dex */
public class x extends gb1.d {
    private static final int CTRL_INDEX = 446;
    public static final java.lang.String NAME = "insertScrollView";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r4.optBoolean("scrollY", true) != false) goto L8;
     */
    @Override // gb1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View K(com.tencent.mm.plugin.appbrand.jsapi.t r3, org.json.JSONObject r4) {
        /*
            r2 = this;
            java.lang.String r0 = "scrollY"
            boolean r1 = r4.has(r0)
            if (r1 == 0) goto L10
            r1 = 1
            boolean r4 = r4.optBoolean(r0, r1)
            if (r4 == 0) goto L10
            goto L11
        L10:
            r1 = 0
        L11:
            com.tencent.mm.plugin.appbrand.jsapi.coverview.WxaScrollView r4 = new com.tencent.mm.plugin.appbrand.jsapi.coverview.WxaScrollView
            android.content.Context r3 = r3.getContext()
            r4.<init>(r3, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.coverview.x.K(com.tencent.mm.plugin.appbrand.jsapi.t, org.json.JSONObject):android.view.View");
    }

    @Override // gb1.d
    public void N(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertScrollView", "onInsertView(viewId : %s, %s)", java.lang.Integer.valueOf(i17), jSONObject);
        com.tencent.mm.plugin.appbrand.jsapi.coverview.WxaScrollView wxaScrollView = (com.tencent.mm.plugin.appbrand.jsapi.coverview.WxaScrollView) view;
        boolean optBoolean = jSONObject.optBoolean("needScrollEvent");
        java.lang.String e17 = c75.c.e(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        if1.t.a(view, jSONObject.optJSONObject("style"));
        boolean optBoolean2 = jSONObject.optBoolean("independent", false);
        tVar.M(optBoolean2).b(i17, true).i(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, e17);
        if (optBoolean) {
            wxaScrollView.setOnScrollChangedListener(new com.tencent.mm.plugin.appbrand.jsapi.coverview.v(this, tVar, optBoolean2, i17));
        }
        jSONObject.optInt("scrollLeft", 0);
        if (jSONObject.has("scrollX")) {
            boolean optBoolean3 = jSONObject.optBoolean("scrollX", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertScrollView", "scrollHorizontal:%b", java.lang.Boolean.valueOf(optBoolean3));
            wxaScrollView.setScrollHorizontal(optBoolean3);
        }
        if (jSONObject.has("scrollY")) {
            boolean optBoolean4 = jSONObject.optBoolean("scrollY", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertScrollView", "scrollVertical:%b", java.lang.Boolean.valueOf(optBoolean4));
            wxaScrollView.setScrollVertical(optBoolean4);
        }
        if (jSONObject.has("scrollX") || jSONObject.has("scrollY")) {
            wxaScrollView.b();
        }
        if (jSONObject.has("hideScrollBar")) {
            boolean optBoolean5 = jSONObject.optBoolean("hideScrollBar", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertScrollView", "hideScrollBar:%b", java.lang.Boolean.valueOf(optBoolean5));
            boolean z17 = !optBoolean5;
            wxaScrollView.f80649e.setVerticalScrollBarEnabled(z17);
            wxaScrollView.f80650f.setHorizontalScrollBarEnabled(z17);
        }
        if (jSONObject.has("scrollTop")) {
            int j17 = ik1.w.j(jSONObject, "scrollTop", wxaScrollView.getScrollY());
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertScrollView", "scrollTop:%d", java.lang.Integer.valueOf(j17));
            wxaScrollView.postDelayed(new com.tencent.mm.plugin.appbrand.jsapi.coverview.w(this, wxaScrollView, j17), 100L);
        }
    }
}
