package fn4;

/* loaded from: classes15.dex */
public class i1 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public boolean f346088d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f346089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn4.l1 f346090f;

    public i1(fn4.l1 l1Var, fn4.d1 d1Var) {
        this.f346090f = l1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d7, code lost:
    
        if (r6 > 100) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn4.i1.a():void");
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        fn4.l1 l1Var = this.f346090f;
        fn4.b bVar = l1Var.f346114j;
        if (bVar != null) {
            fn4.r0 Q4 = bVar.Q4();
            java.util.Map map = Q4.f346135c;
            if (map.containsKey(str)) {
                r45.yn6 yn6Var = (r45.yn6) map.get(str);
                yn6Var.f472776d = str;
                yn6Var.f472779g = j18;
                yn6Var.f472777e = j17;
                yn6Var.f472778f = Q4.a(j17, j18);
                map.put(str, yn6Var);
            }
            rm4.d dVar = l1Var.f346114j.o4().f346012f;
            if (dVar != null) {
                dVar.f479007w = j18;
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new fn4.g1(this, str, j17, j18));
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        boolean z17 = 1 >= com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
        fn4.l1 l1Var = this.f346090f;
        if (z17 && l1Var.f346112h) {
            l1Var.f346112h = false;
            i17 = 404;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "onFinish %s %d", str, java.lang.Integer.valueOf(i17));
        fn4.b bVar = l1Var.f346114j;
        if (bVar != null) {
            fn4.r0 Q4 = bVar.Q4();
            java.util.Map map = Q4.f346135c;
            if (map.containsKey(str)) {
                r45.yn6 yn6Var = (r45.yn6) map.get(str);
                if (i17 == 0) {
                    yn6Var.f472776d = str;
                    long j17 = yn6Var.f472779g;
                    yn6Var.f472777e = j17;
                    yn6Var.f472778f = Q4.a(j17, j17);
                    map.put(str, yn6Var);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryPreloadMgr", "onCurrentVideoDownloadFinish onFinish %s %d %s %d", str, java.lang.Long.valueOf(yn6Var.f472778f), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i0(yn6Var.f472777e, 100.0d), java.lang.Integer.valueOf(i17));
            }
        }
        try {
            pm4.y.c(l1Var.f346114j.s4().d(l1Var.f346114j.Y2()), 2, i17, fn4.z0.c(), hVar);
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new fn4.h1(this, str, i17));
    }

    @Override // dn.n
    /* renamed from: onDataAvailable */
    public void mo65706x9bb59ea0(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new fn4.f1(this, str, j17, j18));
    }

    @Override // dn.n
    /* renamed from: onM3U8Ready */
    public void mo65707xc5dd699b(java.lang.String str, java.lang.String str2) {
    }

    @Override // dn.n
    /* renamed from: onMoovReady */
    public void mo65708xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        if (this.f346088d) {
            return;
        }
        this.f346088d = true;
        fn4.l1 l1Var = this.f346090f;
        if (l1Var.f346114j != null) {
            com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o oVar = (com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class);
            java.lang.String str2 = l1Var.f346114j.z4() + str + ".mp4";
            ((be0.e) oVar).getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new fn4.e1(this, j17, j18, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str2, true), videoInfo, str));
        }
    }
}
