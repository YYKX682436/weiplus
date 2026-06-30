package com.tencent.mm.plugin.appbrand.launching;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/launching/AppBrandAppConfigParserHelper$AheadRequestArgs", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class AppBrandAppConfigParserHelper$AheadRequestArgs implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.AppBrandAppConfigParserHelper$AheadRequestArgs> CREATOR = new com.tencent.mm.plugin.appbrand.launching.d();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f84327d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f84328e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f84329f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f84330g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo f84331h;

    public AppBrandAppConfigParserHelper$AheadRequestArgs(java.lang.String wxaLaunchInstanceId, java.lang.String appId, boolean z17, boolean z18, com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo pkgWrappingInfo) {
        kotlin.jvm.internal.o.g(wxaLaunchInstanceId, "wxaLaunchInstanceId");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(pkgWrappingInfo, "pkgWrappingInfo");
        this.f84327d = wxaLaunchInstanceId;
        this.f84328e = appId;
        this.f84329f = z17;
        this.f84330g = z18;
        this.f84331h = pkgWrappingInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.launching.AppBrandAppConfigParserHelper$AheadRequestArgs)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.AppBrandAppConfigParserHelper$AheadRequestArgs appBrandAppConfigParserHelper$AheadRequestArgs = (com.tencent.mm.plugin.appbrand.launching.AppBrandAppConfigParserHelper$AheadRequestArgs) obj;
        return kotlin.jvm.internal.o.b(this.f84327d, appBrandAppConfigParserHelper$AheadRequestArgs.f84327d) && kotlin.jvm.internal.o.b(this.f84328e, appBrandAppConfigParserHelper$AheadRequestArgs.f84328e) && this.f84329f == appBrandAppConfigParserHelper$AheadRequestArgs.f84329f && this.f84330g == appBrandAppConfigParserHelper$AheadRequestArgs.f84330g && kotlin.jvm.internal.o.b(this.f84331h, appBrandAppConfigParserHelper$AheadRequestArgs.f84331h);
    }

    public int hashCode() {
        return (((((((this.f84327d.hashCode() * 31) + this.f84328e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f84329f)) * 31) + java.lang.Boolean.hashCode(this.f84330g)) * 31) + this.f84331h.hashCode();
    }

    public java.lang.String toString() {
        return "AheadRequestArgs(wxaLaunchInstanceId=" + this.f84327d + ", appId=" + this.f84328e + ", isGame=" + this.f84329f + ", forceLightMode=" + this.f84330g + ", pkgWrappingInfo=" + this.f84331h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f84327d);
        out.writeString(this.f84328e);
        out.writeInt(this.f84329f ? 1 : 0);
        out.writeInt(this.f84330g ? 1 : 0);
        out.writeParcelable(this.f84331h, i17);
    }
}
