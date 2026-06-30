package q36;

/* loaded from: classes16.dex */
public abstract class b implements x36.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final x36.r f441514d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f441515e;

    /* renamed from: f, reason: collision with root package name */
    public long f441516f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q36.h f441517g;

    public b(q36.h hVar, q36.a aVar) {
        this.f441517g = hVar;
        this.f441514d = new x36.r(hVar.f441533c.h());
    }

    @Override // x36.h0
    public long B(x36.k kVar, long j17) {
        try {
            long B = this.f441517g.f441533c.B(kVar, j17);
            if (B > 0) {
                this.f441516f += B;
            }
            return B;
        } catch (java.io.IOException e17) {
            a(false, e17);
            throw e17;
        }
    }

    public final void a(boolean z17, java.io.IOException iOException) {
        q36.h hVar = this.f441517g;
        int i17 = hVar.f441535e;
        if (i17 == 6) {
            return;
        }
        if (i17 != 5) {
            throw new java.lang.IllegalStateException("state: " + hVar.f441535e);
        }
        x36.r rVar = this.f441514d;
        x36.j0 j0Var = rVar.f533235e;
        rVar.f533235e = x36.j0.f533222d;
        j0Var.a();
        j0Var.b();
        hVar.f441535e = 6;
        o36.j jVar = hVar.f441532b;
        if (jVar != null) {
            jVar.i(!z17, hVar, this.f441516f, iOException);
        }
    }

    @Override // x36.h0
    public x36.j0 h() {
        return this.f441514d;
    }
}
