package com.tencent.mm.plugin.appbrand.task.ipc;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandNotifyPauseTask;", "Lcom/tencent/luggage/sdk/processes/main/LuggageMainProcessTaskExt;", "Ljz5/f0;", "z", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "g", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "B", "()Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "runtimeInfo", "<init>", "(Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandNotifyPauseTask extends com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.task.ipc.AppBrandNotifyPauseTask> CREATOR = new com.tencent.mm.plugin.appbrand.task.ipc.p();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandNotifyPauseTask(com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo) {
        super(runtimeInfo);
        kotlin.jvm.internal.o.g(runtimeInfo, "runtimeInfo");
        this.runtimeInfo = runtimeInfo;
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt
    /* renamed from: B, reason: from getter */
    public com.tencent.luggage.sdk.processes.main.RuntimeInfo getRuntimeInfo() {
        return this.runtimeInfo;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt, com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeParcelable(this.runtimeInfo, i17);
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt, com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        super.z();
        com.tencent.mm.plugin.appbrand.report.model.q qVar = com.tencent.mm.plugin.appbrand.report.model.q.INSTANCE;
        com.tencent.mm.plugin.appbrand.report.model.p pVar = (com.tencent.mm.plugin.appbrand.report.model.p) ((java.util.HashMap) qVar.f88069d).get(getRuntimeInfo().f47660e);
        if (pVar != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            pVar.f88063a = java.lang.System.currentTimeMillis();
        }
    }
}
