package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes3.dex */
public class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b f259979d;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b) {
        this.f259979d = activityC19013x23c3e97b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "click top biz");
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b = this.f259979d;
        r45.du4 du4Var = activityC19013x23c3e97b.f259485f.L;
        int i17 = du4Var.f454285h;
        if (i17 == 2) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(du4Var.f454283f)) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.X(activityC19013x23c3e97b, activityC19013x23c3e97b.f259485f.L.f454283f, false);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16807, 1, 2, activityC19013x23c3e97b.f259485f.L.f454283f);
            }
        } else if (i17 == 3 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(du4Var.f454286i) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19013x23c3e97b.f259485f.L.f454283f)) {
            r45.du4 du4Var2 = activityC19013x23c3e97b.f259485f.L;
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(du4Var2.f454286i, du4Var2.f454283f, 0, 1061);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            r45.du4 du4Var3 = activityC19013x23c3e97b.f259485f.L;
            g0Var.d(16807, 1, 3, du4Var3.f454283f, du4Var3.f454286i);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
