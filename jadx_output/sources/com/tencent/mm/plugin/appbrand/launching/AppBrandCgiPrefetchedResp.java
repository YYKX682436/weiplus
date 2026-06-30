package com.tencent.mm.plugin.appbrand.launching;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/AppBrandCgiPrefetchedResp;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class AppBrandCgiPrefetchedResp implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp> CREATOR = new com.tencent.mm.plugin.appbrand.launching.w();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f84336d;

    /* renamed from: e, reason: collision with root package name */
    public final int f84337e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f84338f;

    public AppBrandCgiPrefetchedResp(java.lang.String result, int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f84336d = result;
        this.f84337e = i17;
        this.f84338f = errMsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp appBrandCgiPrefetchedResp = (com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp) obj;
        return kotlin.jvm.internal.o.b(this.f84336d, appBrandCgiPrefetchedResp.f84336d) && this.f84337e == appBrandCgiPrefetchedResp.f84337e && kotlin.jvm.internal.o.b(this.f84338f, appBrandCgiPrefetchedResp.f84338f);
    }

    public int hashCode() {
        return (((this.f84336d.hashCode() * 31) + java.lang.Integer.hashCode(this.f84337e)) * 31) + this.f84338f.hashCode();
    }

    public java.lang.String toString() {
        return "AppBrandCgiPrefetchedResp(result=" + this.f84336d + ", errCode=" + this.f84337e + ", errMsg=" + this.f84338f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f84336d);
        out.writeInt(this.f84337e);
        out.writeString(this.f84338f);
    }
}
