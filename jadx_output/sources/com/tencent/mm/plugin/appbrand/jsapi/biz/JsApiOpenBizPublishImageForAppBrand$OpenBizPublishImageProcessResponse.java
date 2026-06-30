package com.tencent.mm.plugin.appbrand.jsapi.biz;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiOpenBizPublishImageForAppBrand$OpenBizPublishImageProcessResponse", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/biz/z0", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class JsApiOpenBizPublishImageForAppBrand$OpenBizPublishImageProcessResponse extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final com.tencent.mm.plugin.appbrand.jsapi.biz.z0 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.biz.z0(null);

    /* renamed from: d, reason: collision with root package name */
    public boolean f79945d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f79946e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f79947f;

    public JsApiOpenBizPublishImageForAppBrand$OpenBizPublishImageProcessResponse(boolean z17, java.lang.String errMsg, java.lang.String extraData) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        kotlin.jvm.internal.o.g(extraData, "extraData");
        this.f79945d = z17;
        this.f79946e = errMsg;
        this.f79947f = extraData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f79945d = parcel.readInt() == 1;
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        this.f79946e = readString;
        java.lang.String readString2 = parcel.readString();
        this.f79947f = readString2 != null ? readString2 : "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f79945d ? 1 : 0);
        dest.writeString(this.f79946e);
        dest.writeString(this.f79947f);
    }
}
