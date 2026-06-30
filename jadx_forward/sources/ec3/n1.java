package ec3;

/* loaded from: classes2.dex */
public final class n1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f332599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f332600e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f332601f;

    public n1(android.view.ViewGroup.LayoutParams layoutParams, android.widget.RelativeLayout relativeLayout, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        this.f332599d = layoutParams;
        this.f332600e = relativeLayout;
        this.f332601f = c0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        if (f17 != null) {
            int floatValue = (int) f17.floatValue();
            android.view.ViewGroup.LayoutParams layoutParams = this.f332599d;
            layoutParams.height = floatValue;
            android.widget.RelativeLayout relativeLayout = this.f332600e;
            relativeLayout.setLayoutParams(layoutParams);
            if (!this.f332601f.f391645d || relativeLayout.getVisibility() == 0) {
                return;
            }
            relativeLayout.setVisibility(0);
        }
    }
}
