package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class v6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.x6 f233034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ss4 f233035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f233036f;

    public v6(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.x6 x6Var, r45.ss4 ss4Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f233034d = x6Var;
        this.f233035e = ss4Var;
        this.f233036f = k0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.x6 x6Var = this.f233034d;
        int i18 = x6Var.f233064e;
        r45.ss4 ss4Var = this.f233035e;
        if (itemId == i18) {
            x6Var.f233068i = xy2.c.e(x6Var.m80379x76847179()).length() == 0;
            x6Var.P6(true, true, ss4Var);
        } else if (itemId != x6Var.f233065f) {
            this.f233036f.u();
        } else {
            x6Var.f233068i = false;
            x6Var.P6(false, false, ss4Var);
        }
    }
}
