package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/JsApiAddFileToFavorites$DoFavoriteParams", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddFileToFavorites$DoFavoriteParams */
/* loaded from: classes7.dex */
final /* data */ class C11912xd50a0c01 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11912xd50a0c01> f33647x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c2();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f160021d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f160022e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f160023f;

    public C11912xd50a0c01(java.lang.String filePath, java.lang.String str, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        this.f160021d = filePath;
        this.f160022e = str;
        this.f160023f = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50445xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11912xd50a0c01)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11912xd50a0c01 c11912xd50a0c01 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11912xd50a0c01) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f160021d, c11912xd50a0c01.f160021d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f160022e, c11912xd50a0c01.f160022e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f160023f, c11912xd50a0c01.f160023f);
    }

    /* renamed from: hashCode */
    public int m50446x8cdac1b() {
        int hashCode = this.f160021d.hashCode() * 31;
        java.lang.String str = this.f160022e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f160023f;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m50447x9616526c() {
        return "DoFavoriteParams(filePath=" + this.f160021d + ", fileExt=" + this.f160022e + ", fileName=" + this.f160023f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f160021d);
        out.writeString(this.f160022e);
        out.writeString(this.f160023f);
    }
}
