package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class v6 implements qp5.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17135x4b12f675 f239527a;

    public v6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17135x4b12f675 activityC17135x4b12f675) {
        this.f239527a = activityC17135x4b12f675;
    }

    @Override // qp5.k0
    public void a(java.lang.CharSequence charSequence) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17135x4b12f675 activityC17135x4b12f675 = this.f239527a;
        int i17 = activityC17135x4b12f675.f238953p;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceF2fLargeMoneyUI", "mAmountRemindBit == 0");
            activityC17135x4b12f675.f238951n.setVisibility(8);
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
        if (i18 < activityC17135x4b12f675.f238953p) {
            activityC17135x4b12f675.f238951n.setVisibility(8);
            return;
        }
        int k17 = activityC17135x4b12f675.f238947g.k(charSequence, activityC17135x4b12f675.f238954q, i19) + activityC17135x4b12f675.f238947g.getLeft();
        if (k17 == 0) {
            activityC17135x4b12f675.f238951n.setVisibility(8);
            return;
        }
        activityC17135x4b12f675.f238951n.setVisibility(0);
        activityC17135x4b12f675.f238950m.setText(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.b2.a(i18));
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) activityC17135x4b12f675.f238949i.getLayoutParams();
        layoutParams.leftMargin = k17;
        activityC17135x4b12f675.f238949i.setLayoutParams(layoutParams);
    }
}
