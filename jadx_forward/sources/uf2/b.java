package uf2;

/* loaded from: classes2.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f508699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f508700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f508701f;

    public b(float f17, float f18, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f508699d = f17;
        this.f508700e = f18;
        this.f508701f = c22789xd23e9a9b;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        float f17 = this.f508699d;
        float f18 = this.f508700e;
        this.f508701f.setTranslationY(f18 + ((f17 - f18) * it.getAnimatedFraction()));
    }
}
