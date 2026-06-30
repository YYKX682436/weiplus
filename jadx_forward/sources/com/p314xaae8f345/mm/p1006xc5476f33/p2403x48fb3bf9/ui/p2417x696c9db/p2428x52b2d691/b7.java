package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class b7 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267507e;

    public b7(nw4.k kVar, nw4.y2 y2Var) {
        this.f267506d = kVar;
        this.f267507e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2 c10754x630c9a2 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2) obj;
        int i17 = c10754x630c9a2.f149937d;
        nw4.k kVar = this.f267506d;
        nw4.y2 y2Var = this.f267507e;
        if (i17 > 0) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", kz5.b1.e(new jz5.l("state", java.lang.Integer.valueOf(c10754x630c9a2.f149937d))));
            return;
        }
        if (i17 == -1000) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
            return;
        }
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + "pre check fail", null);
    }
}
