package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ie implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f103660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f103661e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f103662f;

    public ie(android.view.MotionEvent motionEvent, android.widget.FrameLayout frameLayout, com.tencent.mm.plugin.finder.convert.qe qeVar) {
        this.f103660d = motionEvent;
        this.f103661e = frameLayout;
        this.f103662f = qeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.MotionEvent motionEvent = this.f103660d;
        if (motionEvent != null) {
            android.widget.FrameLayout frameLayout = this.f103661e;
            frameLayout.setTranslationX(0.0f);
            frameLayout.setTranslationY(0.0f);
            com.tencent.mm.plugin.finder.convert.qe qeVar = this.f103662f;
            frameLayout.getLocationInWindow(qeVar.M);
            float rawX = motionEvent.getRawX();
            int[] iArr = qeVar.M;
            frameLayout.setTranslationX((rawX - iArr[0]) - (frameLayout.getWidth() / 2));
            frameLayout.setTranslationY((motionEvent.getRawY() - iArr[1]) - (frameLayout.getHeight() / 2));
        }
    }
}
