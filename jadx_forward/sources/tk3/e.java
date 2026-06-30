package tk3;

/* loaded from: classes8.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f501449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f501450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f501451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f501452g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e f501453h;

    public e(int i17, int i18, int i19, int i27, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e) {
        this.f501449d = i17;
        this.f501450e = i18;
        this.f501451f = i19;
        this.f501452g = i27;
        this.f501453h = c16608xd141945e;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = this.f501449d;
        int i18 = this.f501451f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e.w(this.f501453h, i17 + ((int) (((this.f501450e * 1.0f) - i17) * floatValue)), i18 + ((int) (((this.f501452g * 1.0f) - i18) * floatValue)), false, false, false, 16, null);
    }
}
