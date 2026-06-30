package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f94484d;

    public y2(long j17) {
        this.f94484d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3.f94193b;
        long j17 = this.f94484d;
        if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherCallbackManager", "clearData session: %d", java.lang.Long.valueOf(j17));
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3.b(com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3.f94192a, this.f94484d, true, 0L, 4, null);
        }
    }
}
