package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public final class ExportSession {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.internal.NativeCallbackManager f48378a;
    private final com.facebook.jni.HybridData mHybridData;

    public ExportSession() {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = new com.tencent.maas.internal.NativeCallbackManager(android.os.Looper.getMainLooper());
        this.f48378a = nativeCallbackManager;
        this.mHybridData = initHybrid(nativeCallbackManager);
    }

    private native com.facebook.jni.HybridData initHybrid(com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager);

    private native com.facebook.jni.HybridData initHybridWithParam(com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager, com.tencent.maas.moviecomposing.ExportInitParam exportInitParam);

    private native void nativeCancelExporting(int i17);

    private native void nativeStartExporting(java.lang.String str, com.tencent.maas.instamovie.MJExportSettings mJExportSettings, com.tencent.maas.moviecomposing.Timeline timeline, com.tencent.maas.model.time.MJTimeRange mJTimeRange, int i17, int i18, int i19);

    private native void nativeStartExportingWithDetails(java.lang.String str, com.tencent.maas.instamovie.MJExportSettings mJExportSettings, com.tencent.maas.moviecomposing.Timeline timeline, com.tencent.maas.model.time.MJTimeRange mJTimeRange, int i17, int i18, int i19);

    public void a(com.tencent.maas.moviecomposing.j jVar) {
        int i17;
        if (jVar != null) {
            i17 = this.f48378a.registerCallback(new com.tencent.maas.moviecomposing.o(this, jVar));
        } else {
            i17 = -1;
        }
        nativeCancelExporting(i17);
    }

    public void b() {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = this.f48378a;
        nativeCallbackManager.removeAllCallback();
        nativeCallbackManager.removeAllCallbackWithReturnValue();
        this.mHybridData.resetNative();
    }

    public void c(java.lang.String str, com.tencent.maas.instamovie.MJExportSettings mJExportSettings, com.tencent.maas.moviecomposing.Timeline timeline, com.tencent.maas.model.time.MJTimeRange mJTimeRange, com.tencent.maas.moviecomposing.n nVar, com.tencent.maas.moviecomposing.m mVar, com.tencent.maas.moviecomposing.k kVar) {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = this.f48378a;
        nativeStartExporting(str, mJExportSettings, timeline, mJTimeRange, nVar != null ? nativeCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.s(this, nVar)) : -1, mVar != null ? nativeCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.r(this, mVar, false)) : -1, kVar != null ? nativeCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.p(this, kVar)) : -1);
    }

    public void d(java.lang.String str, com.tencent.maas.instamovie.MJExportSettings mJExportSettings, com.tencent.maas.moviecomposing.Timeline timeline, com.tencent.maas.model.time.MJTimeRange mJTimeRange, com.tencent.maas.moviecomposing.n nVar, com.tencent.maas.moviecomposing.m mVar, com.tencent.maas.moviecomposing.l lVar) {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = this.f48378a;
        nativeStartExportingWithDetails(str, mJExportSettings, timeline, mJTimeRange, nVar != null ? nativeCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.s(this, nVar)) : -1, mVar != null ? nativeCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.r(this, mVar, false)) : -1, lVar != null ? nativeCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.q(this, lVar)) : -1);
    }

    public ExportSession(com.tencent.maas.moviecomposing.ExportInitParam exportInitParam) {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = new com.tencent.maas.internal.NativeCallbackManager(android.os.Looper.getMainLooper());
        this.f48378a = nativeCallbackManager;
        this.mHybridData = initHybridWithParam(nativeCallbackManager, exportInitParam);
    }
}
