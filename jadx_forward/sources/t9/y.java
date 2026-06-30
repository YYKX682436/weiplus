package t9;

/* loaded from: classes15.dex */
public final class y implements t9.j {

    /* renamed from: d, reason: collision with root package name */
    public boolean f498093d;

    /* renamed from: e, reason: collision with root package name */
    public long f498094e;

    /* renamed from: f, reason: collision with root package name */
    public long f498095f;

    /* renamed from: g, reason: collision with root package name */
    public m8.y f498096g = m8.y.f406211d;

    @Override // t9.j
    public m8.y a(m8.y yVar) {
        if (this.f498093d) {
            b(e());
        }
        this.f498096g = yVar;
        return yVar;
    }

    public void b(long j17) {
        this.f498094e = j17;
        if (this.f498093d) {
            this.f498095f = android.os.SystemClock.elapsedRealtime();
        }
    }

    @Override // t9.j
    public m8.y d() {
        return this.f498096g;
    }

    @Override // t9.j
    public long e() {
        long j17 = this.f498094e;
        if (!this.f498093d) {
            return j17;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f498095f;
        return j17 + (this.f498096g.f406212a == 1.0f ? m8.b.a(elapsedRealtime) : elapsedRealtime * r4.f406214c);
    }
}
