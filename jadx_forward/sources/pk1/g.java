package pk1;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f436978a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f436979b;

    public g(boolean z17, java.lang.String realSrc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(realSrc, "realSrc");
        this.f436978a = z17;
        this.f436979b = realSrc;
    }

    /* renamed from: equals */
    public boolean m158613xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk1.g)) {
            return false;
        }
        pk1.g gVar = (pk1.g) obj;
        return this.f436978a == gVar.f436978a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f436979b, gVar.f436979b);
    }

    /* renamed from: hashCode */
    public int m158614x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f436978a) * 31) + this.f436979b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m158615x9616526c() {
        return "DataSourceInfo(isHls=" + this.f436978a + ", realSrc=" + this.f436979b + ')';
    }
}
