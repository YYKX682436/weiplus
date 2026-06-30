package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc;

/* loaded from: classes15.dex */
public class x extends gb1.d {

    /* renamed from: CTRL_INDEX */
    private static final int f34105x366c91de = 446;

    /* renamed from: NAME */
    public static final java.lang.String f34106x24728b = "insertScrollView";

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
    public android.view.View K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t r3, org.json.JSONObject r4) {
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
            android.content.Context r3 = r3.mo50352x76847179()
            r4.<init>(r3, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.x.K(com.tencent.mm.plugin.appbrand.jsapi.t, org.json.JSONObject):android.view.View");
    }

    @Override // gb1.d
    public void N(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertScrollView", "onInsertView(viewId : %s, %s)", java.lang.Integer.valueOf(i17), jSONObject);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12075x8f3ab8b2 c12075x8f3ab8b2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12075x8f3ab8b2) view;
        boolean optBoolean = jSONObject.optBoolean("needScrollEvent");
        java.lang.String e17 = c75.c.e(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        if1.t.a(view, jSONObject.optJSONObject("style"));
        boolean optBoolean2 = jSONObject.optBoolean("independent", false);
        tVar.M(optBoolean2).b(i17, true).i(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, e17);
        if (optBoolean) {
            c12075x8f3ab8b2.m50866x6fa959a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.v(this, tVar, optBoolean2, i17));
        }
        jSONObject.optInt("scrollLeft", 0);
        if (jSONObject.has("scrollX")) {
            boolean optBoolean3 = jSONObject.optBoolean("scrollX", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertScrollView", "scrollHorizontal:%b", java.lang.Boolean.valueOf(optBoolean3));
            c12075x8f3ab8b2.m50867x38bdef53(optBoolean3);
        }
        if (jSONObject.has("scrollY")) {
            boolean optBoolean4 = jSONObject.optBoolean("scrollY", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertScrollView", "scrollVertical:%b", java.lang.Boolean.valueOf(optBoolean4));
            c12075x8f3ab8b2.m50868x8f91ca65(optBoolean4);
        }
        if (jSONObject.has("scrollX") || jSONObject.has("scrollY")) {
            c12075x8f3ab8b2.b();
        }
        if (jSONObject.has("hideScrollBar")) {
            boolean optBoolean5 = jSONObject.optBoolean("hideScrollBar", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertScrollView", "hideScrollBar:%b", java.lang.Boolean.valueOf(optBoolean5));
            boolean z17 = !optBoolean5;
            c12075x8f3ab8b2.f162182e.setVerticalScrollBarEnabled(z17);
            c12075x8f3ab8b2.f162183f.setHorizontalScrollBarEnabled(z17);
        }
        if (jSONObject.has("scrollTop")) {
            int j17 = ik1.w.j(jSONObject, "scrollTop", c12075x8f3ab8b2.getScrollY());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertScrollView", "scrollTop:%d", java.lang.Integer.valueOf(j17));
            c12075x8f3ab8b2.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.w(this, c12075x8f3ab8b2, j17), 100L);
        }
    }
}
