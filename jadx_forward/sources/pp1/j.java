package pp1;

/* loaded from: classes14.dex */
public final class j implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f438952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pp1.z f438953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f438954f;

    public j(boolean z17, pp1.z zVar, java.lang.Integer num) {
        this.f438952d = z17;
        this.f438953e = zVar;
        this.f438954f = num;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        if (this.f438952d) {
            pp1.a0.b(this.f438953e, true, (int) floatValue, null, this.f438954f, false, false, false, 32, null);
        } else {
            pp1.a0.a(this.f438953e, false, (int) floatValue, null, this.f438954f, false, false, false, 32, null);
        }
    }
}
