package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class x5 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 f214849d;

    public x5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34) {
        this.f214849d = c15270x6d877a34;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        float intValue = ((java.lang.Integer) animatedValue).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34 = this.f214849d;
        android.view.ViewGroup.LayoutParams layoutParams = c15270x6d877a34.m61882x623e5088().getLayoutParams();
        layoutParams.width = a06.d.b(intValue);
        c15270x6d877a34.m61882x623e5088().setLayoutParams(layoutParams);
        c15270x6d877a34.m61882x623e5088().setAlpha(intValue / c15270x6d877a34.getReplyBtnWidth());
    }
}
