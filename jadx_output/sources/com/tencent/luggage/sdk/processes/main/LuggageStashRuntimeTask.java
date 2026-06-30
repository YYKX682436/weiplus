package com.tencent.luggage.sdk.processes.main;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/tencent/luggage/sdk/processes/main/LuggageStashRuntimeTask;", "Lcom/tencent/luggage/sdk/processes/main/LuggageMainProcessTaskExt;", "Ljz5/f0;", "z", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "g", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "B", "()Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "runtimeInfo", "<init>", "(Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;)V", "Lze/n;", "rt", "(Lze/n;)V", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public class LuggageStashRuntimeTask extends com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt {
    public static final android.os.Parcelable.Creator<com.tencent.luggage.sdk.processes.main.LuggageStashRuntimeTask> CREATOR = new ye.k();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LuggageStashRuntimeTask(com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo) {
        super(runtimeInfo);
        kotlin.jvm.internal.o.g(runtimeInfo, "runtimeInfo");
        this.runtimeInfo = runtimeInfo;
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt
    /* renamed from: B, reason: from getter */
    public com.tencent.luggage.sdk.processes.main.RuntimeInfo getRuntimeInfo() {
        return this.runtimeInfo;
    }

    public void D(com.tencent.luggage.sdk.processes.s record) {
        kotlin.jvm.internal.o.g(record, "record");
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt, com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        this.runtimeInfo.writeToParcel(out, i17);
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt, com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.luggage.sdk.processes.r rVar;
        super.z();
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
        java.lang.String appId = getRuntimeInfo().f47660e;
        int i17 = getRuntimeInfo().f47661f;
        int i18 = getRuntimeInfo().f47659d;
        java.lang.String instanceId = getRuntimeInfo().f47664i;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig initConfig = getRuntimeInfo().f47666n;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        com.tencent.mars.xlog.Log.i("Luggage.LuggageMiniProgramProcessManager", "stashPersistentApp: appId[%s]versionType[%d]instanceId[%s]processIndex[%d]", appId, java.lang.Integer.valueOf(i17), instanceId, java.lang.Integer.valueOf(i18));
        com.tencent.luggage.sdk.processes.s f17 = com.tencent.luggage.sdk.processes.h.f(rVar.e(i18), appId, 0, 2, null);
        if (f17 == null) {
            f17 = rVar.e(i18).n(appId, true, i17, instanceId, initConfig);
        } else {
            f17.f47688e = true;
        }
        D(f17);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LuggageStashRuntimeTask(ze.n rt6) {
        this(ye.e.a(rt6));
        kotlin.jvm.internal.o.g(rt6, "rt");
    }
}
