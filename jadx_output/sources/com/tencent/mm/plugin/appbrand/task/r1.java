package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public abstract class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f89179a = new java.util.concurrent.ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.content.Context] */
    public static final void a(android.app.Activity activity, yz5.l task) {
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mm.plugin.appbrand.task.LaunchInBackgroundGuard$StartActivityRequest launchInBackgroundGuard$StartActivityRequest = new com.tencent.mm.plugin.appbrand.task.LaunchInBackgroundGuard$StartActivityRequest(task.hashCode());
        f89179a.put(java.lang.Integer.valueOf(task.hashCode()), task);
        android.app.Activity activity2 = activity;
        if (activity == null) {
            activity2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(activity2, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, launchInBackgroundGuard$StartActivityRequest, null, null);
    }
}
