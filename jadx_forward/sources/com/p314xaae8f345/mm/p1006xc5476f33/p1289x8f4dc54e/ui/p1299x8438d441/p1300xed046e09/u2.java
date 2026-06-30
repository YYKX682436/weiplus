package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f175993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f175994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175995f;

    public u2(long j17, int i17, java.lang.String str) {
        this.f175993d = j17;
        this.f175994e = i17;
        this.f175995f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b3.f175728d;
        long j17 = this.f175993d;
        java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(java.lang.Long.valueOf(j17));
        if (hashMap2 != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            int i17 = this.f175994e;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
            java.lang.String str = this.f175995f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherCallbackManager", "addPrefetchResult session: %d, prefetchResult: %d, url: %s", valueOf, valueOf2, str);
            zq1.k0 k0Var = (zq1.k0) hashMap2.get(str);
            if (k0Var == null) {
                return;
            }
            k0Var.f556543b = i17;
        }
    }
}
