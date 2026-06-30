package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes7.dex */
public final class n4 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267906e;

    public n4(nw4.k kVar, nw4.y2 y2Var) {
        this.f267905d = kVar;
        this.f267906e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        org.json.JSONArray jSONArray;
        com.p314xaae8f345.mm.p646xf2865d2e.C10320x67f7455e c10320x67f7455e = (com.p314xaae8f345.mm.p646xf2865d2e.C10320x67f7455e) obj;
        boolean z17 = c10320x67f7455e.f145154d;
        nw4.k kVar = this.f267905d;
        nw4.y2 y2Var = this.f267906e;
        if (!z17) {
            java.util.Map l17 = kz5.c1.l(new jz5.l("err_desc", c10320x67f7455e.f145157g));
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", l17);
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String str = c10320x67f7455e.f145158h;
        if (str == null) {
            str = "[]";
        }
        try {
            jSONArray = new org.json.JSONArray(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", "Failed to parse bizList JSON: ".concat(str), e17);
            jSONArray = new org.json.JSONArray();
        }
        linkedHashMap.put("result", jSONArray);
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", linkedHashMap);
    }
}
