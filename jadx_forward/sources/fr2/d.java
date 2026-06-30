package fr2;

/* loaded from: classes2.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f347244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f347245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f347246f;

    public d(android.view.View view, int i17, int i18) {
        this.f347244d = view;
        this.f347245e = i17;
        this.f347246f = i18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        android.view.View view = this.f347244d;
        view.getLayoutParams().width = (int) (this.f347245e + ((this.f347246f - r2) * animatedFraction));
        view.requestLayout();
    }
}
