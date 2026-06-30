package com.tencent.mm.plugin.appbrand.task.ipc;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandLaunchWxaAppInfoNotifyMessage;", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/o6;", "com/tencent/mm/plugin/appbrand/task/ipc/l", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandLaunchWxaAppInfoNotifyMessage extends com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage<com.tencent.mm.plugin.appbrand.o6> {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.task.ipc.AppBrandLaunchWxaAppInfoNotifyMessage> CREATOR = new com.tencent.mm.plugin.appbrand.task.ipc.j();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f89041e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Parcelable f89042f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandLaunchWxaAppInfoNotifyMessage(java.lang.String appId, android.os.Parcelable data) {
        super(appId);
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(data, "data");
        this.f89041e = appId;
        this.f89042f = data;
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    /* renamed from: a, reason: from getter */
    public java.lang.String getF89041e() {
        return this.f89041e;
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    public void b(ze.n nVar) {
        final com.tencent.mm.plugin.appbrand.o6 runtime = (com.tencent.mm.plugin.appbrand.o6) nVar;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        final android.os.Parcelable parcelable = this.f89042f;
        com.tencent.mars.xlog.Log.i("MicroMsg.ILaunchWxaAppInfoNotify.RuntimeHelper[permission]", "handleIPCNotifyMessage runtime(%s %d), destroyed %b", runtime.f74803n, java.lang.Integer.valueOf(runtime.f74805p.f77281g), java.lang.Boolean.valueOf(runtime.L0()));
        if (runtime.L0()) {
            return;
        }
        runtime.F2(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.g7$$a
            /* JADX WARN: Removed duplicated region for block: B:57:0x0183  */
            /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 579
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.g7$$a.run():void");
            }
        });
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f89041e);
        out.writeParcelable(this.f89042f, i17);
    }
}
