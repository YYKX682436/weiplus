package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes3.dex */
public class z1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b f259997d;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b) {
        this.f259997d = activityC19013x23c3e97b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$44", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b = this.f259997d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "click middle banner with urltype : %d", java.lang.Integer.valueOf(activityC19013x23c3e97b.f259485f.f473553p0.f454285h));
        r45.du4 du4Var = activityC19013x23c3e97b.f259485f.f473553p0;
        int i17 = du4Var.f454285h;
        if (i17 == 2) {
            java.lang.String str = du4Var.f454283f;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "open middle banner h5 with url : %s", str);
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.X(activityC19013x23c3e97b, str, false);
            }
        } else if (i17 == 3) {
            java.lang.String str2 = du4Var.f454286i;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "open middle banner tinyapp with username : %s", str2);
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(str2, activityC19013x23c3e97b.f259485f.f473553p0.f454283f, 0, 1061);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$44", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
