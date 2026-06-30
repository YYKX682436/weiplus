package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class z2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f94489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f94490e;

    public z2(long j17, java.util.List list) {
        this.f94489d = j17;
        this.f94490e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3.f94194c;
        long j17 = this.f94489d;
        if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            java.util.HashMap hashMap2 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3.f94195d;
            if (!hashMap2.containsKey(java.lang.Long.valueOf(j17))) {
                hashMap2.put(java.lang.Long.valueOf(j17), new java.util.HashMap());
            }
            for (zq1.k0 k0Var : this.f94490e) {
                zq1.i0 i0Var = k0Var.f475009a;
                if (i0Var != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherCallbackManager", "setPreAuthResult session: %d, %d, url: %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(k0Var.f475010b), i0Var.f474983a);
                    java.util.HashMap hashMap3 = (java.util.HashMap) com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3.f94195d.get(java.lang.Long.valueOf(j17));
                    if (hashMap3 != null) {
                    }
                }
            }
        }
    }
}
