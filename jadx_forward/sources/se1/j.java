package se1;

/* loaded from: classes13.dex */
public class j implements se1.d {

    /* renamed from: a, reason: collision with root package name */
    public final se1.e f488318a = new se1.h0();

    /* renamed from: b, reason: collision with root package name */
    public final se1.g0 f488319b = new se1.g0(2000);

    /* renamed from: c, reason: collision with root package name */
    public long f488320c;

    /* renamed from: d, reason: collision with root package name */
    public long f488321d;

    /* renamed from: e, reason: collision with root package name */
    public int f488322e;

    public j(android.os.Handler handler, se1.c cVar) {
    }

    public synchronized void a(int i17) {
        this.f488320c += i17;
    }

    public synchronized void b() {
        ve1.a.a(this.f488322e > 0);
        ((se1.h0) this.f488318a).getClass();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i17 = (int) (elapsedRealtime - this.f488321d);
        if (i17 > 0) {
            long j17 = this.f488320c;
            this.f488319b.a((int) java.lang.Math.sqrt(j17), (float) ((8000 * j17) / i17));
            java.lang.Float.isNaN(this.f488319b.b(0.5f));
        }
        int i18 = this.f488322e - 1;
        this.f488322e = i18;
        if (i18 > 0) {
            this.f488321d = elapsedRealtime;
        }
        this.f488320c = 0L;
    }

    public synchronized void c() {
        if (this.f488322e == 0) {
            ((se1.h0) this.f488318a).getClass();
            this.f488321d = android.os.SystemClock.elapsedRealtime();
        }
        this.f488322e++;
    }
}
