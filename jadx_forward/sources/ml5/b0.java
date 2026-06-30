package ml5;

/* loaded from: classes10.dex */
public final class b0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa f409945d;

    public b0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa c22678xac4e51fa) {
        this.f409945d = c22678xac4e51fa;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue("scale");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        java.lang.Object animatedValue2 = it.getAnimatedValue("transX");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        float floatValue2 = ((java.lang.Float) animatedValue2).floatValue();
        java.lang.Object animatedValue3 = it.getAnimatedValue("transY");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
        float floatValue3 = ((java.lang.Float) animatedValue3).floatValue();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa c22678xac4e51fa = this.f409945d;
        c22678xac4e51fa.m81878xc9901eb9();
        float f17 = (floatValue * 1.0f) / c22678xac4e51fa.m81888xc7b108a2()[0];
        c22678xac4e51fa.mainMatrix.postScale(f17, f17, 0.0f, 0.0f);
        c22678xac4e51fa.y();
        float centerX = floatValue2 - c22678xac4e51fa.getContentRectF().centerX();
        float centerY = floatValue3 - c22678xac4e51fa.getContentRectF().centerY();
        if (!c22678xac4e51fa.getOnlyNotifyCallbackWhenUserTouch()) {
            c22678xac4e51fa.M(-centerX, -centerY);
            return;
        }
        c22678xac4e51fa.mainMatrix.postTranslate(-(-centerX), -(-centerY));
        c22678xac4e51fa.y();
    }
}
