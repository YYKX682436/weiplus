package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgStorageExportServiceIPC$PkgParams", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceIPC$PkgParams */
/* loaded from: classes7.dex */
final /* data */ class C11684x7b6b80f8 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.C11684x7b6b80f8> f33482x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.q0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f157303d;

    /* renamed from: e, reason: collision with root package name */
    public final int f157304e;

    /* renamed from: f, reason: collision with root package name */
    public final int f157305f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f157306g;

    public C11684x7b6b80f8(java.lang.String appId, int i17, int i18, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f157303d = appId;
        this.f157304e = i17;
        this.f157305f = i18;
        this.f157306g = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m49437xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.C11684x7b6b80f8)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.C11684x7b6b80f8 c11684x7b6b80f8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.C11684x7b6b80f8) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157303d, c11684x7b6b80f8.f157303d) && this.f157304e == c11684x7b6b80f8.f157304e && this.f157305f == c11684x7b6b80f8.f157305f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157306g, c11684x7b6b80f8.f157306g);
    }

    /* renamed from: hashCode */
    public int m49438x8cdac1b() {
        int hashCode = ((((this.f157303d.hashCode() * 31) + java.lang.Integer.hashCode(this.f157304e)) * 31) + java.lang.Integer.hashCode(this.f157305f)) * 31;
        java.lang.String str = this.f157306g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m49439x9616526c() {
        return "PkgParams(appId=" + this.f157303d + ", versionType=" + this.f157304e + ", version=" + this.f157305f + ", filePath=" + this.f157306g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f157303d);
        out.writeInt(this.f157304e);
        out.writeInt(this.f157305f);
        out.writeString(this.f157306g);
    }

    public /* synthetic */ C11684x7b6b80f8(java.lang.String str, int i17, int i18, java.lang.String str2, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, (i19 & 2) != 0 ? 0 : i17, (i19 & 4) != 0 ? 0 : i18, (i19 & 8) != 0 ? null : str2);
    }
}
