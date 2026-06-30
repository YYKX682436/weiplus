package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class f5 implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267615b;

    public f5(nw4.k kVar, nw4.y2 y2Var) {
        this.f267614a = kVar;
        this.f267615b = y2Var;
    }

    @Override // vh0.i1
    /* renamed from: onResult */
    public void mo56534x57429edc(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        nw4.k kVar = this.f267614a;
        nw4.y2 y2Var = this.f267615b;
        if (booleanValue) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
            return;
        }
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":cancel", null);
    }
}
