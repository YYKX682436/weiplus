package q8;

/* loaded from: classes15.dex */
public final class a implements q8.m {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f442145a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f442146b;

    /* renamed from: c, reason: collision with root package name */
    public final long f442147c;

    public a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f442145a = jArr;
        this.f442146b = jArr3;
        int length = iArr.length;
        if (length <= 0) {
            this.f442147c = 0L;
        } else {
            int i17 = length - 1;
            this.f442147c = jArr2[i17] + jArr3[i17];
        }
    }

    @Override // q8.m
    public boolean c() {
        return true;
    }

    @Override // q8.m
    public long d(long j17) {
        return this.f442145a[t9.d0.c(this.f442146b, j17, true, true)];
    }

    @Override // q8.m
    public long g() {
        return this.f442147c;
    }
}
