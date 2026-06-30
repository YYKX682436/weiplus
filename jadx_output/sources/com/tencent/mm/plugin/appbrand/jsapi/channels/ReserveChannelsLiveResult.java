package com.tencent.mm.plugin.appbrand.jsapi.channels;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/channels/ReserveChannelsLiveResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/channels/n1", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class ReserveChannelsLiveResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final com.tencent.mm.plugin.appbrand.jsapi.channels.n1 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.channels.n1(null);

    /* renamed from: d, reason: collision with root package name */
    public final boolean f80222d;

    /* renamed from: e, reason: collision with root package name */
    public final int f80223e;

    public ReserveChannelsLiveResult(boolean z17, int i17) {
        this.f80222d = z17;
        this.f80223e = i17;
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
        parcel.writeByte(this.f80222d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f80223e);
    }
}
