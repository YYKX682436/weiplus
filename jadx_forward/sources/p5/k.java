package p5;

/* loaded from: classes16.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5.n f433510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p5.h f433511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p5.m f433512f;

    public k(p5.g gVar, p5.n nVar, p5.h hVar, p5.m mVar) {
        this.f433510d = nVar;
        this.f433511e = hVar;
        this.f433512f = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        p5.n nVar = this.f433510d;
        try {
            if (nVar.f433523a.c(this.f433511e.a(this.f433512f))) {
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
