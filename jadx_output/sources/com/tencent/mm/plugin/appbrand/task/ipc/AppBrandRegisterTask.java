package com.tencent.mm.plugin.appbrand.task.ipc;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0018J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0019\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandRegisterTask;", "Lcom/tencent/luggage/sdk/processes/main/LuggageRegisterTask;", "Lcom/tencent/luggage/sdk/processes/h;", "Lcom/tencent/luggage/sdk/processes/w;", "process", "Ljz5/f0;", "C", "Landroid/os/Parcel;", "parcel", "", "flags", "writeToParcel", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "h", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "B", "()Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "runtimeInfo", "Lcom/tencent/mm/plugin/appbrand/appstorage/ICommLibReader;", "commLibReader", "<init>", "(Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;Lcom/tencent/mm/plugin/appbrand/appstorage/ICommLibReader;)V", "Lze/n;", "rt", "(Lze/n;Lcom/tencent/mm/plugin/appbrand/appstorage/ICommLibReader;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public class AppBrandRegisterTask extends com.tencent.luggage.sdk.processes.main.LuggageRegisterTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.task.ipc.AppBrandRegisterTask> CREATOR = new com.tencent.mm.plugin.appbrand.task.ipc.t();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f89051i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandRegisterTask(com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo, com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader) {
        super(runtimeInfo);
        kotlin.jvm.internal.o.g(runtimeInfo, "runtimeInfo");
        this.runtimeInfo = runtimeInfo;
        this.f89051i = iCommLibReader;
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageRegisterTask, com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt
    /* renamed from: B, reason: from getter */
    public com.tencent.luggage.sdk.processes.main.RuntimeInfo getRuntimeInfo() {
        return this.runtimeInfo;
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageRegisterTask, com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt
    public void C(com.tencent.luggage.sdk.processes.h process) {
        kotlin.jvm.internal.o.g(process, "process");
        super.C(process);
        java.lang.String i17 = process.i();
        if (i17 != null) {
            if (i17.length() > 0) {
                com.tencent.mm.ipcinvoker.i0.a(i17);
            }
        }
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageRegisterTask
    public void D(com.tencent.luggage.sdk.processes.s record) {
        kotlin.jvm.internal.o.g(record, "record");
        com.tencent.mm.plugin.appbrand.task.o oVar = record instanceof com.tencent.mm.plugin.appbrand.task.o ? (com.tencent.mm.plugin.appbrand.task.o) record : null;
        if (oVar == null) {
            return;
        }
        oVar.f89111o = this.f89051i;
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageRegisterTask, com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt, com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeParcelable(this.runtimeInfo, i17);
        out.writeParcelable(this.f89051i, i17);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppBrandRegisterTask(ze.n rt6, com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader) {
        this(ye.e.a(rt6), iCommLibReader);
        kotlin.jvm.internal.o.g(rt6, "rt");
    }
}
