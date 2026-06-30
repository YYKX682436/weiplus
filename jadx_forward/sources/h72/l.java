package h72;

/* loaded from: classes14.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h72.s f360981d;

    public l(h72.s sVar) {
        this.f360981d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f360981d.f361001b) {
            h72.s sVar = this.f360981d;
            if (sVar.f361003d == h72.q.UNINITIALIZED) {
                sVar.i("MicroMsg.FaceVideoRecorder", "hy: not started when cancel. should not happen", new java.lang.Object[0]);
                h72.s.c(this.f360981d);
                return;
            }
            sVar.j("MicroMsg.FaceVideoRecorder", "hy: cancel record", new java.lang.Object[0]);
            this.f360981d.f361000a.mo127742xae7a2e7a();
            h72.s.c(this.f360981d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.v.b().d(this.f360981d.f361015p);
            h72.s sVar2 = this.f360981d;
            sVar2.f361003d = h72.q.CANCELLED;
            sVar2.f361013n.d();
        }
    }
}
