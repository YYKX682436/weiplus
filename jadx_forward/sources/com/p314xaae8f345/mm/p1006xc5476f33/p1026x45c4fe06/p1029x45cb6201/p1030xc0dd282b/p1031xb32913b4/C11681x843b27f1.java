package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgDownloaderExportServiceIPC$DownloadPkgParam", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgParam */
/* loaded from: classes4.dex */
public final /* data */ class C11681x843b27f1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.C11681x843b27f1> f33479x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.q();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f157293d;

    /* renamed from: e, reason: collision with root package name */
    public final int f157294e;

    public C11681x843b27f1(java.lang.String str, int i17) {
        this.f157293d = str;
        this.f157294e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m49425xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.C11681x843b27f1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.C11681x843b27f1 c11681x843b27f1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.C11681x843b27f1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157293d, c11681x843b27f1.f157293d) && this.f157294e == c11681x843b27f1.f157294e;
    }

    /* renamed from: hashCode */
    public int m49426x8cdac1b() {
        java.lang.String str = this.f157293d;
        return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f157294e);
    }

    /* renamed from: toString */
    public java.lang.String m49427x9616526c() {
        return "DownloadPkgParam(appId=" + this.f157293d + ", versionType=" + this.f157294e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f157293d);
        out.writeInt(this.f157294e);
    }
}
