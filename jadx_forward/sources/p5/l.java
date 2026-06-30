package p5;

/* loaded from: classes16.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5.n f433513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.Callable f433514e;

    public l(p5.g gVar, p5.n nVar, java.util.concurrent.Callable callable) {
        this.f433513d = nVar;
        this.f433514e = callable;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        p5.n nVar = this.f433513d;
        try {
            if (nVar.f433523a.c(this.f433514e.call())) {
            } else {
                throw new java.lang.IllegalStateException("Cannot set the result of a completed task.");
            }
        } catch (java.util.concurrent.CancellationException unused) {
            p5.m mVar = nVar.f433523a;
            synchronized (mVar.f433518a) {
                if (mVar.f433519b) {
                    z17 = false;
                } else {
                    mVar.f433519b = true;
                    mVar.f433518a.notifyAll();
                    mVar.b();
                    z17 = true;
                }
                if (!z17) {
                    throw new java.lang.IllegalStateException("Cannot cancel a completed task.");
                }
            }
        } catch (java.lang.Exception e17) {
            nVar.a(e17);
        }
    }
}
