package cw2;

/* loaded from: classes2.dex */
public final class w0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9 f305607d;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9 c15175x44dff2e9) {
        this.f305607d = c15175x44dff2e9;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9 c15175x44dff2e9 = this.f305607d;
        android.view.ViewGroup.LayoutParams layoutParams = c15175x44dff2e9.m61209xcc04d8cb().getLayoutParams();
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.width = ((java.lang.Integer) animatedValue).intValue();
        c15175x44dff2e9.m61209xcc04d8cb().requestLayout();
    }
}
