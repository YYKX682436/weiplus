package iz3;

/* loaded from: classes12.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iz3.j f377606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry3.r f377607e;

    public e(iz3.j jVar, ry3.r rVar) {
        this.f377606d = jVar;
        this.f377607e = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ry3.p pVar;
        iz3.f fVar = iz3.f.f377608a;
        ry3.r rVar = this.f377607e;
        iz3.j jVar = this.f377606d;
        if (jVar == null || (pVar = jVar.f377617a) == null) {
            return;
        }
        long j17 = pVar.f483060a;
        int i17 = pVar.f483066g;
        hz3.a0 lVar = (i17 == 3 || i17 == 4) ? new hz3.l() : (i17 == 5 || i17 == 6 || i17 == 7 || i17 == 9) ? new hz3.y() : new hz3.p();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiImageCDNUploader", "uploadImage-cdn requestType: %s, strategy: %s", java.lang.Integer.valueOf(i17), lVar.mo134285x337a8b());
        lVar.a(pVar, new iz3.d(j17, pVar, rVar, jVar));
    }
}
