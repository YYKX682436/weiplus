package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/JsApiAddVideoToFavorites$DoFavoriteParams", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final /* data */ class JsApiAddVideoToFavorites$DoFavoriteParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiAddVideoToFavorites$DoFavoriteParams> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.h3();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f78512d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f78513e;

    public JsApiAddVideoToFavorites$DoFavoriteParams(java.lang.String videoPath, java.lang.String str) {
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        this.f78512d = videoPath;
        this.f78513e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.JsApiAddVideoToFavorites$DoFavoriteParams)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.JsApiAddVideoToFavorites$DoFavoriteParams jsApiAddVideoToFavorites$DoFavoriteParams = (com.tencent.mm.plugin.appbrand.jsapi.JsApiAddVideoToFavorites$DoFavoriteParams) obj;
        return kotlin.jvm.internal.o.b(this.f78512d, jsApiAddVideoToFavorites$DoFavoriteParams.f78512d) && kotlin.jvm.internal.o.b(this.f78513e, jsApiAddVideoToFavorites$DoFavoriteParams.f78513e);
    }

    public int hashCode() {
        int hashCode = this.f78512d.hashCode() * 31;
        java.lang.String str = this.f78513e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "DoFavoriteParams(videoPath=" + this.f78512d + ", thumbPath=" + this.f78513e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f78512d);
        out.writeString(this.f78513e);
    }
}
