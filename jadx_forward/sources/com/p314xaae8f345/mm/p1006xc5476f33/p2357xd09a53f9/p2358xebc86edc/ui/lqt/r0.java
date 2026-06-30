package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes3.dex */
public class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.du4 f259880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b f259881e;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b, r45.du4 du4Var) {
        this.f259881e = activityC19013x23c3e97b;
        this.f259880d = du4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.du4 du4Var = this.f259880d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "click lqt refactor fixed deposit view with urltype : %d", java.lang.Integer.valueOf(du4Var.f454285h));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(29559, "4", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        int i17 = du4Var.f454285h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b = this.f259881e;
        if (i17 == 2) {
            java.lang.String str = du4Var.f454283f;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "open fixed deposit h5 with url : %s", str);
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.X(activityC19013x23c3e97b, str, false);
            }
        } else if (i17 == 3) {
            java.lang.String str2 = du4Var.f454286i;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "open fixed deposit tinyapp with username : %s", str2);
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(str2, du4Var.f454283f, 0, 1061);
            }
        } else if (i17 == 1) {
            java.lang.String str3 = du4Var.f454283f;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "open native fixed deposit with url: %s", str3);
                if ("wxpay://lqt/fixeddeposit/makeplan".equals(du4Var.f454283f)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "go to lqt make plan");
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b.R1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b.U6(activityC19013x23c3e97b, activityC19013x23c3e97b.Z6(), du4Var, activityC19013x23c3e97b.f259501v);
                    g0Var.d(22449, 2);
                    ((h45.q) i95.n0.c(h45.q.class)).mo24817xf6e2c929(activityC19013x23c3e97b.mo55332x76847179(), new android.os.Bundle());
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_FIXED_DEPOSIT_HAS_SHOW_ENTRANCE_TIPS_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                } else if ("wxpay://lqt/fixeddeposit/planlist".equals(du4Var.f454283f)) {
                    g0Var.d(22449, 2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "go to lqt plan list");
                    int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b.R1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b.U6(activityC19013x23c3e97b, activityC19013x23c3e97b.Z6(), du4Var, activityC19013x23c3e97b.f259501v);
                    ((h45.q) i95.n0.c(h45.q.class)).mo24818x58c4fdf9(activityC19013x23c3e97b.mo55332x76847179(), new android.os.Bundle());
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_FIXED_DEPOSIT_HAS_SHOW_ENTRANCE_TIPS_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
