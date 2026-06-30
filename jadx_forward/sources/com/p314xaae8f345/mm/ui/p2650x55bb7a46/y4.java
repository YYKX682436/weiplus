package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class y4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f287789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.s4 f287790e;

    public y4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.s4 s4Var, java.lang.String str) {
        this.f287790e = s4Var;
        this.f287789d = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent();
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.s4 s4Var = this.f287790e;
        if (itemId == 0) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var = s4Var.f284192b;
            java.lang.String str = this.f287789d;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.y(h4Var, str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.d(18890, 5, 0, str, "", "");
            g0Var.d(28838, 0, 1, 0, 0, 2);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.O(4, 0, s4Var.f284192b.f283180l);
            boolean Ri = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Ri();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.u(s4Var.f284192b, "view_clk", Ri);
            if (Ri) {
                g0Var.A(182, 218);
            }
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().a(56);
            return;
        }
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.w(s4Var.f284192b);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var2.d(11701, 1, 0, 0, 1, 3);
        intent.putExtra("key_username", s4Var.f284192b.I());
        intent.putExtra("key_way", 0);
        intent.putExtra("pay_channel", 11);
        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.s()) {
            j45.l.j(s4Var.f284192b.f283178j.g(), "luckymoney", ".ui.LuckyMoneyNewYearSendUI", intent, null);
        } else {
            j45.l.j(s4Var.f284192b.f283178j.g(), "luckymoney", ".ui.LuckyMoneyNewYearSendUIV2", intent, null);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6687x866492ce c6687x866492ce = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6687x866492ce();
            c6687x866492ce.f140232e = 1L;
            c6687x866492ce.f140231d = 17L;
            c6687x866492ce.k();
        }
        g0Var2.d(28838, 0, 1, 0, 0, 3);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67 c6646xbe932a67 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67();
        c6646xbe932a67.f139948d = 1L;
        c6646xbe932a67.k();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.O(5, 0, s4Var.f284192b.f283180l);
    }
}
