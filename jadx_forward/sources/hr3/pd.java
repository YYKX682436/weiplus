package hr3;

/* loaded from: classes3.dex */
public final class pd implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f365418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.rd f365419e;

    public pd(android.view.ViewGroup.LayoutParams layoutParams, hr3.rd rdVar) {
        this.f365418d = layoutParams;
        this.f365419e = rdVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        android.view.ViewGroup.LayoutParams layoutParams = this.f365418d;
        layoutParams.height = intValue;
        ((android.widget.LinearLayout) ((jz5.n) this.f365419e.f365483d).mo141623x754a37bb()).setLayoutParams(layoutParams);
    }
}
