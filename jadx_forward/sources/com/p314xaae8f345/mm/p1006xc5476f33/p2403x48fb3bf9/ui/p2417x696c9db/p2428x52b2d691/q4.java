package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class q4 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267986e;

    public q4(nw4.k kVar, nw4.y2 y2Var) {
        this.f267985d = kVar;
        this.f267986e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19432xec875db8 c19432xec875db8 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19432xec875db8) obj;
        java.lang.String str = c19432xec875db8.f267408g;
        boolean z17 = str == null || str.length() == 0;
        nw4.k kVar = this.f267985d;
        nw4.y2 y2Var = this.f267986e;
        if (!z17) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ':' + c19432xec875db8.f267408g, null);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("latitude", c19432xec875db8.f267405d);
        jSONObject.put("longitude", c19432xec875db8.f267406e);
        jSONObject.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, c19432xec875db8.f267407f);
        java.util.Map l17 = kz5.c1.l(new jz5.l("position", jSONObject));
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", l17);
    }
}
