package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class j9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9 f171342d;

    public j9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9 c9Var) {
        this.f171342d = c9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int m52961x319751e8;
        int m52963x22633c35;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUILoadingSplash", "animateHide, start hide with animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9 c9Var = this.f171342d;
        android.view.ViewParent parent = c9Var.getParent();
        if (!(parent instanceof android.view.ViewGroup)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUILoadingSplash", "animateHide, wrong ViewGroup");
            return;
        }
        c9Var.B.e();
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(255, 0);
        m52961x319751e8 = c9Var.m52961x319751e8();
        ofInt.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.h9(this, m52961x319751e8, parent));
        ofInt.setStartDelay(java.lang.Math.round(160.0f));
        ofInt.setDuration(java.lang.Math.round(40.0f));
        ofInt.setInterpolator(new y3.a());
        ofInt.start();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(java.lang.Math.round(160.0f));
        m52963x22633c35 = c9Var.m52963x22633c35();
        ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.i9(this, m52963x22633c35));
        ofFloat.setInterpolator(new y3.b());
        ofFloat.start();
    }
}
