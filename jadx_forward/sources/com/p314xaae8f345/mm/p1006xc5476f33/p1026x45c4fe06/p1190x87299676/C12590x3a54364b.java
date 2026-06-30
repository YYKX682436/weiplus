package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/shortlink/AbsWxaShortLinkLauncher$WxaShortLinkLaunchParams", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher$WxaShortLinkLaunchParams */
/* loaded from: classes9.dex */
public final /* data */ class C12590x3a54364b implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.C12590x3a54364b> f35188x681a0c0c = new kj1.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f170398d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f170399e;

    /* renamed from: f, reason: collision with root package name */
    public final int f170400f;

    /* renamed from: g, reason: collision with root package name */
    public final int f170401g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f170402h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f170403i;

    public C12590x3a54364b(java.lang.String appId, java.lang.String path, int i17, int i18, java.lang.String shortLink, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shortLink, "shortLink");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f170398d = appId;
        this.f170399e = path;
        this.f170400f = i17;
        this.f170401g = i18;
        this.f170402h = shortLink;
        this.f170403i = userName;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m52703xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.C12590x3a54364b)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.C12590x3a54364b c12590x3a54364b = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.C12590x3a54364b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170398d, c12590x3a54364b.f170398d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170399e, c12590x3a54364b.f170399e) && this.f170400f == c12590x3a54364b.f170400f && this.f170401g == c12590x3a54364b.f170401g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170402h, c12590x3a54364b.f170402h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170403i, c12590x3a54364b.f170403i);
    }

    /* renamed from: hashCode */
    public int m52704x8cdac1b() {
        return (((((((((this.f170398d.hashCode() * 31) + this.f170399e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f170400f)) * 31) + java.lang.Integer.hashCode(this.f170401g)) * 31) + this.f170402h.hashCode()) * 31) + this.f170403i.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m52705x9616526c() {
        return "WxaShortLinkLaunchParams(appId=" + this.f170398d + ", path=" + this.f170399e + ", version=" + this.f170400f + ", versionType=" + this.f170401g + ", shortLink=" + this.f170402h + ", userName=" + this.f170403i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f170398d);
        out.writeString(this.f170399e);
        out.writeInt(this.f170400f);
        out.writeInt(this.f170401g);
        out.writeString(this.f170402h);
        out.writeString(this.f170403i);
    }
}
