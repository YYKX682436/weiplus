package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes10.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19007xc161a489 f259862d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19007xc161a489 activityC19007xc161a489) {
        this.f259862d = activityC19007xc161a489;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletKnowLqtFullScreenVideoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19007xc161a489 activityC19007xc161a489 = this.f259862d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.l lVar = activityC19007xc161a489.f259453d;
        java.lang.Integer valueOf = lVar != null ? java.lang.Integer.valueOf(lVar.m73836xfa6224fa()) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletKnowLqtFullScreenVideoUIUI", "click play controller, state: " + valueOf);
        if ((valueOf != null && valueOf.intValue() == 7) || (valueOf != null && valueOf.intValue() == 1)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.l lVar2 = activityC19007xc161a489.f259453d;
            if (lVar2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c.r(lVar2, null, 0L, 1, null);
            }
            android.widget.ImageView imageView = activityC19007xc161a489.f259456g;
            if (imageView != null) {
                imageView.setImageDrawable(activityC19007xc161a489.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563421ah5));
            }
        } else if (valueOf != null && valueOf.intValue() == 6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.l lVar3 = activityC19007xc161a489.f259453d;
            if (lVar3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c.r(lVar3, null, 0L, 3, null);
            }
            android.widget.ImageView imageView2 = activityC19007xc161a489.f259456g;
            if (imageView2 != null) {
                imageView2.setImageDrawable(activityC19007xc161a489.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563421ah5));
            }
        } else {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.l lVar4 = activityC19007xc161a489.f259453d;
                if (lVar4 != null) {
                    lVar4.q();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletKnowLqtFullScreenVideoUIUI", "pause has exception" + e17);
            }
            android.widget.ImageView imageView3 = activityC19007xc161a489.f259456g;
            if (imageView3 != null) {
                imageView3.setImageDrawable(activityC19007xc161a489.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ah6));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletKnowLqtFullScreenVideoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
