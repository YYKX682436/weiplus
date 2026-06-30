package r50;

/* loaded from: classes5.dex */
public final class k implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout.LayoutParams f474132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f474133e;

    public k(android.widget.LinearLayout.LayoutParams layoutParams, r50.j0 j0Var) {
        this.f474132d = layoutParams;
        this.f474133e = j0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        r50.j0 j0Var = this.f474133e;
        boolean V6 = j0Var.V6();
        jz5.g gVar = j0Var.f474125n;
        int intValue2 = V6 ? ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() + intValue : (intValue * 2) - ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
        android.widget.LinearLayout.LayoutParams layoutParams = this.f474132d;
        layoutParams.leftMargin = intValue2;
        layoutParams.rightMargin = intValue;
        j0Var.W6().d().setLayoutParams(layoutParams);
    }
}
