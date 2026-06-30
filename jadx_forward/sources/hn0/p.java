package hn0;

/* loaded from: classes14.dex */
public final class p implements hn0.f {

    /* renamed from: a, reason: collision with root package name */
    public final hn0.h f363932a;

    /* renamed from: b, reason: collision with root package name */
    public final go0.f0 f363933b;

    /* renamed from: c, reason: collision with root package name */
    public final p05.v0 f363934c;

    /* renamed from: d, reason: collision with root package name */
    public final p05.t0 f363935d;

    /* renamed from: e, reason: collision with root package name */
    public final p05.u0 f363936e;

    /* renamed from: f, reason: collision with root package name */
    public double f363937f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f363938g;

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f363939h;

    public p(hn0.h liveCore, go0.f0 renderManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveCore, "liveCore");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderManager, "renderManager");
        this.f363932a = liveCore;
        this.f363933b = renderManager;
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        this.f363934c = new p05.h1();
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        this.f363935d = new p05.e1();
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        this.f363936e = new p05.f1();
        this.f363939h = p3325xe03a0797.p3326xc267989b.z0.b();
        b();
    }

    public final void b() {
        go0.f0 f0Var = this.f363933b;
        f0Var.getClass();
        p05.v0 effect = this.f363934c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(effect, "effect");
        f0Var.l(new go0.j(f0Var, effect));
    }

    public kn0.p c() {
        return ((tn0.w0) this.f363932a).D;
    }

    public void d(java.util.List res) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(res, "res");
        p05.t0 effect = this.f363935d;
        go0.f0 f0Var = this.f363933b;
        f0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(effect, "effect");
        f0Var.l(new go0.e(f0Var, effect));
        f0Var.l(new hn0.k(this, res));
    }

    public void e(double d17, boolean z17, boolean z18) {
        if (this.f363938g != z17 && z18) {
            if (z17) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                db5.t7.m(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d7c));
            } else {
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                db5.t7.m(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d7d));
            }
        }
        this.f363938g = z17;
        this.f363937f = d17;
        b();
        this.f363933b.l(new hn0.l(this, d17));
    }

    public void f(int i17, double d17) {
        b();
        this.f363933b.l(new hn0.m(this, i17, d17));
    }

    public void g(java.util.List res) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(res, "res");
        p05.u0 effect = this.f363936e;
        go0.f0 f0Var = this.f363933b;
        f0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(effect, "effect");
        f0Var.l(new go0.l(f0Var, effect));
        f0Var.l(new hn0.o(this, res));
    }

    public void h(lo0.k kVar, double d17) {
        go0.f0 f0Var = this.f363933b;
        f0Var.getClass();
        f0Var.l(new go0.y(f0Var, kVar, d17));
    }

    public void i(int i17) {
        go0.f0 f0Var = this.f363933b;
        f0Var.getClass();
        f0Var.l(new go0.d0(f0Var, i17));
    }

    public void j(boolean z17) {
        go0.f0 f0Var = this.f363933b;
        f0Var.getClass();
        f0Var.l(new go0.c0(f0Var, z17));
    }
}
