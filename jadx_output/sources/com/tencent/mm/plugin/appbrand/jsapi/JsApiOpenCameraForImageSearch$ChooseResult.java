package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/JsApiOpenCameraForImageSearch$ChooseResult", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "<init>", "()V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/a9", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class JsApiOpenCameraForImageSearch$ChooseResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final com.tencent.mm.plugin.appbrand.jsapi.a9 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.a9(null);

    /* renamed from: d, reason: collision with root package name */
    public int f78582d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo f78583e;

    public JsApiOpenCameraForImageSearch$ChooseResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel in6) {
        kotlin.jvm.internal.o.g(in6, "in");
        this.f78582d = in6.readInt();
        this.f78583e = (com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo) in6.readParcelable(com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f78582d);
        dest.writeParcelable(this.f78583e, i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsApiOpenCameraForImageSearch$ChooseResult(android.os.Parcel in6) {
        super(in6);
        kotlin.jvm.internal.o.g(in6, "in");
    }
}
