package xt2;

/* loaded from: classes3.dex */
public final class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f538146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f538147e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f538148f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f538149g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f538150h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f538151i;

    public a3(boolean z17, boolean z18, xt2.e3 e3Var, r45.y23 y23Var, boolean z19, cm2.m0 m0Var) {
        this.f538146d = z17;
        this.f538147e = z18;
        this.f538148f = e3Var;
        this.f538149g = y23Var;
        this.f538150h = z19;
        this.f538151i = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator duration;
        boolean z17 = this.f538147e;
        xt2.e3 e3Var = this.f538148f;
        boolean z18 = this.f538146d;
        if (z18 || z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e3Var.f538239h, "showShoppingBubble: deferred updatePriceView, deferPlay=" + z18 + ", playingNow=" + z17 + ", productId=" + this.f538149g.m75942xfb822ef2(0));
            return;
        }
        if (!this.f538150h) {
            e3Var.m(this.f538151i);
            return;
        }
        float S = pm0.v.S(-10);
        android.view.ViewPropertyAnimator animate = e3Var.f538252w.animate();
        if (animate == null || (alpha = animate.alpha(0.0f)) == null || (translationY = alpha.translationY(S)) == null || (duration = translationY.setDuration(300L)) == null) {
            return;
        }
        duration.withEndAction(new xt2.z2(this.f538148f, this.f538151i, S, 300L));
    }
}
