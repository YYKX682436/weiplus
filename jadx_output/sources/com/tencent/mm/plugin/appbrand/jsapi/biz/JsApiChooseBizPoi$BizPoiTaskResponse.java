package com.tencent.mm.plugin.appbrand.jsapi.biz;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiChooseBizPoi$BizPoiTaskResponse", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final /* data */ class JsApiChooseBizPoi$BizPoiTaskResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskResponse> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.biz.f();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Boolean f79915d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Boolean f79916e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f79917f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f79918g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f79919h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Double f79920i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Double f79921m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f79922n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f79923o;

    public JsApiChooseBizPoi$BizPoiTaskResponse(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Double d17, java.lang.Double d18, java.lang.String str4, java.lang.String str5) {
        this.f79915d = bool;
        this.f79916e = bool2;
        this.f79917f = str;
        this.f79918g = str2;
        this.f79919h = str3;
        this.f79920i = d17;
        this.f79921m = d18;
        this.f79922n = str4;
        this.f79923o = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskResponse)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskResponse jsApiChooseBizPoi$BizPoiTaskResponse = (com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskResponse) obj;
        return kotlin.jvm.internal.o.b(this.f79915d, jsApiChooseBizPoi$BizPoiTaskResponse.f79915d) && kotlin.jvm.internal.o.b(this.f79916e, jsApiChooseBizPoi$BizPoiTaskResponse.f79916e) && kotlin.jvm.internal.o.b(this.f79917f, jsApiChooseBizPoi$BizPoiTaskResponse.f79917f) && kotlin.jvm.internal.o.b(this.f79918g, jsApiChooseBizPoi$BizPoiTaskResponse.f79918g) && kotlin.jvm.internal.o.b(this.f79919h, jsApiChooseBizPoi$BizPoiTaskResponse.f79919h) && kotlin.jvm.internal.o.b(this.f79920i, jsApiChooseBizPoi$BizPoiTaskResponse.f79920i) && kotlin.jvm.internal.o.b(this.f79921m, jsApiChooseBizPoi$BizPoiTaskResponse.f79921m) && kotlin.jvm.internal.o.b(this.f79922n, jsApiChooseBizPoi$BizPoiTaskResponse.f79922n) && kotlin.jvm.internal.o.b(this.f79923o, jsApiChooseBizPoi$BizPoiTaskResponse.f79923o);
    }

    public int hashCode() {
        java.lang.Boolean bool = this.f79915d;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        java.lang.Boolean bool2 = this.f79916e;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        java.lang.String str = this.f79917f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f79918g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f79919h;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Double d17 = this.f79920i;
        int hashCode6 = (hashCode5 + (d17 == null ? 0 : d17.hashCode())) * 31;
        java.lang.Double d18 = this.f79921m;
        int hashCode7 = (hashCode6 + (d18 == null ? 0 : d18.hashCode())) * 31;
        java.lang.String str4 = this.f79922n;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f79923o;
        return hashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "BizPoiTaskResponse(isUserCancel=" + this.f79915d + ", ignorePoiSelect=" + this.f79916e + ", poiId=" + this.f79917f + ", name=" + this.f79918g + ", address=" + this.f79919h + ", latitude=" + this.f79920i + ", longitude=" + this.f79921m + ", districtId=" + this.f79922n + ", content=" + this.f79923o + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        java.lang.Boolean bool = this.f79915d;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        java.lang.Boolean bool2 = this.f79916e;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        out.writeString(this.f79917f);
        out.writeString(this.f79918g);
        out.writeString(this.f79919h);
        java.lang.Double d17 = this.f79920i;
        if (d17 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeDouble(d17.doubleValue());
        }
        java.lang.Double d18 = this.f79921m;
        if (d18 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeDouble(d18.doubleValue());
        }
        out.writeString(this.f79922n);
        out.writeString(this.f79923o);
    }
}
