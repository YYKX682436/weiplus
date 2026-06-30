package com.tencent.mm.plugin.appbrand.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/api/WeAppExportWarmLaunchInfoBundle;", "Landroid/os/Parcelable;", "api-protocol.api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class WeAppExportWarmLaunchInfoBundle implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.api.WeAppExportWarmLaunchInfoBundle> CREATOR = new l81.z0();

    /* renamed from: d, reason: collision with root package name */
    public final long f74982d;

    /* renamed from: e, reason: collision with root package name */
    public long f74983e;

    /* renamed from: f, reason: collision with root package name */
    public l81.a1 f74984f;

    /* renamed from: g, reason: collision with root package name */
    public long f74985g;

    public WeAppExportWarmLaunchInfoBundle(long j17, long j18, l81.a1 entryPageNavigationType, long j19) {
        kotlin.jvm.internal.o.g(entryPageNavigationType, "entryPageNavigationType");
        this.f74982d = j17;
        this.f74983e = j18;
        this.f74984f = entryPageNavigationType;
        this.f74985g = j19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.api.WeAppExportWarmLaunchInfoBundle)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.api.WeAppExportWarmLaunchInfoBundle weAppExportWarmLaunchInfoBundle = (com.tencent.mm.plugin.appbrand.api.WeAppExportWarmLaunchInfoBundle) obj;
        return this.f74982d == weAppExportWarmLaunchInfoBundle.f74982d && this.f74983e == weAppExportWarmLaunchInfoBundle.f74983e && this.f74984f == weAppExportWarmLaunchInfoBundle.f74984f && this.f74985g == weAppExportWarmLaunchInfoBundle.f74985g;
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.f74982d) * 31) + java.lang.Long.hashCode(this.f74983e)) * 31) + this.f74984f.hashCode()) * 31) + java.lang.Long.hashCode(this.f74985g);
    }

    public java.lang.String toString() {
        return "WeAppExportWarmLaunchInfoBundle(totalStartTimestampMs=" + this.f74982d + ", totalEndTimestampMs=" + this.f74983e + ", entryPageNavigationType=" + this.f74984f + ", entryPageNavigationStartTimestampMs=" + this.f74985g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeLong(this.f74982d);
        out.writeLong(this.f74983e);
        l81.a1 a1Var = this.f74984f;
        kotlin.jvm.internal.o.g(a1Var, "<this>");
        out.writeInt(a1Var.ordinal());
        out.writeLong(this.f74985g);
    }
}
