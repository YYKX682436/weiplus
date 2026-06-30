package com.tencent.mm.plugin.appbrand.jsapi.rencentusage;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiGetRecentUsageList$Companion$Result", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class JsApiGetRecentUsageList$Companion$Result implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Result> CREATOR = new td1.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f82911d;

    /* renamed from: e, reason: collision with root package name */
    public final int f82912e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f82913f;

    public JsApiGetRecentUsageList$Companion$Result(java.lang.String data, int i17, java.lang.String errorMsg) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        this.f82911d = data;
        this.f82912e = i17;
        this.f82913f = errorMsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Result)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Result jsApiGetRecentUsageList$Companion$Result = (com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Result) obj;
        return kotlin.jvm.internal.o.b(this.f82911d, jsApiGetRecentUsageList$Companion$Result.f82911d) && this.f82912e == jsApiGetRecentUsageList$Companion$Result.f82912e && kotlin.jvm.internal.o.b(this.f82913f, jsApiGetRecentUsageList$Companion$Result.f82913f);
    }

    public int hashCode() {
        return (((this.f82911d.hashCode() * 31) + java.lang.Integer.hashCode(this.f82912e)) * 31) + this.f82913f.hashCode();
    }

    public java.lang.String toString() {
        return "Result(data=" + this.f82911d + ", errorCode=" + this.f82912e + ", errorMsg=" + this.f82913f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f82911d);
        parcel.writeInt(this.f82912e);
        parcel.writeString(this.f82913f);
    }
}
