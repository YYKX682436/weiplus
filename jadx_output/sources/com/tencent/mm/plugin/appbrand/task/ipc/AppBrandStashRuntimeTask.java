package com.tencent.mm.plugin.appbrand.task.ipc;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\u0019\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandStashRuntimeTask;", "Lcom/tencent/luggage/sdk/processes/main/LuggageStashRuntimeTask;", "Landroid/os/Parcel;", "parcel", "", "flags", "Ljz5/f0;", "writeToParcel", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "h", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "B", "()Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "runtimeInfo", "commLibVersion", "", "isMagicBrushFrameHost", "isEnteredFullscreenCustomLoading", "<init>", "(Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;IZZ)V", "Lcom/tencent/mm/plugin/appbrand/o6;", "rt", "(Lcom/tencent/mm/plugin/appbrand/o6;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandStashRuntimeTask extends com.tencent.luggage.sdk.processes.main.LuggageStashRuntimeTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.task.ipc.AppBrandStashRuntimeTask> CREATOR = new com.tencent.mm.plugin.appbrand.task.ipc.z();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo;

    /* renamed from: i, reason: collision with root package name */
    public final int f89055i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f89056m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f89057n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandStashRuntimeTask(com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo, int i17, boolean z17, boolean z18) {
        super(runtimeInfo);
        kotlin.jvm.internal.o.g(runtimeInfo, "runtimeInfo");
        this.runtimeInfo = runtimeInfo;
        this.f89055i = i17;
        this.f89056m = z17;
        this.f89057n = z18;
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageStashRuntimeTask, com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt
    /* renamed from: B, reason: from getter */
    public com.tencent.luggage.sdk.processes.main.RuntimeInfo getRuntimeInfo() {
        return this.runtimeInfo;
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageStashRuntimeTask
    public void D(com.tencent.luggage.sdk.processes.s record) {
        kotlin.jvm.internal.o.g(record, "record");
        boolean z17 = record instanceof com.tencent.mm.plugin.appbrand.task.o;
        com.tencent.mm.plugin.appbrand.task.o oVar = z17 ? (com.tencent.mm.plugin.appbrand.task.o) record : null;
        if (oVar != null) {
            oVar.f89110n = this.f89056m;
        }
        com.tencent.mm.plugin.appbrand.task.o oVar2 = z17 ? (com.tencent.mm.plugin.appbrand.task.o) record : null;
        if (oVar2 == null) {
            return;
        }
        oVar2.f89106j = this.f89057n;
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageStashRuntimeTask, com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt, com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeParcelable(this.runtimeInfo, i17);
        out.writeInt(this.f89055i);
        out.writeInt(this.f89056m ? 1 : 0);
        out.writeInt(this.f89057n ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppBrandStashRuntimeTask(com.tencent.mm.plugin.appbrand.o6 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "rt"
            kotlin.jvm.internal.o.g(r4, r0)
            com.tencent.luggage.sdk.processes.main.RuntimeInfo r0 = ye.e.a(r4)
            r1 = 0
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r2 = r4.S2(r1)
            if (r2 == 0) goto L15
            int r2 = r2.i()
            goto L16
        L15:
            r2 = -1
        L16:
            com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a r4 = r4.U2()
            if (r4 == 0) goto L1e
            r4 = 1
            goto L1f
        L1e:
            r4 = r1
        L1f:
            r3.<init>(r0, r2, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandStashRuntimeTask.<init>(com.tencent.mm.plugin.appbrand.o6):void");
    }
}
