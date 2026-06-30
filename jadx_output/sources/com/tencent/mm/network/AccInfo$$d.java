package com.tencent.mm.network;

/* loaded from: classes8.dex */
public final /* synthetic */ class AccInfo$$d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.AccInfo f71916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f71917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f71918f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f71919g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f71920h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f71921i;

    public /* synthetic */ AccInfo$$d(com.tencent.mm.network.AccInfo accInfo, int i17, int i18, int i19, long j17, long j18) {
        this.f71916d = accInfo;
        this.f71917e = i17;
        this.f71918f = i18;
        this.f71919g = i19;
        this.f71920h = j17;
        this.f71921i = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f71917e;
        int i18 = this.f71919g;
        long j17 = this.f71920h;
        long j18 = this.f71921i;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.tencent.mm.network.AccInfo accInfo = this.f71916d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) accInfo.f71912y;
        java.lang.Boolean bool = (java.lang.Boolean) concurrentHashMap.get(valueOf);
        if (bool == null || java.lang.Boolean.FALSE.equals(bool)) {
            return;
        }
        int i19 = i18 - 1;
        int i27 = this.f71918f;
        if (i27 >= i19) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AccInfo", "reset axAuthRequesting %s", java.lang.Integer.valueOf(i17));
            jx3.f.INSTANCE.d(28982, "%s", java.lang.Integer.valueOf(i17));
            concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
        } else {
            int i28 = i27 + 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "index:%s, max:%s, will reset axAuthRequesting", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i18));
            ((ku5.t0) ku5.t0.f312615d).l(new com.tencent.mm.network.AccInfo$$d(accInfo, i17, i28, i18, j17, j18), j17, "MicroMsg.AccInfo");
        }
    }
}
