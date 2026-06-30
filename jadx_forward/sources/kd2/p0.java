package kd2;

/* loaded from: classes10.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f388316a;

    /* renamed from: b, reason: collision with root package name */
    public long f388317b;

    /* renamed from: c, reason: collision with root package name */
    public long f388318c;

    public p0(long j17, long j18, long j19) {
        this.f388316a = j17;
        this.f388317b = j18;
        this.f388318c = j19;
    }

    public final long a() {
        long b17;
        long j17;
        if (this.f388317b > 0) {
            b17 = b();
            j17 = (this.f388318c + android.os.SystemClock.elapsedRealtime()) - this.f388317b;
        } else {
            b17 = b();
            j17 = this.f388318c;
        }
        return b17 - j17;
    }

    public final long b() {
        return android.os.SystemClock.elapsedRealtime() - this.f388316a;
    }
}
