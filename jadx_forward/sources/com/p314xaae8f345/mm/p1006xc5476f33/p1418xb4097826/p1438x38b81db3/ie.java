package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ie implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f185193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f185194e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f185195f;

    public ie(android.view.MotionEvent motionEvent, android.widget.FrameLayout frameLayout, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar) {
        this.f185193d = motionEvent;
        this.f185194e = frameLayout;
        this.f185195f = qeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.MotionEvent motionEvent = this.f185193d;
        if (motionEvent != null) {
            android.widget.FrameLayout frameLayout = this.f185194e;
            frameLayout.setTranslationX(0.0f);
            frameLayout.setTranslationY(0.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f185195f;
            frameLayout.getLocationInWindow(qeVar.M);
            float rawX = motionEvent.getRawX();
            int[] iArr = qeVar.M;
            frameLayout.setTranslationX((rawX - iArr[0]) - (frameLayout.getWidth() / 2));
            frameLayout.setTranslationY((motionEvent.getRawY() - iArr[1]) - (frameLayout.getHeight() / 2));
        }
    }
}
