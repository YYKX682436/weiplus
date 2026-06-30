package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class d1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267557e;

    public d1(nw4.k kVar, nw4.y2 y2Var) {
        this.f267556d = kVar;
        this.f267557e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.e1 e1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.e1.f267579d;
        rk0.c.c("MicroMsg.JsApiGetAccessibilitySecureRiskInfo", "callback result", new java.lang.Object[0]);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("is_readmode_enable", java.lang.Boolean.valueOf(bundle.getBoolean("is_readmode_enable")));
        linkedHashMap.put("is_risk", java.lang.Boolean.valueOf(bundle.getBoolean("is_risk")));
        nw4.g gVar = this.f267556d.f422396d;
        nw4.y2 y2Var = this.f267557e;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", linkedHashMap);
    }
}
