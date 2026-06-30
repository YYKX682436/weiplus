package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes4.dex */
public class l7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22322x8ea5381a.OpenIMAddressUIFragment f288541d;

    public l7(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22322x8ea5381a.OpenIMAddressUIFragment openIMAddressUIFragment) {
        this.f288541d = openIMAddressUIFragment;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22322x8ea5381a.OpenIMAddressUIFragment openIMAddressUIFragment = this.f288541d;
        if (itemId == 1 || itemId == 2) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22322x8ea5381a.OpenIMAddressUIFragment.l0(openIMAddressUIFragment, openIMAddressUIFragment.f288055h, true);
            return;
        }
        if (itemId != 7) {
            return;
        }
        java.lang.String str = openIMAddressUIFragment.f288055h;
        openIMAddressUIFragment.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
        if (n17.r2()) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", n17.d1());
            intent.putExtra("view_mode", true);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.m(intent, openIMAddressUIFragment.mo7438x76847179());
        }
    }
}
