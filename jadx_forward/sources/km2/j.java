package km2;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f390644a;

    public j(long j17) {
        this.f390644a = j17;
    }

    /* renamed from: equals */
    public boolean m143664xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof km2.j) && this.f390644a == ((km2.j) obj).f390644a;
    }

    /* renamed from: hashCode */
    public int m143665x8cdac1b() {
        return java.lang.Long.hashCode(this.f390644a);
    }

    /* renamed from: toString */
    public java.lang.String m143666x9616526c() {
        return "FinderLiveBalanceData(wecoinBalance=" + this.f390644a + ')';
    }
}
