package pp1;

/* loaded from: classes14.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f438935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pp1.z f438936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f438937f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f438938g;

    public e(boolean z17, pp1.z zVar, java.lang.Integer num, boolean z18) {
        this.f438935d = z17;
        this.f438936e = zVar;
        this.f438937f = num;
        this.f438938g = z18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        if (this.f438935d) {
            pp1.a0.b(this.f438936e, true, (int) floatValue, null, this.f438937f, false, this.f438938g, false, 64, null);
        } else {
            pp1.a0.a(this.f438936e, false, (int) floatValue, null, this.f438937f, false, this.f438938g, false, 64, null);
        }
    }
}
