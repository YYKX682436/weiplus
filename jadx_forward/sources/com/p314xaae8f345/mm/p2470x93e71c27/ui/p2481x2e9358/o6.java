package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes3.dex */
public final class o6 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 f272065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f272066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f272067f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f272068g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f272069h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f272070i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f272071m;

    public o6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var, int i17, int i18, int i19, int i27, int i28, int i29, float f17, float f18) {
        this.f272065d = c8Var;
        this.f272066e = i17;
        this.f272067f = i18;
        this.f272068g = i19;
        this.f272069h = i27;
        this.f272070i = i28;
        this.f272071m = i29;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f272065d.h().setOutlineProvider(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.n6(this.f272066e, it.getAnimatedFraction(), this.f272067f, this.f272068g, this.f272069h, this.f272070i, this.f272071m, 0.5f, 0.0f, this.f272065d));
    }
}
