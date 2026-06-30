package ml5;

/* loaded from: classes10.dex */
public final class y implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public int f409991d;

    /* renamed from: e, reason: collision with root package name */
    public int f409992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa f409993f;

    public y(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa c22678xac4e51fa) {
        this.f409993f = c22678xac4e51fa;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue("transX");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        java.lang.Object animatedValue2 = it.getAnimatedValue("transY");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = ((java.lang.Integer) animatedValue2).intValue();
        this.f409993f.M(intValue - this.f409991d, intValue2 - this.f409992e);
        this.f409991d = intValue;
        this.f409992e = intValue2;
    }
}
