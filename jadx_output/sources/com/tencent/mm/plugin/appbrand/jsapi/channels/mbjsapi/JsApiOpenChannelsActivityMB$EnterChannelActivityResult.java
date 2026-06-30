package com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/channels/mbjsapi/JsApiOpenChannelsActivityMB$EnterChannelActivityResult", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/channels/mbjsapi/b", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class JsApiOpenChannelsActivityMB$EnterChannelActivityResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi.b CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi.b(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f80251d;

    public JsApiOpenChannelsActivityMB$EnterChannelActivityResult(int i17) {
        this.f80251d = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f80251d);
    }
}
