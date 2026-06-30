package com.tencent.mm.plugin.appbrand.custom_loading;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/appbrand/custom_loading/CustomLoadingUtil$NeedHistoryListMessage", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/o6;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class CustomLoadingUtil$NeedHistoryListMessage extends com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage<com.tencent.mm.plugin.appbrand.o6> {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.custom_loading.CustomLoadingUtil$NeedHistoryListMessage> CREATOR = new n91.p();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f77556e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomLoadingUtil$NeedHistoryListMessage(java.lang.String appId) {
        super(appId);
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f77556e = appId;
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    /* renamed from: a, reason: from getter */
    public java.lang.String getF77556e() {
        return this.f77556e;
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    public void b(ze.n nVar) {
        com.tencent.mm.plugin.appbrand.o6 runtime = (com.tencent.mm.plugin.appbrand.o6) nVar;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        ((ku5.t0) ku5.t0.f312615d).B(new n91.q(runtime));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f77556e);
    }
}
