package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/fakenative/JsApiRemoveSplashScreenshot$RemoveParams", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final /* data */ class JsApiRemoveSplashScreenshot$RemoveParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.fakenative.JsApiRemoveSplashScreenshot$RemoveParams> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.fakenative.n();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f80892d;

    /* renamed from: e, reason: collision with root package name */
    public final int f80893e;

    public JsApiRemoveSplashScreenshot$RemoveParams(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f80892d = appId;
        this.f80893e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.fakenative.JsApiRemoveSplashScreenshot$RemoveParams)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.JsApiRemoveSplashScreenshot$RemoveParams jsApiRemoveSplashScreenshot$RemoveParams = (com.tencent.mm.plugin.appbrand.jsapi.fakenative.JsApiRemoveSplashScreenshot$RemoveParams) obj;
        return kotlin.jvm.internal.o.b(this.f80892d, jsApiRemoveSplashScreenshot$RemoveParams.f80892d) && this.f80893e == jsApiRemoveSplashScreenshot$RemoveParams.f80893e;
    }

    public int hashCode() {
        return (this.f80892d.hashCode() * 31) + java.lang.Integer.hashCode(this.f80893e);
    }

    public java.lang.String toString() {
        return "RemoveParams(appId=" + this.f80892d + ", versionType=" + this.f80893e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f80892d);
        out.writeInt(this.f80893e);
    }
}
