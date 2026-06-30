package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/JsApiAddFileToFavorites$DoFavoriteParams", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final /* data */ class JsApiAddFileToFavorites$DoFavoriteParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiAddFileToFavorites$DoFavoriteParams> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.c2();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f78488d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f78489e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f78490f;

    public JsApiAddFileToFavorites$DoFavoriteParams(java.lang.String filePath, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        this.f78488d = filePath;
        this.f78489e = str;
        this.f78490f = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.JsApiAddFileToFavorites$DoFavoriteParams)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.JsApiAddFileToFavorites$DoFavoriteParams jsApiAddFileToFavorites$DoFavoriteParams = (com.tencent.mm.plugin.appbrand.jsapi.JsApiAddFileToFavorites$DoFavoriteParams) obj;
        return kotlin.jvm.internal.o.b(this.f78488d, jsApiAddFileToFavorites$DoFavoriteParams.f78488d) && kotlin.jvm.internal.o.b(this.f78489e, jsApiAddFileToFavorites$DoFavoriteParams.f78489e) && kotlin.jvm.internal.o.b(this.f78490f, jsApiAddFileToFavorites$DoFavoriteParams.f78490f);
    }

    public int hashCode() {
        int hashCode = this.f78488d.hashCode() * 31;
        java.lang.String str = this.f78489e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f78490f;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "DoFavoriteParams(filePath=" + this.f78488d + ", fileExt=" + this.f78489e + ", fileName=" + this.f78490f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f78488d);
        out.writeString(this.f78489e);
        out.writeString(this.f78490f);
    }
}
