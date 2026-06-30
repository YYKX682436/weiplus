package cj5;

/* loaded from: classes3.dex */
public final class t0 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.d1 f123770d;

    public t0(cj5.d1 d1Var) {
        this.f123770d = d1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public final void w2(int i17, boolean z17) {
        android.animation.ObjectAnimator ofFloat;
        android.animation.ObjectAnimator objectAnimator;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactBottomMenuUIC", "height:%s", java.lang.Integer.valueOf(i17));
        cj5.d1 d1Var = this.f123770d;
        android.animation.ObjectAnimator objectAnimator2 = d1Var.f123632n;
        if ((objectAnimator2 != null && objectAnimator2.isRunning()) && (objectAnimator = d1Var.f123632n) != null) {
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
        d1Var.f123632n = ofFloat;
        android.animation.ObjectAnimator objectAnimator3 = d1Var.f123632n;
        if (objectAnimator3 != null) {
            objectAnimator3.setDuration(200L);
        }
        android.animation.ObjectAnimator objectAnimator4 = d1Var.f123632n;
        if (objectAnimator4 != null) {
            objectAnimator4.setInterpolator(new y3.b());
        }
        android.animation.ObjectAnimator objectAnimator5 = d1Var.f123632n;
        if (objectAnimator5 != null) {
            objectAnimator5.addUpdateListener(cj5.s0.f123765d);
        }
        android.animation.ObjectAnimator objectAnimator6 = d1Var.f123632n;
        if (objectAnimator6 != null) {
            objectAnimator6.start();
        }
    }
}
