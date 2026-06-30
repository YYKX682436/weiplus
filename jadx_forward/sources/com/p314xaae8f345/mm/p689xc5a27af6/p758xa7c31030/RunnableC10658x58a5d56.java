package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* renamed from: com.tencent.mm.feature.performance.c2$$e */
/* loaded from: classes12.dex */
public final /* synthetic */ class RunnableC10658x58a5d56 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        int o17 = wh.m.o();
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        try {
            i17 = wh.n1.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).g();
        } catch (java.lang.Throwable unused) {
            i17 = -1;
        }
        if (o17 == availableProcessors && (i17 == -1 || i17 == availableProcessors)) {
            return;
        }
        ap.a.a(1, "CpuCoreNum", null, null, java.lang.String.valueOf(o17), java.lang.String.valueOf(availableProcessors), java.lang.String.valueOf(i17));
    }
}
