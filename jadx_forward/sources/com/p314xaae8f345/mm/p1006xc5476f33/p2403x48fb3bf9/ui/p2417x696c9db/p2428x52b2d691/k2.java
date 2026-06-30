package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class k2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f267830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267831e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267832f;

    public k2(java.util.Map map, nw4.k kVar, nw4.y2 y2Var) {
        this.f267830d = map;
        this.f267831e = kVar;
        this.f267832f = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(la5.b.f399133a.g(true));
        java.util.Map map = this.f267830d;
        map.put("isAccessibilityMode", valueOf);
        map.put("isCareMode", java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) obj).f149933d));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetUserConfig", "isAccessibilityMode:" + map.get("isAccessibilityMode") + ", isCareMode:" + map.get("isCareMode"));
        this.f267831e.f422396d.e(this.f267832f.f422546c, "getUserConfig:ok", map);
    }
}
