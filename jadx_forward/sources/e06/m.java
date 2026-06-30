package e06;

/* loaded from: classes10.dex */
public final class m extends kz5.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final long f327753d;

    /* renamed from: e, reason: collision with root package name */
    public final long f327754e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f327755f;

    /* renamed from: g, reason: collision with root package name */
    public long f327756g;

    public m(long j17, long j18, long j19) {
        this.f327753d = j19;
        this.f327754e = j18;
        boolean z17 = true;
        if (j19 <= 0 ? j17 < j18 : j17 > j18) {
            z17 = false;
        }
        this.f327755f = z17;
        this.f327756g = z17 ? j17 : j18;
    }

    @Override // kz5.y0
    public long b() {
        long j17 = this.f327756g;
        if (j17 != this.f327754e) {
            this.f327756g = this.f327753d + j17;
        } else {
            if (!this.f327755f) {
                throw new java.util.NoSuchElementException();
            }
            this.f327755f = false;
        }
        return j17;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f327755f;
    }
}
