package q01;

/* loaded from: classes12.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f440888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f440889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f440890f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f440891g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f440892h;

    public z(boolean z17, long j17, java.lang.Throwable th6, int i17, int i18) {
        this.f440888d = z17;
        this.f440889e = j17;
        this.f440890f = th6;
        this.f440891g = i17;
        this.f440892h = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneQueueTracker", "NetSceneInspect jam report task - run: jam=" + this.f440888d + ", durationMs=" + java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(this.f440889e) + "min");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("durationMs", java.lang.Long.valueOf(this.f440889e));
        ((hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class))).wi(linkedHashMap);
        java.lang.Throwable th6 = this.f440890f;
        java.lang.String[] strArr = new java.lang.String[4];
        boolean z17 = false;
        strArr[0] = "jam";
        strArr[1] = this.f440888d ? "1" : "0";
        strArr[2] = java.lang.String.valueOf(this.f440891g);
        strArr[3] = java.lang.String.valueOf(this.f440892h);
        ap.a.a(10001, "errNetScene", th6, linkedHashMap, strArr);
        jz5.l lVar = q01.e0.f440805c;
        if (lVar != null && ((java.lang.Boolean) lVar.f384366d).booleanValue()) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneQueueTracker", "NetSceneInspect jam restore checking task - post");
            ((ku5.t0) ku5.t0.f394148d).l(q01.y.f440886d, 600000L, "MicroMsg.NetSceneQueueTracker.JammingRestore");
        }
    }
}
