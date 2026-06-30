package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.feature.performance.adpf.d f67409d = new com.tencent.mm.feature.performance.adpf.d();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AdpfFeatureService", "onRestored: cpuLoadHighCritical");
        com.tencent.mm.feature.performance.adpf.IAdpfState.Companion.d(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_CPU_LOAD_HIGH_CRITICAL).turnOffSync();
    }
}
