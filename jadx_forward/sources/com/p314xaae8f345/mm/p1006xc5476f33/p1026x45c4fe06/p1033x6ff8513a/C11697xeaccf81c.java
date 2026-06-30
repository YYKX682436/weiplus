package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/appstorage/AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams */
/* loaded from: classes5.dex */
final /* data */ class C11697xeaccf81c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11697xeaccf81c> f33485x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f157649d;

    /* renamed from: e, reason: collision with root package name */
    public final long f157650e;

    /* renamed from: f, reason: collision with root package name */
    public final long f157651f;

    /* renamed from: g, reason: collision with root package name */
    public final long f157652g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f157653h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f157654i;

    /* renamed from: m, reason: collision with root package name */
    public final long f157655m;

    /* renamed from: n, reason: collision with root package name */
    public final int f157656n;

    /* renamed from: o, reason: collision with root package name */
    public final long f157657o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f157658p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f157659q;

    public C11697xeaccf81c(java.lang.String appId, long j17, long j18, long j19, java.util.HashMap storageKey2Path, boolean z17, long j27, int i17, long j28, boolean z18, java.util.Map supportRuntimeSpaceStaticsMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageKey2Path, "storageKey2Path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(supportRuntimeSpaceStaticsMap, "supportRuntimeSpaceStaticsMap");
        this.f157649d = appId;
        this.f157650e = j17;
        this.f157651f = j18;
        this.f157652g = j19;
        this.f157653h = storageKey2Path;
        this.f157654i = z17;
        this.f157655m = j27;
        this.f157656n = i17;
        this.f157657o = j28;
        this.f157658p = z18;
        this.f157659q = supportRuntimeSpaceStaticsMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m49600xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11697xeaccf81c)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11697xeaccf81c c11697xeaccf81c = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11697xeaccf81c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157649d, c11697xeaccf81c.f157649d) && this.f157650e == c11697xeaccf81c.f157650e && this.f157651f == c11697xeaccf81c.f157651f && this.f157652g == c11697xeaccf81c.f157652g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157653h, c11697xeaccf81c.f157653h) && this.f157654i == c11697xeaccf81c.f157654i && this.f157655m == c11697xeaccf81c.f157655m && this.f157656n == c11697xeaccf81c.f157656n && this.f157657o == c11697xeaccf81c.f157657o && this.f157658p == c11697xeaccf81c.f157658p && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157659q, c11697xeaccf81c.f157659q);
    }

    /* renamed from: hashCode */
    public int m49601x8cdac1b() {
        return (((((((((((((((((((this.f157649d.hashCode() * 31) + java.lang.Long.hashCode(this.f157650e)) * 31) + java.lang.Long.hashCode(this.f157651f)) * 31) + java.lang.Long.hashCode(this.f157652g)) * 31) + this.f157653h.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f157654i)) * 31) + java.lang.Long.hashCode(this.f157655m)) * 31) + java.lang.Integer.hashCode(this.f157656n)) * 31) + java.lang.Long.hashCode(this.f157657o)) * 31) + java.lang.Boolean.hashCode(this.f157658p)) * 31) + this.f157659q.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m49602x9616526c() {
        return "CleanupTempFilesOnExitParams(appId=" + this.f157649d + ", minTempSize=" + this.f157650e + ", maxTempSize=" + this.f157651f + ", maxTotalTempSize=" + this.f157652g + ", storageKey2Path=" + this.f157653h + ", report=" + this.f157654i + ", appVersion=" + this.f157655m + ", appState=" + this.f157656n + ", appType=" + this.f157657o + ", storageSpaceStatisticsEnable=" + this.f157658p + ", supportRuntimeSpaceStaticsMap=" + this.f157659q + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f157649d);
        out.writeLong(this.f157650e);
        out.writeLong(this.f157651f);
        out.writeLong(this.f157652g);
        java.util.HashMap hashMap = this.f157653h;
        out.writeInt(hashMap.size());
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            out.writeString((java.lang.String) entry.getKey());
            out.writeString((java.lang.String) entry.getValue());
        }
        out.writeInt(this.f157654i ? 1 : 0);
        out.writeLong(this.f157655m);
        out.writeInt(this.f157656n);
        out.writeLong(this.f157657o);
        out.writeInt(this.f157658p ? 1 : 0);
        java.util.Map map = this.f157659q;
        out.writeInt(map.size());
        for (java.util.Map.Entry entry2 : map.entrySet()) {
            out.writeString((java.lang.String) entry2.getKey());
            out.writeStringList((java.util.List) entry2.getValue());
        }
    }
}
