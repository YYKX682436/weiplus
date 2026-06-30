package h72;

/* loaded from: classes14.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h72.r f360983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360985f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h72.s f360986g;

    public n(h72.s sVar, h72.r rVar, java.lang.String str, java.lang.String str2) {
        this.f360986g = sVar;
        this.f360983d = rVar;
        this.f360984e = str;
        this.f360985f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f360986g.f361001b) {
            h72.s sVar = this.f360986g;
            sVar.f361008i = this.f360983d;
            h72.q qVar = sVar.f361003d;
            if (qVar == h72.q.UNINITIALIZED) {
                sVar.i("MicroMsg.FaceVideoRecorder", "hy: not initialized. should not happen", new java.lang.Object[0]);
                h72.s.c(this.f360986g);
                h72.r rVar = this.f360986g.f361008i;
                if (rVar != null) {
                    rVar.a(null);
                    this.f360986g.f361008i = null;
                }
                return;
            }
            if (qVar != h72.q.CANCELLED && qVar != h72.q.INITIALIZED) {
                if (qVar == h72.q.STOPPED) {
                    sVar.j("MicroMsg.FaceVideoRecorder", "hy: already stopped", new java.lang.Object[0]);
                    h72.r rVar2 = this.f360986g.f361008i;
                    if (rVar2 != null) {
                        rVar2.a(this.f360984e);
                        this.f360986g.f361008i = null;
                    }
                    return;
                }
                h72.q qVar2 = h72.q.STOPPING;
                if (qVar == qVar2) {
                    sVar.j("MicroMsg.FaceVideoRecorder", "hy: stopping. wait", new java.lang.Object[0]);
                    return;
                }
                sVar.j("MicroMsg.FaceVideoRecorder", "hy: stop record and release" + java.lang.Thread.currentThread().getName(), new java.lang.Object[0]);
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.v.b().d(this.f360986g.f361015p);
                h72.s sVar2 = this.f360986g;
                sVar2.f361003d = qVar2;
                sVar2.f361000a.g(new h72.m(this));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceVideoRecorder", "hy: cancelled or not started capturing.");
            h72.s.c(this.f360986g);
            h72.r rVar3 = this.f360986g.f361008i;
            if (rVar3 != null) {
                rVar3.a(null);
                this.f360986g.f361008i = null;
            }
        }
    }
}
