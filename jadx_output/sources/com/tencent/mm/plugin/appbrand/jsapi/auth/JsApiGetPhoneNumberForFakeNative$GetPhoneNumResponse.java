package com.tencent.mm.plugin.appbrand.jsapi.auth;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiGetPhoneNumberForFakeNative$GetPhoneNumResponse", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/auth/a2", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class JsApiGetPhoneNumberForFakeNative$GetPhoneNumResponse extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final com.tencent.mm.plugin.appbrand.jsapi.auth.a2 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.auth.a2(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f79352d;

    /* renamed from: e, reason: collision with root package name */
    public int f79353e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f79354f;

    public JsApiGetPhoneNumberForFakeNative$GetPhoneNumResponse(java.lang.String requestTicket, int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(requestTicket, "requestTicket");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f79352d = requestTicket;
        this.f79353e = i17;
        this.f79354f = errMsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.d(parcel);
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        this.f79352d = readString;
        this.f79353e = parcel.readInt();
        java.lang.String readString2 = parcel.readString();
        this.f79354f = readString2 != null ? readString2 : "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f79352d);
        parcel.writeInt(this.f79353e);
        parcel.writeString(this.f79354f);
    }
}
