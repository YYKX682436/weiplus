package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class r1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.s1 f228894d;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.s1 s1Var) {
        this.f228894d = s1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "showLuckyHbDlg() onMMMenuItemSelected menuItemId:%s", java.lang.Integer.valueOf(menuItem.getItemId()));
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.s1 s1Var = this.f228894d;
        if (itemId == 1) {
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.e7 e7Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.e7) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.e7.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = s1Var.f228931d;
            java.lang.String str = activityC16363x8a0a619d.L1;
            ((h30.k) e7Var).getClass();
            o22.i.b(activityC16363x8a0a619d, 5, str);
            s1Var.f228931d.f227595g2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6822xf8edc503();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6822xf8edc503 c6822xf8edc503 = s1Var.f228931d.f227595g2;
            c6822xf8edc503.f141465d = 4L;
            c6822xf8edc503.k();
            s1Var.f228931d.f227601i2 = 1;
            return;
        }
        if (itemId == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d.V6(s1Var.f228931d);
            return;
        }
        if (itemId != 3) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d2 = s1Var.f228931d;
        activityC16363x8a0a619d2.Z1 = null;
        activityC16363x8a0a619d2.f227595g2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6822xf8edc503();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6822xf8edc503 c6822xf8edc5032 = s1Var.f228931d.f227595g2;
        c6822xf8edc5032.f141465d = 8L;
        c6822xf8edc5032.k();
        s1Var.f228931d.Z6(1);
    }
}
