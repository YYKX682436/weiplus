package e06;

/* loaded from: classes10.dex */
public final class n extends e06.l implements e06.h {

    /* renamed from: g, reason: collision with root package name */
    public static final e06.n f327757g = new e06.n(1, 0);

    public n(long j17, long j18) {
        super(j17, j18, 1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e06.h
    public boolean e(java.lang.Comparable comparable) {
        long longValue = ((java.lang.Number) comparable).longValue();
        return this.f327750d <= longValue && longValue <= this.f327751e;
    }

    /* renamed from: equals */
    public boolean m126628xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof e06.n) {
            if (!mo126615x7aab3243() || !((e06.n) obj).mo126615x7aab3243()) {
                e06.n nVar = (e06.n) obj;
                if (this.f327750d == nVar.f327750d) {
                    if (this.f327751e == nVar.f327751e) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // e06.h
    public java.lang.Comparable g() {
        return java.lang.Long.valueOf(this.f327751e);
    }

    @Override // e06.h
    public java.lang.Comparable h() {
        return java.lang.Long.valueOf(this.f327750d);
    }

    /* renamed from: hashCode */
    public int m126629x8cdac1b() {
        if (mo126615x7aab3243()) {
            return -1;
        }
        long j17 = this.f327750d;
        long j18 = 31 * (j17 ^ (j17 >>> 32));
        long j19 = this.f327751e;
        return (int) (j18 + (j19 ^ (j19 >>> 32)));
    }

    @Override // e06.h
    /* renamed from: isEmpty */
    public boolean mo126615x7aab3243() {
        return this.f327750d > this.f327751e;
    }

    /* renamed from: toString */
    public java.lang.String m126630x9616526c() {
        return this.f327750d + ".." + this.f327751e;
    }
}
