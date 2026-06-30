package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class j9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.c9 f89809d;

    public j9(com.tencent.mm.plugin.appbrand.ui.c9 c9Var) {
        this.f89809d = c9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int bgColor;
        int nameTextColor;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUILoadingSplash", "animateHide, start hide with animation");
        com.tencent.mm.plugin.appbrand.ui.c9 c9Var = this.f89809d;
        android.view.ViewParent parent = c9Var.getParent();
        if (!(parent instanceof android.view.ViewGroup)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUILoadingSplash", "animateHide, wrong ViewGroup");
            return;
        }
        c9Var.B.e();
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(255, 0);
        bgColor = c9Var.getBgColor();
        ofInt.addUpdateListener(new com.tencent.mm.plugin.appbrand.ui.h9(this, bgColor, parent));
        ofInt.setStartDelay(java.lang.Math.round(160.0f));
        ofInt.setDuration(java.lang.Math.round(40.0f));
        ofInt.setInterpolator(new y3.a());
        ofInt.start();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(java.lang.Math.round(160.0f));
        nameTextColor = c9Var.getNameTextColor();
        ofFloat.addUpdateListener(new com.tencent.mm.plugin.appbrand.ui.i9(this, nameTextColor));
        ofFloat.setInterpolator(new y3.b());
        ofFloat.start();
    }
}
