package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class dc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 f228371d;

    public dc(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13) {
        this.f228371d = activityC16373x8a110f13;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.f227774x2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "showLuckyHbDlg() onMMMenuItemSelected menuItemId:%s", java.lang.Integer.valueOf(menuItem.getItemId()));
        int itemId = menuItem.getItemId();
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.G2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = this.f228371d;
        if (itemId == i18) {
            activityC16373x8a110f13.P1 = 1;
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.e7 e7Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.e7) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.e7.class);
            java.lang.String str = activityC16373x8a110f13.E1;
            ((h30.k) e7Var).getClass();
            o22.i.b(activityC16373x8a110f13, 4, str);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6824xd593096d c6824xd593096d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6824xd593096d();
            activityC16373x8a110f13.L1 = c6824xd593096d;
            c6824xd593096d.f141469d = 4L;
            c6824xd593096d.k();
            return;
        }
        if (itemId == com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.H2) {
            activityC16373x8a110f13.P1 = 2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.X6(activityC16373x8a110f13);
            return;
        }
        if (itemId == com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.I2) {
            activityC16373x8a110f13.O1 = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16405x4886faea c16405x4886faea = activityC16373x8a110f13.f227788i;
            if (c16405x4886faea != null) {
                c16405x4886faea.f228207f.setTag("");
                c16405x4886faea.f228208g.setVisibility(0);
                c16405x4886faea.f228209h.setVisibility(8);
            }
            activityC16373x8a110f13.K1 = null;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6824xd593096d c6824xd593096d2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6824xd593096d();
            activityC16373x8a110f13.L1 = c6824xd593096d2;
            c6824xd593096d2.f141469d = 5L;
            c6824xd593096d2.k();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.W6(activityC16373x8a110f13, 24);
        }
    }
}
