package com.tencent.mm.plugin.appbrand.appstorage;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/appstorage/AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final /* data */ class AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams> CREATOR = new com.tencent.mm.plugin.appbrand.appstorage.h0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f76116d;

    /* renamed from: e, reason: collision with root package name */
    public final long f76117e;

    /* renamed from: f, reason: collision with root package name */
    public final long f76118f;

    /* renamed from: g, reason: collision with root package name */
    public final long f76119g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f76120h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f76121i;

    /* renamed from: m, reason: collision with root package name */
    public final long f76122m;

    /* renamed from: n, reason: collision with root package name */
    public final int f76123n;

    /* renamed from: o, reason: collision with root package name */
    public final long f76124o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f76125p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f76126q;

    public AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams(java.lang.String appId, long j17, long j18, long j19, java.util.HashMap storageKey2Path, boolean z17, long j27, int i17, long j28, boolean z18, java.util.Map supportRuntimeSpaceStaticsMap) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(storageKey2Path, "storageKey2Path");
        kotlin.jvm.internal.o.g(supportRuntimeSpaceStaticsMap, "supportRuntimeSpaceStaticsMap");
        this.f76116d = appId;
        this.f76117e = j17;
        this.f76118f = j18;
        this.f76119g = j19;
        this.f76120h = storageKey2Path;
        this.f76121i = z17;
        this.f76122m = j27;
        this.f76123n = i17;
        this.f76124o = j28;
        this.f76125p = z18;
        this.f76126q = supportRuntimeSpaceStaticsMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams appBrandStorageQuotaManager$CleanupTempFilesOnExitParams = (com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams) obj;
        return kotlin.jvm.internal.o.b(this.f76116d, appBrandStorageQuotaManager$CleanupTempFilesOnExitParams.f76116d) && this.f76117e == appBrandStorageQuotaManager$CleanupTempFilesOnExitParams.f76117e && this.f76118f == appBrandStorageQuotaManager$CleanupTempFilesOnExitParams.f76118f && this.f76119g == appBrandStorageQuotaManager$CleanupTempFilesOnExitParams.f76119g && kotlin.jvm.internal.o.b(this.f76120h, appBrandStorageQuotaManager$CleanupTempFilesOnExitParams.f76120h) && this.f76121i == appBrandStorageQuotaManager$CleanupTempFilesOnExitParams.f76121i && this.f76122m == appBrandStorageQuotaManager$CleanupTempFilesOnExitParams.f76122m && this.f76123n == appBrandStorageQuotaManager$CleanupTempFilesOnExitParams.f76123n && this.f76124o == appBrandStorageQuotaManager$CleanupTempFilesOnExitParams.f76124o && this.f76125p == appBrandStorageQuotaManager$CleanupTempFilesOnExitParams.f76125p && kotlin.jvm.internal.o.b(this.f76126q, appBrandStorageQuotaManager$CleanupTempFilesOnExitParams.f76126q);
    }

    public int hashCode() {
        return (((((((((((((((((((this.f76116d.hashCode() * 31) + java.lang.Long.hashCode(this.f76117e)) * 31) + java.lang.Long.hashCode(this.f76118f)) * 31) + java.lang.Long.hashCode(this.f76119g)) * 31) + this.f76120h.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f76121i)) * 31) + java.lang.Long.hashCode(this.f76122m)) * 31) + java.lang.Integer.hashCode(this.f76123n)) * 31) + java.lang.Long.hashCode(this.f76124o)) * 31) + java.lang.Boolean.hashCode(this.f76125p)) * 31) + this.f76126q.hashCode();
    }

    public java.lang.String toString() {
        return "CleanupTempFilesOnExitParams(appId=" + this.f76116d + ", minTempSize=" + this.f76117e + ", maxTempSize=" + this.f76118f + ", maxTotalTempSize=" + this.f76119g + ", storageKey2Path=" + this.f76120h + ", report=" + this.f76121i + ", appVersion=" + this.f76122m + ", appState=" + this.f76123n + ", appType=" + this.f76124o + ", storageSpaceStatisticsEnable=" + this.f76125p + ", supportRuntimeSpaceStaticsMap=" + this.f76126q + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f76116d);
        out.writeLong(this.f76117e);
        out.writeLong(this.f76118f);
        out.writeLong(this.f76119g);
        java.util.HashMap hashMap = this.f76120h;
        out.writeInt(hashMap.size());
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            out.writeString((java.lang.String) entry.getKey());
            out.writeString((java.lang.String) entry.getValue());
        }
        out.writeInt(this.f76121i ? 1 : 0);
        out.writeLong(this.f76122m);
        out.writeInt(this.f76123n);
        out.writeLong(this.f76124o);
        out.writeInt(this.f76125p ? 1 : 0);
        java.util.Map map = this.f76126q;
        out.writeInt(map.size());
        for (java.util.Map.Entry entry2 : map.entrySet()) {
            out.writeString((java.lang.String) entry2.getKey());
            out.writeStringList((java.util.List) entry2.getValue());
        }
    }
}
