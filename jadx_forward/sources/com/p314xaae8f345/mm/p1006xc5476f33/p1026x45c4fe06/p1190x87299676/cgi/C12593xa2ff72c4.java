package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.cgi;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/shortlink/cgi/WxaShortLinkInfo;", "Landroid/os/Parcelable;", "data-model_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo */
/* loaded from: classes8.dex */
public final /* data */ class C12593xa2ff72c4 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.cgi.C12593xa2ff72c4> f35193x681a0c0c = new lj1.d();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f170407d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f170408e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f170409f;

    /* renamed from: g, reason: collision with root package name */
    public final int f170410g;

    /* renamed from: h, reason: collision with root package name */
    public final int f170411h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f170412i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f170413m;

    public C12593xa2ff72c4(java.lang.String appId, java.lang.String pageTitle, java.lang.String path, int i17, int i18, java.lang.String nickName, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageTitle, "pageTitle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f170407d = appId;
        this.f170408e = pageTitle;
        this.f170409f = path;
        this.f170410g = i17;
        this.f170411h = i18;
        this.f170412i = nickName;
        this.f170413m = userName;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m52713xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.cgi.C12593xa2ff72c4)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.cgi.C12593xa2ff72c4 c12593xa2ff72c4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.cgi.C12593xa2ff72c4) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170407d, c12593xa2ff72c4.f170407d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170408e, c12593xa2ff72c4.f170408e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170409f, c12593xa2ff72c4.f170409f) && this.f170410g == c12593xa2ff72c4.f170410g && this.f170411h == c12593xa2ff72c4.f170411h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170412i, c12593xa2ff72c4.f170412i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170413m, c12593xa2ff72c4.f170413m);
    }

    /* renamed from: hashCode */
    public int m52714x8cdac1b() {
        return (((((((((((this.f170407d.hashCode() * 31) + this.f170408e.hashCode()) * 31) + this.f170409f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f170410g)) * 31) + java.lang.Integer.hashCode(this.f170411h)) * 31) + this.f170412i.hashCode()) * 31) + this.f170413m.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m52715x9616526c() {
        return "WxaShortLinkInfo(appId='" + this.f170407d + "', pageTitle='" + this.f170408e + "', path='" + this.f170409f + "', version=" + this.f170410g + ", versionType=" + this.f170411h + ", nickName='" + this.f170412i + "', userName=" + this.f170413m + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f170407d);
        out.writeString(this.f170408e);
        out.writeString(this.f170409f);
        out.writeInt(this.f170410g);
        out.writeInt(this.f170411h);
        out.writeString(this.f170412i);
        out.writeString(this.f170413m);
    }
}
