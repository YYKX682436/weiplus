package cv0;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner f304072a;

    /* renamed from: b, reason: collision with root package name */
    public final cv0.m f304073b;

    public k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner corner, cv0.m option) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(corner, "corner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        this.f304072a = corner;
        this.f304073b = option;
    }

    /* renamed from: equals */
    public boolean m122785xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv0.k)) {
            return false;
        }
        cv0.k kVar = (cv0.k) obj;
        return this.f304072a == kVar.f304072a && this.f304073b == kVar.f304073b;
    }

    /* renamed from: hashCode */
    public int m122786x8cdac1b() {
        return (this.f304072a.hashCode() * 31) + this.f304073b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m122787x9616526c() {
        return "MJRectCornerOptionMapping(corner=" + this.f304072a + ", option=" + this.f304073b + ')';
    }
}
