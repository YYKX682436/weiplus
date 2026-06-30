package com.tencent.mm.plugin.appbrand.task.ipc;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandNetworkChangeMessage;", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/o6;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandNetworkChangeMessage extends com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage<com.tencent.mm.plugin.appbrand.o6> {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.task.ipc.AppBrandNetworkChangeMessage> CREATOR = new com.tencent.mm.plugin.appbrand.task.ipc.m();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f89043e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandNetworkChangeMessage(java.lang.String appId) {
        super(appId);
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f89043e = appId;
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    /* renamed from: a, reason: from getter */
    public java.lang.String getF89043e() {
        return this.f89043e;
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    public void b(ze.n nVar) {
        com.tencent.mm.plugin.appbrand.o6 runtime = (com.tencent.mm.plugin.appbrand.o6) nVar;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        com.tencent.mm.plugin.appbrand.networking.d0 d0Var = (com.tencent.mm.plugin.appbrand.networking.d0) ((com.tencent.mm.plugin.appbrand.x7) runtime.f86173i3).f92378a.K1(com.tencent.mm.plugin.appbrand.networking.d0.class);
        if (d0Var instanceof com.tencent.mm.plugin.appbrand.networking.h0) {
            ((com.tencent.mm.plugin.appbrand.networking.h0) d0Var).a();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f89043e);
    }
}
