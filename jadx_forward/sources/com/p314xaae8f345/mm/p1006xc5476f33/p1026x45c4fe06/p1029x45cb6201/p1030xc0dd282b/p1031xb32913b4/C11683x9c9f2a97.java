package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs */
/* loaded from: classes7.dex */
public final /* data */ class C11683x9c9f2a97 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.C11683x9c9f2a97> f33481x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.s();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f157300d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f157301e;

    /* renamed from: f, reason: collision with root package name */
    public final int f157302f;

    public C11683x9c9f2a97(java.lang.String username, java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f157300d = username;
        this.f157301e = appId;
        this.f157302f = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m49433xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.C11683x9c9f2a97)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.C11683x9c9f2a97 c11683x9c9f2a97 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.C11683x9c9f2a97) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157300d, c11683x9c9f2a97.f157300d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157301e, c11683x9c9f2a97.f157301e) && this.f157302f == c11683x9c9f2a97.f157302f;
    }

    /* renamed from: hashCode */
    public int m49434x8cdac1b() {
        return (((this.f157300d.hashCode() * 31) + this.f157301e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f157302f);
    }

    /* renamed from: toString */
    public java.lang.String m49435x9616526c() {
        return "RegisterPkgSpecs(username=" + this.f157300d + ", appId=" + this.f157301e + ", scene=" + this.f157302f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f157300d);
        out.writeString(this.f157301e);
        out.writeInt(this.f157302f);
    }
}
