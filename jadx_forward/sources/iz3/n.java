package iz3;

/* loaded from: classes12.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iz3.s f377621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f377622e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ry3.q f377623f;

    public n(iz3.s sVar, long j17, ry3.q qVar) {
        this.f377621d = sVar;
        this.f377622e = j17;
        this.f377623f = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        iz3.s sVar = this.f377621d;
        java.util.HashMap hashMap = sVar.f377631d;
        long j17 = this.f377622e;
        iz3.j jVar = (iz3.j) hashMap.remove(java.lang.Long.valueOf(j17));
        ry3.q qVar = this.f377623f;
        if (jVar != null) {
            ry3.p pVar = jVar.f377617a;
            if (pVar == null || (str = pVar.f483064e) == null) {
                str = "";
            }
            qVar.f483081f = str;
        }
        ry3.r rVar = (ry3.r) sVar.f377632e.remove(java.lang.Long.valueOf(j17));
        if (rVar != null) {
            rVar.a(j17, qVar);
        }
    }
}
