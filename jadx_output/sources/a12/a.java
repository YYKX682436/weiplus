package a12;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f507a;

    /* renamed from: b, reason: collision with root package name */
    public final double f508b;

    public a(double d17, double d18) {
        this.f507a = d17;
        this.f508b = d18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a12.a)) {
            return false;
        }
        a12.a aVar = (a12.a) obj;
        return java.lang.Double.compare(this.f507a, aVar.f507a) == 0 && java.lang.Double.compare(this.f508b, aVar.f508b) == 0;
    }

    public int hashCode() {
        return (java.lang.Double.hashCode(this.f507a) * 31) + java.lang.Double.hashCode(this.f508b);
    }

    public java.lang.String toString() {
        return "EcsKFDynamicCardViewInfo(offsetHeight=" + this.f507a + ", offsetTop=" + this.f508b + ')';
    }
}
