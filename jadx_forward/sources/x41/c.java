package x41;

/* loaded from: classes15.dex */
public final class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p986x373aa5.AbstractC11221xf21fe5de f533301d;

    public c(com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p986x373aa5.AbstractC11221xf21fe5de abstractC11221xf21fe5de) {
        this.f533301d = abstractC11221xf21fe5de;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p986x373aa5.AbstractC11221xf21fe5de.f153835l1;
        com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p986x373aa5.AbstractC11221xf21fe5de abstractC11221xf21fe5de = this.f533301d;
        android.view.View view = abstractC11221xf21fe5de.f153844n;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dialogContainer");
            throw null;
        }
        view.setTranslationY(floatValue);
        abstractC11221xf21fe5de.g(floatValue);
    }
}
