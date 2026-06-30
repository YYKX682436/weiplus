package xt2;

/* loaded from: classes3.dex */
public final class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f538647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f538648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f538649f;

    public y2(xt2.e3 e3Var, float f17, long j17) {
        this.f538647d = e3Var;
        this.f538648e = f17;
        this.f538649f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator translationY;
        xt2.e3 e3Var = this.f538647d;
        e3Var.f538252w.setTranslationY(-this.f538648e);
        android.view.ViewPropertyAnimator animate = e3Var.f538252w.animate();
        if (animate == null || (alpha = animate.alpha(1.0f)) == null || (translationY = alpha.translationY(0.0f)) == null) {
            return;
        }
        translationY.setDuration(this.f538649f);
    }
}
