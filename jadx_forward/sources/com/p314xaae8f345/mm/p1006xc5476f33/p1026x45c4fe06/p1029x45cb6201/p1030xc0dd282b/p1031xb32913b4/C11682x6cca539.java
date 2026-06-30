package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgDownloaderExportServiceIPC$DownloadPkgResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgResult */
/* loaded from: classes5.dex */
public final /* data */ class C11682x6cca539 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.C11682x6cca539> f33480x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.r();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f157295d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.ContentValues f157296e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f157297f;

    /* renamed from: g, reason: collision with root package name */
    public final int f157298g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f157299h;

    public C11682x6cca539(boolean z17, android.content.ContentValues contentValues, java.lang.String str, int i17, java.lang.String str2) {
        this.f157295d = z17;
        this.f157296e = contentValues;
        this.f157297f = str;
        this.f157298g = i17;
        this.f157299h = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m49429xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.C11682x6cca539)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.C11682x6cca539 c11682x6cca539 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.C11682x6cca539) obj;
        return this.f157295d == c11682x6cca539.f157295d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157296e, c11682x6cca539.f157296e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157297f, c11682x6cca539.f157297f) && this.f157298g == c11682x6cca539.f157298g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157299h, c11682x6cca539.f157299h);
    }

    /* renamed from: hashCode */
    public int m49430x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f157295d) * 31;
        android.content.ContentValues contentValues = this.f157296e;
        int hashCode2 = (hashCode + (contentValues == null ? 0 : contentValues.hashCode())) * 31;
        java.lang.String str = this.f157297f;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f157298g)) * 31;
        java.lang.String str2 = this.f157299h;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m49431x9616526c() {
        return "DownloadPkgResult(isSuccess=" + this.f157295d + ", recordContentValues=" + this.f157296e + ", filePath=" + this.f157297f + ", errCode=" + this.f157298g + ", errMsg=" + this.f157299h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f157295d ? 1 : 0);
        out.writeParcelable(this.f157296e, i17);
        out.writeString(this.f157297f);
        out.writeInt(this.f157298g);
        out.writeString(this.f157299h);
    }

    public /* synthetic */ C11682x6cca539(boolean z17, android.content.ContentValues contentValues, java.lang.String str, int i17, java.lang.String str2, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(z17, (i18 & 2) != 0 ? null : contentValues, (i18 & 4) != 0 ? null : str, (i18 & 8) != 0 ? -1 : i17, (i18 & 16) != 0 ? null : str2);
    }
}
