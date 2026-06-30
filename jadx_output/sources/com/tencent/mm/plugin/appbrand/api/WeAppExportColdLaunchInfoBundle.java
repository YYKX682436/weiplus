package com.tencent.mm.plugin.appbrand.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/api/WeAppExportColdLaunchInfoBundle;", "Landroid/os/Parcelable;", "api-protocol.api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class WeAppExportColdLaunchInfoBundle implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.api.WeAppExportColdLaunchInfoBundle> CREATOR = new l81.w0();

    /* renamed from: d, reason: collision with root package name */
    public long f74959d;

    /* renamed from: e, reason: collision with root package name */
    public long f74960e;

    /* renamed from: f, reason: collision with root package name */
    public long f74961f;

    /* renamed from: g, reason: collision with root package name */
    public long f74962g;

    /* renamed from: h, reason: collision with root package name */
    public long f74963h;

    /* renamed from: i, reason: collision with root package name */
    public long f74964i;

    /* renamed from: m, reason: collision with root package name */
    public long f74965m;

    /* renamed from: n, reason: collision with root package name */
    public long f74966n;

    /* renamed from: o, reason: collision with root package name */
    public long f74967o;

    /* renamed from: p, reason: collision with root package name */
    public long f74968p;

    /* renamed from: q, reason: collision with root package name */
    public long f74969q;

    /* renamed from: r, reason: collision with root package name */
    public long f74970r;

    /* renamed from: s, reason: collision with root package name */
    public long f74971s;

    /* renamed from: t, reason: collision with root package name */
    public long f74972t;

    /* renamed from: u, reason: collision with root package name */
    public long f74973u;

    public WeAppExportColdLaunchInfoBundle(long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, long j39, long j47, long j48, long j49, long j57, long j58, long j59) {
        this.f74959d = j17;
        this.f74960e = j18;
        this.f74961f = j19;
        this.f74962g = j27;
        this.f74963h = j28;
        this.f74964i = j29;
        this.f74965m = j37;
        this.f74966n = j38;
        this.f74967o = j39;
        this.f74968p = j47;
        this.f74969q = j48;
        this.f74970r = j49;
        this.f74971s = j57;
        this.f74972t = j58;
        this.f74973u = j59;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.api.WeAppExportColdLaunchInfoBundle)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.api.WeAppExportColdLaunchInfoBundle weAppExportColdLaunchInfoBundle = (com.tencent.mm.plugin.appbrand.api.WeAppExportColdLaunchInfoBundle) obj;
        return this.f74959d == weAppExportColdLaunchInfoBundle.f74959d && this.f74960e == weAppExportColdLaunchInfoBundle.f74960e && this.f74961f == weAppExportColdLaunchInfoBundle.f74961f && this.f74962g == weAppExportColdLaunchInfoBundle.f74962g && this.f74963h == weAppExportColdLaunchInfoBundle.f74963h && this.f74964i == weAppExportColdLaunchInfoBundle.f74964i && this.f74965m == weAppExportColdLaunchInfoBundle.f74965m && this.f74966n == weAppExportColdLaunchInfoBundle.f74966n && this.f74967o == weAppExportColdLaunchInfoBundle.f74967o && this.f74968p == weAppExportColdLaunchInfoBundle.f74968p && this.f74969q == weAppExportColdLaunchInfoBundle.f74969q && this.f74970r == weAppExportColdLaunchInfoBundle.f74970r && this.f74971s == weAppExportColdLaunchInfoBundle.f74971s && this.f74972t == weAppExportColdLaunchInfoBundle.f74972t && this.f74973u == weAppExportColdLaunchInfoBundle.f74973u;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((java.lang.Long.hashCode(this.f74959d) * 31) + java.lang.Long.hashCode(this.f74960e)) * 31) + java.lang.Long.hashCode(this.f74961f)) * 31) + java.lang.Long.hashCode(this.f74962g)) * 31) + java.lang.Long.hashCode(this.f74963h)) * 31) + java.lang.Long.hashCode(this.f74964i)) * 31) + java.lang.Long.hashCode(this.f74965m)) * 31) + java.lang.Long.hashCode(this.f74966n)) * 31) + java.lang.Long.hashCode(this.f74967o)) * 31) + java.lang.Long.hashCode(this.f74968p)) * 31) + java.lang.Long.hashCode(this.f74969q)) * 31) + java.lang.Long.hashCode(this.f74970r)) * 31) + java.lang.Long.hashCode(this.f74971s)) * 31) + java.lang.Long.hashCode(this.f74972t)) * 31) + java.lang.Long.hashCode(this.f74973u);
    }

    public java.lang.String toString() {
        return "WeAppExportColdLaunchInfoBundle(totalStartTimestampMs=" + this.f74959d + ", totalEndTimestampMs=" + this.f74960e + ", getContactStartTimestampMs=" + this.f74961f + ", getContactEndTimestampMs=" + this.f74962g + ", resourcePrepareStartTimestampMs=" + this.f74963h + ", resourcePrepareEndTimestampMs=" + this.f74964i + ", launchStartTimestampMs=" + this.f74965m + ", launchEndTimestampMs=" + this.f74966n + ", packagePrepareStartTimestampMs=" + this.f74967o + ", packagePrepareEndTimestampMs=" + this.f74968p + ", checkJsApiPermissionStartTimestampMs=" + this.f74969q + ", checkJsApiPermissionEndTimestampMs=" + this.f74970r + ", checkAppidABTestPermissionStartTimestampMs=" + this.f74971s + ", checkAppidABTestPermissionEndTimestampMs=" + this.f74972t + ", entryPageNavigationStartTimestampMs=" + this.f74973u + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeLong(this.f74959d);
        out.writeLong(this.f74960e);
        out.writeLong(this.f74961f);
        out.writeLong(this.f74962g);
        out.writeLong(this.f74963h);
        out.writeLong(this.f74964i);
        out.writeLong(this.f74965m);
        out.writeLong(this.f74966n);
        out.writeLong(this.f74967o);
        out.writeLong(this.f74968p);
        out.writeLong(this.f74969q);
        out.writeLong(this.f74970r);
        out.writeLong(this.f74971s);
        out.writeLong(this.f74972t);
        out.writeLong(this.f74973u);
    }
}
