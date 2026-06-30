package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f;

/* loaded from: classes7.dex */
public final class g implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f169121d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f169122e;

    /* renamed from: f, reason: collision with root package name */
    public int f169123f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f169124g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f169125h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f169126i;

    public g(yz5.a decorViewProvider, java.lang.Runnable viewTreeLayoutCompletedCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(decorViewProvider, "decorViewProvider");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewTreeLayoutCompletedCallback, "viewTreeLayoutCompletedCallback");
        this.f169121d = decorViewProvider;
        this.f169122e = viewTreeLayoutCompletedCallback;
        this.f169124g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.f(this));
        this.f169125h = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.d.f169109d);
        this.f169126i = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final void a() {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.View view = (android.view.View) this.f169121d.mo152xb9724478();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.f169125h).mo141623x754a37bb()).mo50300x3fa464aa((java.lang.Runnable) ((jz5.n) this.f169124g).mo141623x754a37bb());
    }

    public final void b() {
        android.view.View view = (android.view.View) this.f169121d.mo152xb9724478();
        android.view.ViewTreeObserver viewTreeObserver = view != null ? view.getViewTreeObserver() : null;
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            this.f169122e.run();
        } else {
            viewTreeObserver.addOnGlobalLayoutListener(this);
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.f169125h).mo141623x754a37bb()).mo50297x7c4d7ca2((java.lang.Runnable) ((jz5.n) this.f169124g).mo141623x754a37bb(), 100L);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i17 = this.f169123f + 1;
        this.f169123f = i17;
        if (i17 < 2 || this.f169126i.getAndSet(true)) {
            return;
        }
        a();
        this.f169122e.run();
    }
}
