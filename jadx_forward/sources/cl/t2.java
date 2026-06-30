package cl;

/* loaded from: classes7.dex */
public class t2 extends cl.v2 {

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f124302n;

    /* renamed from: o, reason: collision with root package name */
    public long f124303o;

    /* renamed from: p, reason: collision with root package name */
    public long f124304p;

    public t2(cl.w2 w2Var, cl.q0 q0Var, int i17, com.p159x477cd522.p160x333422.C1474xd5ce209a c1474xd5ce209a, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7, boolean z17, long j17) {
        super(w2Var, q0Var, i17, c1474xd5ce209a, c1469x28b0ccd7, z17, j17);
        this.f124302n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(w2Var.f124348d, (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new cl.s2(this, w2Var, q0Var), false);
    }

    @Override // cl.u2
    public void a() {
        this.f124302n.d();
        b();
    }

    @Override // cl.v2
    public void e() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f124302n;
        long j17 = this.f124336h;
        b4Var.c(j17, j17);
    }

    @Override // cl.v2, java.lang.Runnable
    public void run() {
        if (d()) {
            c(this.f124338m);
            if (d()) {
                if (!this.f124337i) {
                    b();
                    return;
                }
                long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                long j17 = this.f124303o;
                if (0 == j17) {
                    this.f124303o = elapsedRealtimeNanos - this.f124304p;
                } else {
                    this.f124303o = ((j17 + elapsedRealtimeNanos) - this.f124304p) / 2;
                }
                long millis = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(this.f124303o);
                long j18 = this.f124336h;
                long j19 = j18 - millis;
                if (j19 > 0) {
                    j18 = j19;
                }
                this.f124302n.c(j18, j18);
            }
        }
    }
}
