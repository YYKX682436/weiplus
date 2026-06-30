package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class v7 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268110e;

    public v7(nw4.k kVar, nw4.y2 y2Var) {
        this.f268109d = kVar;
        this.f268110e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        java.util.HashMap hashMap = new java.util.HashMap();
        boolean z17 = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) obj).f149933d;
        nw4.k kVar = this.f268109d;
        nw4.y2 y2Var = this.f268110e;
        if (z17) {
            hashMap.put("code", 100);
            hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "post successful");
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
            return;
        }
        hashMap.put("code", 200);
        hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "post cancel");
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", hashMap);
    }
}
