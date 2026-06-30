package com.tencent.mm.plugin.appbrand.launching;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/launching/AppBrandCgiPrefetchApi$GetPrefetchResultReq", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final /* data */ class AppBrandCgiPrefetchApi$GetPrefetchResultReq implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchApi$GetPrefetchResultReq> CREATOR = new com.tencent.mm.plugin.appbrand.launching.m();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f84332d;

    /* renamed from: e, reason: collision with root package name */
    public final int f84333e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f84334f;

    /* renamed from: g, reason: collision with root package name */
    public final long f84335g;

    public AppBrandCgiPrefetchApi$GetPrefetchResultReq(java.lang.String instanceId, int i17, boolean z17, long j17) {
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        this.f84332d = instanceId;
        this.f84333e = i17;
        this.f84334f = z17;
        this.f84335g = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchApi$GetPrefetchResultReq)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchApi$GetPrefetchResultReq appBrandCgiPrefetchApi$GetPrefetchResultReq = (com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchApi$GetPrefetchResultReq) obj;
        return kotlin.jvm.internal.o.b(this.f84332d, appBrandCgiPrefetchApi$GetPrefetchResultReq.f84332d) && this.f84333e == appBrandCgiPrefetchApi$GetPrefetchResultReq.f84333e && this.f84334f == appBrandCgiPrefetchApi$GetPrefetchResultReq.f84334f && this.f84335g == appBrandCgiPrefetchApi$GetPrefetchResultReq.f84335g;
    }

    public int hashCode() {
        return (((((this.f84332d.hashCode() * 31) + java.lang.Integer.hashCode(this.f84333e)) * 31) + java.lang.Boolean.hashCode(this.f84334f)) * 31) + java.lang.Long.hashCode(this.f84335g);
    }

    public java.lang.String toString() {
        return "GetPrefetchResultReq(instanceId=" + this.f84332d + ", prefetchType=" + this.f84333e + ", pull=" + this.f84334f + ", timeout=" + this.f84335g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f84332d);
        out.writeInt(this.f84333e);
        out.writeInt(this.f84334f ? 1 : 0);
        out.writeLong(this.f84335g);
    }
}
