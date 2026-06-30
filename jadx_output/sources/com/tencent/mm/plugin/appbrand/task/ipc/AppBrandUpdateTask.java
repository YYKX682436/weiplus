package com.tencent.mm.plugin.appbrand.task.ipc;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015B#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0018B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandUpdateTask;", "Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandRegisterTask;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljz5/f0;", "writeToParcel", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "m", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "B", "()Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "runtimeInfo", "Lcom/tencent/mm/plugin/appbrand/appstorage/ICommLibReader;", "commLibReader", "", "isMagicBrushFrameHost", "isEnteredFullscreenCustomLoading", "<init>", "(Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;Lcom/tencent/mm/plugin/appbrand/appstorage/ICommLibReader;ZZ)V", "Lze/n;", "rt", "(Lze/n;Lcom/tencent/mm/plugin/appbrand/appstorage/ICommLibReader;Z)V", "(Lze/n;Lcom/tencent/mm/plugin/appbrand/appstorage/ICommLibReader;)V", "com/tencent/mm/plugin/appbrand/task/ipc/a0", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandUpdateTask extends com.tencent.mm.plugin.appbrand.task.ipc.AppBrandRegisterTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.task.ipc.AppBrandUpdateTask> CREATOR;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f89059n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f89060o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f89061p;

    static {
        new com.tencent.mm.plugin.appbrand.task.ipc.a0(null);
        CREATOR = new com.tencent.mm.plugin.appbrand.task.ipc.b0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandUpdateTask(com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo, com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, boolean z17, boolean z18) {
        super(runtimeInfo, iCommLibReader);
        kotlin.jvm.internal.o.g(runtimeInfo, "runtimeInfo");
        this.runtimeInfo = runtimeInfo;
        this.f89059n = iCommLibReader;
        this.f89060o = z17;
        this.f89061p = z18;
    }

    @Override // com.tencent.mm.plugin.appbrand.task.ipc.AppBrandRegisterTask, com.tencent.luggage.sdk.processes.main.LuggageRegisterTask, com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt
    /* renamed from: B, reason: from getter */
    public com.tencent.luggage.sdk.processes.main.RuntimeInfo getRuntimeInfo() {
        return this.runtimeInfo;
    }

    @Override // com.tencent.mm.plugin.appbrand.task.ipc.AppBrandRegisterTask, com.tencent.luggage.sdk.processes.main.LuggageRegisterTask
    public void D(com.tencent.luggage.sdk.processes.s record) {
        kotlin.jvm.internal.o.g(record, "record");
        super.D(record);
        boolean z17 = record instanceof com.tencent.mm.plugin.appbrand.task.o;
        com.tencent.mm.plugin.appbrand.task.o oVar = z17 ? (com.tencent.mm.plugin.appbrand.task.o) record : null;
        if (oVar != null) {
            oVar.f89110n = this.f89060o;
        }
        com.tencent.mm.plugin.appbrand.task.o oVar2 = z17 ? (com.tencent.mm.plugin.appbrand.task.o) record : null;
        if (oVar2 == null) {
            return;
        }
        oVar2.f89106j = this.f89061p;
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageRegisterTask, com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.task.ipc.AppBrandRegisterTask, com.tencent.luggage.sdk.processes.main.LuggageRegisterTask, com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt, com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeParcelable(this.runtimeInfo, i17);
        out.writeParcelable(this.f89059n, i17);
        out.writeInt(this.f89060o ? 1 : 0);
        out.writeInt(this.f89061p ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppBrandUpdateTask(ze.n r4, com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r5, boolean r6) {
        /*
            r3 = this;
            java.lang.String r0 = "rt"
            kotlin.jvm.internal.o.g(r4, r0)
            com.tencent.luggage.sdk.processes.main.RuntimeInfo r0 = ye.e.a(r4)
            boolean r1 = r4 instanceof com.tencent.mm.plugin.appbrand.o6
            r2 = 0
            if (r1 != 0) goto Lf
            goto L18
        Lf:
            com.tencent.mm.plugin.appbrand.o6 r4 = (com.tencent.mm.plugin.appbrand.o6) r4
            com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a r4 = r4.U2()
            if (r4 == 0) goto L18
            r2 = 1
        L18:
            r3.<init>(r0, r5, r2, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandUpdateTask.<init>(ze.n, com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader, boolean):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppBrandUpdateTask(ze.n rt6, com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader) {
        this(ye.e.a(rt6), iCommLibReader, (rt6 instanceof com.tencent.mm.plugin.appbrand.o6) && ((com.tencent.mm.plugin.appbrand.o6) rt6).U2() != null, false);
        kotlin.jvm.internal.o.g(rt6, "rt");
    }
}
