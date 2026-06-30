package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class p1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267953e;

    public p1(nw4.k kVar, nw4.y2 y2Var) {
        this.f267952d = kVar;
        this.f267953e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        java.util.Map map = (java.util.Map) obj;
        nw4.k kVar = this.f267952d;
        nw4.y2 y2Var = this.f267953e;
        if (map != null) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", map);
            return;
        }
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
    }
}
