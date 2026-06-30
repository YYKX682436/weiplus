package com.tencent.mm.plugin.appbrand.jsapi.channels;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/channels/JsApiEcdSaSign$SignResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final /* data */ class JsApiEcdSaSign$SignResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignResult> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.channels.g();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f80204d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f80205e;

    public JsApiEcdSaSign$SignResult(java.lang.String signature, java.lang.String suffix) {
        kotlin.jvm.internal.o.g(signature, "signature");
        kotlin.jvm.internal.o.g(suffix, "suffix");
        this.f80204d = signature;
        this.f80205e = suffix;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignResult)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignResult jsApiEcdSaSign$SignResult = (com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignResult) obj;
        return kotlin.jvm.internal.o.b(this.f80204d, jsApiEcdSaSign$SignResult.f80204d) && kotlin.jvm.internal.o.b(this.f80205e, jsApiEcdSaSign$SignResult.f80205e);
    }

    public int hashCode() {
        return (this.f80204d.hashCode() * 31) + this.f80205e.hashCode();
    }

    public java.lang.String toString() {
        return "SignResult(signature=" + this.f80204d + ", suffix=" + this.f80205e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f80204d);
        out.writeString(this.f80205e);
    }
}
