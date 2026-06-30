package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes9.dex */
public class d1 implements qp5.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 f238194a;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 activityC17121x70367c94) {
        this.f238194a = activityC17121x70367c94;
    }

    @Override // qp5.k0
    public void a(java.lang.CharSequence charSequence) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 activityC17121x70367c94 = this.f238194a;
        int i17 = activityC17121x70367c94.f238153m;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "mAmountRemindBit == 0");
            activityC17121x70367c94.H.setVisibility(8);
            return;
        }
        long longValue = new java.lang.Double(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(charSequence.toString(), 0.0d)).longValue();
        int i18 = 0;
        int i19 = 0;
        while (longValue != 0) {
            int i27 = (int) (longValue % 10);
            longValue /= 10;
            i18++;
            i19 = i27;
        }
        if (i18 < activityC17121x70367c94.f238153m) {
            activityC17121x70367c94.H.setVisibility(8);
            return;
        }
        int k17 = activityC17121x70367c94.E.k(charSequence, activityC17121x70367c94.f238161t, i19);
        if (k17 == 0) {
            activityC17121x70367c94.H.setVisibility(8);
            return;
        }
        activityC17121x70367c94.H.setVisibility(0);
        activityC17121x70367c94.G.setText(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.b2.a(i18));
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) activityC17121x70367c94.F.getLayoutParams();
        layoutParams.leftMargin = k17;
        activityC17121x70367c94.F.setLayoutParams(layoutParams);
    }
}
