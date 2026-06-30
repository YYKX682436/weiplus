package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes5.dex */
public class p1 implements android.view.View.OnScrollChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b f259848a;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b) {
        this.f259848a = activityC19013x23c3e97b;
    }

    @Override // android.view.View.OnScrollChangeListener
    public void onScrollChange(android.view.View view, int i17, int i18, int i19, int i27) {
        zj0.b bVar = new zj0.b();
        bVar.c(view);
        bVar.b(i17);
        bVar.b(i18);
        bVar.b(i19);
        bVar.b(i27);
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$3", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V", this, bVar.a());
        int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b.R1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b = this.f259848a;
        if (!activityC19013x23c3e97b.c7()) {
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$3", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
            return;
        }
        int i29 = 0;
        while (true) {
            if (i29 >= activityC19013x23c3e97b.f259485f.C1.size()) {
                i29 = -1;
                break;
            } else if (((r45.k64) activityC19013x23c3e97b.f259485f.C1.get(i29)).f459970g == 2) {
                break;
            } else {
                i29++;
            }
        }
        if (i29 == -1) {
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$3", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "index is %d", java.lang.Integer.valueOf(i29));
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) activityC19013x23c3e97b.f259509z.getChildAt(i29 + 1).findViewById(com.p314xaae8f345.mm.R.id.iwx);
        if (viewGroup != null) {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            if (iArr[1] + viewGroup.getHeight() <= com.p314xaae8f345.mm.ui.bl.b(activityC19013x23c3e97b.mo55332x76847179()).y && !activityC19013x23c3e97b.f259505x1) {
                activityC19013x23c3e97b.f259505x1 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(29559, "5", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "view group is null");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$3", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
    }
}
