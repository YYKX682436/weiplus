package com.tencent.mm.plugin.appbrand.task;

@j95.b
/* loaded from: classes7.dex */
public final class e extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f89011d = new java.util.concurrent.ConcurrentHashMap();

    public static void Bi(com.tencent.mm.plugin.appbrand.task.e eVar, java.lang.String str, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            launchParcel = null;
        }
        eVar.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLaunchParcelStoreService", "[" + eVar.hashCode() + "]remove(instanceId:" + str + ')');
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = eVar.f89011d;
        if (launchParcel != null) {
            concurrentHashMap.remove(str, launchParcel);
        } else {
            concurrentHashMap.remove(str);
        }
    }

    public final com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel Ai(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = (com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel) this.f89011d.get(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(hashCode());
        sb6.append("]get(instanceId:");
        sb6.append(str);
        sb6.append("), return?");
        sb6.append(launchParcel != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLaunchParcelStoreService", sb6.toString());
        return launchParcel;
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLaunchParcelStoreService", "[" + hashCode() + "]onAccountReleased");
        this.f89011d.clear();
    }

    public final void wi(java.lang.String str, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel) {
        if ((str == null || str.length() == 0) || launchParcel == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLaunchParcelStoreService", "[" + hashCode() + "]add(instanceId:" + str + ')');
        this.f89011d.put(str, launchParcel);
    }
}
