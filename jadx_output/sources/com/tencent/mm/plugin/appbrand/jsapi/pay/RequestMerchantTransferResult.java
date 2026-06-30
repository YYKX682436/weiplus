package com.tencent.mm.plugin.appbrand.jsapi.pay;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/pay/RequestMerchantTransferResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "<init>", "()V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/pay/z2", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class RequestMerchantTransferResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final com.tencent.mm.plugin.appbrand.jsapi.pay.z2 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.pay.z2(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f82567d;

    /* renamed from: e, reason: collision with root package name */
    public org.json.JSONObject f82568e;

    public RequestMerchantTransferResult() {
        this.f82567d = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        this.f82567d = readString;
        java.lang.String readString2 = parcel.readString();
        this.f82568e = readString2 == null || readString2.length() == 0 ? new org.json.JSONObject() : new org.json.JSONObject(readString2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.f82567d);
        org.json.JSONObject jSONObject = this.f82568e;
        dest.writeString(jSONObject != null ? jSONObject.toString() : null);
    }

    public RequestMerchantTransferResult(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f82567d = "";
        readParcel(parcel);
    }
}
