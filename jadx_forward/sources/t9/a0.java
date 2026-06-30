package t9;

/* loaded from: classes15.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public long f498022a;

    /* renamed from: b, reason: collision with root package name */
    public long f498023b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f498024c = -9223372036854775807L;

    public a0(long j17) {
        synchronized (this) {
            t9.a.d(this.f498024c == -9223372036854775807L);
            this.f498022a = j17;
        }
    }

    public long a(long j17) {
        if (j17 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f498024c != -9223372036854775807L) {
            this.f498024c = j17;
        } else {
            long j18 = this.f498022a;
            if (j18 != com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                this.f498023b = j18 - j17;
            }
            synchronized (this) {
                this.f498024c = j17;
                notifyAll();
            }
        }
        return j17 + this.f498023b;
    }

    public long b(long j17) {
        if (j17 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f498024c != -9223372036854775807L) {
            long j18 = (this.f498024c * 90000) / 1000000;
            long j19 = (4294967296L + j18) / 8589934592L;
            long j27 = ((j19 - 1) * 8589934592L) + j17;
            j17 += j19 * 8589934592L;
            if (java.lang.Math.abs(j27 - j18) < java.lang.Math.abs(j17 - j18)) {
                j17 = j27;
            }
        }
        return a((j17 * 1000000) / 90000);
    }

    public long c() {
        if (this.f498022a == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
            return 0L;
        }
        if (this.f498024c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f498023b;
    }
}
