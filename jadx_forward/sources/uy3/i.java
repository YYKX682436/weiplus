package uy3;

/* loaded from: classes8.dex */
public final class i implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 f513477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f513478e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 abstractC17267x816864c7, float f17, float f18) {
        this.f513477d = abstractC17267x816864c7;
        this.f513478e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 abstractC17267x816864c7 = this.f513477d;
        android.view.View view = abstractC17267x816864c7.f240223n;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dialogContainer");
            throw null;
        }
        abstractC17267x816864c7.i(view.getTranslationY());
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float f17 = this.f513478e;
        abstractC17267x816864c7.m68532x461dcb18(f17 + ((0.0f - f17) * floatValue));
    }
}
