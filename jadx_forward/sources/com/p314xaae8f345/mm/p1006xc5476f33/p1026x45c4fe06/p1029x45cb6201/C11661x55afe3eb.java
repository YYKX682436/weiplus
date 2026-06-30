package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/WxaCommonLibRecord;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord */
/* loaded from: classes5.dex */
public final /* data */ class C11661x55afe3eb implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb> f33462x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j8();

    /* renamed from: d, reason: collision with root package name */
    public final int f156910d;

    /* renamed from: e, reason: collision with root package name */
    public final int f156911e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f156912f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f156913g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f156914h;

    /* renamed from: i, reason: collision with root package name */
    public final long f156915i;

    /* renamed from: m, reason: collision with root package name */
    public final long f156916m;

    /* renamed from: n, reason: collision with root package name */
    public final long f156917n;

    /* renamed from: o, reason: collision with root package name */
    public final long f156918o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f156919p;

    public C11661x55afe3eb(int i17, int i18, java.lang.String str, java.lang.String downloadUrl, java.lang.String str2, long j17, long j18, long j19, long j27, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadUrl, "downloadUrl");
        this.f156910d = i17;
        this.f156911e = i18;
        this.f156912f = str;
        this.f156913g = downloadUrl;
        this.f156914h = str2;
        this.f156915i = j17;
        this.f156916m = j18;
        this.f156917n = j19;
        this.f156918o = j27;
        this.f156919p = list;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb c11661x55afe3eb, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, long j18, long j19, long j27, java.util.List list, int i19, java.lang.Object obj) {
        int i27 = (i19 & 1) != 0 ? c11661x55afe3eb.f156910d : i17;
        int i28 = (i19 & 2) != 0 ? c11661x55afe3eb.f156911e : i18;
        java.lang.String str4 = (i19 & 4) != 0 ? c11661x55afe3eb.f156912f : str;
        java.lang.String downloadUrl = (i19 & 8) != 0 ? c11661x55afe3eb.f156913g : str2;
        java.lang.String str5 = (i19 & 16) != 0 ? c11661x55afe3eb.f156914h : str3;
        long j28 = (i19 & 32) != 0 ? c11661x55afe3eb.f156915i : j17;
        long j29 = (i19 & 64) != 0 ? c11661x55afe3eb.f156916m : j18;
        long j37 = (i19 & 128) != 0 ? c11661x55afe3eb.f156917n : j19;
        long j38 = (i19 & 256) != 0 ? c11661x55afe3eb.f156918o : j27;
        java.util.List list2 = (i19 & 512) != 0 ? c11661x55afe3eb.f156919p : list;
        c11661x55afe3eb.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadUrl, "downloadUrl");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb(i27, i28, str4, downloadUrl, str5, j28, j29, j37, j38, list2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m49211xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb c11661x55afe3eb = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) obj;
        return this.f156910d == c11661x55afe3eb.f156910d && this.f156911e == c11661x55afe3eb.f156911e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156912f, c11661x55afe3eb.f156912f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156913g, c11661x55afe3eb.f156913g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156914h, c11661x55afe3eb.f156914h) && this.f156915i == c11661x55afe3eb.f156915i && this.f156916m == c11661x55afe3eb.f156916m && this.f156917n == c11661x55afe3eb.f156917n && this.f156918o == c11661x55afe3eb.f156918o && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156919p, c11661x55afe3eb.f156919p);
    }

    /* renamed from: hashCode */
    public int m49212x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f156910d) * 31) + java.lang.Integer.hashCode(this.f156911e)) * 31;
        java.lang.String str = this.f156912f;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f156913g.hashCode()) * 31;
        java.lang.String str2 = this.f156914h;
        int hashCode3 = (((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Long.hashCode(this.f156915i)) * 31) + java.lang.Long.hashCode(this.f156916m)) * 31) + java.lang.Long.hashCode(this.f156917n)) * 31) + java.lang.Long.hashCode(this.f156918o)) * 31;
        java.util.List list = this.f156919p;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m49213x9616526c() {
        return "WxaCommonLibRecord(version=" + this.f156910d + ", versionType=" + this.f156911e + ", filePath=" + this.f156912f + ", downloadUrl=" + this.f156913g + ", md5=" + this.f156914h + ", checksum=" + this.f156915i + ", createTime=" + this.f156916m + ", startTime=" + this.f156917n + ", endTime=" + this.f156918o + ", uinList=" + this.f156919p + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f156910d);
        out.writeInt(this.f156911e);
        out.writeString(this.f156912f);
        out.writeString(this.f156913g);
        out.writeString(this.f156914h);
        out.writeLong(this.f156915i);
        out.writeLong(this.f156916m);
        out.writeLong(this.f156917n);
        out.writeLong(this.f156918o);
        java.util.List list = this.f156919p;
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
