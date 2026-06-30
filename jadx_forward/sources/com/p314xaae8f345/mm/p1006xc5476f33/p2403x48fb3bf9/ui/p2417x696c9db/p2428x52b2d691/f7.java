package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class f7 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267618e;

    public f7(nw4.k kVar, nw4.y2 y2Var) {
        this.f267617d = kVar;
        this.f267618e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        boolean z17 = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) obj).f149933d;
        nw4.k kVar = this.f267617d;
        nw4.y2 y2Var = this.f267618e;
        if (z17) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
            return;
        }
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail open fail", null);
    }
}
