package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public abstract class k0 implements fs2.a, im5.b {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f188688d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 f188689e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 f188690f;

    /* renamed from: g, reason: collision with root package name */
    public final ym5.q1 f188691g;

    /* renamed from: h, reason: collision with root package name */
    public final cs2.i f188692h;

    public k0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 feedLoader) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedLoader, "feedLoader");
        this.f188688d = context;
        this.f188689e = feedLoader;
        this.f188692h = new cs2.i(context, i18);
        this.f188691g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j0(this);
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
    /* renamed from: keep */
    public void mo46316x322b85(im5.a aVar) {
    }

    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f188690f = callback;
        ym5.q1 f17 = f();
        if (f17 == null) {
            f17 = this.f188691g;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7.m56397xe61f0140(this.f188689e, f17, false, 2, null);
        g();
    }

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        ym5.q1 f17 = f();
        if (f17 == null) {
            f17 = this.f188691g;
        }
        this.f188689e.m56401x31d4943c(f17);
        this.f188692h.f();
    }

    /* renamed from: onRefreshEnd */
    public void mo56078xb3ee2b3f(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
    }

    public void p(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
    }

    public void q() {
    }

    public void s() {
    }

    public abstract void v();
}
