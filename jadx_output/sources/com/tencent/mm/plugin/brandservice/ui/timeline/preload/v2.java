package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f94465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f94466e;

    public v2(long j17, boolean z17) {
        this.f94465d = j17;
        this.f94466e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zq1.h0 h0Var;
        java.util.HashMap hashMap = com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3.f94193b;
        long j17 = this.f94465d;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) hashMap.remove(java.lang.Long.valueOf(j17));
        if (weakReference != null && (h0Var = (zq1.h0) weakReference.get()) != null) {
            java.util.HashMap hashMap2 = (java.util.HashMap) com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3.f94195d.remove(java.lang.Long.valueOf(j17));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (hashMap2 != null) {
                java.util.Iterator it = hashMap2.entrySet().iterator();
                while (it.hasNext()) {
                    zq1.k0 k0Var = (zq1.k0) ((java.util.Map.Entry) it.next()).getValue();
                    java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                    boolean z17 = this.f94466e;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherCallbackManager", "notifyCallback session: %d, timeout: %s, url: %s, result: %d", valueOf, java.lang.Boolean.valueOf(z17), k0Var.f475009a.f474983a, java.lang.Integer.valueOf(k0Var.f475010b));
                    if (z17 || k0Var.f475010b == 1) {
                        k0Var.f475010b = 8;
                        arrayList.add(k0Var);
                    } else {
                        arrayList.add(k0Var);
                    }
                }
            }
            h0Var.a(arrayList);
        }
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3 b3Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3.f94192a;
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3.f94194c.remove(java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3.f94195d.remove(java.lang.Long.valueOf(j17));
    }
}
