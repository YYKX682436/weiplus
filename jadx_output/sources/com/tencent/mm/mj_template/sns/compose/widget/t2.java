package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class t2 implements n0.e4 {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f70234d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.mj_template.sns.compose.widget.u2 f70235e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f70236f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.mj_template.sns.compose.widget.t0 f70237g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.mj_template.sns.compose.widget.e1 f70238h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f70239i;

    /* renamed from: m, reason: collision with root package name */
    public final n0.v2 f70240m;

    /* renamed from: n, reason: collision with root package name */
    public final n0.e5 f70241n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f70242o;

    /* renamed from: p, reason: collision with root package name */
    public final n0.v2 f70243p;

    /* renamed from: q, reason: collision with root package name */
    public final n0.e5 f70244q;

    /* renamed from: r, reason: collision with root package name */
    public gz0.h f70245r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f70246s;

    public t2(kotlinx.coroutines.y0 scope, com.tencent.mm.mj_template.sns.compose.widget.u2 scene, yz5.p muteMusic, com.tencent.mm.mj_template.sns.compose.widget.t0 t0Var) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(muteMusic, "muteMusic");
        this.f70234d = scope;
        this.f70235e = scene;
        this.f70236f = muteMusic;
        this.f70237g = t0Var;
        r45.k96 k96Var = new r45.k96();
        k96Var.f378517d = "";
        k96Var.f378520g = "";
        k96Var.f378521h = "";
        k96Var.f378518e = "";
        com.tencent.mm.mj_template.sns.compose.widget.e1 e1Var = new com.tencent.mm.mj_template.sns.compose.widget.e1(k96Var, 0L);
        this.f70238h = e1Var;
        this.f70239i = jz5.h.b(com.tencent.mm.mj_template.sns.compose.widget.p2.f70149d);
        n0.v2 c17 = n0.s4.c(e1Var, null, 2, null);
        this.f70240m = c17;
        this.f70241n = c17;
        this.f70242o = "";
        n0.v2 c18 = n0.s4.c(null, null, 2, null);
        this.f70243p = c18;
        this.f70244q = c18;
    }

    public static void a(com.tencent.mm.mj_template.sns.compose.widget.t2 t2Var, java.lang.String keyword, long j17, int i17, java.lang.Object obj) {
        long j18 = (i17 & 2) != 0 ? 0L : j17;
        t2Var.getClass();
        kotlin.jvm.internal.o.g(keyword, "keyword");
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicSearchPanel", "search: ".concat(keyword));
        if (keyword.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MusicSearchPanel", "search: can not search empty keyword");
            return;
        }
        if (kotlin.jvm.internal.o.b(t2Var.f70242o, keyword)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MusicSearchPanel", "search: now is searching this key");
            return;
        }
        kotlinx.coroutines.l.d(t2Var.f70234d, null, null, new com.tencent.mm.mj_template.sns.compose.widget.r2(t2Var, null), 3, null);
        t2Var.f70242o = keyword;
        com.tencent.mm.mj_template.sns.compose.widget.t0 t0Var = t2Var.f70237g;
        if (t0Var != null) {
            t0Var.b(keyword);
        }
        ((n0.q4) t2Var.f70240m).setValue(t2Var.f70238h);
        com.tencent.mm.mj_template.sns.compose.widget.u2 u2Var = com.tencent.mm.mj_template.sns.compose.widget.u2.f70262d;
        n0.v2 v2Var = t2Var.f70243p;
        kotlinx.coroutines.y0 y0Var = t2Var.f70234d;
        com.tencent.mm.mj_template.sns.compose.widget.u2 u2Var2 = t2Var.f70235e;
        if (u2Var2 == u2Var) {
            ((n0.q4) v2Var).setValue(g4.w.a(new g4.x1(new g4.g3(new xy0.e(keyword), null), null, new g4.h3(10, 0, false, 10, 0, 0, 50, null), null).f268608c, y0Var));
        } else if (u2Var2 == com.tencent.mm.mj_template.sns.compose.widget.u2.f70263e) {
            ((n0.q4) v2Var).setValue(g4.w.a(new g4.x1(new g4.g3(new xy0.h(keyword, j18), null), null, new g4.h3(10, 0, false, 10, 0, 0, 50, null), null).f268608c, y0Var));
        }
    }

    @Override // n0.e4
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicSearchPanel", "onRemembered: ");
    }

    @Override // n0.e4
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicSearchPanel", "onAbandoned: ");
        d();
    }

    @Override // n0.e4
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicSearchPanel", "onForgotten: ");
        kotlinx.coroutines.l.d(this.f70234d, null, null, new com.tencent.mm.mj_template.sns.compose.widget.q2(this, null), 3, null);
    }
}
