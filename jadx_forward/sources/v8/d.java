package v8;

/* loaded from: classes15.dex */
public class d implements v8.i, q8.m {

    /* renamed from: a, reason: collision with root package name */
    public long[] f515519a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f515520b;

    /* renamed from: c, reason: collision with root package name */
    public long f515521c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f515522d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v8.e f515523e;

    public d(v8.e eVar) {
        this.f515523e = eVar;
    }

    @Override // v8.i
    public q8.m a() {
        return this;
    }

    @Override // v8.i
    public long b(long j17) {
        long j18 = (this.f515523e.f515555i * j17) / 1000000;
        this.f515522d = this.f515519a[t9.d0.c(this.f515519a, j18, true, true)];
        return j18;
    }

    @Override // q8.m
    public boolean c() {
        return true;
    }

    @Override // q8.m
    public long d(long j17) {
        return this.f515521c + this.f515520b[t9.d0.c(this.f515519a, (this.f515523e.f515555i * j17) / 1000000, true, true)];
    }

    @Override // v8.i
    public long e(q8.f fVar) {
        long j17 = this.f515522d;
        if (j17 < 0) {
            return -1L;
        }
        long j18 = -(j17 + 2);
        this.f515522d = -1L;
        return j18;
    }

    @Override // q8.m
    public long g() {
        return (this.f515523e.f515524n.f498049d * 1000000) / r0.f498046a;
    }
}
