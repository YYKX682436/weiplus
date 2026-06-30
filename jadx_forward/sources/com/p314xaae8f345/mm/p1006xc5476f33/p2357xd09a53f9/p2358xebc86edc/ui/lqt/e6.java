package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class e6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.f6 f259692d;

    public e6(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.f6 f6Var) {
        this.f259692d = f6Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.f6 f6Var = this.f259692d;
        if (itemId < f6Var.f259707a.size()) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(f6Var.f259708b, ((java.lang.String) f6Var.f259707a.get(itemId)).split("\\|\\|")[1], false);
        }
    }
}
