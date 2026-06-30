package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/webview/EmojiFetcher$EmojiArgs", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webview.EmojiFetcher$EmojiArgs */
/* loaded from: classes7.dex */
public final /* data */ class C12290x66551320 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.C12290x66551320> f34978x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.d();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f165398d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f165399e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f165400f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f165401g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f165402h;

    public C12290x66551320(java.lang.String md52, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        this.f165398d = md52;
        this.f165399e = str;
        this.f165400f = str2;
        this.f165401g = str3;
        this.f165402h = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51508xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.C12290x66551320)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.C12290x66551320 c12290x66551320 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.C12290x66551320) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165398d, c12290x66551320.f165398d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165399e, c12290x66551320.f165399e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165400f, c12290x66551320.f165400f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165401g, c12290x66551320.f165401g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165402h, c12290x66551320.f165402h);
    }

    /* renamed from: hashCode */
    public int m51509x8cdac1b() {
        int hashCode = this.f165398d.hashCode() * 31;
        java.lang.String str = this.f165399e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f165400f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f165401g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f165402h;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m51510x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("EmojiArgs(md5='");
        sb6.append(this.f165398d);
        sb6.append("', encryptUrl=");
        java.lang.String str = this.f165399e;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(", aesKey=");
        java.lang.String str2 = this.f165400f;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(", productId=");
        java.lang.String str3 = this.f165401g;
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        sb6.append(", designerId=");
        java.lang.String str4 = this.f165402h;
        sb6.append(str4 != null ? str4 : "");
        sb6.append(')');
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f165398d);
        out.writeString(this.f165399e);
        out.writeString(this.f165400f);
        out.writeString(this.f165401g);
        out.writeString(this.f165402h);
    }
}
