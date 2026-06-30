package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class f9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f184888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f184889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f184890f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f184891g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f184892h;

    public f9(android.view.MotionEvent motionEvent, android.widget.LinearLayout linearLayout, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, int i17, int i18) {
        this.f184888d = motionEvent;
        this.f184889e = linearLayout;
        this.f184890f = qeVar;
        this.f184891g = i17;
        this.f184892h = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.MotionEvent motionEvent = this.f184888d;
        if (motionEvent != null) {
            android.widget.LinearLayout linearLayout = this.f184889e;
            linearLayout.setTranslationX(0.0f);
            linearLayout.setTranslationY(0.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f184890f;
            linearLayout.getLocationInWindow(qeVar.M);
            float rawX = motionEvent.getRawX();
            int[] iArr = qeVar.M;
            linearLayout.setTranslationX(((rawX - iArr[0]) - (linearLayout.getWidth() / 2)) + this.f184891g);
            linearLayout.setTranslationY(((motionEvent.getRawY() - iArr[1]) - (linearLayout.getHeight() / 2)) + this.f184892h);
        }
    }
}
