package cj5;

/* loaded from: classes3.dex */
public final class t0 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.d1 f42237d;

    public t0(cj5.d1 d1Var) {
        this.f42237d = d1Var;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        android.animation.ObjectAnimator ofFloat;
        android.animation.ObjectAnimator objectAnimator;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactBottomMenuUIC", "height:%s", java.lang.Integer.valueOf(i17));
        cj5.d1 d1Var = this.f42237d;
        android.animation.ObjectAnimator objectAnimator2 = d1Var.f42099n;
        if ((objectAnimator2 != null && objectAnimator2.isRunning()) && (objectAnimator = d1Var.f42099n) != null) {
            objectAnimator.cancel();
        }
        if (i17 > 0) {
            if (!(d1Var.T6().o().getTranslationY() == 0.0f)) {
                d1Var.T6().o().setTranslationY(0.0f);
            }
            ofFloat = android.animation.ObjectAnimator.ofFloat(d1Var.T6().o(), "translationY", 0.0f, -i17);
        } else {
            ofFloat = android.animation.ObjectAnimator.ofFloat(d1Var.T6().o(), "translationY", d1Var.T6().o().getTranslationY(), 0.0f);
        }
        d1Var.f42099n = ofFloat;
        android.animation.ObjectAnimator objectAnimator3 = d1Var.f42099n;
        if (objectAnimator3 != null) {
            objectAnimator3.setDuration(200L);
        }
        android.animation.ObjectAnimator objectAnimator4 = d1Var.f42099n;
        if (objectAnimator4 != null) {
            objectAnimator4.setInterpolator(new y3.b());
        }
        android.animation.ObjectAnimator objectAnimator5 = d1Var.f42099n;
        if (objectAnimator5 != null) {
            objectAnimator5.addUpdateListener(cj5.s0.f42232d);
        }
        android.animation.ObjectAnimator objectAnimator6 = d1Var.f42099n;
        if (objectAnimator6 != null) {
            objectAnimator6.start();
        }
    }
}
