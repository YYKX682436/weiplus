package e06;

/* loaded from: classes10.dex */
public abstract class l implements java.lang.Iterable, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final long f327750d;

    /* renamed from: e, reason: collision with root package name */
    public final long f327751e;

    /* renamed from: f, reason: collision with root package name */
    public final long f327752f;

    public l(long j17, long j18, long j19) {
        if (j19 == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        if (j19 == Long.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f327750d = j17;
        this.f327751e = sz5.b.b(j17, j18, j19);
        this.f327752f = j19;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new e06.m(this.f327750d, this.f327751e, this.f327752f);
    }
}
