package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes3.dex */
public class a2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b f259622d;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b) {
        this.f259622d = activityC19013x23c3e97b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$45", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b = this.f259622d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "click security entry, url type is : %d", java.lang.Integer.valueOf(activityC19013x23c3e97b.f259485f.Z.f454285h));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(17084, 21);
        r45.du4 du4Var = activityC19013x23c3e97b.f259485f.Z;
        int i17 = du4Var.f454285h;
        if (i17 == 2) {
            java.lang.String str = du4Var.f454283f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "jump to h5 with url : %s", str);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.X(activityC19013x23c3e97b, str, false);
        } else if (i17 == 3) {
            java.lang.String str2 = du4Var.f454286i;
            java.lang.String str3 = du4Var.f454283f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "jump to tinyapp with username : %s, path : %s", str2, str3);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(str2, str3, 0, 1061);
        }
        if (activityC19013x23c3e97b.D1.getVisibility() == 0) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAY_LQT_SECURITY_REDDOT_TIME_INT_SYNC, -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "report click security reddot");
            g0Var.d(17084, 23);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$45", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
