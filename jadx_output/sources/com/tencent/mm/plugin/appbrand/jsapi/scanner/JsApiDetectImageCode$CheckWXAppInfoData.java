package com.tencent.mm.plugin.appbrand.jsapi.scanner;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/scanner/JsApiDetectImageCode$CheckWXAppInfoData", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class JsApiDetectImageCode$CheckWXAppInfoData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$CheckWXAppInfoData> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.scanner.f();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f82932d;

    /* renamed from: e, reason: collision with root package name */
    public final int f82933e;

    /* renamed from: f, reason: collision with root package name */
    public final int f82934f;

    public JsApiDetectImageCode$CheckWXAppInfoData(java.lang.String result, int i17, int i18) {
        kotlin.jvm.internal.o.g(result, "result");
        this.f82932d = result;
        this.f82933e = i17;
        this.f82934f = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$CheckWXAppInfoData)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$CheckWXAppInfoData jsApiDetectImageCode$CheckWXAppInfoData = (com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$CheckWXAppInfoData) obj;
        return kotlin.jvm.internal.o.b(this.f82932d, jsApiDetectImageCode$CheckWXAppInfoData.f82932d) && this.f82933e == jsApiDetectImageCode$CheckWXAppInfoData.f82933e && this.f82934f == jsApiDetectImageCode$CheckWXAppInfoData.f82934f;
    }

    public int hashCode() {
        return (((this.f82932d.hashCode() * 31) + java.lang.Integer.hashCode(this.f82933e)) * 31) + java.lang.Integer.hashCode(this.f82934f);
    }

    public java.lang.String toString() {
        return "CheckWXAppInfoData(result=" + this.f82932d + ", codeType=" + this.f82933e + ", codeVersion=" + this.f82934f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f82932d);
        out.writeInt(this.f82933e);
        out.writeInt(this.f82934f);
    }
}
