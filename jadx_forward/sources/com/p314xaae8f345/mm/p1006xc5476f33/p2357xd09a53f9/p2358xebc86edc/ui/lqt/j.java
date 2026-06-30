package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.C19006x5b654392 f259745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.rk5 f259746e;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.C19006x5b654392 c19006x5b654392, r45.rk5 rk5Var) {
        this.f259745d = c19006x5b654392;
        this.f259746e = rk5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/LqtSaveKeyboardToolBarLayout$getAmountTextView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.i onSelectAmount = this.f259745d.getOnSelectAmount();
        if (onSelectAmount != null) {
            int i17 = this.f259746e.f466503d;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.R1;
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb = ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.C19021x16fcea06) onSelectAmount).f259613a;
            activityC19020x7623dbfb.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17084, 34, java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "keyboard toolbar select amount: %d", java.lang.Integer.valueOf(i17));
            if (i17 % 100 == 0) {
                activityC19020x7623dbfb.f259589h.m83213x765074af(java.lang.String.valueOf(i17 / 100));
            } else {
                activityC19020x7623dbfb.f259589h.m83213x765074af(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(i17 / 100.0d));
            }
            activityC19020x7623dbfb.f259589h.m83169xe7297452().requestFocus();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/LqtSaveKeyboardToolBarLayout$getAmountTextView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
