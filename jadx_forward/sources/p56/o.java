package p56;

/* loaded from: classes16.dex */
public class o implements r56.a {

    /* renamed from: d, reason: collision with root package name */
    public long f433628d;

    /* renamed from: e, reason: collision with root package name */
    public long f433629e;

    /* renamed from: f, reason: collision with root package name */
    public long f433630f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r56.a f433631g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a66.e f433632h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f433633i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p56.p f433634m;

    public o(p56.p pVar, long j17, long j18, r56.a aVar, a66.e eVar, long j19) {
        this.f433634m = pVar;
        this.f433631g = aVar;
        this.f433632h = eVar;
        this.f433633i = j19;
        this.f433629e = j17;
        this.f433630f = j18;
    }

    @Override // r56.a
    /* renamed from: call */
    public void mo740x2e7a5e() {
        long j17;
        this.f433631g.mo740x2e7a5e();
        a66.e eVar = this.f433632h;
        if (eVar.b()) {
            return;
        }
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        p56.p pVar = this.f433634m;
        long nanos = timeUnit.toNanos(pVar.a());
        long j18 = p56.q.f433635d;
        long j19 = nanos + j18;
        long j27 = this.f433629e;
        long j28 = this.f433633i;
        if (j19 < j27 || nanos >= j27 + j28 + j18) {
            j17 = nanos + j28;
            long j29 = this.f433628d + 1;
            this.f433628d = j29;
            this.f433630f = j17 - (j28 * j29);
        } else {
            long j37 = this.f433630f;
            long j38 = this.f433628d + 1;
            this.f433628d = j38;
            j17 = j37 + (j38 * j28);
        }
        this.f433629e = nanos;
        eVar.a(pVar.e(this, j17 - nanos, java.util.concurrent.TimeUnit.NANOSECONDS));
    }
}
