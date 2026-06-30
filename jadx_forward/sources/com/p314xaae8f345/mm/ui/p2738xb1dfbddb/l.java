package com.p314xaae8f345.mm.ui.p2738xb1dfbddb;

/* loaded from: classes3.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c f291479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f291480e;

    public l(com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c c22490xdfa0051c, int i17) {
        this.f291479d = c22490xdfa0051c;
        this.f291480e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c c22490xdfa0051c = this.f291479d;
        c22490xdfa0051c.f291444m.setClipToOutline(true);
        int height = c22490xdfa0051c.f291439e.getHeight();
        android.view.ViewPropertyAnimator alpha = c22490xdfa0051c.f291443i.animate().alpha(0.0f);
        alpha.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        alpha.setDuration(250L);
        alpha.start();
        alpha.setUpdateListener(new com.p314xaae8f345.mm.ui.p2738xb1dfbddb.j(c22490xdfa0051c, this.f291480e, height));
        alpha.setListener(new com.p314xaae8f345.mm.ui.p2738xb1dfbddb.k(alpha, c22490xdfa0051c));
    }
}
