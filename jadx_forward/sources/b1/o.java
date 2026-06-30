package b1;

/* loaded from: classes14.dex */
public final class o extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i3 implements s1.i0, b1.h {

    /* renamed from: d, reason: collision with root package name */
    public final h1.c f98536d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f98537e;

    /* renamed from: f, reason: collision with root package name */
    public final z0.d f98538f;

    /* renamed from: g, reason: collision with root package name */
    public final s1.p f98539g;

    /* renamed from: h, reason: collision with root package name */
    public final float f98540h;

    /* renamed from: i, reason: collision with root package name */
    public final e1.z f98541i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(h1.c painter, boolean z17, z0.d alignment, s1.p contentScale, float f17, e1.z zVar, yz5.l inspectorInfo) {
        super(inspectorInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(painter, "painter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alignment, "alignment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentScale, "contentScale");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inspectorInfo, "inspectorInfo");
        this.f98536d = painter;
        this.f98537e = z17;
        this.f98538f = alignment;
        this.f98539g = contentScale;
        this.f98540h = f17;
        this.f98541i = zVar;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // s1.i0
    public int O(s1.u uVar, s1.t measurable, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        if (!a()) {
            return measurable.k(i17);
        }
        long d17 = d(p2.d.b(0, 0, 0, i17, 7, null));
        return java.lang.Math.max(p2.c.j(d17), measurable.k(i17));
    }

    @Override // b1.h
    public void P(g1.f fVar) {
        long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        long h17 = this.f98536d.h();
        long a17 = d1.l.a(c(h17) ? d1.k.d(h17) : d1.k.d(((u1.o0) fVar).a()), b(h17) ? d1.k.b(h17) : d1.k.b(((u1.o0) fVar).a()));
        u1.o0 o0Var = (u1.o0) fVar;
        if (!(d1.k.d(o0Var.a()) == 0.0f)) {
            if (!(d1.k.b(o0Var.a()) == 0.0f)) {
                j17 = s1.y1.b(a17, this.f98539g.a(a17, o0Var.a()));
                long j18 = j17;
                long a18 = ((z0.g) this.f98538f).a(p2.r.a(a06.d.b(d1.k.d(j18)), a06.d.b(d1.k.b(j18))), p2.r.a(a06.d.b(d1.k.d(o0Var.a())), a06.d.b(d1.k.b(o0Var.a()))), o0Var.mo130620x6fcfed3f());
                float f17 = (int) (a18 >> 32);
                float b17 = p2.m.b(a18);
                ((g1.d) ((g1.b) fVar.p()).f349037a).e(f17, b17);
                this.f98536d.g(fVar, j18, this.f98540h, this.f98541i);
                ((g1.d) ((g1.b) fVar.p()).f349037a).e(-f17, -b17);
                o0Var.b();
            }
        }
        int i17 = d1.k.f307176d;
        j17 = d1.k.f307174b;
        long j182 = j17;
        long a182 = ((z0.g) this.f98538f).a(p2.r.a(a06.d.b(d1.k.d(j182)), a06.d.b(d1.k.b(j182))), p2.r.a(a06.d.b(d1.k.d(o0Var.a())), a06.d.b(d1.k.b(o0Var.a()))), o0Var.mo130620x6fcfed3f());
        float f172 = (int) (a182 >> 32);
        float b172 = p2.m.b(a182);
        ((g1.d) ((g1.b) fVar.p()).f349037a).e(f172, b172);
        this.f98536d.g(fVar, j182, this.f98540h, this.f98541i);
        ((g1.d) ((g1.b) fVar.p()).f349037a).e(-f172, -b172);
        o0Var.b();
    }

    @Override // s1.i0
    public int Q(s1.u uVar, s1.t measurable, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        if (!a()) {
            return measurable.i(i17);
        }
        long d17 = d(p2.d.b(0, i17, 0, 0, 13, null));
        return java.lang.Math.max(p2.c.i(d17), measurable.i(i17));
    }

    @Override // s1.i0
    public int S(s1.u uVar, s1.t measurable, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        if (!a()) {
            return measurable.j(i17);
        }
        long d17 = d(p2.d.b(0, i17, 0, 0, 13, null));
        return java.lang.Math.max(p2.c.i(d17), measurable.j(i17));
    }

    public final boolean a() {
        if (!this.f98537e) {
            return false;
        }
        long h17 = this.f98536d.h();
        int i17 = d1.k.f307176d;
        return (h17 > d1.k.f307175c ? 1 : (h17 == d1.k.f307175c ? 0 : -1)) != 0;
    }

    public final boolean b(long j17) {
        int i17 = d1.k.f307176d;
        if (d1.k.a(j17, d1.k.f307175c)) {
            return false;
        }
        float b17 = d1.k.b(j17);
        return !java.lang.Float.isInfinite(b17) && !java.lang.Float.isNaN(b17);
    }

    public final boolean c(long j17) {
        int i17 = d1.k.f307176d;
        if (d1.k.a(j17, d1.k.f307175c)) {
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
        h1.c cVar = this.f98536d;
        long h17 = cVar.h();
        long a17 = d1.l.a(p2.d.e(j17, c(h17) ? a06.d.b(d1.k.d(h17)) : p2.c.j(j17)), p2.d.d(j17, b(h17) ? a06.d.b(d1.k.b(h17)) : p2.c.i(j17)));
        if (a()) {
            long a18 = d1.l.a(!c(cVar.h()) ? d1.k.d(a17) : d1.k.d(cVar.h()), !b(cVar.h()) ? d1.k.b(a17) : d1.k.b(cVar.h()));
            if (!(d1.k.d(a17) == 0.0f)) {
                if (!(d1.k.b(a17) == 0.0f)) {
                    a17 = s1.y1.b(a18, this.f98539g.a(a18, a17));
                }
            }
            a17 = d1.k.f307174b;
        }
        return p2.c.a(j17, p2.d.e(j17, a06.d.b(d1.k.d(a17))), 0, p2.d.d(j17, a06.d.b(d1.k.b(a17))), 0, 10, null);
    }

    /* renamed from: equals */
    public boolean m9564xb2c87fbf(java.lang.Object obj) {
        b1.o oVar = obj instanceof b1.o ? (b1.o) obj : null;
        if (oVar != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98536d, oVar.f98536d) && this.f98537e == oVar.f98537e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98538f, oVar.f98538f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98539g, oVar.f98539g)) {
            return ((this.f98540h > oVar.f98540h ? 1 : (this.f98540h == oVar.f98540h ? 0 : -1)) == 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98541i, oVar.f98541i);
        }
        return false;
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measure, "$this$measure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        s1.o1 m17 = measurable.m(d(j17));
        return s1.v0.b(measure, m17.f483583d, m17.f483584e, null, new b1.n(m17), 4, null);
    }

    /* renamed from: hashCode */
    public int m9565x8cdac1b() {
        int hashCode = ((((((((this.f98536d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f98537e)) * 31) + this.f98538f.hashCode()) * 31) + this.f98539g.hashCode()) * 31) + java.lang.Float.hashCode(this.f98540h)) * 31;
        e1.z zVar = this.f98541i;
        return hashCode + (zVar != null ? zVar.hashCode() : 0);
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

    /* renamed from: toString */
    public java.lang.String m9566x9616526c() {
        return "PainterModifier(painter=" + this.f98536d + ", sizeToIntrinsics=" + this.f98537e + ", alignment=" + this.f98538f + ", alpha=" + this.f98540h + ", colorFilter=" + this.f98541i + ')';
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(obj, this);
    }

    @Override // s1.i0
    public int x(s1.u uVar, s1.t measurable, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        if (!a()) {
            return measurable.l(i17);
        }
        long d17 = d(p2.d.b(0, 0, 0, i17, 7, null));
        return java.lang.Math.max(p2.c.j(d17), measurable.l(i17));
    }
}
