package w82;

/* loaded from: classes2.dex */
public final class r implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 f525456d;

    public r(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b194) {
        this.f525456d = c22642x62f5b194;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b194 = this.f525456d;
        c22642x62f5b194.getLayoutParams().height = intValue;
        c22642x62f5b194.requestLayout();
    }
}
