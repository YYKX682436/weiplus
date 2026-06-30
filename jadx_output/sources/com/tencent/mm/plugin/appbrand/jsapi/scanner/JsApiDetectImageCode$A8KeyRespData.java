package com.tencent.mm.plugin.appbrand.jsapi.scanner;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/scanner/JsApiDetectImageCode$A8KeyRespData", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class JsApiDetectImageCode$A8KeyRespData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$A8KeyRespData> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.scanner.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f82929d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f82930e;

    public JsApiDetectImageCode$A8KeyRespData(int i17, java.lang.String respStr) {
        kotlin.jvm.internal.o.g(respStr, "respStr");
        this.f82929d = i17;
        this.f82930e = respStr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$A8KeyRespData)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$A8KeyRespData jsApiDetectImageCode$A8KeyRespData = (com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$A8KeyRespData) obj;
        return this.f82929d == jsApiDetectImageCode$A8KeyRespData.f82929d && kotlin.jvm.internal.o.b(this.f82930e, jsApiDetectImageCode$A8KeyRespData.f82930e);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f82929d) * 31) + this.f82930e.hashCode();
    }

    public java.lang.String toString() {
        return "A8KeyRespData(actionCode=" + this.f82929d + ", respStr=" + this.f82930e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f82929d);
        out.writeString(this.f82930e);
    }
}
