package com.tencent.mm.plugin.appbrand.jsapi.channels;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/channels/OpenFinderFeedResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/channels/h1", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class OpenFinderFeedResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final com.tencent.mm.plugin.appbrand.jsapi.channels.h1 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.channels.h1(null);

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.channels.s1 f80218d;

    /* renamed from: e, reason: collision with root package name */
    public final int f80219e;

    /* renamed from: f, reason: collision with root package name */
    public final org.json.JSONObject f80220f;

    public OpenFinderFeedResult(com.tencent.mm.plugin.appbrand.jsapi.channels.s1 resultType, int i17, org.json.JSONObject navigateBackInfo) {
        kotlin.jvm.internal.o.g(resultType, "resultType");
        kotlin.jvm.internal.o.g(navigateBackInfo, "navigateBackInfo");
        this.f80218d = resultType;
        this.f80219e = i17;
        this.f80220f = navigateBackInfo;
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
        parcel.writeInt(this.f80218d.f80272d);
        parcel.writeInt(this.f80219e);
        parcel.writeString(this.f80220f.toString());
    }
}
