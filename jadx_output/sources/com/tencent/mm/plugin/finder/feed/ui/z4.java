package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class z4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f110791d;

    public z4(android.view.View view) {
        this.f110791d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f110791d;
        view.getHitRect(rect);
        rect.inset(rect.width() * (-2), -rect.width());
        java.lang.Object parent = view.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
