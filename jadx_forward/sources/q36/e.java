package q36;

/* loaded from: classes16.dex */
public final class e implements x36.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final x36.r f441525d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f441526e;

    /* renamed from: f, reason: collision with root package name */
    public long f441527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q36.h f441528g;

    public e(q36.h hVar, long j17) {
        this.f441528g = hVar;
        this.f441525d = new x36.r(hVar.f441534d.h());
        this.f441527f = j17;
    }

    @Override // x36.f0
    public void U(x36.k kVar, long j17) {
        if (this.f441526e) {
            throw new java.lang.IllegalStateException("closed");
        }
        long j18 = kVar.f533227e;
        byte[] bArr = m36.e.f404919a;
        if ((0 | j17) < 0 || 0 > j18 || j18 - 0 < j17) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        if (j17 <= this.f441527f) {
            this.f441528g.f441534d.U(kVar, j17);
            this.f441527f -= j17;
        } else {
            throw new java.net.ProtocolException("expected " + this.f441527f + " bytes but received " + j17);
        }
    }

    @Override // x36.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f441526e) {
            return;
        }
        this.f441526e = true;
        if (this.f441527f > 0) {
            throw new java.net.ProtocolException("unexpected end of stream");
        }
        q36.h hVar = this.f441528g;
        hVar.getClass();
        x36.r rVar = this.f441525d;
        x36.j0 j0Var = rVar.f533235e;
        rVar.f533235e = x36.j0.f533222d;
        j0Var.a();
        j0Var.b();
        hVar.f441535e = 3;
    }

    @Override // x36.f0, java.io.Flushable
    public void flush() {
        if (this.f441526e) {
            return;
        }
        this.f441528g.f441534d.flush();
    }

    @Override // x36.f0
    public x36.j0 h() {
        return this.f441525d;
    }
}
