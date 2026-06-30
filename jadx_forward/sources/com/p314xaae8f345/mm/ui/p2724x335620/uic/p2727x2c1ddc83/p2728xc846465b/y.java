package com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b;

/* loaded from: classes.dex */
public final class y implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e0 f290918d;

    public y(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e0 e0Var) {
        this.f290918d = e0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e0 e0Var = this.f290918d;
        if (itemId == 1) {
            j75.f Q6 = e0Var.Q6();
            if (Q6 != null) {
                Q6.B3(new xi5.e(1));
                return;
            }
            return;
        }
        if (itemId != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(pf5.o.TAG, "showForwardToWeWorkBottomSheet: menuItem.itemId:" + menuItem.getItemId());
        } else {
            j75.f Q62 = e0Var.Q6();
            if (Q62 != null) {
                Q62.B3(new xi5.e(2));
            }
        }
    }
}
