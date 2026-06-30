package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252;

/* loaded from: classes15.dex */
public class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a f125871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c f125872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior f125873f;

    public b(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior baseBehavior, p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c) {
        this.f125873f = baseBehavior;
        this.f125871d = c1081xa22a3e5a;
        this.f125872e = c2678xa407981c;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f125873f.G(this.f125871d, this.f125872e, ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
