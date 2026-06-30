package b1;

/* loaded from: classes14.dex */
public final class o extends androidx.compose.ui.platform.i3 implements s1.i0, b1.h {

    /* renamed from: d, reason: collision with root package name */
    public final h1.c f17003d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17004e;

    /* renamed from: f, reason: collision with root package name */
    public final z0.d f17005f;

    /* renamed from: g, reason: collision with root package name */
    public final s1.p f17006g;

    /* renamed from: h, reason: collision with root package name */
    public final float f17007h;

    /* renamed from: i, reason: collision with root package name */
    public final e1.z f17008i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(h1.c painter, boolean z17, z0.d alignment, s1.p contentScale, float f17, e1.z zVar, yz5.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.o.g(painter, "painter");
        kotlin.jvm.internal.o.g(alignment, "alignment");
        kotlin.jvm.internal.o.g(contentScale, "contentScale");
        kotlin.jvm.internal.o.g(inspectorInfo, "inspectorInfo");
        this.f17003d = painter;
        this.f17004e = z17;
        this.f17005f = alignment;
        this.f17006g = contentScale;
        this.f17007h = f17;
        this.f17008i = zVar;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // s1.i0
    public int O(s1.u uVar, s1.t measurable, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        if (!a()) {
            return measurable.k(i17);
        }
        long d17 = d(p2.d.b(0, 0, 0, i17, 7, null));
        return java.lang.Math.max(p2.c.j(d17), measurable.k(i17));
    }

    @Override // b1.h
    public void P(g1.f fVar) {
        long j17;
        kotlin.jvm.internal.o.g(fVar, "<this>");
        long h17 = this.f17003d.h();
        long a17 = d1.l.a(c(h17) ? d1.k.d(h17) : d1.k.d(((u1.o0) fVar).a()), b(h17) ? d1.k.b(h17) : d1.k.b(((u1.o0) fVar).a()));
        u1.o0 o0Var = (u1.o0) fVar;
        if (!(d1.k.d(o0Var.a()) == 0.0f)) {
            if (!(d1.k.b(o0Var.a()) == 0.0f)) {
                j17 = s1.y1.b(a17, this.f17006g.a(a17, o0Var.a()));
                long j18 = j17;
                long a18 = ((z0.g) this.f17005f).a(p2.r.a(a06.d.b(d1.k.d(j18)), a06.d.b(d1.k.b(j18))), p2.r.a(a06.d.b(d1.k.d(o0Var.a())), a06.d.b(d1.k.b(o0Var.a()))), o0Var.getLayoutDirection());
                float f17 = (int) (a18 >> 32);
                float b17 = p2.m.b(a18);
                ((g1.d) ((g1.b) fVar.p()).f267504a).e(f17, b17);
                this.f17003d.g(fVar, j18, this.f17007h, this.f17008i);
                ((g1.d) ((g1.b) fVar.p()).f267504a).e(-f17, -b17);
                o0Var.b();
            }
        }
        int i17 = d1.k.f225643d;
        j17 = d1.k.f225641b;
        long j182 = j17;
        long a182 = ((z0.g) this.f17005f).a(p2.r.a(a06.d.b(d1.k.d(j182)), a06.d.b(d1.k.b(j182))), p2.r.a(a06.d.b(d1.k.d(o0Var.a())), a06.d.b(d1.k.b(o0Var.a()))), o0Var.getLayoutDirection());
        float f172 = (int) (a182 >> 32);
        float b172 = p2.m.b(a182);
        ((g1.d) ((g1.b) fVar.p()).f267504a).e(f172, b172);
        this.f17003d.g(fVar, j182, this.f17007h, this.f17008i);
        ((g1.d) ((g1.b) fVar.p()).f267504a).e(-f172, -b172);
        o0Var.b();
    }

    @Override // s1.i0
    public int Q(s1.u uVar, s1.t measurable, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        if (!a()) {
            return measurable.i(i17);
        }
        long d17 = d(p2.d.b(0, i17, 0, 0, 13, null));
        return java.lang.Math.max(p2.c.i(d17), measurable.i(i17));
    }

    @Override // s1.i0
    public int S(s1.u uVar, s1.t measurable, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        if (!a()) {
            return measurable.j(i17);
        }
        long d17 = d(p2.d.b(0, i17, 0, 0, 13, null));
        return java.lang.Math.max(p2.c.i(d17), measurable.j(i17));
    }

    public final boolean a() {
        if (!this.f17004e) {
            return false;
        }
        long h17 = this.f17003d.h();
        int i17 = d1.k.f225643d;
        return (h17 > d1.k.f225642c ? 1 : (h17 == d1.k.f225642c ? 0 : -1)) != 0;
    }

    public final boolean b(long j17) {
        int i17 = d1.k.f225643d;
        if (d1.k.a(j17, d1.k.f225642c)) {
            return false;
        }
        float b17 = d1.k.b(j17);
        return !java.lang.Float.isInfinite(b17) && !java.lang.Float.isNaN(b17);
    }

    public final boolean c(long j17) {
        int i17 = d1.k.f225643d;
        if (d1.k.a(j17, d1.k.f225642c)) {
            return false;
        }
        float d17 = d1.k.d(j17);
        return !java.lang.Float.isInfinite(d17) && !java.lang.Float.isNaN(d17);
    }

    public final long d(long j17) {
        boolean z17 = p2.c.d(j17) && p2.c.c(j17);
        boolean z18 = p2.c.f(j17) && p2.c.e(j17);
        if ((!a() && z17) || z18) {
            return p2.c.a(j17, p2.c.h(j17), 0, p2.c.g(j17), 0, 10, null);
        }
        h1.c cVar = this.f17003d;
        long h17 = cVar.h();
        long a17 = d1.l.a(p2.d.e(j17, c(h17) ? a06.d.b(d1.k.d(h17)) : p2.c.j(j17)), p2.d.d(j17, b(h17) ? a06.d.b(d1.k.b(h17)) : p2.c.i(j17)));
        if (a()) {
            long a18 = d1.l.a(!c(cVar.h()) ? d1.k.d(a17) : d1.k.d(cVar.h()), !b(cVar.h()) ? d1.k.b(a17) : d1.k.b(cVar.h()));
            if (!(d1.k.d(a17) == 0.0f)) {
                if (!(d1.k.b(a17) == 0.0f)) {
                    a17 = s1.y1.b(a18, this.f17006g.a(a18, a17));
                }
            }
            a17 = d1.k.f225641b;
        }
        return p2.c.a(j17, p2.d.e(j17, a06.d.b(d1.k.d(a17))), 0, p2.d.d(j17, a06.d.b(d1.k.b(a17))), 0, 10, null);
    }

    public boolean equals(java.lang.Object obj) {
        b1.o oVar = obj instanceof b1.o ? (b1.o) obj : null;
        if (oVar != null && kotlin.jvm.internal.o.b(this.f17003d, oVar.f17003d) && this.f17004e == oVar.f17004e && kotlin.jvm.internal.o.b(this.f17005f, oVar.f17005f) && kotlin.jvm.internal.o.b(this.f17006g, oVar.f17006g)) {
            return ((this.f17007h > oVar.f17007h ? 1 : (this.f17007h == oVar.f17007h ? 0 : -1)) == 0) && kotlin.jvm.internal.o.b(this.f17008i, oVar.f17008i);
        }
        return false;
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        kotlin.jvm.internal.o.g(measure, "$this$measure");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        s1.o1 m17 = measurable.m(d(j17));
        return s1.v0.b(measure, m17.f402050d, m17.f402051e, null, new b1.n(m17), 4, null);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f17003d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f17004e)) * 31) + this.f17005f.hashCode()) * 31) + this.f17006g.hashCode()) * 31) + java.lang.Float.hashCode(this.f17007h)) * 31;
        e1.z zVar = this.f17008i;
        return hashCode + (zVar != null ? zVar.hashCode() : 0);
    }

    @Override // z0.t
    public z0.t k(z0.t other) {
        kotlin.jvm.internal.o.g(other, "other");
        return z0.q.a(this, other);
    }

    @Override // z0.t
    public java.lang.Object m(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(this, obj);
    }

    public java.lang.String toString() {
        return "PainterModifier(painter=" + this.f17003d + ", sizeToIntrinsics=" + this.f17004e + ", alignment=" + this.f17005f + ", alpha=" + this.f17007h + ", colorFilter=" + this.f17008i + ')';
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // s1.i0
    public int x(s1.u uVar, s1.t measurable, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        if (!a()) {
            return measurable.l(i17);
        }
        long d17 = d(p2.d.b(0, 0, 0, i17, 7, null));
        return java.lang.Math.max(p2.c.j(d17), measurable.l(i17));
    }
}
