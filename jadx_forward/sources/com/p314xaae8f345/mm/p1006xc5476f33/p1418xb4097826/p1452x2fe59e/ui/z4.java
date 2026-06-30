package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class z4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f192324d;

    public z4(android.view.View view) {
        this.f192324d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f192324d;
        view.getHitRect(rect);
        rect.inset(rect.width() * (-2), -rect.width());
        java.lang.Object parent = view.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
