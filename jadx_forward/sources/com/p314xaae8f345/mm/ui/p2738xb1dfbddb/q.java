package com.p314xaae8f345.mm.ui.p2738xb1dfbddb;

/* loaded from: classes3.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c f291482d;

    public q(com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c c22490xdfa0051c) {
        this.f291482d = c22490xdfa0051c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c c22490xdfa0051c = this.f291482d;
        c22490xdfa0051c.setTranslationY(-c22490xdfa0051c.getMeasuredHeight());
        c22490xdfa0051c.setAlpha(1.0f);
        android.view.ViewPropertyAnimator translationY = c22490xdfa0051c.animate().translationY(0.0f);
        translationY.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        translationY.setDuration(200L);
        translationY.start();
    }
}
