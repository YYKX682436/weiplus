package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/PublishTextStatusParams;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class PublishTextStatusParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.PublishTextStatusParams> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.sf();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f78665d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f78666e;

    public PublishTextStatusParams(java.lang.String appId, java.lang.String token) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(token, "token");
        this.f78665d = appId;
        this.f78666e = token;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "PublishTextStatusParams(appId='" + this.f78665d + "', token='" + this.f78666e + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f78665d);
        out.writeString(this.f78666e);
    }
}
