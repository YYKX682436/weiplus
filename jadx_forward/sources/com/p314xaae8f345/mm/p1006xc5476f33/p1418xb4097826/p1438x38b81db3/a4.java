package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes5.dex */
public final class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f184385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.xj f184386f;

    public a4(android.view.View view, int i17, com.p314xaae8f345.mm.ui.xj xjVar) {
        this.f184384d = view;
        this.f184385e = i17;
        this.f184386f = xjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f184384d;
        view.getHitRect(rect);
        rect.left -= this.f184385e;
        this.f184386f.a(new com.p314xaae8f345.mm.ui.yj(rect, view));
    }
}
