package j0;

/* loaded from: classes14.dex */
public final class x1 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final j0.u4 f378166d;

    /* renamed from: e, reason: collision with root package name */
    public final int f378167e;

    /* renamed from: f, reason: collision with root package name */
    public final g2.r0 f378168f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f378169g;

    public x1(j0.u4 scrollerPosition, int i17, g2.r0 transformedText, yz5.a textLayoutResultProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scrollerPosition, "scrollerPosition");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transformedText, "transformedText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textLayoutResultProvider, "textLayoutResultProvider");
        this.f378166d = scrollerPosition;
        this.f378167e = i17;
        this.f378168f = transformedText;
        this.f378169g = textLayoutResultProvider;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // s1.i0
    public int O(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.d(this, uVar, tVar, i17);
    }

    @Override // s1.i0
    public int Q(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.a(this, uVar, tVar, i17);
    }

    @Override // s1.i0
    public int S(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.c(this, uVar, tVar, i17);
    }

    /* renamed from: equals */
    public boolean m140061xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0.x1)) {
            return false;
        }
        j0.x1 x1Var = (j0.x1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f378166d, x1Var.f378166d) && this.f378167e == x1Var.f378167e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f378168f, x1Var.f378168f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f378169g, x1Var.f378169g);
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measure, "$this$measure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        s1.o1 m17 = measurable.m(measurable.l(p2.c.g(j17)) < p2.c.h(j17) ? j17 : p2.c.a(j17, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        int min = java.lang.Math.min(m17.f483583d, p2.c.h(j17));
        return s1.v0.b(measure, min, m17.f483584e, null, new j0.w1(measure, this, m17, min), 4, null);
    }

    /* renamed from: hashCode */
    public int m140062x8cdac1b() {
        return (((((this.f378166d.hashCode() * 31) + java.lang.Integer.hashCode(this.f378167e)) * 31) + this.f378168f.m130708x8cdac1b()) * 31) + this.f378169g.hashCode();
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
    public java.lang.String m140063x9616526c() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f378166d + ", cursorOffset=" + this.f378167e + ", transformedText=" + this.f378168f + ", textLayoutResultProvider=" + this.f378169g + ')';
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(obj, this);
    }

    @Override // s1.i0
    public int x(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.b(this, uVar, tVar, i17);
    }
}
