package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/appcache/predownload/PreDownloadServiceExportAnyProcess$PreDownloadInvokeParams", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.PreDownloadServiceExportAnyProcess$PreDownloadInvokeParams */
/* loaded from: classes7.dex */
public final /* data */ class C11680xc396d226 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.C11680xc396d226> f33478x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.e0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f157260d;

    /* renamed from: e, reason: collision with root package name */
    public final int f157261e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f157262f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f157263g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f157264h;

    public C11680xc396d226(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f157260d = str;
        this.f157261e = i17;
        this.f157262f = str2;
        this.f157263g = str3;
        this.f157264h = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m49405xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.C11680xc396d226)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.C11680xc396d226 c11680xc396d226 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.C11680xc396d226) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157260d, c11680xc396d226.f157260d) && this.f157261e == c11680xc396d226.f157261e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157262f, c11680xc396d226.f157262f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157263g, c11680xc396d226.f157263g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157264h, c11680xc396d226.f157264h);
    }

    /* renamed from: hashCode */
    public int m49406x8cdac1b() {
        java.lang.String str = this.f157260d;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f157261e)) * 31;
        java.lang.String str2 = this.f157262f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f157263g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f157264h;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m49407x9616526c() {
        return "PreDownloadInvokeParams(username=" + this.f157260d + ", scene=" + this.f157261e + ", appId=" + this.f157262f + ", path=" + this.f157263g + ", preferModuleName=" + this.f157264h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f157260d);
        out.writeInt(this.f157261e);
        out.writeString(this.f157262f);
        out.writeString(this.f157263g);
        out.writeString(this.f157264h);
    }

    public /* synthetic */ C11680xc396d226(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, i17, (i18 & 4) != 0 ? null : str2, (i18 & 8) != 0 ? null : str3, (i18 & 16) != 0 ? null : str4);
    }
}
