package a0;

/* loaded from: classes14.dex */
public final class o3 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final a0.m3 f81791d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f81792e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f81793f;

    /* renamed from: g, reason: collision with root package name */
    public final b0.c2 f81794g;

    public o3(a0.m3 scrollerState, boolean z17, boolean z18, b0.c2 overScrollController) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scrollerState, "scrollerState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(overScrollController, "overScrollController");
        this.f81791d = scrollerState;
        this.f81792e = z17;
        this.f81793f = z18;
        this.f81794g = overScrollController;
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
        return measurable.k(i17);
    }

    @Override // s1.i0
    public int Q(s1.u uVar, s1.t measurable, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        return measurable.i(i17);
    }

    @Override // s1.i0
    public int S(s1.u uVar, s1.t measurable, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        return measurable.j(i17);
    }

    /* renamed from: equals */
    public boolean m181xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0.o3)) {
            return false;
        }
        a0.o3 o3Var = (a0.o3) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f81791d, o3Var.f81791d) && this.f81792e == o3Var.f81792e && this.f81793f == o3Var.f81793f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f81794g, o3Var.f81794g);
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measure, "$this$measure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        boolean z17 = this.f81793f;
        a0.i3.a(j17, z17);
        s1.o1 m17 = measurable.m(p2.c.a(j17, 0, z17 ? p2.c.h(j17) : Integer.MAX_VALUE, 0, z17 ? Integer.MAX_VALUE : p2.c.g(j17), 5, null));
        int i17 = m17.f483583d;
        int h17 = p2.c.h(j17);
        int i18 = i17 > h17 ? h17 : i17;
        int i19 = m17.f483584e;
        int g17 = p2.c.g(j17);
        int i27 = i19 > g17 ? g17 : i19;
        int i28 = m17.f483584e - i27;
        int i29 = m17.f483583d - i18;
        if (!z17) {
            i28 = i29;
        }
        this.f81794g.g(d1.l.a(i18, i27), i28 != 0);
        return s1.v0.b(measure, i18, i27, null, new a0.n3(this, i28, m17), 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hashCode */
    public int m182x8cdac1b() {
        int hashCode = this.f81791d.hashCode() * 31;
        boolean z17 = this.f81792e;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        int i18 = (hashCode + i17) * 31;
        boolean z18 = this.f81793f;
        return ((i18 + (z18 ? 1 : z18 ? 1 : 0)) * 31) + this.f81794g.hashCode();
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
    public java.lang.String m183x9616526c() {
        return "ScrollingLayoutModifier(scrollerState=" + this.f81791d + ", isReversed=" + this.f81792e + ", isVertical=" + this.f81793f + ", overScrollController=" + this.f81794g + ')';
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
        return measurable.l(i17);
    }
}
