package fn4;

/* loaded from: classes15.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f346027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f346028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b f346029f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo f346030g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346031h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fn4.i1 f346032i;

    public e1(fn4.i1 i1Var, long j17, long j18, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b bVar, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo, java.lang.String str) {
        this.f346032i = i1Var;
        this.f346027d = j17;
        this.f346028e = j18;
        this.f346029f = bVar;
        this.f346030g = videoInfo;
        this.f346031h = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        fn4.b bVar;
        fn4.i1 i1Var = this.f346032i;
        fn4.l1 l1Var = i1Var.f346090f;
        if (l1Var.f346106b == null || (bVar = l1Var.f346114j) == null) {
            return;
        }
        rm4.d dVar = bVar.o4().f346012f;
        if (dVar != null && dVar.f478998n == 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - dVar.f478985a;
            dVar.f478998n = currentTimeMillis;
            long j17 = this.f346027d;
            dVar.f478999o = j17;
            long j18 = this.f346028e;
            dVar.f479000p = j17 + j18;
            dVar.f479006v = this.f346029f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "onMoovReady %d %d %d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo = this.f346030g;
        i1Var.f346090f.f346106b.e0(this.f346031h, this.f346027d, this.f346028e, videoInfo != null ? videoInfo.f18114x9330627b : "");
    }
}
