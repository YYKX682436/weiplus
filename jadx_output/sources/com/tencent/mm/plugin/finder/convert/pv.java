package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class pv implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f104296d;

    public pv(android.widget.LinearLayout linearLayout) {
        this.f104296d = linearLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.widget.LinearLayout linearLayout = this.f104296d;
        linearLayout.getHitRect(rect);
        rect.inset(rect.width(), (-rect.height()) / 2);
        java.lang.Object parent = linearLayout.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, linearLayout));
    }
}
