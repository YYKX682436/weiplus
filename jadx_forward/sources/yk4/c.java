package yk4;

/* loaded from: classes3.dex */
public final class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c f544367d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c) {
        this.f544367d = c18713x3be2dc6c;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        float intValue = ((java.lang.Integer) animatedValue).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c = this.f544367d;
        android.view.ViewGroup.LayoutParams layoutParams = c18713x3be2dc6c.m72075x623e5088().getLayoutParams();
        layoutParams.width = a06.d.b(intValue);
        c18713x3be2dc6c.m72075x623e5088().setLayoutParams(layoutParams);
        c18713x3be2dc6c.m72075x623e5088().setAlpha(intValue / c18713x3be2dc6c.getReplyBtnWidth());
    }
}
