package so2;

/* loaded from: classes2.dex */
public final class q1 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final bw5.q5 f492078d;

    public q1(bw5.q5 productCard) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productCard, "productCard");
        this.f492078d = productCard;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return ((obj instanceof so2.q1 ? (so2.q1) obj : null) == null || ((so2.q1) obj).f492078d.f113474d != this.f492078d.f113474d) ? -1 : 0;
    }

    /* renamed from: equals */
    public boolean m164932xb2c87fbf(java.lang.Object obj) {
        so2.q1 q1Var = obj instanceof so2.q1 ? (so2.q1) obj : null;
        return q1Var != null && this.f492078d.f113474d == q1Var.f492078d.f113474d;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f492078d.f113474d;
    }

    @Override // in5.c
    public int h() {
        return so2.q1.class.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m164933x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderFeedProductListItem:");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[product_id=");
        bw5.q5 q5Var = this.f492078d;
        sb7.append(q5Var.f113474d);
        sb7.append(", product_name=");
        sb7.append(q5Var.m12792x7531c8a2());
        sb7.append(", selling_price=");
        sb7.append(q5Var.f113479i);
        sb6.append(sb7.toString());
        java.lang.String sb8 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "toString(...)");
        return sb8;
    }
}
