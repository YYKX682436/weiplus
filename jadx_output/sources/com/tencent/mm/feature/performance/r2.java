package com.tencent.mm.feature.performance;

/* loaded from: classes7.dex */
public final class r2 extends com.tencent.mm.app.w6 {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.ref.WeakReference f67652d;

    @Override // com.tencent.mm.app.w6, com.tencent.mm.app.v6
    public void onActivityResumed(android.app.Activity activity) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginPerformance", "onActivityStarted, activity:%s", activity);
        f67652d = new java.lang.ref.WeakReference(activity);
    }
}
