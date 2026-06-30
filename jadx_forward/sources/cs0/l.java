package cs0;

/* loaded from: classes4.dex */
public final class l implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10901x74919f80 f303585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f303586e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f303587f;

    public l(com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10901x74919f80 c10901x74919f80, float f17, float f18) {
        this.f303585d = c10901x74919f80;
        this.f303586e = f17;
        this.f303587f = f18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = this.f303586e + (this.f303587f * ((java.lang.Float) animatedValue).floatValue());
        com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10901x74919f80 c10901x74919f80 = this.f303585d;
        c10901x74919f80.f150460v = floatValue;
        java.lang.Thread.currentThread().getName();
        c10901x74919f80.postInvalidate();
    }
}
