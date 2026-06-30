package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f94460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f94461e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94462f;

    public u2(long j17, int i17, java.lang.String str) {
        this.f94460d = j17;
        this.f94461e = i17;
        this.f94462f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3.f94195d;
        long j17 = this.f94460d;
        java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(java.lang.Long.valueOf(j17));
        if (hashMap2 != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            int i17 = this.f94461e;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
            java.lang.String str = this.f94462f;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherCallbackManager", "addPrefetchResult session: %d, prefetchResult: %d, url: %s", valueOf, valueOf2, str);
            zq1.k0 k0Var = (zq1.k0) hashMap2.get(str);
            if (k0Var == null) {
                return;
            }
            k0Var.f475010b = i17;
        }
    }
}
