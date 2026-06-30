package cl;

/* loaded from: classes7.dex */
public class t2 extends cl.v2 {

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f42769n;

    /* renamed from: o, reason: collision with root package name */
    public long f42770o;

    /* renamed from: p, reason: collision with root package name */
    public long f42771p;

    public t2(cl.w2 w2Var, cl.q0 q0Var, int i17, com.eclipsesource.mmv8.V8Function v8Function, com.eclipsesource.mmv8.V8Array v8Array, boolean z17, long j17) {
        super(w2Var, q0Var, i17, v8Function, v8Array, z17, j17);
        this.f42769n = new com.tencent.mm.sdk.platformtools.b4(w2Var.f42815d, (com.tencent.mm.sdk.platformtools.a4) new cl.s2(this, w2Var, q0Var), false);
    }

    @Override // cl.u2
    public void a() {
        this.f42769n.d();
        b();
    }

    @Override // cl.v2
    public void e() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f42769n;
        long j17 = this.f42803h;
        b4Var.c(j17, j17);
    }

    @Override // cl.v2, java.lang.Runnable
    public void run() {
        if (d()) {
            c(this.f42805m);
            if (d()) {
                if (!this.f42804i) {
                    b();
                    return;
                }
                long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                long j17 = this.f42770o;
                if (0 == j17) {
                    this.f42770o = elapsedRealtimeNanos - this.f42771p;
                } else {
                    this.f42770o = ((j17 + elapsedRealtimeNanos) - this.f42771p) / 2;
                }
                long millis = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(this.f42770o);
                long j18 = this.f42803h;
                long j19 = j18 - millis;
                if (j19 > 0) {
                    j18 = j19;
                }
                this.f42769n.c(j18, j18);
            }
        }
    }
}
