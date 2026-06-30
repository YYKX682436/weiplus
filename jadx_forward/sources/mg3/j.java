package mg3;

/* loaded from: classes10.dex */
public final class j implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public float f407770d;

    /* renamed from: e, reason: collision with root package name */
    public float f407771e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100 f407772f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f407773g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f407774h;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100 c16501x5a606100, android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2) {
        this.f407772f = c16501x5a606100;
        this.f407773g = motionEvent;
        this.f407774h = motionEvent2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue("transX");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        java.lang.Object animatedValue2 = it.getAnimatedValue("transY");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        float floatValue2 = ((java.lang.Float) animatedValue2).floatValue();
        float f17 = this.f407770d - floatValue;
        float f18 = this.f407771e - floatValue2;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100.E1;
        this.f407772f.Q(this.f407773g, this.f407774h, f17, f18);
        this.f407770d = floatValue;
        this.f407771e = floatValue2;
    }
}
