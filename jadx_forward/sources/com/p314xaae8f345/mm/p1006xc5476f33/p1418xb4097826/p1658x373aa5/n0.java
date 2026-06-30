package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class n0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.o0 f214209d;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.o0 o0Var) {
        this.f214209d = o0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p0 p0Var;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.o0 o0Var = this.f214209d;
        if (itemId == 9) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p0 p0Var2 = o0Var.f214290h;
            if (p0Var2 != null) {
                p0Var2.b(o0Var.f214288f, false);
                return;
            }
            return;
        }
        if (itemId != 10 || (p0Var = o0Var.f214290h) == null) {
            return;
        }
        p0Var.b(o0Var.f214288f, true);
    }
}
