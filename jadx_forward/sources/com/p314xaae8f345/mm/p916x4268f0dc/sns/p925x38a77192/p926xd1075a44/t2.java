package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes5.dex */
public final class t2 implements n0.e4 {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f151767d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.u2 f151768e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f151769f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0 f151770g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e1 f151771h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f151772i;

    /* renamed from: m, reason: collision with root package name */
    public final n0.v2 f151773m;

    /* renamed from: n, reason: collision with root package name */
    public final n0.e5 f151774n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f151775o;

    /* renamed from: p, reason: collision with root package name */
    public final n0.v2 f151776p;

    /* renamed from: q, reason: collision with root package name */
    public final n0.e5 f151777q;

    /* renamed from: r, reason: collision with root package name */
    public gz0.h f151778r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f151779s;

    public t2(p3325xe03a0797.p3326xc267989b.y0 scope, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.u2 scene, yz5.p muteMusic, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0 t0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(muteMusic, "muteMusic");
        this.f151767d = scope;
        this.f151768e = scene;
        this.f151769f = muteMusic;
        this.f151770g = t0Var;
        r45.k96 k96Var = new r45.k96();
        k96Var.f460050d = "";
        k96Var.f460053g = "";
        k96Var.f460054h = "";
        k96Var.f460051e = "";
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e1 e1Var = new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e1(k96Var, 0L);
        this.f151771h = e1Var;
        this.f151772i = jz5.h.b(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.p2.f151682d);
        n0.v2 c17 = n0.s4.c(e1Var, null, 2, null);
        this.f151773m = c17;
        this.f151774n = c17;
        this.f151775o = "";
        n0.v2 c18 = n0.s4.c(null, null, 2, null);
        this.f151776p = c18;
        this.f151777q = c18;
    }

    public static void a(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t2 t2Var, java.lang.String keyword, long j17, int i17, java.lang.Object obj) {
        long j18 = (i17 & 2) != 0 ? 0L : j17;
        t2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicSearchPanel", "search: ".concat(keyword));
        if (keyword.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MusicSearchPanel", "search: can not search empty keyword");
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(t2Var.f151775o, keyword)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MusicSearchPanel", "search: now is searching this key");
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.d(t2Var.f151767d, null, null, new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.r2(t2Var, null), 3, null);
        t2Var.f151775o = keyword;
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0 t0Var = t2Var.f151770g;
        if (t0Var != null) {
            t0Var.b(keyword);
        }
        ((n0.q4) t2Var.f151773m).mo148714x53d8522f(t2Var.f151771h);
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.u2 u2Var = com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.u2.f151795d;
        n0.v2 v2Var = t2Var.f151776p;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = t2Var.f151767d;
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.u2 u2Var2 = t2Var.f151768e;
        if (u2Var2 == u2Var) {
            ((n0.q4) v2Var).mo148714x53d8522f(g4.w.a(new g4.x1(new g4.g3(new xy0.e(keyword), null), null, new g4.h3(10, 0, false, 10, 0, 0, 50, null), null).f350141c, y0Var));
        } else if (u2Var2 == com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.u2.f151796e) {
            ((n0.q4) v2Var).mo148714x53d8522f(g4.w.a(new g4.x1(new g4.g3(new xy0.h(keyword, j18), null), null, new g4.h3(10, 0, false, 10, 0, 0, 50, null), null).f350141c, y0Var));
        }
    }

    @Override // n0.e4
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicSearchPanel", "onRemembered: ");
    }

    @Override // n0.e4
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicSearchPanel", "onAbandoned: ");
        d();
    }

    @Override // n0.e4
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicSearchPanel", "onForgotten: ");
        p3325xe03a0797.p3326xc267989b.l.d(this.f151767d, null, null, new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.q2(this, null), 3, null);
    }
}
