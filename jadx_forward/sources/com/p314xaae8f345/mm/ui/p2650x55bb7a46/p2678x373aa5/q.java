package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class q implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i f284587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r f284588f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f284589g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f284590h;

    public q(java.lang.String str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i iVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r rVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039, int i17) {
        this.f284586d = str;
        this.f284587e = iVar;
        this.f284588f = rVar;
        this.f284589g = c22624x85d69039;
        this.f284590h = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
        java.lang.String str = this.f284586d;
        int length = str.length();
        if (length < 1) {
            length = 1;
        }
        int f17 = e06.p.f((int) (anim.getAnimatedFraction() * (length + 1)), 0, length);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i iVar = this.f284587e;
        if (f17 != iVar.f284491c) {
            iVar.f284491c = f17;
            this.f284588f.D(this.f284589g, str, f17, this.f284590h);
        }
    }
}
