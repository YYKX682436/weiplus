package com.tencent.luggage.sdk.processes.main;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u0019\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0019J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/tencent/luggage/sdk/processes/main/LuggageRemoveTask;", "Lcom/tencent/luggage/sdk/processes/main/LuggageMainProcessTaskExt;", "Lcom/tencent/luggage/sdk/processes/h;", "Lcom/tencent/luggage/sdk/processes/w;", "process", "Ljz5/f0;", "C", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "g", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "B", "()Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "runtimeInfo", "", "isForDestroy", "<init>", "(Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;Z)V", "Lze/n;", "rt", "(Lze/n;Z)V", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class LuggageRemoveTask extends com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt {
    public static final android.os.Parcelable.Creator<com.tencent.luggage.sdk.processes.main.LuggageRemoveTask> CREATOR = new ye.i();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f47656h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LuggageRemoveTask(com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo, boolean z17) {
        super(runtimeInfo);
        kotlin.jvm.internal.o.g(runtimeInfo, "runtimeInfo");
        this.runtimeInfo = runtimeInfo;
        this.f47656h = z17;
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt
    /* renamed from: B, reason: from getter */
    public com.tencent.luggage.sdk.processes.main.RuntimeInfo getRuntimeInfo() {
        return this.runtimeInfo;
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt
    public void C(com.tencent.luggage.sdk.processes.h process) {
        com.tencent.luggage.sdk.processes.r rVar;
        kotlin.jvm.internal.o.g(process, "process");
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
        rVar.i(getRuntimeInfo().f47660e, getRuntimeInfo().f47661f, new ye.j(process));
        if (this.f47656h) {
            new com.tencent.luggage.sdk.processes.main.LuggageOnRuntimeFinishTask(getRuntimeInfo()).z();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt, com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        this.runtimeInfo.writeToParcel(out, i17);
        out.writeInt(this.f47656h ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LuggageRemoveTask(ze.n rt6, boolean z17) {
        this(ye.e.a(rt6), z17);
        kotlin.jvm.internal.o.g(rt6, "rt");
    }
}
