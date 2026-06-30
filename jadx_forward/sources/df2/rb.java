package df2;

/* loaded from: classes10.dex */
public final class rb implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zb f312774d;

    public rb(df2.zb zbVar) {
        this.f312774d = zbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        df2.zb zbVar = this.f312774d;
        android.view.View S6 = zbVar.S6(com.p314xaae8f345.mm.R.id.u_y);
        if (S6 != null) {
            android.view.View S62 = zbVar.S6(com.p314xaae8f345.mm.R.id.u_y);
            android.view.ViewGroup.LayoutParams layoutParams = S62 != null ? S62.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.width = intValue;
            }
            S6.setLayoutParams(layoutParams);
        }
        android.view.View i76 = zbVar.i7();
        if (i76 != null) {
            i76.requestLayout();
        }
    }
}
