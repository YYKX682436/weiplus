package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final /* synthetic */ class c2$$e implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        int o17 = wh.m.o();
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        try {
            i17 = wh.n1.j(com.tencent.mm.sdk.platformtools.x2.f193071a).g();
        } catch (java.lang.Throwable unused) {
            i17 = -1;
        }
        if (o17 == availableProcessors && (i17 == -1 || i17 == availableProcessors)) {
            return;
        }
        ap.a.a(1, "CpuCoreNum", null, null, java.lang.String.valueOf(o17), java.lang.String.valueOf(availableProcessors), java.lang.String.valueOf(i17));
    }
}
