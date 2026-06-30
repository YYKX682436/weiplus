package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes7.dex */
public final class g implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f87588d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f87589e;

    /* renamed from: f, reason: collision with root package name */
    public int f87590f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f87591g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f87592h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f87593i;

    public g(yz5.a decorViewProvider, java.lang.Runnable viewTreeLayoutCompletedCallback) {
        kotlin.jvm.internal.o.g(decorViewProvider, "decorViewProvider");
        kotlin.jvm.internal.o.g(viewTreeLayoutCompletedCallback, "viewTreeLayoutCompletedCallback");
        this.f87588d = decorViewProvider;
        this.f87589e = viewTreeLayoutCompletedCallback;
        this.f87591g = jz5.h.b(new com.tencent.mm.plugin.appbrand.platform.window.activity.f(this));
        this.f87592h = jz5.h.b(com.tencent.mm.plugin.appbrand.platform.window.activity.d.f87576d);
        this.f87593i = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final void a() {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.View view = (android.view.View) this.f87588d.invoke();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.f87592h).getValue()).removeCallbacks((java.lang.Runnable) ((jz5.n) this.f87591g).getValue());
    }

    public final void b() {
        android.view.View view = (android.view.View) this.f87588d.invoke();
        android.view.ViewTreeObserver viewTreeObserver = view != null ? view.getViewTreeObserver() : null;
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            this.f87589e.run();
        } else {
            viewTreeObserver.addOnGlobalLayoutListener(this);
            ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.f87592h).getValue()).postDelayed((java.lang.Runnable) ((jz5.n) this.f87591g).getValue(), 100L);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i17 = this.f87590f + 1;
        this.f87590f = i17;
        if (i17 < 2 || this.f87593i.getAndSet(true)) {
            return;
        }
        a();
        this.f87589e.run();
    }
}
