package rp1;

/* loaded from: classes10.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.animation.ObjectAnimator f479903a;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12921xde8d5499 c12921xde8d5499, boolean z17) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "percent", 0.1f, 1.0f);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.setDuration(c12921xde8d5499.f174984g);
        ofFloat.addListener(new rp1.c0(c12921xde8d5499, this));
        this.f479903a = ofFloat;
        if (z17) {
            ofFloat.start();
        }
    }
}
