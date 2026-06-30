package iz3;

/* loaded from: classes12.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iz3.s f377627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f377628e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f377629f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ry3.q f377630g;

    public r(iz3.s sVar, long j17, yz5.l lVar, ry3.q qVar) {
        this.f377627d = sVar;
        this.f377628e = j17;
        this.f377629f = lVar;
        this.f377630g = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        iz3.s sVar = this.f377627d;
        java.util.HashMap hashMap = sVar.f377631d;
        long j17 = this.f377628e;
        iz3.j jVar = (iz3.j) hashMap.remove(java.lang.Long.valueOf(j17));
        ry3.q qVar = this.f377630g;
        if (jVar != null) {
            ry3.p pVar = jVar.f377617a;
            if (pVar == null || (str = pVar.f483064e) == null) {
                str = "";
            }
            qVar.f483081f = str;
        } else {
            jVar = null;
        }
        this.f377629f.mo146xb9724478(jVar);
        ry3.r rVar = (ry3.r) sVar.f377632e.remove(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageSceneUploader", "onScanSuccess session: %d, callback: %s", java.lang.Long.valueOf(j17), rVar);
        if (rVar != null) {
            rVar.a(j17, qVar);
        }
    }
}
