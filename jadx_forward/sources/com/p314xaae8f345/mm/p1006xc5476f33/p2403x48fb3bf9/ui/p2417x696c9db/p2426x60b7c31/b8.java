package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class b8 implements r35.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266495a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266496b;

    public b8(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var) {
        this.f266496b = c1Var;
        this.f266495a = y2Var;
    }

    @Override // r35.n3
    public void a(int i17) {
        nw4.y2 y2Var = this.f266495a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266496b;
        if (i17 == -2) {
            c1Var.i5(y2Var, "quickly_add_contact:added", null);
            return;
        }
        if (i17 == -1) {
            c1Var.i5(y2Var, "quickly_add_contact:fail", null);
            return;
        }
        if (i17 == 0) {
            c1Var.i5(y2Var, "quickly_add_contact:cancel", null);
        } else if (i17 != 1) {
            c1Var.i5(y2Var, "quickly_add_contact:fail", null);
        } else {
            c1Var.i5(y2Var, "quickly_add_contact:ok", null);
        }
    }
}
