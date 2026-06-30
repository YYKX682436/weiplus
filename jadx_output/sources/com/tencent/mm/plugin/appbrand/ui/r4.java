package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class r4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f89977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.w4 f89978e;

    public r4(com.tencent.mm.plugin.appbrand.ui.w4 w4Var, yz5.a aVar) {
        this.f89978e = w4Var;
        this.f89977d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.w4 w4Var = this.f89978e;
        android.view.ViewParent parent = w4Var.getParent();
        if (!(parent instanceof android.view.ViewGroup)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameUILoadingSplash", "animateHide, wrong ViewGroup");
            return;
        }
        w4Var.H.e();
        android.view.ViewPropertyAnimator animate = w4Var.animate();
        animate.setStartDelay(((float) animate.getDuration()) * 0.8f);
        animate.setDuration(((float) animate.getDuration()) * 1.0f);
        animate.setListener(new com.tencent.mm.plugin.appbrand.ui.q4(this, parent));
        animate.alpha(0.0f).start();
    }
}
