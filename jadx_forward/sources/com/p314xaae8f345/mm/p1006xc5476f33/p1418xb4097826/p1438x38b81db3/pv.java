package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class pv implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f185829d;

    public pv(android.widget.LinearLayout linearLayout) {
        this.f185829d = linearLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.widget.LinearLayout linearLayout = this.f185829d;
        linearLayout.getHitRect(rect);
        rect.inset(rect.width(), (-rect.height()) / 2);
        java.lang.Object parent = linearLayout.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, linearLayout));
    }
}
