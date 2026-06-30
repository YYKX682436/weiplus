package h72;

/* loaded from: classes14.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h72.s f360980d;

    public k(h72.s sVar) {
        this.f360980d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f360980d.f361001b) {
            h72.s sVar = this.f360980d;
            h72.q qVar = sVar.f361003d;
            if (qVar == h72.q.UNINITIALIZED) {
                sVar.i("MicroMsg.FaceVideoRecorder", "hy: not started. should not happen", new java.lang.Object[0]);
                h72.s.c(this.f360980d);
                return;
            }
            h72.q qVar2 = h72.q.STARTED;
            if (qVar == qVar2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceVideoRecorder", "hy: already started or wait start");
                return;
            }
            sVar.j("MicroMsg.FaceVideoRecorder", "hy: startRecord record", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.v b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.v.b();
            b17.getClass();
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.v.f181571c) {
                java.util.List list = b17.f181572a;
                if (list != null) {
                    list.clear();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.v.b().a(this.f360980d.f361015p);
            h72.s sVar2 = this.f360980d;
            sVar2.f361000a.y(sVar2.f361004e, sVar2.f361005f, sVar2.f361006g);
            this.f360980d.f361003d = qVar2;
        }
    }
}
