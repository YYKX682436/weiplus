package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes3.dex */
public final class r6 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 f272133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f272134e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f272135f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f272136g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f272137h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f272138i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f272139m;

    public r6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var, int i17, int i18, int i19, int i27, int i28, int i29, float f17, float f18) {
        this.f272133d = c8Var;
        this.f272134e = i17;
        this.f272135f = i18;
        this.f272136g = i19;
        this.f272137h = i27;
        this.f272138i = i28;
        this.f272139m = i29;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f272133d.h().setOutlineProvider(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.q6(this.f272134e, it.getAnimatedFraction(), this.f272135f, this.f272136g, this.f272137h, this.f272138i, this.f272139m, 0.0f, 0.5f, this.f272133d));
    }
}
