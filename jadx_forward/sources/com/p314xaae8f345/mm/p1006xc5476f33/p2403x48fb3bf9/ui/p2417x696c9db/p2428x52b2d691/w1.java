package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class w1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268128e;

    public w1(nw4.k kVar, nw4.y2 y2Var) {
        this.f268127d = kVar;
        this.f268128e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj).f149939d;
        if (str == null) {
            str = "";
        }
        hashMap.put("redDotInfo", new org.json.JSONObject(str));
        nw4.g gVar = this.f268127d.f422396d;
        nw4.y2 y2Var = this.f268128e;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":success", hashMap);
    }
}
