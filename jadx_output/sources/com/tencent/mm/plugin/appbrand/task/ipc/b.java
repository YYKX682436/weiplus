package com.tencent.mm.plugin.appbrand.task.ipc;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f89063a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f89064b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel f89065c;

    public b(java.lang.String appId, java.lang.String str, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f89063a = appId;
        this.f89064b = str;
        this.f89065c = launchParcel;
    }

    public final void a() {
        com.tencent.mm.plugin.appbrand.task.u0 a17 = com.tencent.mm.plugin.appbrand.task.u0.f89199h.a();
        java.lang.String str = this.f89063a;
        com.tencent.luggage.sdk.processes.s sVar = (com.tencent.luggage.sdk.processes.s) kz5.z.O(a17.j(str, -1));
        com.tencent.luggage.sdk.processes.h f17 = sVar != null ? a17.f(sVar) : null;
        if (f17 != null) {
            com.tencent.mm.ipcinvoker.d0.d(((com.tencent.mm.plugin.appbrand.task.k) f17).i(), new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.appbrand.task.ipc.c0.class, new com.tencent.mm.plugin.appbrand.task.ipc.a(this));
            return;
        }
        com.tencent.mm.plugin.appbrand.task.e eVar = (com.tencent.mm.plugin.appbrand.task.e) i95.n0.c(com.tencent.mm.plugin.appbrand.task.e.class);
        kotlin.jvm.internal.o.d(eVar);
        eVar.wi(this.f89064b, this.f89065c);
    }
}
