package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class f9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f103355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f103356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f103357f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f103358g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f103359h;

    public f9(android.view.MotionEvent motionEvent, android.widget.LinearLayout linearLayout, com.tencent.mm.plugin.finder.convert.qe qeVar, int i17, int i18) {
        this.f103355d = motionEvent;
        this.f103356e = linearLayout;
        this.f103357f = qeVar;
        this.f103358g = i17;
        this.f103359h = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.MotionEvent motionEvent = this.f103355d;
        if (motionEvent != null) {
            android.widget.LinearLayout linearLayout = this.f103356e;
            linearLayout.setTranslationX(0.0f);
            linearLayout.setTranslationY(0.0f);
            com.tencent.mm.plugin.finder.convert.qe qeVar = this.f103357f;
            linearLayout.getLocationInWindow(qeVar.M);
            float rawX = motionEvent.getRawX();
            int[] iArr = qeVar.M;
            linearLayout.setTranslationX(((rawX - iArr[0]) - (linearLayout.getWidth() / 2)) + this.f103358g);
            linearLayout.setTranslationY(((motionEvent.getRawY() - iArr[1]) - (linearLayout.getHeight() / 2)) + this.f103359h);
        }
    }
}
