package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f206909a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.qt2 f206910b;

    /* renamed from: c, reason: collision with root package name */
    public final int f206911c;

    /* renamed from: d, reason: collision with root package name */
    public final int f206912d;

    /* renamed from: e, reason: collision with root package name */
    public so2.u1 f206913e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f206914f;

    public u0(p3325xe03a0797.p3326xc267989b.y0 scope, r45.qt2 contextObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        this.f206909a = scope;
        this.f206910b = contextObj;
        this.f206911c = 80;
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.f206912d = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Id).mo141623x754a37bb()).r()).intValue() * 1000;
    }

    public final void a(so2.u1 feed, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n4 n4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        if (n4Var == null) {
            return;
        }
        so2.u1 u1Var = this.f206913e;
        if (u1Var != null && u1Var.mo2128x1ed62e84() == feed.mo2128x1ed62e84()) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f206914f;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f206914f = null;
        this.f206913e = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHeartBeatReporter", "startRecord: " + hc2.b0.f(feed, true));
        this.f206913e = feed;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = n4Var.f206719q0.get();
        this.f206914f = p3325xe03a0797.p3326xc267989b.l.d(this.f206909a, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t0(f0Var, this, feed, n4Var, null), 2, null);
    }
}
