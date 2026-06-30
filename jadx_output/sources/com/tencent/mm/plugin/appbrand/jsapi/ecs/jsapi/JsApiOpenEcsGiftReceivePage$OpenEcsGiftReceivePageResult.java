package com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/ecs/jsapi/JsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageResult", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/ecs/jsapi/p", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class JsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.p CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.p(null);

    /* renamed from: d, reason: collision with root package name */
    public int f80785d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f80786e;

    public JsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageResult(int i17, java.lang.String str) {
        this.f80785d = i17;
        this.f80786e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f80785d = parcel.readInt();
        this.f80786e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f80785d);
        dest.writeString(this.f80786e);
    }

    public JsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageResult(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        readParcel(parcel);
    }
}
