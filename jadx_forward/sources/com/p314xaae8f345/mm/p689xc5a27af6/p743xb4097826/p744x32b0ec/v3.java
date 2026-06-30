package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes3.dex */
public final class v3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 f148510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f148511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f148512f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f148513g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148514h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.s74 f148515i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.m71 f148516m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ im5.b f148517n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s40.t0 f148518o;

    public v3(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var, long j17, boolean z17, int i17, java.lang.String str, r45.s74 s74Var, r45.m71 m71Var, im5.b bVar, s40.t0 t0Var) {
        this.f148510d = v4Var;
        this.f148511e = j17;
        this.f148512f = z17;
        this.f148513g = i17;
        this.f148514h = str;
        this.f148515i = s74Var;
        this.f148516m = m71Var;
        this.f148517n = bVar;
        this.f148518o = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var = this.f148510d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = v4Var.f148519g;
        long j17 = this.f148511e;
        jz5.o oVar = (jz5.o) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLiveInfo cache: liveID=");
        sb6.append(j17);
        sb6.append(", forceRefresh=");
        boolean z17 = this.f148512f;
        sb6.append(z17);
        sb6.append(", status=");
        sb6.append(v4Var.ak(oVar));
        sb6.append(", scene=");
        sb6.append(this.f148513g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        if (z17) {
            v4Var.f148519g.remove(java.lang.Long.valueOf(j17));
        }
        s40.t0 t0Var = this.f148518o;
        if (!z17 && oVar != null) {
            v4Var.getClass();
            int i17 = zy2.v.f559124b;
            if (i17 <= 0) {
                i17 = ae2.in.f85295h3;
            }
            if (v4Var.jk(oVar, i17 * 1000)) {
                pm0.v.X(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t3(t0Var, j17, oVar));
                return;
            }
        }
        if (gm0.j1.d().f152297d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "getLiveInfo dispatcher is null!");
            pm0.v.X(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.u3(t0Var, j17));
            return;
        }
        long j18 = this.f148511e;
        int i18 = this.f148513g;
        java.lang.String str = this.f148514h;
        r45.s74 s74Var = this.f148515i;
        r45.m71 m71Var = this.f148516m;
        s40.t0 t0Var2 = this.f148518o;
        pq5.g l17 = new ek2.b0(j18, i18, str, s74Var, m71Var, null, null).l();
        l17.K(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.h2(v4Var, j18, i18, t0Var2));
        im5.b bVar = this.f148517n;
        if (bVar != null) {
            l17.f(bVar);
        }
    }
}
