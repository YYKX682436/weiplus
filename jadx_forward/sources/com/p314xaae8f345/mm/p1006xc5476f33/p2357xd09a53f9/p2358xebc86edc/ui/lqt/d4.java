package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f259669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.e4 f259670e;

    public d4(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.e4 e4Var, boolean z17) {
        this.f259670e = e4Var;
        this.f259669d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 activityC19014x45f83936 = this.f259670e.f259690a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936.f259513y0;
        activityC19014x45f83936.getClass();
        float b17 = i65.a.b(activityC19014x45f83936, 56);
        float b18 = i65.a.b(activityC19014x45f83936, 86);
        boolean z17 = this.f259669d;
        if (!z17 || activityC19014x45f83936.V) {
            if (z17 || !activityC19014x45f83936.V) {
                return;
            }
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(activityC19014x45f83936.f259534y, "translationY", -activityC19014x45f83936.B, 0.0f);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
            ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.t3(activityC19014x45f83936, b17, b18));
            ofFloat.start();
            activityC19014x45f83936.f259531w.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u3(activityC19014x45f83936));
            activityC19014x45f83936.V = z17;
            return;
        }
        if (activityC19014x45f83936.B == 0) {
            activityC19014x45f83936.B = activityC19014x45f83936.f259517g.getBottom() + i65.a.b(activityC19014x45f83936, 6);
        }
        if (activityC19014x45f83936.B == 0) {
            activityC19014x45f83936.B = i65.a.b(activityC19014x45f83936, 132);
        }
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(activityC19014x45f83936.f259534y, "translationY", 0.0f, -activityC19014x45f83936.B);
        ofFloat2.setDuration(300L);
        ofFloat2.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat2.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.r3(activityC19014x45f83936, b17, b18));
        if (!activityC19014x45f83936.W) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanAddUI", "do not Scroll Lv ");
            return;
        }
        ofFloat2.start();
        activityC19014x45f83936.f259531w.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.s3(activityC19014x45f83936));
        activityC19014x45f83936.V = z17;
    }
}
