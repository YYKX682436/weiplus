package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes5.dex */
public final class e7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f103232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.xj f103233f;

    public e7(android.view.View view, int i17, com.tencent.mm.ui.xj xjVar) {
        this.f103231d = view;
        this.f103232e = i17;
        this.f103233f = xjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f103231d;
        view.getHitRect(rect);
        rect.left -= this.f103232e;
        this.f103233f.a(new com.tencent.mm.ui.yj(rect, view));
    }
}
