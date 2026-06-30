package com.tencent.mm.plugin.appbrand.task.ipc;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006HÖ\u0001¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandRuntimePreloadNextInvoke;", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "z", "Landroid/os/Parcel;", "parcel", "", "flags", "writeToParcel", "Lcom/tencent/luggage/sdk/processes/LuggageServiceType;", "serviceType", "<init>", "(Lcom/tencent/luggage/sdk/processes/LuggageServiceType;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandRuntimePreloadNextInvoke extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.task.ipc.AppBrandRuntimePreloadNextInvoke> CREATOR = new com.tencent.mm.plugin.appbrand.task.ipc.y();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.luggage.sdk.processes.LuggageServiceType f89053f;

    public AppBrandRuntimePreloadNextInvoke(com.tencent.luggage.sdk.processes.LuggageServiceType serviceType) {
        kotlin.jvm.internal.o.g(serviceType, "serviceType");
        this.f89053f = serviceType;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeParcelable(this.f89053f, i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runInMainProcess, serviceType:");
        sb6.append(this.f89053f);
        sb6.append(", isAppForeground:");
        com.tencent.mm.app.w wVar = com.tencent.mm.app.w.INSTANCE;
        sb6.append(wVar.f53889n);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimePreloadNextInvoke", sb6.toString());
        if (wVar.f53889n) {
            com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().P(this.f89053f, com.tencent.mm.plugin.appbrand.service.x6.f88823n);
        }
    }
}
