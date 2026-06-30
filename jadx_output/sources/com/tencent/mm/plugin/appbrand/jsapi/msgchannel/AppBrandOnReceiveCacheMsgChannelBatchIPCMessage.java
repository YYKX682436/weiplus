package com.tencent.mm.plugin.appbrand.jsapi.msgchannel;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/msgchannel/AppBrandOnReceiveCacheMsgChannelBatchIPCMessage;", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/o6;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public class AppBrandOnReceiveCacheMsgChannelBatchIPCMessage extends com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage<com.tencent.mm.plugin.appbrand.o6> {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.msgchannel.AppBrandOnReceiveCacheMsgChannelBatchIPCMessage> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.msgchannel.b();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f82287e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f82288f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandOnReceiveCacheMsgChannelBatchIPCMessage(java.lang.String appId, java.util.ArrayList cacheList) {
        super(appId);
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(cacheList, "cacheList");
        this.f82287e = appId;
        this.f82288f = cacheList;
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    /* renamed from: a, reason: from getter */
    public java.lang.String getF82287e() {
        return this.f82287e;
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    public void b(ze.n nVar) {
        com.tencent.mm.plugin.appbrand.o6 runtime = (com.tencent.mm.plugin.appbrand.o6) nVar;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOnReceiveCacheMsgChannelBatchIPCMessage", "runInLuggageProcess");
        runtime.I1(new com.tencent.mm.plugin.appbrand.jsapi.msgchannel.c(runtime, this));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f82287e);
        java.util.ArrayList arrayList = this.f82288f;
        out.writeInt(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            out.writeParcelable((android.os.Parcelable) it.next(), i17);
        }
    }
}
