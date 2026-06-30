package pa5;

/* loaded from: classes3.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f434635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f434636e;

    public e(android.view.View view, float f17) {
        this.f434635d = view;
        this.f434636e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        android.view.View view = this.f434635d;
        float alpha = view.getAlpha() + ((this.f434636e - view.getAlpha()) * animatedFraction);
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background == null) {
            return;
        }
        background.setAlpha((int) (255 * alpha));
    }
}
