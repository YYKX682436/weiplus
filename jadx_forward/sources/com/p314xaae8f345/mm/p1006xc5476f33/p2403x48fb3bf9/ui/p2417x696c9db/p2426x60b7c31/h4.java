package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class h4 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266697e;

    public h4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var) {
        this.f266697e = c1Var;
        this.f266696d = y2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int ordinal = ((pr4.a) obj).f439518a.ordinal();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266697e;
        nw4.y2 y2Var = this.f266696d;
        if (ordinal == 0) {
            c1Var.i5(y2Var, y2Var.f422552i + ":fail", null);
        } else if (ordinal == 1) {
            c1Var.i5(y2Var, y2Var.f422552i + ":insufficient", null);
        } else if (ordinal == 2) {
            c1Var.i5(y2Var, y2Var.f422552i + ":intercept", null);
        }
        c1Var.getClass();
        return null;
    }
}
