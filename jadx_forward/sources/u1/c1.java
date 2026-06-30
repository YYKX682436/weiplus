package u1;

/* loaded from: classes14.dex */
public abstract class c1 extends s1.o1 implements s1.r0, s1.z, u1.s1, yz5.l {
    public static final e1.x0 C = new e1.x0();
    public static final u1.v0 D = new u1.r0();
    public static final u1.v0 E = new u1.s0();
    public boolean A;
    public u1.o1 B;

    /* renamed from: h, reason: collision with root package name */
    public final u1.w f505087h;

    /* renamed from: i, reason: collision with root package name */
    public u1.c1 f505088i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f505089m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f505090n;

    /* renamed from: o, reason: collision with root package name */
    public p2.f f505091o;

    /* renamed from: p, reason: collision with root package name */
    public p2.s f505092p;

    /* renamed from: q, reason: collision with root package name */
    public float f505093q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f505094r;

    /* renamed from: s, reason: collision with root package name */
    public s1.u0 f505095s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.Map f505096t;

    /* renamed from: u, reason: collision with root package name */
    public long f505097u;

    /* renamed from: v, reason: collision with root package name */
    public float f505098v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f505099w;

    /* renamed from: x, reason: collision with root package name */
    public d1.d f505100x;

    /* renamed from: y, reason: collision with root package name */
    public final u1.p0[] f505101y;

    /* renamed from: z, reason: collision with root package name */
    public final yz5.a f505102z;

    public c1(u1.w layoutNode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutNode, "layoutNode");
        this.f505087h = layoutNode;
        this.f505091o = layoutNode.f505231v;
        this.f505092p = layoutNode.f505233x;
        this.f505093q = 0.8f;
        int i17 = p2.m.f432922c;
        this.f505097u = p2.m.f432921b;
        this.f505101y = new u1.p0[6];
        this.f505102z = new u1.y0(this);
    }

    public final void A0(s1.u0 value) {
        u1.w p17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        s1.u0 u0Var = this.f505095s;
        if (value != u0Var) {
            this.f505095s = value;
            u1.w wVar = this.f505087h;
            if (u0Var == null || value.mo126532x755bd410() != u0Var.mo126532x755bd410() || value.mo126531x1c4fb41d() != u0Var.mo126531x1c4fb41d()) {
                int mo126532x755bd410 = value.mo126532x755bd410();
                int mo126531x1c4fb41d = value.mo126531x1c4fb41d();
                u1.o1 o1Var = this.B;
                if (o1Var != null) {
                    o1Var.d(p2.r.a(mo126532x755bd410, mo126531x1c4fb41d));
                } else {
                    u1.c1 c1Var = this.f505088i;
                    if (c1Var != null) {
                        c1Var.o0();
                    }
                }
                u1.r1 r1Var = wVar.f505222m;
                if (r1Var != null) {
                    ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988) r1Var).m(wVar);
                }
                N(p2.r.a(mo126532x755bd410, mo126531x1c4fb41d));
                for (u1.p0 p0Var = this.f505101y[0]; p0Var != null; p0Var = p0Var.f505189f) {
                    ((u1.o) p0Var).f505183m = true;
                }
            }
            java.util.Map map = this.f505096t;
            if ((!(map == null || map.isEmpty()) || (!value.c().isEmpty())) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(value.c(), this.f505096t)) {
                u1.c1 j07 = j0();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j07 != null ? j07.f505087h : null, wVar)) {
                    u1.w p18 = wVar.p();
                    if (p18 != null) {
                        p18.C();
                    }
                    u1.n0 n0Var = wVar.f505235z;
                    if (n0Var.f505165c) {
                        u1.w p19 = wVar.p();
                        if (p19 != null) {
                            p19.I(false);
                        }
                    } else if (n0Var.f505166d && (p17 = wVar.p()) != null) {
                        p17.H(false);
                    }
                } else {
                    wVar.C();
                }
                wVar.f505235z.f505164b = true;
                java.util.Map map2 = this.f505096t;
                if (map2 == null) {
                    map2 = new java.util.LinkedHashMap();
                    this.f505096t = map2;
                }
                map2.clear();
                map2.putAll(value.c());
            }
        }
    }

    @Override // s1.o1
    public void B(long j17, float f17, yz5.l lVar) {
        v0(lVar);
        long j18 = this.f505097u;
        int i17 = p2.m.f432922c;
        if (!(j18 == j17)) {
            this.f505097u = j17;
            u1.o1 o1Var = this.B;
            if (o1Var != null) {
                o1Var.g(j17);
            } else {
                u1.c1 c1Var = this.f505088i;
                if (c1Var != null) {
                    c1Var.o0();
                }
            }
            u1.c1 j07 = j0();
            u1.w wVar = j07 != null ? j07.f505087h : null;
            u1.w wVar2 = this.f505087h;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(wVar, wVar2)) {
                u1.w p17 = wVar2.p();
                if (p17 != null) {
                    p17.C();
                }
            } else {
                wVar2.C();
            }
            u1.r1 r1Var = wVar2.f505222m;
            if (r1Var != null) {
                ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988) r1Var).m(wVar2);
            }
        }
        this.f505098v = f17;
    }

    public final boolean B0() {
        u1.x1 x1Var = (u1.x1) this.f505101y[1];
        if (x1Var != null && x1Var.c()) {
            return true;
        }
        u1.c1 j07 = j0();
        return j07 != null && j07.B0();
    }

    public final void C0(u1.p0 p0Var, u1.v0 v0Var, long j17, u1.s sVar, boolean z17, boolean z18, float f17) {
        if (p0Var == null) {
            n0(v0Var, j17, sVar, z17, z18);
            return;
        }
        if (!v0Var.d(p0Var)) {
            C0(p0Var.f505189f, v0Var, j17, sVar, z17, z18, f17);
            return;
        }
        java.lang.Object e17 = v0Var.e(p0Var);
        u1.a1 a1Var = new u1.a1(this, p0Var, v0Var, j17, sVar, z17, z18, f17);
        sVar.getClass();
        if (sVar.f505200f == kz5.c0.h(sVar)) {
            sVar.e(e17, f17, z18, a1Var);
            if (sVar.f505200f + 1 == kz5.c0.h(sVar)) {
                sVar.g();
                return;
            }
            return;
        }
        long d17 = sVar.d();
        int i17 = sVar.f505200f;
        sVar.f505200f = kz5.c0.h(sVar);
        sVar.e(e17, f17, z18, a1Var);
        if (sVar.f505200f + 1 < kz5.c0.h(sVar) && u1.k.a(d17, sVar.d()) > 0) {
            int i18 = sVar.f505200f + 1;
            int i19 = i17 + 1;
            java.lang.Object[] objArr = sVar.f505198d;
            kz5.v.k(objArr, objArr, i19, i18, sVar.f505201g);
            long[] jArr = sVar.f505199e;
            int i27 = sVar.f505201g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jArr, "<this>");
            java.lang.System.arraycopy(jArr, i18, jArr, i19, i27 - i18);
            sVar.f505200f = ((sVar.f505201g + i17) - sVar.f505200f) - 1;
        }
        sVar.g();
        sVar.f505200f = i17;
    }

    public long D0(long j17) {
        u1.o1 o1Var = this.B;
        if (o1Var != null) {
            j17 = o1Var.c(j17, false);
        }
        long j18 = this.f505097u;
        float c17 = d1.e.c(j17);
        int i17 = p2.m.f432922c;
        return d1.f.a(c17 + ((int) (j18 >> 32)), d1.e.d(j17) + p2.m.b(j18));
    }

    public final void E0() {
        u1.c1 c1Var;
        u1.w wVar;
        e1.x0 x0Var;
        u1.o1 o1Var = this.B;
        e1.x0 x0Var2 = C;
        u1.w wVar2 = this.f505087h;
        if (o1Var != null) {
            yz5.l lVar = this.f505090n;
            if (lVar == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            x0Var2.f327828d = 1.0f;
            x0Var2.f327829e = 1.0f;
            x0Var2.f327830f = 1.0f;
            x0Var2.f327831g = 0.0f;
            x0Var2.f327832h = 0.0f;
            x0Var2.f327833i = 0.0f;
            long j17 = e1.f0.f327785a;
            x0Var2.f327834m = j17;
            x0Var2.f327835n = j17;
            x0Var2.f327836o = 0.0f;
            x0Var2.f327837p = 0.0f;
            x0Var2.f327838q = 0.0f;
            x0Var2.f327839r = 8.0f;
            x0Var2.f327840s = e1.i1.f327805b;
            x0Var2.f327841t = e1.v0.f327822a;
            x0Var2.f327842u = false;
            p2.f fVar = wVar2.f505231v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<set-?>");
            x0Var2.f327843v = fVar;
            u1.q0.a(wVar2).getSnapshotObserver().a(this, u1.u0.f505204d, new u1.b1(lVar));
            wVar = wVar2;
            o1Var.b(x0Var2.f327828d, x0Var2.f327829e, x0Var2.f327830f, x0Var2.f327831g, x0Var2.f327832h, x0Var2.f327833i, x0Var2.f327836o, x0Var2.f327837p, x0Var2.f327838q, x0Var2.f327839r, x0Var2.f327840s, x0Var2.f327841t, x0Var2.f327842u, null, x0Var2.f327834m, x0Var2.f327835n, wVar.f505233x, wVar.f505231v);
            x0Var = x0Var2;
            c1Var = this;
            c1Var.f505089m = x0Var.f327842u;
        } else {
            c1Var = this;
            wVar = wVar2;
            x0Var = x0Var2;
            if (!(c1Var.f505090n == null)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
        }
        c1Var.f505093q = x0Var.f327830f;
        u1.r1 r1Var = wVar.f505222m;
        if (r1Var != null) {
            ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988) r1Var).m(wVar);
        }
    }

    public long F0(long j17) {
        if (!p0()) {
            throw new java.lang.IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        s1.z c17 = s1.a0.c(this);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988 = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988) u1.q0.a(this.f505087h);
        c1059xa8272988.p();
        return s0(c17, d1.e.e(e1.j0.b(c1059xa8272988.P, j17), s1.a0.d(c17)));
    }

    public final void P(u1.c1 c1Var, d1.d dVar, boolean z17) {
        if (c1Var == this) {
            return;
        }
        u1.c1 c1Var2 = this.f505088i;
        if (c1Var2 != null) {
            c1Var2.P(c1Var, dVar, z17);
        }
        long j17 = this.f505097u;
        int i17 = p2.m.f432922c;
        float f17 = (int) (j17 >> 32);
        dVar.f307152a -= f17;
        dVar.f307154c -= f17;
        float b17 = p2.m.b(j17);
        dVar.f307153b -= b17;
        dVar.f307155d -= b17;
        u1.o1 o1Var = this.B;
        if (o1Var != null) {
            o1Var.a(dVar, true);
            if (this.f505089m && z17) {
                long j18 = this.f483585f;
                dVar.a(0.0f, 0.0f, (int) (j18 >> 32), p2.q.b(j18));
            }
        }
    }

    public final long Q(u1.c1 c1Var, long j17) {
        if (c1Var == this) {
            return j17;
        }
        u1.c1 c1Var2 = this.f505088i;
        return (c1Var2 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c1Var, c1Var2)) ? d0(j17) : d0(c1Var2.Q(c1Var, j17));
    }

    public abstract int S(s1.a aVar);

    public final long X(long j17) {
        return d1.l.a(java.lang.Math.max(0.0f, (d1.k.d(j17) - y()) / 2.0f), java.lang.Math.max(0.0f, (d1.k.b(j17) - x()) / 2.0f));
    }

    public void Y() {
        for (u1.p0 p0Var : this.f505101y) {
            for (; p0Var != null; p0Var = p0Var.f505189f) {
                p0Var.b();
            }
        }
        this.f505094r = false;
        v0(this.f505090n);
        u1.w p17 = this.f505087h.p();
        if (p17 != null) {
            p17.u();
        }
    }

    public final float Z(long j17, long j18) {
        if (y() >= d1.k.d(j18) && x() >= d1.k.b(j18)) {
            return Float.POSITIVE_INFINITY;
        }
        long X = X(j18);
        float d17 = d1.k.d(X);
        float b17 = d1.k.b(X);
        float c17 = d1.e.c(j17);
        float max = java.lang.Math.max(0.0f, c17 < 0.0f ? -c17 : c17 - y());
        float d18 = d1.e.d(j17);
        long a17 = d1.f.a(max, java.lang.Math.max(0.0f, d18 < 0.0f ? -d18 : d18 - x()));
        if ((d17 > 0.0f || b17 > 0.0f) && d1.e.c(a17) <= d17 && d1.e.d(a17) <= b17) {
            return (d1.e.c(a17) * d1.e.c(a17)) + (d1.e.d(a17) * d1.e.d(a17));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void a0(e1.u canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        u1.o1 o1Var = this.B;
        if (o1Var != null) {
            o1Var.i(canvas);
            return;
        }
        long j17 = this.f505097u;
        float f17 = (int) (j17 >> 32);
        float b17 = p2.m.b(j17);
        canvas.e(f17, b17);
        u1.o oVar = (u1.o) this.f505101y[0];
        if (oVar == null) {
            y0(canvas);
        } else {
            oVar.c(canvas);
        }
        canvas.e(-f17, -b17);
    }

    public final void b0(e1.u canvas, e1.n0 paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        long j17 = this.f483585f;
        canvas.a(new d1.g(0.5f, 0.5f, ((int) (j17 >> 32)) - 0.5f, p2.q.b(j17) - 0.5f), paint);
    }

    public final u1.c1 c0(u1.c1 other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        u1.w wVar = other.f505087h;
        u1.w wVar2 = this.f505087h;
        if (wVar == wVar2) {
            u1.c1 c1Var = wVar2.f505215J.f505173i;
            u1.c1 c1Var2 = this;
            while (c1Var2 != c1Var && c1Var2 != other) {
                c1Var2 = c1Var2.f505088i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1Var2);
            }
            return c1Var2 == other ? other : this;
        }
        u1.w wVar3 = wVar;
        while (wVar3.f505223n > wVar2.f505223n) {
            wVar3 = wVar3.p();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar3);
        }
        u1.w wVar4 = wVar2;
        while (wVar4.f505223n > wVar3.f505223n) {
            wVar4 = wVar4.p();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar4);
        }
        while (wVar3 != wVar4) {
            wVar3 = wVar3.p();
            wVar4 = wVar4.p();
            if (wVar3 == null || wVar4 == null) {
                throw new java.lang.IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return wVar4 == wVar2 ? this : wVar3 == wVar ? other : wVar3.I;
    }

    public long d0(long j17) {
        long j18 = this.f505097u;
        float c17 = d1.e.c(j17);
        int i17 = p2.m.f432922c;
        long a17 = d1.f.a(c17 - ((int) (j18 >> 32)), d1.e.d(j17) - p2.m.b(j18));
        u1.o1 o1Var = this.B;
        return o1Var != null ? o1Var.c(a17, true) : a17;
    }

    public final s1.u0 e0() {
        s1.u0 u0Var = this.f505095s;
        if (u0Var != null) {
            return u0Var;
        }
        throw new java.lang.IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    public abstract s1.x0 f0();

    @Override // s1.o1, s1.t
    public java.lang.Object g() {
        return h0((u1.a2) this.f505101y[3]);
    }

    public final long g0() {
        return this.f505091o.t(this.f505087h.f505234y.e());
    }

    public final java.lang.Object h0(u1.a2 a2Var) {
        if (a2Var != null) {
            return ((s1.l1) a2Var.f505188e).s(f0(), h0((u1.a2) a2Var.f505189f));
        }
        u1.c1 j07 = j0();
        if (j07 != null) {
            return j07.g();
        }
        return null;
    }

    public final s1.z i0() {
        if (p0()) {
            return this.f505087h.f505215J.f505173i.f505088i;
        }
        throw new java.lang.IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        e1.u canvas = (e1.u) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        u1.w wVar = this.f505087h;
        if (wVar.A) {
            u1.q0.a(wVar).getSnapshotObserver().a(this, u1.t0.f505202d, new u1.z0(this, canvas));
            this.A = false;
        } else {
            this.A = true;
        }
        return jz5.f0.f384359a;
    }

    @Override // u1.s1
    /* renamed from: isValid */
    public boolean mo7155x7b953cf2() {
        return this.B != null;
    }

    public u1.c1 j0() {
        return null;
    }

    public final void k0(u1.p0 p0Var, u1.v0 v0Var, long j17, u1.s sVar, boolean z17, boolean z18) {
        if (p0Var == null) {
            n0(v0Var, j17, sVar, z17, z18);
            return;
        }
        java.lang.Object e17 = v0Var.e(p0Var);
        u1.w0 w0Var = new u1.w0(this, p0Var, v0Var, j17, sVar, z17, z18);
        sVar.getClass();
        sVar.e(e17, -1.0f, z18, w0Var);
    }

    public final void l0(u1.p0 p0Var, u1.v0 v0Var, long j17, u1.s sVar, boolean z17, boolean z18, float f17) {
        if (p0Var == null) {
            n0(v0Var, j17, sVar, z17, z18);
        } else {
            sVar.e(v0Var.e(p0Var), f17, z18, new u1.x0(this, p0Var, v0Var, j17, sVar, z17, z18, f17));
        }
    }

    public final void m0(u1.v0 hitTestSource, long j17, u1.s hitTestResult, boolean z17, boolean z18) {
        u1.o1 o1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hitTestSource, "hitTestSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hitTestResult, "hitTestResult");
        u1.p0 p0Var = this.f505101y[hitTestSource.a()];
        boolean z19 = true;
        if (!(d1.f.b(j17) && ((o1Var = this.B) == null || !this.f505089m || o1Var.f(j17)))) {
            if (z17) {
                float Z = Z(j17, g0());
                if ((java.lang.Float.isInfinite(Z) || java.lang.Float.isNaN(Z)) ? false : true) {
                    if (hitTestResult.f505200f != kz5.c0.h(hitTestResult)) {
                        if (u1.k.a(hitTestResult.d(), u1.t.a(Z, false)) <= 0) {
                            z19 = false;
                        }
                    }
                    if (z19) {
                        l0(p0Var, hitTestSource, j17, hitTestResult, z17, false, Z);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (p0Var == null) {
            n0(hitTestSource, j17, hitTestResult, z17, z18);
            return;
        }
        float c17 = d1.e.c(j17);
        float d17 = d1.e.d(j17);
        if (c17 >= 0.0f && d17 >= 0.0f && c17 < ((float) y()) && d17 < ((float) x())) {
            k0(p0Var, hitTestSource, j17, hitTestResult, z17, z18);
            return;
        }
        float Z2 = !z17 ? Float.POSITIVE_INFINITY : Z(j17, g0());
        if ((java.lang.Float.isInfinite(Z2) || java.lang.Float.isNaN(Z2)) ? false : true) {
            if (hitTestResult.f505200f != kz5.c0.h(hitTestResult)) {
                if (u1.k.a(hitTestResult.d(), u1.t.a(Z2, z18)) <= 0) {
                    z19 = false;
                }
            }
            if (z19) {
                l0(p0Var, hitTestSource, j17, hitTestResult, z17, z18, Z2);
                return;
            }
        }
        C0(p0Var, hitTestSource, j17, hitTestResult, z17, z18, Z2);
    }

    public void n0(u1.v0 hitTestSource, long j17, u1.s hitTestResult, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hitTestSource, "hitTestSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hitTestResult, "hitTestResult");
        u1.c1 j07 = j0();
        if (j07 != null) {
            j07.m0(hitTestSource, j07.d0(j17), hitTestResult, z17, z18);
        }
    }

    public void o0() {
        u1.o1 o1Var = this.B;
        if (o1Var != null) {
            o1Var.mo7146x92d0313b();
            return;
        }
        u1.c1 c1Var = this.f505088i;
        if (c1Var != null) {
            c1Var.o0();
        }
    }

    public final boolean p0() {
        if (!this.f505094r || this.f505087h.x()) {
            return this.f505094r;
        }
        throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
    }

    public final boolean q0() {
        if (this.B != null && this.f505093q <= 0.0f) {
            return true;
        }
        u1.c1 c1Var = this.f505088i;
        if (c1Var != null) {
            return c1Var.q0();
        }
        return false;
    }

    public d1.g r0(s1.z sourceCoordinates, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceCoordinates, "sourceCoordinates");
        if (!p0()) {
            throw new java.lang.IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        u1.c1 c1Var = (u1.c1) sourceCoordinates;
        if (!c1Var.p0()) {
            throw new java.lang.IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
        }
        u1.c1 c1Var2 = (u1.c1) sourceCoordinates;
        u1.c1 c07 = c0(c1Var2);
        d1.d dVar = this.f505100x;
        if (dVar == null) {
            dVar = new d1.d(0.0f, 0.0f, 0.0f, 0.0f);
            this.f505100x = dVar;
        }
        dVar.f307152a = 0.0f;
        dVar.f307153b = 0.0f;
        long j17 = c1Var.f483585f;
        dVar.f307154c = (int) (j17 >> 32);
        dVar.f307155d = p2.q.b(j17);
        while (c1Var2 != c07) {
            c1Var2.z0(dVar, z17, false);
            if (dVar.b()) {
                return d1.g.f307161e;
            }
            c1Var2 = c1Var2.f505088i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1Var2);
        }
        P(c07, dVar, z17);
        return new d1.g(dVar.f307152a, dVar.f307153b, dVar.f307154c, dVar.f307155d);
    }

    @Override // s1.y0
    public final int s(s1.a alignmentLine) {
        int S;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alignmentLine, "alignmentLine");
        if ((this.f505095s != null) && (S = S(alignmentLine)) != Integer.MIN_VALUE) {
            return S + p2.m.b(u());
        }
        return Integer.MIN_VALUE;
    }

    public long s0(s1.z sourceCoordinates, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceCoordinates, "sourceCoordinates");
        u1.c1 c1Var = (u1.c1) sourceCoordinates;
        u1.c1 c07 = c0(c1Var);
        while (c1Var != c07) {
            j17 = c1Var.D0(j17);
            c1Var = c1Var.f505088i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1Var);
        }
        return Q(c07, j17);
    }

    public long t0(long j17) {
        if (!p0()) {
            throw new java.lang.IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        for (u1.c1 c1Var = this; c1Var != null; c1Var = c1Var.f505088i) {
            j17 = c1Var.D0(j17);
        }
        return j17;
    }

    public long u0(long j17) {
        long t07 = t0(j17);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988 = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988) u1.q0.a(this.f505087h);
        c1059xa8272988.p();
        return e1.j0.b(c1059xa8272988.N, t07);
    }

    public final void v0(yz5.l lVar) {
        u1.r1 r1Var;
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.u4 u4Var;
        java.lang.ref.Reference poll;
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.v2 q4Var;
        yz5.l lVar2 = this.f505090n;
        u1.w wVar = this.f505087h;
        boolean z17 = (lVar2 == lVar && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f505091o, wVar.f505231v) && this.f505092p == wVar.f505233x) ? false : true;
        this.f505090n = lVar;
        this.f505091o = wVar.f505231v;
        this.f505092p = wVar.f505233x;
        boolean p07 = p0();
        yz5.a invalidateParentLayer = this.f505102z;
        java.lang.Object obj = null;
        if (!p07 || lVar == null) {
            u1.o1 o1Var = this.B;
            if (o1Var != null) {
                o1Var.mo7121x5cd39ffa();
                wVar.N = true;
                ((u1.y0) invalidateParentLayer).mo152xb9724478();
                if (p0() && (r1Var = wVar.f505222m) != null) {
                    ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988) r1Var).m(wVar);
                }
            }
            this.B = null;
            this.A = false;
            return;
        }
        if (this.B != null) {
            if (z17) {
                E0();
                return;
            }
            return;
        }
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988 = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988) u1.q0.a(wVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invalidateParentLayer, "invalidateParentLayer");
        do {
            u4Var = c1059xa8272988.G1;
            poll = u4Var.f92291b.poll();
            if (poll != null) {
                u4Var.f92290a.k(poll);
            }
        } while (poll != null);
        while (true) {
            o0.i iVar = u4Var.f92290a;
            if (!iVar.j()) {
                break;
            }
            java.lang.Object obj2 = ((java.lang.ref.Reference) iVar.m(iVar.f423385f - 1)).get();
            if (obj2 != null) {
                obj = obj2;
                break;
            }
        }
        u1.o1 o1Var2 = (u1.o1) obj;
        if (o1Var2 != null) {
            o1Var2.e(this, invalidateParentLayer);
        } else {
            if (c1059xa8272988.isHardwareAccelerated() && c1059xa8272988.U) {
                try {
                    o1Var2 = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.v3(c1059xa8272988, this, invalidateParentLayer);
                } catch (java.lang.Throwable unused) {
                    c1059xa8272988.U = false;
                }
            }
            if (c1059xa8272988.G == null) {
                p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.n4 n4Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p4.f92216s;
                if (!p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p4.f92220w) {
                    n4Var.a(new android.view.View(c1059xa8272988.getContext()));
                }
                if (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p4.f92221x) {
                    android.content.Context context = c1059xa8272988.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "context");
                    q4Var = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.v2(context);
                } else {
                    android.content.Context context2 = c1059xa8272988.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "context");
                    q4Var = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q4(context2);
                }
                c1059xa8272988.G = q4Var;
                c1059xa8272988.addView(q4Var);
            }
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.v2 v2Var = c1059xa8272988.G;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v2Var);
            o1Var2 = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p4(c1059xa8272988, v2Var, this, invalidateParentLayer);
        }
        o1Var2.d(this.f483585f);
        o1Var2.g(this.f505097u);
        this.B = o1Var2;
        E0();
        wVar.N = true;
        ((u1.y0) invalidateParentLayer).mo152xb9724478();
    }

    public final void w0() {
        u1.p0[] p0VarArr = this.f505101y;
        if (u1.p.a(p0VarArr, 5)) {
            x0.m g17 = x0.z.g((x0.m) x0.z.f532495a.a(), null);
            try {
                x0.m i17 = g17.i();
                try {
                    for (u1.p0 p0Var = p0VarArr[5]; p0Var != null; p0Var = p0Var.f505189f) {
                        ((s1.j1) ((u1.a2) p0Var).f505188e).y(this.f483585f);
                    }
                } finally {
                    g17.o(i17);
                }
            } finally {
                g17.c();
            }
        }
    }

    public void x0() {
        u1.o1 o1Var = this.B;
        if (o1Var != null) {
            o1Var.mo7146x92d0313b();
        }
    }

    public abstract void y0(e1.u uVar);

    public final void z0(d1.d bounds, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bounds, "bounds");
        u1.o1 o1Var = this.B;
        if (o1Var != null) {
            if (this.f505089m) {
                if (z18) {
                    long g07 = g0();
                    float d17 = d1.k.d(g07) / 2.0f;
                    float b17 = d1.k.b(g07) / 2.0f;
                    long j17 = this.f483585f;
                    bounds.a(-d17, -b17, ((int) (j17 >> 32)) + d17, p2.q.b(j17) + b17);
                } else if (z17) {
                    long j18 = this.f483585f;
                    bounds.a(0.0f, 0.0f, (int) (j18 >> 32), p2.q.b(j18));
                }
                if (bounds.b()) {
                    return;
                }
            }
            o1Var.a(bounds, false);
        }
        long j19 = this.f505097u;
        int i17 = p2.m.f432922c;
        float f17 = (int) (j19 >> 32);
        bounds.f307152a += f17;
        bounds.f307154c += f17;
        float b18 = p2.m.b(j19);
        bounds.f307153b += b18;
        bounds.f307155d += b18;
    }
}
