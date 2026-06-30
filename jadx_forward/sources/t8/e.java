package t8;

/* loaded from: classes15.dex */
public final class e implements t8.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f497873a;

    /* renamed from: b, reason: collision with root package name */
    public final long f497874b;

    /* renamed from: c, reason: collision with root package name */
    public final long f497875c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f497876d;

    /* renamed from: e, reason: collision with root package name */
    public final long f497877e;

    /* renamed from: f, reason: collision with root package name */
    public final int f497878f;

    public e(long j17, long j18, long j19, long[] jArr, long j27, int i17) {
        this.f497873a = j17;
        this.f497874b = j18;
        this.f497875c = j19;
        this.f497876d = jArr;
        this.f497877e = j27;
        this.f497878f = i17;
    }

    @Override // q8.m
    public boolean c() {
        return this.f497876d != null;
    }

    @Override // q8.m
    public long d(long j17) {
        boolean c17 = c();
        long j18 = this.f497873a;
        if (!c17) {
            return j18;
        }
        float f17 = (((float) j17) * 100.0f) / ((float) this.f497874b);
        if (f17 > 0.0f) {
            if (f17 >= 100.0f) {
                r0 = 256.0f;
            } else {
                int i17 = (int) f17;
                long[] jArr = this.f497876d;
                r0 = i17 != 0 ? (float) jArr[i17 - 1] : 0.0f;
                r0 += ((i17 < 99 ? (float) jArr[i17] : 256.0f) - r0) * (f17 - i17);
            }
        }
        long j19 = this.f497877e;
        long round = java.lang.Math.round(r0 * 0.00390625d * j19) + j18;
        long j27 = this.f497875c;
        return java.lang.Math.min(round, j27 != -1 ? j27 - 1 : ((j18 - this.f497878f) + j19) - 1);
    }

    @Override // t8.b
    public long f(long j17) {
        if (!c()) {
            return 0L;
        }
        if (j17 < this.f497873a) {
            return 0L;
        }
        double d17 = ((j17 - r4) * 256.0d) / this.f497877e;
        long[] jArr = this.f497876d;
        int c17 = t9.d0.c(jArr, (long) d17, true, false) + 1;
        long j18 = (c17 * this.f497874b) / 100;
        long j19 = c17 == 0 ? 0L : jArr[c17 - 1];
        return j18 + ((c17 == 99 ? 256L : jArr[c17]) == j19 ? 0L : (long) (((((r11 * (c17 + 1)) / 100) - j18) * (d17 - j19)) / (r15 - j19)));
    }

    @Override // q8.m
    public long g() {
        return this.f497874b;
    }
}
