package r50;

/* loaded from: classes5.dex */
public final class m implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f474136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f474137e;

    public m(android.view.ViewGroup.LayoutParams layoutParams, r50.j0 j0Var) {
        this.f474136d = layoutParams;
        this.f474137e = j0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        android.view.ViewGroup.LayoutParams layoutParams = this.f474136d;
        layoutParams.width = intValue;
        r50.j0 j0Var = this.f474137e;
        j0Var.W6().i().setLayoutParams(layoutParams);
        j0Var.W6().i().setAlpha(intValue / ((java.lang.Number) ((jz5.n) j0Var.f474128q).mo141623x754a37bb()).intValue());
        j0Var.W6().i().setVisibility(intValue == 0 ? 8 : 0);
    }
}
