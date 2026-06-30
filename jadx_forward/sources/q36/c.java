package q36;

/* loaded from: classes16.dex */
public final class c implements x36.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final x36.r f441518d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f441519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q36.h f441520f;

    public c(q36.h hVar) {
        this.f441520f = hVar;
        this.f441518d = new x36.r(hVar.f441534d.h());
    }

    @Override // x36.f0
    public void U(x36.k kVar, long j17) {
        if (this.f441519e) {
            throw new java.lang.IllegalStateException("closed");
        }
        if (j17 == 0) {
            return;
        }
        q36.h hVar = this.f441520f;
        hVar.f441534d.i0(j17);
        hVar.f441534d.F0(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
        hVar.f441534d.U(kVar, j17);
        hVar.f441534d.F0(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
    }

    @Override // x36.f0, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f441519e) {
            return;
        }
        this.f441519e = true;
        this.f441520f.f441534d.F0("0\r\n\r\n");
        q36.h hVar = this.f441520f;
        x36.r rVar = this.f441518d;
        hVar.getClass();
        x36.j0 j0Var = rVar.f533235e;
        rVar.f533235e = x36.j0.f533222d;
        j0Var.a();
        j0Var.b();
        this.f441520f.f441535e = 3;
    }

    @Override // x36.f0, java.io.Flushable
    public synchronized void flush() {
        if (this.f441519e) {
            return;
        }
        this.f441520f.f441534d.flush();
    }

    @Override // x36.f0
    public x36.j0 h() {
        return this.f441518d;
    }
}
