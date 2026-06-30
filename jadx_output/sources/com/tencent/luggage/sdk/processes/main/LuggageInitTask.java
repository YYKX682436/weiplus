package com.tencent.luggage.sdk.processes.main;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006HÖ\u0001¨\u0006\r"}, d2 = {"Lcom/tencent/luggage/sdk/processes/main/LuggageInitTask;", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "z", "Landroid/os/Parcel;", "parcel", "", "flags", "writeToParcel", "", "processName", "<init>", "(Ljava/lang/String;)V", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class LuggageInitTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.luggage.sdk.processes.main.LuggageInitTask> CREATOR = new ye.b();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f47650f;

    public LuggageInitTask(java.lang.String processName) {
        kotlin.jvm.internal.o.g(processName, "processName");
        this.f47650f = processName;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f47650f);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.luggage.sdk.processes.r rVar;
        com.tencent.mars.xlog.Log.i("LuggageInitTask", "runInMainProcess for " + this.f47650f);
        if (i95.n0.h(com.tencent.mm.plugin.appbrand.fc.class)) {
            ((com.tencent.mm.plugin.appbrand.fc) i95.n0.c(com.tencent.mm.plugin.appbrand.fc.class)).waitFor();
        }
        synchronized (com.tencent.luggage.sdk.processes.r.f47681e) {
            rVar = com.tencent.luggage.sdk.processes.r.f47682f;
            if (rVar == null) {
                kotlin.jvm.internal.o.o("INSTANCE_");
                throw null;
            }
        }
        java.util.Iterator it = rVar.h(new ye.c(this)).iterator();
        while (it.hasNext()) {
            ((com.tencent.luggage.sdk.processes.h) it.next()).s();
        }
    }
}
