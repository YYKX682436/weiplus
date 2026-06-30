package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class i0 implements qp5.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2 f154212b;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2 activityC11343xa72aeaf2, int i17) {
        this.f154212b = activityC11343xa72aeaf2;
        this.f154211a = i17;
    }

    @Override // qp5.k0
    public void a(java.lang.CharSequence charSequence) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        int i17 = this.f154211a;
        boolean z18 = i17 == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2 activityC11343xa72aeaf2 = this.f154212b;
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AARemittanceUI", "mAmountRemindBit == 0");
            activityC11343xa72aeaf2.f153995r.setVisibility(8);
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
        if (i18 < i17) {
            activityC11343xa72aeaf2.f153995r.setVisibility(8);
            return;
        }
        int k17 = activityC11343xa72aeaf2.f153992o.k(charSequence, activityC11343xa72aeaf2.f153987g, i19);
        if (k17 == 0) {
            activityC11343xa72aeaf2.f153995r.setVisibility(8);
            return;
        }
        activityC11343xa72aeaf2.f153995r.setVisibility(0);
        activityC11343xa72aeaf2.f153994q.setText(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.b2.a(i18));
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) activityC11343xa72aeaf2.f153993p.getLayoutParams();
        layoutParams.leftMargin = k17;
        activityC11343xa72aeaf2.f153993p.setLayoutParams(layoutParams);
    }
}
