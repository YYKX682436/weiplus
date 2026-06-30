package br5;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final er5.g f23752a;

    /* renamed from: b, reason: collision with root package name */
    public kotlinx.coroutines.y0 f23753b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.zoomimage.subsampling.internal.m0 f23754c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f23755d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f23756e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f23757f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f23758g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f23759h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f23760i;

    /* renamed from: j, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f23761j;

    /* renamed from: k, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f23762k;

    /* renamed from: l, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f23763l;

    /* renamed from: m, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f23764m;

    /* renamed from: n, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f23765n;

    /* renamed from: o, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f23766o;

    /* renamed from: p, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f23767p;

    /* renamed from: q, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f23768q;

    /* renamed from: r, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f23769r;

    /* renamed from: s, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f23770s;

    /* renamed from: t, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f23771t;

    /* renamed from: u, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f23772u;

    public e(er5.g zoomableEngine) {
        kotlin.jvm.internal.o.g(zoomableEngine, "zoomableEngine");
        this.f23752a = zoomableEngine;
        com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = new com.tencent.mm.zoomimage.subsampling.internal.m0("SubsamplingEngine", zoomableEngine.f256240a, null, new br5.b(this), new br5.c(this), new br5.d(this));
        this.f23754c = m0Var;
        android.view.View view = zoomableEngine.f256241b;
        this.f23755d = view;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        m0Var.f215000i.getClass();
        this.f23756e = kotlinx.coroutines.flow.i3.a(m0Var.f215008q);
        this.f23757f = kotlinx.coroutines.flow.i3.a(java.lang.Integer.valueOf(m0Var.f215007p));
        this.f23758g = kotlinx.coroutines.flow.i3.a(java.lang.Boolean.valueOf(m0Var.f215009r));
        this.f23759h = kotlinx.coroutines.flow.i3.a(java.lang.Boolean.valueOf(m0Var.f215010s));
        kotlinx.coroutines.flow.j2 a17 = kotlinx.coroutines.flow.i3.a(bool);
        this.f23760i = a17;
        this.f23761j = a17;
        this.f23762k = kotlinx.coroutines.flow.i3.a(m0Var.f215013v);
        kotlinx.coroutines.flow.j2 a18 = kotlinx.coroutines.flow.i3.a(java.lang.Boolean.valueOf(m0Var.f215014w));
        this.f23763l = a18;
        kotlinx.coroutines.flow.j2 a19 = kotlinx.coroutines.flow.i3.a(m0Var.f215015x);
        this.f23764m = a19;
        kotlinx.coroutines.flow.j2 a27 = kotlinx.coroutines.flow.i3.a(m0Var.f215016y);
        this.f23765n = a27;
        this.f23766o = kotlinx.coroutines.flow.i3.a(java.lang.Integer.valueOf(m0Var.f215017z));
        kotlinx.coroutines.flow.j2 a28 = kotlinx.coroutines.flow.i3.a(m0Var.A);
        this.f23767p = a28;
        this.f23768q = kotlinx.coroutines.flow.i3.a(m0Var.B);
        this.f23769r = a18;
        this.f23770s = a28;
        this.f23771t = a19;
        this.f23772u = a27;
        view.addOnAttachStateChangeListener(new br5.a(this));
        if (view.isAttachedToWindow()) {
            a();
        }
    }

    public final void a() {
        if (this.f23753b != null) {
            return;
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        this.f23753b = kotlinx.coroutines.z0.a(g3Var);
        com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = this.f23754c;
        m0Var.getClass();
        zq5.b.d();
        if (m0Var.f214997f != null) {
            return;
        }
        kotlinx.coroutines.y0 a17 = kotlinx.coroutines.z0.a(g3Var);
        m0Var.f214997f = a17;
        kotlinx.coroutines.l.d(a17, null, null, new com.tencent.mm.zoomimage.subsampling.internal.j(m0Var, null), 3, null);
        kotlinx.coroutines.l.d(a17, null, null, new com.tencent.mm.zoomimage.subsampling.internal.l(m0Var, null), 3, null);
        kotlinx.coroutines.l.d(a17, null, null, new com.tencent.mm.zoomimage.subsampling.internal.n(m0Var, null), 3, null);
        kotlinx.coroutines.l.d(a17, null, null, new com.tencent.mm.zoomimage.subsampling.internal.p(m0Var, null), 3, null);
        kotlinx.coroutines.l.d(a17, null, null, new com.tencent.mm.zoomimage.subsampling.internal.r(m0Var, null), 3, null);
        androidx.lifecycle.o oVar = m0Var.f215011t;
        if (oVar != null) {
            oVar.a(m0Var.f215005n);
        }
        if (m0Var.f215006o != null) {
            m0Var.f("setImage");
        }
    }

    public final void b(boolean z17) {
        ((kotlinx.coroutines.flow.h3) this.f23758g).k(java.lang.Boolean.valueOf(z17));
        com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = this.f23754c;
        m0Var.getClass();
        zq5.b.d();
        if (m0Var.f215009r != z17) {
            m0Var.f214993b.a(new com.tencent.mm.zoomimage.subsampling.internal.e0(m0Var, z17));
            m0Var.f215009r = z17;
            com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var = m0Var.f214998g;
            if (v1Var == null || v1Var.f215140r == z17) {
                return;
            }
            v1Var.f215140r = z17;
            v1Var.d("disabledBackgroundTilesChanged");
        }
    }

    public final void c(int i17) {
        ((kotlinx.coroutines.flow.h3) this.f23757f).k(java.lang.Integer.valueOf(i17));
        com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = this.f23754c;
        m0Var.getClass();
        zq5.b.d();
        if (m0Var.f215007p != i17) {
            m0Var.f214993b.a(new com.tencent.mm.zoomimage.subsampling.internal.g0(i17, m0Var));
            m0Var.f215007p = i17;
            com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var = m0Var.f214998g;
            if (v1Var == null) {
                return;
            }
            v1Var.f215139q = i17;
        }
    }

    public final void d(yq5.n tileAnimationSpec) {
        kotlin.jvm.internal.o.g(tileAnimationSpec, "tileAnimationSpec");
        ((kotlinx.coroutines.flow.h3) this.f23756e).k(tileAnimationSpec);
        com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = this.f23754c;
        m0Var.getClass();
        zq5.b.d();
        if (kotlin.jvm.internal.o.b(m0Var.f215008q, tileAnimationSpec)) {
            return;
        }
        m0Var.f214993b.a(new com.tencent.mm.zoomimage.subsampling.internal.i0(m0Var, tileAnimationSpec));
        m0Var.f215008q = tileAnimationSpec;
        com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var = m0Var.f214998g;
        if (v1Var == null) {
            return;
        }
        v1Var.f215141s = tileAnimationSpec;
    }
}
