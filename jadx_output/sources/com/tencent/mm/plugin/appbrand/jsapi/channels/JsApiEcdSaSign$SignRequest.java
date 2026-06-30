package com.tencent.mm.plugin.appbrand.jsapi.channels;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/channels/JsApiEcdSaSign$SignRequest", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final /* data */ class JsApiEcdSaSign$SignRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignRequest> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.channels.f();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f80203d;

    public JsApiEcdSaSign$SignRequest(java.lang.String params) {
        kotlin.jvm.internal.o.g(params, "params");
        this.f80203d = params;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignRequest) && kotlin.jvm.internal.o.b(this.f80203d, ((com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignRequest) obj).f80203d);
    }

    public int hashCode() {
        return this.f80203d.hashCode();
    }

    public java.lang.String toString() {
        return "SignRequest(params=" + this.f80203d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f80203d);
    }
}
