package com.p314xaae8f345.mm.ui.p2738xb1dfbddb;

/* loaded from: classes3.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c f291467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f291468e;

    public g(com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c c22490xdfa0051c, int i17) {
        this.f291467d = c22490xdfa0051c;
        this.f291468e = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c c22490xdfa0051c = this.f291467d;
        c22490xdfa0051c.f291439e.setOutlineProvider(new com.p314xaae8f345.mm.ui.p2738xb1dfbddb.f(this.f291468e, animatedFraction));
        c22490xdfa0051c.f291439e.invalidate();
    }
}
