package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class t9 implements qp5.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb f239495a;

    public t9(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb activityC17155x7c2f4bb) {
        this.f239495a = activityC17155x7c2f4bb;
    }

    @Override // qp5.k0
    public void a(java.lang.CharSequence charSequence) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb activityC17155x7c2f4bb = this.f239495a;
        int i17 = activityC17155x7c2f4bb.f239150z;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MerchantPayUI", "mAmountRemindBit == 0");
            activityC17155x7c2f4bb.I.setVisibility(8);
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
        if (i18 < activityC17155x7c2f4bb.f239150z) {
            activityC17155x7c2f4bb.I.setVisibility(8);
            return;
        }
        int k17 = activityC17155x7c2f4bb.f239135h.k(charSequence, activityC17155x7c2f4bb.M, i19);
        if (k17 == 0) {
            activityC17155x7c2f4bb.I.setVisibility(8);
            return;
        }
        activityC17155x7c2f4bb.I.setVisibility(0);
        activityC17155x7c2f4bb.L.setText(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.b2.a(i18));
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) activityC17155x7c2f4bb.K.getLayoutParams();
        layoutParams.leftMargin = k17;
        activityC17155x7c2f4bb.K.setLayoutParams(layoutParams);
    }
}
