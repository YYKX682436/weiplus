package at2;

/* loaded from: classes3.dex */
public final class b1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.n1 f13639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f13640e;

    public b1(at2.n1 n1Var, kotlin.jvm.internal.f0 f0Var) {
        this.f13639d = n1Var;
        this.f13640e = f0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        dt2.a0 a0Var;
        kotlin.jvm.internal.o.g(it, "it");
        at2.n1 n1Var = this.f13639d;
        at2.u1 u1Var = (at2.u1) n1Var.X0(at2.u1.class);
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = (u1Var == null || (a0Var = u1Var.f13762q) == null) ? null : a0Var.f243158a;
        if (finderLiveThumbPlayerProxy != null) {
            java.lang.Object animatedValue = it.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            finderLiveThumbPlayerProxy.setAlpha(1 - ((java.lang.Float) animatedValue).floatValue());
        }
        int i17 = this.f13640e.f310116d;
        java.lang.Object animatedValue2 = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        int floatValue = i17 - ((int) (i17 * ((java.lang.Float) animatedValue2).floatValue()));
        java.lang.Object value = ((jz5.n) n1Var.f13719u).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.widget.TextView) value).setText(java.lang.String.valueOf(floatValue));
    }
}
