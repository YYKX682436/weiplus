package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public abstract class k0 implements fs2.a, im5.b {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f107155d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f107156e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.a1 f107157f;

    /* renamed from: g, reason: collision with root package name */
    public final ym5.q1 f107158g;

    /* renamed from: h, reason: collision with root package name */
    public final cs2.i f107159h;

    public k0(com.tencent.mm.ui.MMActivity context, int i17, int i18, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader feedLoader) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feedLoader, "feedLoader");
        this.f107155d = context;
        this.f107156e = feedLoader;
        this.f107159h = new cs2.i(context, i18);
        this.f107158g = new com.tencent.mm.plugin.finder.feed.j0(this);
    }

    public abstract in5.s c();

    public ym5.q1 f() {
        return null;
    }

    public abstract void g();

    public void h() {
    }

    public abstract void i();

    @Override // im5.b
    public void keep(im5.a aVar) {
    }

    public void m(com.tencent.mm.plugin.finder.feed.a1 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f107157f = callback;
        ym5.q1 f17 = f();
        if (f17 == null) {
            f17 = this.f107158g;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(this.f107156e, f17, false, 2, null);
        g();
    }

    @Override // fs2.a
    public void onDetach() {
        ym5.q1 f17 = f();
        if (f17 == null) {
            f17 = this.f107158g;
        }
        this.f107156e.unregister(f17);
        this.f107159h.f();
    }

    public void onRefreshEnd(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
    }

    public void p(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
    }

    public void q() {
    }

    public void s() {
    }

    public abstract void v();
}
