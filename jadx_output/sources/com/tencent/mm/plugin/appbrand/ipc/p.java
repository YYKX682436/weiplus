package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes14.dex */
public class p implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask f78427d;

    public p(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask appBrandProxyTransparentUIProcessTask) {
        this.f78427d = appBrandProxyTransparentUIProcessTask;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask appBrandProxyTransparentUIProcessTask = this.f78427d;
        if (i17 != (appBrandProxyTransparentUIProcessTask.hashCode() & 65535) || intent == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask appBrandProxyTransparentUIProcessTask2 = (com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask) intent.getParcelableExtra("task_object");
        java.lang.String stringExtra = intent.getStringExtra("task_id");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask.f78362g;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask appBrandProxyTransparentUIProcessTask3 = (concurrentHashMap.containsKey(stringExtra) && ((java.lang.ref.WeakReference) concurrentHashMap.get(stringExtra)).get() != null) ? (com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask) ((java.lang.ref.WeakReference) concurrentHashMap.get(stringExtra)).get() : null;
        if (appBrandProxyTransparentUIProcessTask3 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProxyTransparentUIProcessTask", "task is null");
            return;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        appBrandProxyTransparentUIProcessTask2.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        appBrandProxyTransparentUIProcessTask3.b(obtain);
        obtain.recycle();
        ((java.util.HashSet) com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask.f78363h).remove(appBrandProxyTransparentUIProcessTask3);
        appBrandProxyTransparentUIProcessTask3.c();
        appBrandProxyTransparentUIProcessTask.f78364d = null;
    }
}
