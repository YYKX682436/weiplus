package r36;

/* loaded from: classes16.dex */
public class f0 extends x36.g {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r36.g0 f450923l;

    public f0(r36.g0 g0Var) {
        this.f450923l = g0Var;
    }

    @Override // x36.g
    public java.io.IOException k(java.io.IOException iOException) {
        java.net.SocketTimeoutException socketTimeoutException = new java.net.SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // x36.g
    public void l() {
        r36.g0 g0Var = this.f450923l;
        r36.b bVar = r36.b.CANCEL;
        if (g0Var.d(bVar)) {
            g0Var.f450931d.p(g0Var.f450930c, bVar);
        }
        r36.z zVar = this.f450923l.f450931d;
        synchronized (zVar) {
            long j17 = zVar.f451017t;
            long j18 = zVar.f451016s;
            if (j17 < j18) {
                return;
            }
            zVar.f451016s = j18 + 1;
            zVar.f451018u = java.lang.System.nanoTime() + 1000000000;
            try {
                ((java.util.concurrent.ScheduledThreadPoolExecutor) zVar.f451011n).execute(new r36.l(zVar, "OkHttp %s ping", zVar.f451007g));
            } catch (java.util.concurrent.RejectedExecutionException unused) {
            }
        }
    }

    public void m() {
        if (j()) {
            throw k(null);
        }
    }
}
