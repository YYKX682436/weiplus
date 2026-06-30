package yq1;

/* loaded from: classes7.dex */
public final class o implements zq1.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f545980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yq1.z f545981b;

    public o(long j17, yq1.z zVar) {
        this.f545980a = j17;
        this.f545981b = zVar;
    }

    @Override // zq1.h0
    public final void a(java.util.List list) {
        zq1.m0 m0Var = (zq1.m0) gm0.j1.s(zq1.m0.class);
        long j17 = this.f545980a;
        ((yq1.x0) m0Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b3 b3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b3.f175725a;
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.a3(j17), "MicroMsg.WebPrefetcherCallbackManager");
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                zq1.k0 k0Var = (zq1.k0) it.next();
                this.f545981b.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPrefetchResult result: ");
                sb6.append(k0Var.f556543b);
                sb6.append(", ");
                zq1.i0 i0Var = k0Var.f556542a;
                sb6.append(i0Var != null ? i0Var.f556516a : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceImpl", sb6.toString());
            }
        }
    }
}
