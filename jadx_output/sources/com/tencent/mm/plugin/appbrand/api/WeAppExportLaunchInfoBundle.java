package com.tencent.mm.plugin.appbrand.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/api/WeAppExportLaunchInfoBundle;", "Landroid/os/Parcelable;", "api-protocol.api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class WeAppExportLaunchInfoBundle implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.api.WeAppExportLaunchInfoBundle> CREATOR = new l81.x0();

    /* renamed from: d, reason: collision with root package name */
    public int f74974d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f74975e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f74976f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.api.WeAppExportColdLaunchInfoBundle f74977g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.api.WeAppExportWarmLaunchInfoBundle f74978h;

    /* renamed from: i, reason: collision with root package name */
    public int f74979i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f74980m;

    /* renamed from: n, reason: collision with root package name */
    public l81.y0 f74981n;

    public WeAppExportLaunchInfoBundle(int i17, boolean z17, boolean z18, com.tencent.mm.plugin.appbrand.api.WeAppExportColdLaunchInfoBundle weAppExportColdLaunchInfoBundle, com.tencent.mm.plugin.appbrand.api.WeAppExportWarmLaunchInfoBundle weAppExportWarmLaunchInfoBundle, int i18, java.lang.String customVersion, l81.y0 renderTypeOfStackTopView) {
        kotlin.jvm.internal.o.g(customVersion, "customVersion");
        kotlin.jvm.internal.o.g(renderTypeOfStackTopView, "renderTypeOfStackTopView");
        this.f74974d = i17;
        this.f74975e = z17;
        this.f74976f = z18;
        this.f74977g = weAppExportColdLaunchInfoBundle;
        this.f74978h = weAppExportWarmLaunchInfoBundle;
        this.f74979i = i18;
        this.f74980m = customVersion;
        this.f74981n = renderTypeOfStackTopView;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.api.WeAppExportLaunchInfoBundle)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.api.WeAppExportLaunchInfoBundle weAppExportLaunchInfoBundle = (com.tencent.mm.plugin.appbrand.api.WeAppExportLaunchInfoBundle) obj;
        return this.f74974d == weAppExportLaunchInfoBundle.f74974d && this.f74975e == weAppExportLaunchInfoBundle.f74975e && this.f74976f == weAppExportLaunchInfoBundle.f74976f && kotlin.jvm.internal.o.b(this.f74977g, weAppExportLaunchInfoBundle.f74977g) && kotlin.jvm.internal.o.b(this.f74978h, weAppExportLaunchInfoBundle.f74978h) && this.f74979i == weAppExportLaunchInfoBundle.f74979i && kotlin.jvm.internal.o.b(this.f74980m, weAppExportLaunchInfoBundle.f74980m) && this.f74981n == weAppExportLaunchInfoBundle.f74981n;
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f74974d) * 31) + java.lang.Boolean.hashCode(this.f74975e)) * 31) + java.lang.Boolean.hashCode(this.f74976f)) * 31;
        com.tencent.mm.plugin.appbrand.api.WeAppExportColdLaunchInfoBundle weAppExportColdLaunchInfoBundle = this.f74977g;
        int hashCode2 = (hashCode + (weAppExportColdLaunchInfoBundle == null ? 0 : weAppExportColdLaunchInfoBundle.hashCode())) * 31;
        com.tencent.mm.plugin.appbrand.api.WeAppExportWarmLaunchInfoBundle weAppExportWarmLaunchInfoBundle = this.f74978h;
        return ((((((hashCode2 + (weAppExportWarmLaunchInfoBundle != null ? weAppExportWarmLaunchInfoBundle.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f74979i)) * 31) + this.f74980m.hashCode()) * 31) + this.f74981n.hashCode();
    }

    public java.lang.String toString() {
        return "WeAppExportLaunchInfoBundle(preloadType=" + this.f74974d + ", isPreRender=" + this.f74975e + ", isWarmLaunch=" + this.f74976f + ", coldLaunchInfo=" + this.f74977g + ", warmLaunchInfo=" + this.f74978h + ", appVersion=" + this.f74979i + ", customVersion=" + this.f74980m + ", renderTypeOfStackTopView=" + this.f74981n + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f74974d);
        out.writeInt(this.f74975e ? 1 : 0);
        out.writeInt(this.f74976f ? 1 : 0);
        com.tencent.mm.plugin.appbrand.api.WeAppExportColdLaunchInfoBundle weAppExportColdLaunchInfoBundle = this.f74977g;
        if (weAppExportColdLaunchInfoBundle == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            weAppExportColdLaunchInfoBundle.writeToParcel(out, i17);
        }
        com.tencent.mm.plugin.appbrand.api.WeAppExportWarmLaunchInfoBundle weAppExportWarmLaunchInfoBundle = this.f74978h;
        if (weAppExportWarmLaunchInfoBundle == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            weAppExportWarmLaunchInfoBundle.writeToParcel(out, i17);
        }
        out.writeInt(this.f74979i);
        out.writeString(this.f74980m);
        out.writeString(this.f74981n.name());
    }
}
