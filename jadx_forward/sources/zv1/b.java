package zv1;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f557798a;

    /* renamed from: b, reason: collision with root package name */
    public final long f557799b;

    /* renamed from: c, reason: collision with root package name */
    public final long f557800c;

    /* renamed from: d, reason: collision with root package name */
    public final long f557801d;

    public b(int i17, long j17, long j18, long j19) {
        this.f557798a = i17;
        this.f557799b = j17;
        this.f557800c = j18;
        this.f557801d = j19;
    }

    /* renamed from: equals */
    public boolean m179727xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv1.b)) {
            return false;
        }
        zv1.b bVar = (zv1.b) obj;
        return this.f557798a == bVar.f557798a && this.f557799b == bVar.f557799b && this.f557800c == bVar.f557800c && this.f557801d == bVar.f557801d;
    }

    /* renamed from: hashCode */
    public int m179728x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f557798a) * 31) + java.lang.Long.hashCode(this.f557799b)) * 31) + java.lang.Long.hashCode(this.f557800c)) * 31) + java.lang.Long.hashCode(this.f557801d);
    }

    /* renamed from: toString */
    public java.lang.String m179729x9616526c() {
        return "AllocationResult(allocType=" + this.f557798a + ", allocSize1=" + this.f557799b + ", allocSize2=" + this.f557800c + ", cacheSize=" + this.f557801d + ')';
    }
}
