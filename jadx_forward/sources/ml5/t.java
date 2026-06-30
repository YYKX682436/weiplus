package ml5;

/* loaded from: classes10.dex */
public final class t implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa f409980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f409981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f409982f;

    public t(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa c22678xac4e51fa, float f17, float f18) {
        this.f409980d = c22678xac4e51fa;
        this.f409981e = f17;
        this.f409982f = f18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue("scale");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa c22678xac4e51fa = this.f409980d;
        c22678xac4e51fa.B(floatValue / c22678xac4e51fa.m81888xc7b108a2()[0], this.f409981e, this.f409982f);
    }
}
