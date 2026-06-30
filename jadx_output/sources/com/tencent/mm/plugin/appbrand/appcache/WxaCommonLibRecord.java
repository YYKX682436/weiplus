package com.tencent.mm.plugin.appbrand.appcache;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/WxaCommonLibRecord;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class WxaCommonLibRecord implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord> CREATOR = new com.tencent.mm.plugin.appbrand.appcache.j8();

    /* renamed from: d, reason: collision with root package name */
    public final int f75377d;

    /* renamed from: e, reason: collision with root package name */
    public final int f75378e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f75379f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f75380g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f75381h;

    /* renamed from: i, reason: collision with root package name */
    public final long f75382i;

    /* renamed from: m, reason: collision with root package name */
    public final long f75383m;

    /* renamed from: n, reason: collision with root package name */
    public final long f75384n;

    /* renamed from: o, reason: collision with root package name */
    public final long f75385o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f75386p;

    public WxaCommonLibRecord(int i17, int i18, java.lang.String str, java.lang.String downloadUrl, java.lang.String str2, long j17, long j18, long j19, long j27, java.util.List list) {
        kotlin.jvm.internal.o.g(downloadUrl, "downloadUrl");
        this.f75377d = i17;
        this.f75378e = i18;
        this.f75379f = str;
        this.f75380g = downloadUrl;
        this.f75381h = str2;
        this.f75382i = j17;
        this.f75383m = j18;
        this.f75384n = j19;
        this.f75385o = j27;
        this.f75386p = list;
    }

    public static com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord a(com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord wxaCommonLibRecord, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, long j18, long j19, long j27, java.util.List list, int i19, java.lang.Object obj) {
        int i27 = (i19 & 1) != 0 ? wxaCommonLibRecord.f75377d : i17;
        int i28 = (i19 & 2) != 0 ? wxaCommonLibRecord.f75378e : i18;
        java.lang.String str4 = (i19 & 4) != 0 ? wxaCommonLibRecord.f75379f : str;
        java.lang.String downloadUrl = (i19 & 8) != 0 ? wxaCommonLibRecord.f75380g : str2;
        java.lang.String str5 = (i19 & 16) != 0 ? wxaCommonLibRecord.f75381h : str3;
        long j28 = (i19 & 32) != 0 ? wxaCommonLibRecord.f75382i : j17;
        long j29 = (i19 & 64) != 0 ? wxaCommonLibRecord.f75383m : j18;
        long j37 = (i19 & 128) != 0 ? wxaCommonLibRecord.f75384n : j19;
        long j38 = (i19 & 256) != 0 ? wxaCommonLibRecord.f75385o : j27;
        java.util.List list2 = (i19 & 512) != 0 ? wxaCommonLibRecord.f75386p : list;
        wxaCommonLibRecord.getClass();
        kotlin.jvm.internal.o.g(downloadUrl, "downloadUrl");
        return new com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord(i27, i28, str4, downloadUrl, str5, j28, j29, j37, j38, list2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord wxaCommonLibRecord = (com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord) obj;
        return this.f75377d == wxaCommonLibRecord.f75377d && this.f75378e == wxaCommonLibRecord.f75378e && kotlin.jvm.internal.o.b(this.f75379f, wxaCommonLibRecord.f75379f) && kotlin.jvm.internal.o.b(this.f75380g, wxaCommonLibRecord.f75380g) && kotlin.jvm.internal.o.b(this.f75381h, wxaCommonLibRecord.f75381h) && this.f75382i == wxaCommonLibRecord.f75382i && this.f75383m == wxaCommonLibRecord.f75383m && this.f75384n == wxaCommonLibRecord.f75384n && this.f75385o == wxaCommonLibRecord.f75385o && kotlin.jvm.internal.o.b(this.f75386p, wxaCommonLibRecord.f75386p);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f75377d) * 31) + java.lang.Integer.hashCode(this.f75378e)) * 31;
        java.lang.String str = this.f75379f;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f75380g.hashCode()) * 31;
        java.lang.String str2 = this.f75381h;
        int hashCode3 = (((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Long.hashCode(this.f75382i)) * 31) + java.lang.Long.hashCode(this.f75383m)) * 31) + java.lang.Long.hashCode(this.f75384n)) * 31) + java.lang.Long.hashCode(this.f75385o)) * 31;
        java.util.List list = this.f75386p;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "WxaCommonLibRecord(version=" + this.f75377d + ", versionType=" + this.f75378e + ", filePath=" + this.f75379f + ", downloadUrl=" + this.f75380g + ", md5=" + this.f75381h + ", checksum=" + this.f75382i + ", createTime=" + this.f75383m + ", startTime=" + this.f75384n + ", endTime=" + this.f75385o + ", uinList=" + this.f75386p + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f75377d);
        out.writeInt(this.f75378e);
        out.writeString(this.f75379f);
        out.writeString(this.f75380g);
        out.writeString(this.f75381h);
        out.writeLong(this.f75382i);
        out.writeLong(this.f75383m);
        out.writeLong(this.f75384n);
        out.writeLong(this.f75385o);
        java.util.List list = this.f75386p;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeInt(((java.lang.Number) it.next()).intValue());
        }
    }
}
