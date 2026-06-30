package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class r4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f171510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4 f171511e;

    public r4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4 w4Var, yz5.a aVar) {
        this.f171511e = w4Var;
        this.f171510d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4 w4Var = this.f171511e;
        android.view.ViewParent parent = w4Var.getParent();
        if (!(parent instanceof android.view.ViewGroup)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGameUILoadingSplash", "animateHide, wrong ViewGroup");
            return;
        }
        w4Var.H.e();
        android.view.ViewPropertyAnimator animate = w4Var.animate();
        animate.setStartDelay(((float) animate.getDuration()) * 0.8f);
        animate.setDuration(((float) animate.getDuration()) * 1.0f);
        animate.setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.q4(this, parent));
        animate.alpha(0.0f).start();
    }
}
