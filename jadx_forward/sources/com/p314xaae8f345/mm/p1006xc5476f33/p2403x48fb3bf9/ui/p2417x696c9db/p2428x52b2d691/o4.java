package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes7.dex */
public final class o4 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267937e;

    public o4(nw4.k kVar, nw4.y2 y2Var) {
        this.f267936d = kVar;
        this.f267937e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.mm.p646xf2865d2e.C10320x67f7455e c10320x67f7455e = (com.p314xaae8f345.mm.p646xf2865d2e.C10320x67f7455e) obj;
        boolean z17 = c10320x67f7455e.f145154d;
        nw4.k kVar = this.f267936d;
        nw4.y2 y2Var = this.f267937e;
        if (!z17) {
            java.util.Map l17 = kz5.c1.l(new jz5.l("err_desc", c10320x67f7455e.f145157g));
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", l17);
            return;
        }
        java.lang.String str = c10320x67f7455e.f145160m;
        if (str.length() == 0) {
            jSONObject = new org.json.JSONObject();
        } else {
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", "Failed to parse fullInfo JSON: ".concat(str), e17);
                jSONObject = new org.json.JSONObject();
            }
        }
        java.util.Map l18 = kz5.c1.l(new jz5.l("biz", c10320x67f7455e.f145155e), new jz5.l("interactiveIdentityType", java.lang.Integer.valueOf(c10320x67f7455e.f145156f)), new jz5.l("initFlag", java.lang.Boolean.valueOf(c10320x67f7455e.f145159i)), new jz5.l("fullInfo", jSONObject));
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", l18);
    }
}
