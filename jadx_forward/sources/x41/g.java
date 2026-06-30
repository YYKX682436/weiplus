package x41;

/* loaded from: classes15.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p986x373aa5.AbstractC11221xf21fe5de f533308d;

    public g(com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p986x373aa5.AbstractC11221xf21fe5de abstractC11221xf21fe5de) {
        this.f533308d = abstractC11221xf21fe5de;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p986x373aa5.AbstractC11221xf21fe5de abstractC11221xf21fe5de = this.f533308d;
        android.view.View view = abstractC11221xf21fe5de.f153844n;
        if (view != null) {
            abstractC11221xf21fe5de.g(view.getTranslationY());
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dialogContainer");
            throw null;
        }
    }
}
