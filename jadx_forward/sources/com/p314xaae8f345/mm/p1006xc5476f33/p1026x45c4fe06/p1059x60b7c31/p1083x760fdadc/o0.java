package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc;

/* loaded from: classes15.dex */
public class o0 extends gb1.h {

    /* renamed from: CTRL_INDEX */
    private static final int f34095x366c91de = 447;

    /* renamed from: NAME */
    public static final java.lang.String f34096x24728b = "updateScrollView";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    @Override // gb1.h
    public boolean K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        if (!(view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12075x8f3ab8b2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiUpdateScrollView", "the view(%s) is not a instance of WxaScrollView", java.lang.Integer.valueOf(i17));
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12075x8f3ab8b2 c12075x8f3ab8b2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12075x8f3ab8b2) view;
        if1.t.a(view, jSONObject.optJSONObject("style"));
        try {
            if (jSONObject.getBoolean("needScrollEvent")) {
                c12075x8f3ab8b2.m50866x6fa959a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.n0(this, tVar, jSONObject, i17));
            } else {
                c12075x8f3ab8b2.m50866x6fa959a(null);
            }
        } catch (org.json.JSONException unused) {
        }
        jSONObject.optInt("scrollLeft", 0);
        if (jSONObject.has("scrollX")) {
            boolean optBoolean = jSONObject.optBoolean("scrollX", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateScrollView", "scrollHorizontal:%b", java.lang.Boolean.valueOf(optBoolean));
            c12075x8f3ab8b2.m50867x38bdef53(optBoolean);
        }
        if (jSONObject.has("scrollY")) {
            boolean optBoolean2 = jSONObject.optBoolean("scrollY", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateScrollView", "scrollVertical:%b", java.lang.Boolean.valueOf(optBoolean2));
            c12075x8f3ab8b2.m50868x8f91ca65(optBoolean2);
        }
        if (jSONObject.has("scrollX") || jSONObject.has("scrollY")) {
            c12075x8f3ab8b2.b();
        }
        if (jSONObject.has("scrollTop")) {
            int j17 = ik1.w.j(jSONObject, "scrollTop", c12075x8f3ab8b2.getScrollY());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateScrollView", "scrollTop:%d", java.lang.Integer.valueOf(j17));
            c12075x8f3ab8b2.scrollTo(c12075x8f3ab8b2.getScrollX(), j17);
        }
        if (jSONObject.has("hideScrollBar")) {
            boolean optBoolean3 = jSONObject.optBoolean("hideScrollBar", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateScrollView", "hideScrollBar:%b", java.lang.Boolean.valueOf(optBoolean3));
            boolean z17 = !optBoolean3;
            c12075x8f3ab8b2.f162182e.setVerticalScrollBarEnabled(z17);
            c12075x8f3ab8b2.f162183f.setHorizontalScrollBarEnabled(z17);
        }
        return true;
    }
}
