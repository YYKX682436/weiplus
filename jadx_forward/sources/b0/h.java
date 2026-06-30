package b0;

/* loaded from: classes14.dex */
public final class h implements g0.m, s1.j1, s1.i1 {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f97835d;

    /* renamed from: e, reason: collision with root package name */
    public final b0.y1 f97836e;

    /* renamed from: f, reason: collision with root package name */
    public final b0.f3 f97837f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f97838g;

    /* renamed from: h, reason: collision with root package name */
    public s1.z f97839h;

    /* renamed from: i, reason: collision with root package name */
    public s1.z f97840i;

    /* renamed from: m, reason: collision with root package name */
    public p2.q f97841m;

    /* renamed from: n, reason: collision with root package name */
    public final z0.t f97842n;

    public h(p3325xe03a0797.p3326xc267989b.y0 scope, b0.y1 orientation, b0.f3 scrollableState, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orientation, "orientation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scrollableState, "scrollableState");
        this.f97835d = scope;
        this.f97836e = orientation;
        this.f97837f = scrollableState;
        this.f97838g = z17;
        b0.f fVar = new b0.f(this);
        t1.f fVar2 = a0.b1.f81613a;
        boolean z18 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.f3.f92095a;
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3 e3Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3.f92086d;
        z0.t a17 = z0.m.a(this, e3Var, new a0.a1(fVar));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "<this>");
        this.f97842n = z0.m.a(a17, e3Var, new g0.n(this));
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    public final d1.g a(d1.g gVar, long j17) {
        long b17 = p2.r.b(j17);
        int ordinal = this.f97836e.ordinal();
        if (ordinal == 0) {
            return gVar.c(0.0f, c(gVar.f307163b, gVar.f307165d, d1.k.b(b17)));
        }
        if (ordinal != 1) {
            throw new jz5.j();
        }
        return gVar.c(c(gVar.f307162a, gVar.f307164c, d1.k.d(b17)), 0.0f);
    }

    public final java.lang.Object b(d1.g gVar, d1.g gVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        float f17;
        float f18;
        int ordinal = this.f97836e.ordinal();
        if (ordinal == 0) {
            f17 = gVar.f307163b;
            f18 = gVar2.f307163b;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            f17 = gVar.f307162a;
            f18 = gVar2.f307162a;
        }
        float f19 = f17 - f18;
        if (this.f97838g) {
            f19 = -f19;
        }
        java.lang.Object b17 = b0.o2.b(this.f97837f, f19, null, interfaceC29045xdcb5ca57, 2, null);
        return b17 == pz5.a.f440719d ? b17 : jz5.f0.f384359a;
    }

    public final float c(float f17, float f18, float f19) {
        if ((f17 >= 0.0f && f18 <= f19) || (f17 < 0.0f && f18 > f19)) {
            return 0.0f;
        }
        float f27 = f18 - f19;
        return java.lang.Math.abs(f17) < java.lang.Math.abs(f27) ? f17 : f27;
    }

    @Override // s1.i1
    public void i(s1.z coordinates) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coordinates, "coordinates");
        this.f97840i = coordinates;
    }

    @Override // z0.t
    public z0.t k(z0.t other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return z0.q.a(this, other);
    }

    @Override // z0.t
    public java.lang.Object m(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(this, obj);
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(obj, this);
    }

    @Override // s1.j1
    public void y(long j17) {
        s1.z zVar;
        s1.z zVar2 = this.f97840i;
        p2.q qVar = this.f97841m;
        if (qVar != null) {
            long j18 = qVar.f432929a;
            if (!p2.q.a(j18, j17)) {
                if (zVar2 != null && ((u1.c1) zVar2).p0()) {
                    if ((this.f97836e != b0.y1.Horizontal ? p2.q.b(((u1.c1) zVar2).f483585f) < p2.q.b(j18) : ((int) (((u1.c1) zVar2).f483585f >> 32)) < ((int) (j18 >> 32))) && (zVar = this.f97839h) != null) {
                        u1.c1 c1Var = (u1.c1) zVar2;
                        d1.g r07 = c1Var.r0(zVar, false);
                        d1.g a17 = d1.h.a(d1.e.f307156b, p2.r.b(j18));
                        d1.g a18 = a(r07, c1Var.f483585f);
                        boolean b17 = a17.b(r07);
                        boolean z17 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a18, r07);
                        if (b17 && z17) {
                            p3325xe03a0797.p3326xc267989b.l.d(this.f97835d, null, null, new b0.g(this, r07, a18, null), 3, null);
                        }
                    }
                }
            }
        }
        this.f97841m = new p2.q(j17);
    }
}
