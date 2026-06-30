package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class z2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f176022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f176023e;

    public z2(long j17, java.util.List list) {
        this.f176022d = j17;
        this.f176023e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b3.f175727c;
        long j17 = this.f176022d;
        if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            java.util.HashMap hashMap2 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b3.f175728d;
            if (!hashMap2.containsKey(java.lang.Long.valueOf(j17))) {
                hashMap2.put(java.lang.Long.valueOf(j17), new java.util.HashMap());
            }
            for (zq1.k0 k0Var : this.f176023e) {
                zq1.i0 i0Var = k0Var.f556542a;
                if (i0Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherCallbackManager", "setPreAuthResult session: %d, %d, url: %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(k0Var.f556543b), i0Var.f556516a);
                    java.util.HashMap hashMap3 = (java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b3.f175728d.get(java.lang.Long.valueOf(j17));
                    if (hashMap3 != null) {
                    }
                }
            }
        }
    }
}
