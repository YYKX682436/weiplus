package t8;

/* loaded from: classes15.dex */
public final class d implements t8.b {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f497870a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f497871b;

    /* renamed from: c, reason: collision with root package name */
    public final long f497872c;

    public d(long[] jArr, long[] jArr2, long j17) {
        this.f497870a = jArr;
        this.f497871b = jArr2;
        this.f497872c = j17;
    }

    @Override // q8.m
    public boolean c() {
        return true;
    }

    @Override // q8.m
    public long d(long j17) {
        return this.f497871b[t9.d0.c(this.f497870a, j17, true, true)];
    }

    @Override // t8.b
    public long f(long j17) {
        return this.f497870a[t9.d0.c(this.f497871b, j17, true, true)];
    }

    @Override // q8.m
    public long g() {
        return this.f497872c;
    }
}
