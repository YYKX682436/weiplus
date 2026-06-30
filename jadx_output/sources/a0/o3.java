package a0;

/* loaded from: classes14.dex */
public final class o3 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final a0.m3 f258d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f259e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f260f;

    /* renamed from: g, reason: collision with root package name */
    public final b0.c2 f261g;

    public o3(a0.m3 scrollerState, boolean z17, boolean z18, b0.c2 overScrollController) {
        kotlin.jvm.internal.o.g(scrollerState, "scrollerState");
        kotlin.jvm.internal.o.g(overScrollController, "overScrollController");
        this.f258d = scrollerState;
        this.f259e = z17;
        this.f260f = z18;
        this.f261g = overScrollController;
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
        return measurable.k(i17);
    }

    @Override // s1.i0
    public int Q(s1.u uVar, s1.t measurable, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        return measurable.i(i17);
    }

    @Override // s1.i0
    public int S(s1.u uVar, s1.t measurable, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        return measurable.j(i17);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0.o3)) {
            return false;
        }
        a0.o3 o3Var = (a0.o3) obj;
        return kotlin.jvm.internal.o.b(this.f258d, o3Var.f258d) && this.f259e == o3Var.f259e && this.f260f == o3Var.f260f && kotlin.jvm.internal.o.b(this.f261g, o3Var.f261g);
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        kotlin.jvm.internal.o.g(measure, "$this$measure");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        boolean z17 = this.f260f;
        a0.i3.a(j17, z17);
        s1.o1 m17 = measurable.m(p2.c.a(j17, 0, z17 ? p2.c.h(j17) : Integer.MAX_VALUE, 0, z17 ? Integer.MAX_VALUE : p2.c.g(j17), 5, null));
        int i17 = m17.f402050d;
        int h17 = p2.c.h(j17);
        int i18 = i17 > h17 ? h17 : i17;
        int i19 = m17.f402051e;
        int g17 = p2.c.g(j17);
        int i27 = i19 > g17 ? g17 : i19;
        int i28 = m17.f402051e - i27;
        int i29 = m17.f402050d - i18;
        if (!z17) {
            i28 = i29;
        }
        this.f261g.g(d1.l.a(i18, i27), i28 != 0);
        return s1.v0.b(measure, i18, i27, null, new a0.n3(this, i28, m17), 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f258d.hashCode() * 31;
        boolean z17 = this.f259e;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        int i18 = (hashCode + i17) * 31;
        boolean z18 = this.f260f;
        return ((i18 + (z18 ? 1 : z18 ? 1 : 0)) * 31) + this.f261g.hashCode();
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
        return "ScrollingLayoutModifier(scrollerState=" + this.f258d + ", isReversed=" + this.f259e + ", isVertical=" + this.f260f + ", overScrollController=" + this.f261g + ')';
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
        return measurable.l(i17);
    }
}
