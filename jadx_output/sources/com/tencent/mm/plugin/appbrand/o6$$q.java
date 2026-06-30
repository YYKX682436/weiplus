package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final /* synthetic */ class o6$$q implements java.util.function.Consumer {
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
        android.app.Activity activity = (android.app.Activity) ((java.lang.ref.WeakReference) obj).get();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        activity.finish();
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeWC", "Manual finish activity " + activity);
    }
}
