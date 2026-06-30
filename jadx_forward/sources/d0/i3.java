package d0;

/* loaded from: classes14.dex */
public final class i3 extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i3 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final float f306683d;

    /* renamed from: e, reason: collision with root package name */
    public final float f306684e;

    public i3(float f17, float f18, yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(lVar);
        this.f306683d = f17;
        this.f306684e = f18;
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
        int k17 = measurable.k(i17);
        float f17 = this.f306683d;
        int G = !p2.h.a(f17, Float.NaN) ? uVar.G(f17) : 0;
        return k17 < G ? G : k17;
    }

    @Override // s1.i0
    public int Q(s1.u uVar, s1.t measurable, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        int i18 = measurable.i(i17);
        float f17 = this.f306684e;
        int G = !p2.h.a(f17, Float.NaN) ? uVar.G(f17) : 0;
        return i18 < G ? G : i18;
    }

    @Override // s1.i0
    public int S(s1.u uVar, s1.t measurable, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        int j17 = measurable.j(i17);
        float f17 = this.f306684e;
        int G = !p2.h.a(f17, Float.NaN) ? uVar.G(f17) : 0;
        return j17 < G ? G : j17;
    }

    /* renamed from: equals */
    public boolean m123221xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof d0.i3)) {
            return false;
        }
        d0.i3 i3Var = (d0.i3) obj;
        return p2.h.a(this.f306683d, i3Var.f306683d) && p2.h.a(this.f306684e, i3Var.f306684e);
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        int j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measure, "$this$measure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        float f17 = this.f306683d;
        int i17 = 0;
        if (p2.h.a(f17, Float.NaN) || p2.c.j(j17) != 0) {
            j18 = p2.c.j(j17);
        } else {
            j18 = measure.G(f17);
            int h17 = p2.c.h(j17);
            if (j18 > h17) {
                j18 = h17;
            }
            if (j18 < 0) {
                j18 = 0;
            }
        }
        int h18 = p2.c.h(j17);
        float f18 = this.f306684e;
        if (p2.h.a(f18, Float.NaN) || p2.c.i(j17) != 0) {
            i17 = p2.c.i(j17);
        } else {
            int G = measure.G(f18);
            int g17 = p2.c.g(j17);
            if (G > g17) {
                G = g17;
            }
            if (G >= 0) {
                i17 = G;
            }
        }
        s1.o1 m17 = measurable.m(p2.d.a(j18, h18, i17, p2.c.g(j17)));
        return s1.v0.b(measure, m17.f483583d, m17.f483584e, null, new d0.h3(m17), 4, null);
    }

    /* renamed from: hashCode */
    public int m123222x8cdac1b() {
        return (java.lang.Float.hashCode(this.f306683d) * 31) + java.lang.Float.hashCode(this.f306684e);
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

    @Override // s1.i0
    public int x(s1.u uVar, s1.t measurable, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        int l17 = measurable.l(i17);
        float f17 = this.f306683d;
        int G = !p2.h.a(f17, Float.NaN) ? uVar.G(f17) : 0;
        return l17 < G ? G : l17;
    }
}
