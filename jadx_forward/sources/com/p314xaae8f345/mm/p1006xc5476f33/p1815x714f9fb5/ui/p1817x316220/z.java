package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f226497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f226498e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16296x40c45249 f226499f;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16296x40c45249 c16296x40c45249, android.view.View view, android.content.Context context) {
        this.f226499f = c16296x40c45249;
        this.f226497d = view;
        this.f226498e = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f226497d;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.bottomMargin = ((int) ((this.f226499f.f226237f.getHeight() / 2.0d) + 0.5d)) + com.p314xaae8f345.mm.ui.zk.a(this.f226498e, 20);
        view.setLayoutParams(layoutParams);
    }
}
