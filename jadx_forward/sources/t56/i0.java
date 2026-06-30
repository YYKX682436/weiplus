package t56;

/* loaded from: classes16.dex */
public class i0 extends t56.k0 {

    /* renamed from: e, reason: collision with root package name */
    public final r56.a f497419e;

    /* renamed from: f, reason: collision with root package name */
    public final long f497420f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.TimeUnit f497421g;

    public i0(r56.a aVar, long j17, java.util.concurrent.TimeUnit timeUnit) {
        this.f497419e = aVar;
        this.f497420f = j17;
        this.f497421g = timeUnit;
    }

    @Override // t56.k0
    public p56.s a(p56.p pVar) {
        return pVar.e(this.f497419e, this.f497420f, this.f497421g);
    }
}
