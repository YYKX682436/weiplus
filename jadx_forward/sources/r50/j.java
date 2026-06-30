package r50;

/* loaded from: classes5.dex */
public final class j implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f474116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f474117e;

    public j(android.view.ViewGroup.LayoutParams layoutParams, r50.j0 j0Var) {
        this.f474116d = layoutParams;
        this.f474117e = j0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        android.view.ViewGroup.LayoutParams layoutParams = this.f474116d;
        layoutParams.height = intValue;
        em.b W6 = this.f474117e.W6();
        if (W6.f335616f == null) {
            W6.f335616f = (android.widget.LinearLayout) W6.f335611a.findViewById(com.p314xaae8f345.mm.R.id.dfl);
        }
        W6.f335616f.setLayoutParams(layoutParams);
    }
}
