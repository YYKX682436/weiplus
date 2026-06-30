package rp1;

/* loaded from: classes13.dex */
public final class w implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f480076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f480077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f480078f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f480079g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 f480080h;

    public w(int i17, int i18, int i19, int i27, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7) {
        this.f480076d = i17;
        this.f480077e = i18;
        this.f480078f = i19;
        this.f480079g = i27;
        this.f480080h = c12917x19ac03e7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = this.f480076d;
        int i18 = this.f480078f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7.P(this.f480080h, i17 + ((int) (((this.f480077e * 1.0f) - i17) * floatValue)), java.lang.Integer.valueOf(i18 + ((int) (((this.f480079g * 1.0f) - i18) * floatValue))), false, false, true, false, 32, null);
    }
}
