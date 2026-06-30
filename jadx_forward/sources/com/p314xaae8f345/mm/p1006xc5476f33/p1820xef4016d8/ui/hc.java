package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class hc implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f228523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 f228524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f228525c;

    public hc(android.app.Dialog dialog, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13, boolean z17) {
        this.f228523a = dialog;
        this.f228524b = activityC16373x8a110f13;
        this.f228525c = z17;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d
    public /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d
    public void b(java.lang.Object obj, int i17, int i18) {
        r45.co3 co3Var = (r45.co3) obj;
        android.app.Dialog dialog = this.f228523a;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = this.f228524b;
        if (co3Var == null) {
            java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.f227774x2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[openLocalEnvelopeLayout] netCallback failed");
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.K(activityC16373x8a110f13.mo55332x76847179(), "");
            return;
        }
        java.lang.ref.WeakReference weakReference2 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.f227774x2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[openLocalEnvelopeLayout] netCallback retcode: %s", java.lang.Integer.valueOf(co3Var.f453236d));
        if (co3Var.f453236d != 0) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.L(co3Var.f453237e);
            return;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.V6(activityC16373x8a110f13, co3Var.mo14344x5f01b1f6(), true, this.f228525c);
        } catch (java.lang.Exception e17) {
            java.lang.ref.WeakReference weakReference3 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.f227774x2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LuckyMoneyNewPrepareUI", e17, "", new java.lang.Object[0]);
        }
        android.widget.TextView textView = activityC16373x8a110f13.G;
        if (textView != null) {
            textView.setVisibility(8);
        }
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_STRING_SYNC, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_HOME_STRING_SYNC);
    }
}
