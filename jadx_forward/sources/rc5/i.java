package rc5;

/* loaded from: classes5.dex */
public final class i implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc5.m f475697d;

    public i(rc5.m mVar) {
        this.f475697d = mVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
        java.lang.Object animatedValue = anim.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        rc5.m mVar = this.f475697d;
        int height = mVar.getHeight();
        mVar.getLayoutParams().height = intValue;
        mVar.setLayoutParams(mVar.getLayoutParams());
        java.lang.Object m79872xcc101dd9 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) mVar.f475703f.W6().f279685f.f542252n).B.m79872xcc101dd9();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = m79872xcc101dd9 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) m79872xcc101dd9 : null;
        if (c1163xf1deaba4 == null) {
            return;
        }
        mVar.getViewTreeObserver().addOnPreDrawListener(new rc5.h(c1163xf1deaba4, intValue, height, mVar));
    }
}
