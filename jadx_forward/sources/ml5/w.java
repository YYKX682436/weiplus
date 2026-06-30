package ml5;

/* loaded from: classes10.dex */
public final class w implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa f409985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f409986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f409987f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f409988g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f409989h;

    public w(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa c22678xac4e51fa, boolean z17, boolean z18, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var2) {
        this.f409985d = c22678xac4e51fa;
        this.f409986e = z17;
        this.f409987f = z18;
        this.f409988g = e0Var;
        this.f409989h = e0Var2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa c22678xac4e51fa = this.f409985d;
        ml5.k scaleType = c22678xac4e51fa.getScaleType();
        ml5.k kVar = ml5.k.f409964e;
        boolean z17 = this.f409987f;
        boolean z18 = this.f409986e;
        if ((scaleType == kVar && !z18 && !z17) || (c22678xac4e51fa.getScaleType() == ml5.k.f409963d && (!z18 || !z17))) {
            java.lang.Object animatedValue = it.getAnimatedValue("scale");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c22678xac4e51fa.L((((java.lang.Float) animatedValue).floatValue() * 1.0f) / c22678xac4e51fa.m81888xc7b108a2()[0], c22678xac4e51fa.getContentRectF().centerX(), c22678xac4e51fa.getContentRectF().centerY());
        }
        java.lang.Object animatedValue2 = it.getAnimatedValue("transX");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue2).floatValue();
        java.lang.Object animatedValue3 = it.getAnimatedValue("transY");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
        float floatValue2 = ((java.lang.Float) animatedValue3).floatValue();
        java.lang.Object animatedValue4 = it.getAnimatedValue("edgeX");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
        float floatValue3 = ((java.lang.Float) animatedValue4).floatValue();
        java.lang.Object animatedValue5 = it.getAnimatedValue("edgeY");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
        float floatValue4 = ((java.lang.Float) animatedValue5).floatValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f409988g;
        float f17 = floatValue3 - e0Var.f391648d;
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var2 = this.f409989h;
        float f18 = floatValue4 - e0Var2.f391648d;
        c22678xac4e51fa.M(z17 ? -f17 : -(floatValue - c22678xac4e51fa.getContentRectF().centerX()), z18 ? -f18 : -(floatValue2 - c22678xac4e51fa.getContentRectF().centerY()));
        e0Var.f391648d = floatValue3;
        e0Var2.f391648d = floatValue4;
    }
}
