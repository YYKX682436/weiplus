package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252;

/* loaded from: classes15.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a f125877d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f125878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.AbstractC2680x7913e81f f125879f;

    public k(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.AbstractC2680x7913e81f abstractC2680x7913e81f, p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view) {
        this.f125879f = abstractC2680x7913e81f;
        this.f125877d = c1081xa22a3e5a;
        this.f125878e = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.AbstractC2680x7913e81f abstractC2680x7913e81f;
        android.widget.OverScroller overScroller;
        android.view.View view = this.f125878e;
        if (view == null || (overScroller = (abstractC2680x7913e81f = this.f125879f).f125858g) == null) {
            return;
        }
        boolean computeScrollOffset = overScroller.computeScrollOffset();
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a = this.f125877d;
        if (!computeScrollOffset) {
            abstractC2680x7913e81f.F(c1081xa22a3e5a, view);
            return;
        }
        abstractC2680x7913e81f.G(c1081xa22a3e5a, view, abstractC2680x7913e81f.f125858g.getCurrY());
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.m(view, this);
    }
}
