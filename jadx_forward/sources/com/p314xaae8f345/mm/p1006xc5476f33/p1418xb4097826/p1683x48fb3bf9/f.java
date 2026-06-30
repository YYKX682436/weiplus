package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public final class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.AbstractC15490x816864c7 f218398d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.AbstractC15490x816864c7 abstractC15490x816864c7, float f17, float f18) {
        this.f218398d = abstractC15490x816864c7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.AbstractC15490x816864c7 abstractC15490x816864c7 = this.f218398d;
        android.view.View view = abstractC15490x816864c7.f218324m;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dialogContainer");
            throw null;
        }
        float translationY = view.getTranslationY();
        android.widget.LinearLayout linearLayout = abstractC15490x816864c7.f218327p;
        if (linearLayout != null) {
            linearLayout.setTranslationY(translationY - 0);
        }
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        abstractC15490x816864c7.m63315x461dcb18((((java.lang.Float) animatedValue).floatValue() * 0.0f) + 0.0f);
    }
}
