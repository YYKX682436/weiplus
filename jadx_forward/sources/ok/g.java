package ok;

/* loaded from: classes10.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ok.i f427462d;

    public g(ok.i iVar) {
        this.f427462d = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue("deltaY");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        java.lang.Object animatedValue2 = animation.getAnimatedValue("deltaX");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        float floatValue2 = ((java.lang.Float) animatedValue2).floatValue();
        java.lang.Object animatedValue3 = animation.getAnimatedValue("scaleX");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
        float floatValue3 = ((java.lang.Float) animatedValue3).floatValue();
        java.lang.Object animatedValue4 = animation.getAnimatedValue("scaleY");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
        ((java.lang.Float) animatedValue4).floatValue();
        java.lang.Object animatedValue5 = animation.getAnimatedValue("rotation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
        float floatValue4 = ((java.lang.Float) animatedValue5).floatValue();
        ok.i iVar = this.f427462d;
        float f17 = iVar.f427468g;
        dl.f0 f0Var = iVar.f427464c;
        float f18 = floatValue2 - iVar.f427469h;
        float f19 = floatValue - f17;
        int i17 = (int) floatValue4;
        xk0.f M = f0Var.M(iVar.f427466e);
        if (M != null) {
            M.y(f18, f19, floatValue3, i17);
            f0Var.r();
        }
        iVar.f427468g = floatValue;
        iVar.f427469h = floatValue2;
    }
}
