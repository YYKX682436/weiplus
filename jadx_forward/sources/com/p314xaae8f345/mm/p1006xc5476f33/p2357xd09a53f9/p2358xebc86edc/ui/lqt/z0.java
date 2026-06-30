package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b f259996d;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b) {
        this.f259996d = activityC19013x23c3e97b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b.R1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b = this.f259996d;
        if (activityC19013x23c3e97b.c7()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(29559, "1", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        boolean z17 = x51.o1.f533575a;
        r45.zg5 zg5Var = activityC19013x23c3e97b.f259485f;
        r45.e54 e54Var = zg5Var.M;
        if (e54Var != null && e54Var.f454557g && zg5Var.T != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.e3.b(activityC19013x23c3e97b.mo55332x76847179(), activityC19013x23c3e97b.f259485f.T);
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        activityC19013x23c3e97b.f259484e.f259291e.b(zg5Var.C, 1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19013x23c3e97b.f259485f.f473561w)) {
            r45.e54 e54Var2 = activityC19013x23c3e97b.f259485f.M;
            if (e54Var2 == null) {
                activityC19013x23c3e97b.b7("", new android.content.Intent(activityC19013x23c3e97b, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.class));
            } else if (e54Var2.f454554d != 1 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e54Var2.f454555e)) {
                int i18 = e54Var2.f454554d;
                if (i18 == 2) {
                    com.p314xaae8f345.mm.p2802xd031a825.ui.r1.X(activityC19013x23c3e97b.mo55332x76847179(), e54Var2.f454555e, true);
                } else if (i18 == 3) {
                    com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(e54Var2.f454556f, e54Var2.f454555e, 0, 1061);
                } else {
                    activityC19013x23c3e97b.b7("", new android.content.Intent(activityC19013x23c3e97b, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.class));
                }
            } else {
                activityC19013x23c3e97b.b7(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.a(e54Var2.f454555e), new android.content.Intent(activityC19013x23c3e97b, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.class));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "click save button, go to block url: %s", activityC19013x23c3e97b.f259485f.f473561w);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.X(activityC19013x23c3e97b, activityC19013x23c3e97b.f259485f.f473561w, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
