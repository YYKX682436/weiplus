package tl2;

/* loaded from: classes3.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u4.m1 f501773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f501774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f501775f;

    public b(u4.m1 m1Var, int i17, int i18) {
        this.f501773d = m1Var;
        this.f501774e = i17;
        this.f501775f = i18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        u4.m1 m1Var = this.f501773d;
        android.graphics.drawable.Drawable background = (m1Var == null || (view = m1Var.f506048b) == null) ? null : view.getBackground();
        if (background == null) {
            return;
        }
        int i17 = this.f501774e;
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        background.setAlpha((int) (i17 - (((java.lang.Float) animatedValue).floatValue() * (i17 - this.f501775f))));
    }
}
