package com.tencent.luggage.sdk.processes.main;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0012\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/tencent/luggage/sdk/processes/main/LuggageClearDuplicatedTask;", "Lcom/tencent/luggage/sdk/processes/main/LuggageMainProcessTaskExt;", "Ljz5/f0;", "z", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "g", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "B", "()Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "D", "(Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;)V", "runtimeInfo", "<init>", "Lze/n;", "rt", "(Lze/n;)V", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class LuggageClearDuplicatedTask extends com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt {
    public static final android.os.Parcelable.Creator<com.tencent.luggage.sdk.processes.main.LuggageClearDuplicatedTask> CREATOR = new ye.a();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LuggageClearDuplicatedTask(com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo) {
        super(runtimeInfo);
        kotlin.jvm.internal.o.g(runtimeInfo, "runtimeInfo");
        this.runtimeInfo = runtimeInfo;
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt
    /* renamed from: B, reason: from getter */
    public com.tencent.luggage.sdk.processes.main.RuntimeInfo getRuntimeInfo() {
        return this.runtimeInfo;
    }

    public void D(com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo) {
        kotlin.jvm.internal.o.g(runtimeInfo, "<set-?>");
        this.runtimeInfo = runtimeInfo;
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
        rVar.b(getRuntimeInfo().f47664i, getRuntimeInfo().f47660e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LuggageClearDuplicatedTask(ze.n rt6) {
        this(ye.e.a(rt6));
        kotlin.jvm.internal.o.g(rt6, "rt");
    }
}
