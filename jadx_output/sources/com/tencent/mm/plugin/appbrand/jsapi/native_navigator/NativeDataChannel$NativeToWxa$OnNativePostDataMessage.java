package com.tencent.mm.plugin.appbrand.jsapi.native_navigator;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/native_navigator/NativeDataChannel$NativeToWxa$OnNativePostDataMessage", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/o6;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class NativeDataChannel$NativeToWxa$OnNativePostDataMessage extends com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage<com.tencent.mm.plugin.appbrand.o6> {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.native_navigator.NativeDataChannel$NativeToWxa$OnNativePostDataMessage> CREATOR = new xc1.m();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f82383e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f82384f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeDataChannel$NativeToWxa$OnNativePostDataMessage(java.lang.String appId, java.lang.String str) {
        super(appId);
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f82383e = appId;
        this.f82384f = str;
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    /* renamed from: a, reason: from getter */
    public java.lang.String getF82383e() {
        return this.f82383e;
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    public void b(ze.n nVar) {
        com.tencent.mm.plugin.appbrand.o6 runtime = (com.tencent.mm.plugin.appbrand.o6) nVar;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        com.tencent.mm.plugin.appbrand.service.c0 C0 = runtime.C0();
        if (C0 == null) {
            return;
        }
        xc1.a aVar = new xc1.a();
        aVar.f82374f = this.f82384f;
        aVar.u(C0);
        aVar.m();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f82383e);
        out.writeString(this.f82384f);
    }
}
