package com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/appbrand/magicbrush_frame/appbrand_host/OnMiniProgramRemovedNotify$OnMiniProgramRemovedIPCMessage", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/o6;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class OnMiniProgramRemovedNotify$OnMiniProgramRemovedIPCMessage extends com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage<com.tencent.mm.plugin.appbrand.o6> {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.OnMiniProgramRemovedNotify$OnMiniProgramRemovedIPCMessage> CREATOR = new com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.d();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f85731e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f85732f;

    /* renamed from: g, reason: collision with root package name */
    public final int f85733g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnMiniProgramRemovedNotify$OnMiniProgramRemovedIPCMessage(java.lang.String appId, java.lang.String removedAppId, int i17) {
        super(appId);
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(removedAppId, "removedAppId");
        this.f85731e = appId;
        this.f85732f = removedAppId;
        this.f85733g = i17;
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    /* renamed from: a, reason: from getter */
    public java.lang.String getF85731e() {
        return this.f85731e;
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    public void b(ze.n nVar) {
        com.tencent.mm.plugin.appbrand.o6 runtime = (com.tencent.mm.plugin.appbrand.o6) nVar;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        runtime.I1(new com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.e(runtime, this));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f85731e);
        out.writeString(this.f85732f);
        out.writeInt(this.f85733g);
    }
}
