package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/wxassistant/cdp/ShareAppMessageData;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.wxassistant.cdp.ShareAppMessageData */
/* loaded from: classes7.dex */
public final /* data */ class C12816x4017790f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp.C12816x4017790f> f35337x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp.o3();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f173691d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f173692e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f173693f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f173694g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f173695h;

    /* renamed from: i, reason: collision with root package name */
    public final int f173696i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f173697m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f173698n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12575x278fd8e2 f173699o;

    public C12816x4017790f(java.lang.String title, java.lang.String iconUrl, java.lang.String username, java.lang.String path, java.lang.String appId, int i17, java.lang.String imagePath, java.lang.String targetUserName, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12575x278fd8e2 c12575x278fd8e2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconUrl, "iconUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePath, "imagePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetUserName, "targetUserName");
        this.f173691d = title;
        this.f173692e = iconUrl;
        this.f173693f = username;
        this.f173694g = path;
        this.f173695h = appId;
        this.f173696i = i17;
        this.f173697m = imagePath;
        this.f173698n = targetUserName;
        this.f173699o = c12575x278fd8e2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m53719xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp.C12816x4017790f)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp.C12816x4017790f c12816x4017790f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp.C12816x4017790f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f173691d, c12816x4017790f.f173691d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f173692e, c12816x4017790f.f173692e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f173693f, c12816x4017790f.f173693f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f173694g, c12816x4017790f.f173694g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f173695h, c12816x4017790f.f173695h) && this.f173696i == c12816x4017790f.f173696i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f173697m, c12816x4017790f.f173697m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f173698n, c12816x4017790f.f173698n) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f173699o, c12816x4017790f.f173699o);
    }

    /* renamed from: hashCode */
    public int m53720x8cdac1b() {
        int hashCode = ((((((((((((((this.f173691d.hashCode() * 31) + this.f173692e.hashCode()) * 31) + this.f173693f.hashCode()) * 31) + this.f173694g.hashCode()) * 31) + this.f173695h.hashCode()) * 31) + java.lang.Integer.hashCode(this.f173696i)) * 31) + this.f173697m.hashCode()) * 31) + this.f173698n.hashCode()) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12575x278fd8e2 c12575x278fd8e2 = this.f173699o;
        return hashCode + (c12575x278fd8e2 == null ? 0 : c12575x278fd8e2.m52554x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m53721x9616526c() {
        return "ShareAppMessageData(title=" + this.f173691d + ", iconUrl=" + this.f173692e + ", username=" + this.f173693f + ", path=" + this.f173694g + ", appId=" + this.f173695h + ", versionType=" + this.f173696i + ", imagePath=" + this.f173697m + ", targetUserName=" + this.f173698n + ", params=" + this.f173699o + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f173691d);
        out.writeString(this.f173692e);
        out.writeString(this.f173693f);
        out.writeString(this.f173694g);
        out.writeString(this.f173695h);
        out.writeInt(this.f173696i);
        out.writeString(this.f173697m);
        out.writeString(this.f173698n);
        out.writeParcelable(this.f173699o, i17);
    }
}
