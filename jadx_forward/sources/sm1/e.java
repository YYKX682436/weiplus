package sm1;

/* loaded from: classes3.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 f490851d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa7) {
        this.f490851d = c12827x691a1aa7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        float intValue = ((java.lang.Integer) animatedValue).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa7 = this.f490851d;
        android.view.ViewGroup.LayoutParams layoutParams = c12827x691a1aa7.m53847x623e5088().getLayoutParams();
        layoutParams.width = a06.d.b(intValue);
        c12827x691a1aa7.m53847x623e5088().setLayoutParams(layoutParams);
        c12827x691a1aa7.m53847x623e5088().setAlpha(intValue / c12827x691a1aa7.getReplyBtnWidth());
    }
}
