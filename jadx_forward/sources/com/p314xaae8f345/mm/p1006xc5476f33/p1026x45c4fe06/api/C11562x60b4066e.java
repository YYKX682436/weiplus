package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/api/WeAppExportColdLaunchInfoBundle;", "Landroid/os/Parcelable;", "api-protocol.api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.api.WeAppExportColdLaunchInfoBundle */
/* loaded from: classes7.dex */
public final /* data */ class C11562x60b4066e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11562x60b4066e> f33404x681a0c0c = new l81.w0();

    /* renamed from: d, reason: collision with root package name */
    public long f156492d;

    /* renamed from: e, reason: collision with root package name */
    public long f156493e;

    /* renamed from: f, reason: collision with root package name */
    public long f156494f;

    /* renamed from: g, reason: collision with root package name */
    public long f156495g;

    /* renamed from: h, reason: collision with root package name */
    public long f156496h;

    /* renamed from: i, reason: collision with root package name */
    public long f156497i;

    /* renamed from: m, reason: collision with root package name */
    public long f156498m;

    /* renamed from: n, reason: collision with root package name */
    public long f156499n;

    /* renamed from: o, reason: collision with root package name */
    public long f156500o;

    /* renamed from: p, reason: collision with root package name */
    public long f156501p;

    /* renamed from: q, reason: collision with root package name */
    public long f156502q;

    /* renamed from: r, reason: collision with root package name */
    public long f156503r;

    /* renamed from: s, reason: collision with root package name */
    public long f156504s;

    /* renamed from: t, reason: collision with root package name */
    public long f156505t;

    /* renamed from: u, reason: collision with root package name */
    public long f156506u;

    public C11562x60b4066e(long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, long j39, long j47, long j48, long j49, long j57, long j58, long j59) {
        this.f156492d = j17;
        this.f156493e = j18;
        this.f156494f = j19;
        this.f156495g = j27;
        this.f156496h = j28;
        this.f156497i = j29;
        this.f156498m = j37;
        this.f156499n = j38;
        this.f156500o = j39;
        this.f156501p = j47;
        this.f156502q = j48;
        this.f156503r = j49;
        this.f156504s = j57;
        this.f156505t = j58;
        this.f156506u = j59;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m48851xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11562x60b4066e)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11562x60b4066e c11562x60b4066e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11562x60b4066e) obj;
        return this.f156492d == c11562x60b4066e.f156492d && this.f156493e == c11562x60b4066e.f156493e && this.f156494f == c11562x60b4066e.f156494f && this.f156495g == c11562x60b4066e.f156495g && this.f156496h == c11562x60b4066e.f156496h && this.f156497i == c11562x60b4066e.f156497i && this.f156498m == c11562x60b4066e.f156498m && this.f156499n == c11562x60b4066e.f156499n && this.f156500o == c11562x60b4066e.f156500o && this.f156501p == c11562x60b4066e.f156501p && this.f156502q == c11562x60b4066e.f156502q && this.f156503r == c11562x60b4066e.f156503r && this.f156504s == c11562x60b4066e.f156504s && this.f156505t == c11562x60b4066e.f156505t && this.f156506u == c11562x60b4066e.f156506u;
    }

    /* renamed from: hashCode */
    public int m48852x8cdac1b() {
        return (((((((((((((((((((((((((((java.lang.Long.hashCode(this.f156492d) * 31) + java.lang.Long.hashCode(this.f156493e)) * 31) + java.lang.Long.hashCode(this.f156494f)) * 31) + java.lang.Long.hashCode(this.f156495g)) * 31) + java.lang.Long.hashCode(this.f156496h)) * 31) + java.lang.Long.hashCode(this.f156497i)) * 31) + java.lang.Long.hashCode(this.f156498m)) * 31) + java.lang.Long.hashCode(this.f156499n)) * 31) + java.lang.Long.hashCode(this.f156500o)) * 31) + java.lang.Long.hashCode(this.f156501p)) * 31) + java.lang.Long.hashCode(this.f156502q)) * 31) + java.lang.Long.hashCode(this.f156503r)) * 31) + java.lang.Long.hashCode(this.f156504s)) * 31) + java.lang.Long.hashCode(this.f156505t)) * 31) + java.lang.Long.hashCode(this.f156506u);
    }

    /* renamed from: toString */
    public java.lang.String m48853x9616526c() {
        return "WeAppExportColdLaunchInfoBundle(totalStartTimestampMs=" + this.f156492d + ", totalEndTimestampMs=" + this.f156493e + ", getContactStartTimestampMs=" + this.f156494f + ", getContactEndTimestampMs=" + this.f156495g + ", resourcePrepareStartTimestampMs=" + this.f156496h + ", resourcePrepareEndTimestampMs=" + this.f156497i + ", launchStartTimestampMs=" + this.f156498m + ", launchEndTimestampMs=" + this.f156499n + ", packagePrepareStartTimestampMs=" + this.f156500o + ", packagePrepareEndTimestampMs=" + this.f156501p + ", checkJsApiPermissionStartTimestampMs=" + this.f156502q + ", checkJsApiPermissionEndTimestampMs=" + this.f156503r + ", checkAppidABTestPermissionStartTimestampMs=" + this.f156504s + ", checkAppidABTestPermissionEndTimestampMs=" + this.f156505t + ", entryPageNavigationStartTimestampMs=" + this.f156506u + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeLong(this.f156492d);
        out.writeLong(this.f156493e);
        out.writeLong(this.f156494f);
        out.writeLong(this.f156495g);
        out.writeLong(this.f156496h);
        out.writeLong(this.f156497i);
        out.writeLong(this.f156498m);
        out.writeLong(this.f156499n);
        out.writeLong(this.f156500o);
        out.writeLong(this.f156501p);
        out.writeLong(this.f156502q);
        out.writeLong(this.f156503r);
        out.writeLong(this.f156504s);
        out.writeLong(this.f156505t);
        out.writeLong(this.f156506u);
    }
}
