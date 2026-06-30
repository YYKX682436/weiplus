package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes5.dex */
public final class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f102851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f102852e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.xj f102853f;

    public a4(android.view.View view, int i17, com.tencent.mm.ui.xj xjVar) {
        this.f102851d = view;
        this.f102852e = i17;
        this.f102853f = xjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f102851d;
        view.getHitRect(rect);
        rect.left -= this.f102852e;
        this.f102853f.a(new com.tencent.mm.ui.yj(rect, view));
    }
}
