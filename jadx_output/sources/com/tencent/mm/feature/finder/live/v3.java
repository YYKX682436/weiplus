package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class v3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.v4 f66977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f66978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f66979f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f66980g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66981h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.s74 f66982i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.m71 f66983m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ im5.b f66984n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s40.t0 f66985o;

    public v3(com.tencent.mm.feature.finder.live.v4 v4Var, long j17, boolean z17, int i17, java.lang.String str, r45.s74 s74Var, r45.m71 m71Var, im5.b bVar, s40.t0 t0Var) {
        this.f66977d = v4Var;
        this.f66978e = j17;
        this.f66979f = z17;
        this.f66980g = i17;
        this.f66981h = str;
        this.f66982i = s74Var;
        this.f66983m = m71Var;
        this.f66984n = bVar;
        this.f66985o = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.feature.finder.live.v4 v4Var = this.f66977d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = v4Var.f66986g;
        long j17 = this.f66978e;
        jz5.o oVar = (jz5.o) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLiveInfo cache: liveID=");
        sb6.append(j17);
        sb6.append(", forceRefresh=");
        boolean z17 = this.f66979f;
        sb6.append(z17);
        sb6.append(", status=");
        sb6.append(v4Var.ak(oVar));
        sb6.append(", scene=");
        sb6.append(this.f66980g);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        if (z17) {
            v4Var.f66986g.remove(java.lang.Long.valueOf(j17));
        }
        s40.t0 t0Var = this.f66985o;
        if (!z17 && oVar != null) {
            v4Var.getClass();
            int i17 = zy2.v.f477591b;
            if (i17 <= 0) {
                i17 = ae2.in.f3762h3;
            }
            if (v4Var.jk(oVar, i17 * 1000)) {
                pm0.v.X(new com.tencent.mm.feature.finder.live.t3(t0Var, j17, oVar));
                return;
            }
        }
        if (gm0.j1.d().f70764d == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "getLiveInfo dispatcher is null!");
            pm0.v.X(new com.tencent.mm.feature.finder.live.u3(t0Var, j17));
            return;
        }
        long j18 = this.f66978e;
        int i18 = this.f66980g;
        java.lang.String str = this.f66981h;
        r45.s74 s74Var = this.f66982i;
        r45.m71 m71Var = this.f66983m;
        s40.t0 t0Var2 = this.f66985o;
        pq5.g l17 = new ek2.b0(j18, i18, str, s74Var, m71Var, null, null).l();
        l17.K(new com.tencent.mm.feature.finder.live.h2(v4Var, j18, i18, t0Var2));
        im5.b bVar = this.f66984n;
        if (bVar != null) {
            l17.f(bVar);
        }
    }
}
