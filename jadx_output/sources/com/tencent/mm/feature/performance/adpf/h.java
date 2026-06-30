package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.feature.performance.adpf.h f67423d = new com.tencent.mm.feature.performance.adpf.h();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AdpfFeatureService", "onRestored: uiLagging");
        com.tencent.mm.feature.performance.adpf.IAdpfState.Companion.d(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_UI_LAGGING).turnOffSync();
    }
}
