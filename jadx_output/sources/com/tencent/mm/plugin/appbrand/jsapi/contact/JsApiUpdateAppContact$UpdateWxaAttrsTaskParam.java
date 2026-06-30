package com.tencent.mm.plugin.appbrand.jsapi.contact;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/contact/JsApiUpdateAppContact$UpdateWxaAttrsTaskParam", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class JsApiUpdateAppContact$UpdateWxaAttrsTaskParam implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiUpdateAppContact$UpdateWxaAttrsTaskParam> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.contact.s0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f80496d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f80497e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f80498f;

    public JsApiUpdateAppContact$UpdateWxaAttrsTaskParam(java.lang.String str, java.lang.String str2, boolean z17) {
        this.f80496d = str;
        this.f80497e = str2;
        this.f80498f = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiUpdateAppContact$UpdateWxaAttrsTaskParam)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiUpdateAppContact$UpdateWxaAttrsTaskParam jsApiUpdateAppContact$UpdateWxaAttrsTaskParam = (com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiUpdateAppContact$UpdateWxaAttrsTaskParam) obj;
        return kotlin.jvm.internal.o.b(this.f80496d, jsApiUpdateAppContact$UpdateWxaAttrsTaskParam.f80496d) && kotlin.jvm.internal.o.b(this.f80497e, jsApiUpdateAppContact$UpdateWxaAttrsTaskParam.f80497e) && this.f80498f == jsApiUpdateAppContact$UpdateWxaAttrsTaskParam.f80498f;
    }

    public int hashCode() {
        java.lang.String str = this.f80496d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f80497e;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f80498f);
    }

    public java.lang.String toString() {
        return "UpdateWxaAttrsTaskParam(appId=" + this.f80496d + ", username=" + this.f80497e + ", isByAppId=" + this.f80498f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f80496d);
        out.writeString(this.f80497e);
        out.writeInt(this.f80498f ? 1 : 0);
    }
}
