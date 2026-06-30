package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class v8 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f229067d;

    public v8(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d) {
        this.f229067d = activityC16371xf216ae6d;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "showLuckyHbDlg() onMMMenuItemSelected menuItemId:%s", java.lang.Integer.valueOf(menuItem.getItemId()));
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f229067d;
        if (itemId == 1) {
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.e7 e7Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.e7) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.e7.class);
            java.lang.String str = activityC16371xf216ae6d.L1;
            ((h30.k) e7Var).getClass();
            o22.i.b(activityC16371xf216ae6d, 5, str);
            activityC16371xf216ae6d.f227719g2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6822xf8edc503();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6822xf8edc503 c6822xf8edc503 = activityC16371xf216ae6d.f227719g2;
            if (c6822xf8edc503 != null) {
                c6822xf8edc503.f141465d = 4L;
            }
            if (c6822xf8edc503 != null) {
                c6822xf8edc503.k();
            }
            activityC16371xf216ae6d.f227725i2 = 1;
            return;
        }
        if (itemId == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d.Z6(activityC16371xf216ae6d);
            return;
        }
        if (itemId != 3) {
            return;
        }
        activityC16371xf216ae6d.Z1 = null;
        activityC16371xf216ae6d.f227719g2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6822xf8edc503();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6822xf8edc503 c6822xf8edc5032 = activityC16371xf216ae6d.f227719g2;
        if (c6822xf8edc5032 != null) {
            c6822xf8edc5032.f141465d = 8L;
        }
        if (c6822xf8edc5032 != null) {
            c6822xf8edc5032.k();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d.b7(activityC16371xf216ae6d, 1, null, 2, null);
    }
}
