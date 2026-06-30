package com.p314xaae8f345.mm.ui.p2738xb1dfbddb;

/* loaded from: classes3.dex */
public final class j implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c f291474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f291475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f291476f;

    public j(com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c c22490xdfa0051c, int i17, int i18) {
        this.f291474d = c22490xdfa0051c;
        this.f291475e = i17;
        this.f291476f = i18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c c22490xdfa0051c = this.f291474d;
        c22490xdfa0051c.f291444m.setOutlineProvider(new com.p314xaae8f345.mm.ui.p2738xb1dfbddb.i(this.f291475e, this.f291476f, animatedFraction));
        c22490xdfa0051c.f291444m.invalidate();
    }
}
