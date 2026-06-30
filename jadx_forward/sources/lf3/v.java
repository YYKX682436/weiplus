package lf3;

/* loaded from: classes3.dex */
public final class v implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf3.y f399871d;

    public v(lf3.y yVar) {
        this.f399871d = yVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        lf3.i iVar = this.f399871d.f399877g;
        if (iVar != null) {
            ((yh5.e) iVar).W6(floatValue);
        }
    }
}
