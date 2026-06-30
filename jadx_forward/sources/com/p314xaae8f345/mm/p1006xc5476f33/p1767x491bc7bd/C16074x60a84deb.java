package com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/gamesharecard/GameShareCardInfo;", "Landroid/os/Parcelable;", "plugin-gamesharecard.api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gamesharecard.GameShareCardInfo */
/* loaded from: classes9.dex */
public final /* data */ class C16074x60a84deb implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16074x60a84deb> f36993x681a0c0c = new l63.e();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16075xd72ab138 f223641d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f223642e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f223643f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f223644g;

    /* renamed from: h, reason: collision with root package name */
    public final int f223645h;

    /* renamed from: i, reason: collision with root package name */
    public final int f223646i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f223647m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f223648n;

    public C16074x60a84deb(com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16075xd72ab138 liteAppInfo, java.lang.String gameShareId, java.lang.String gameShareData, java.lang.String title, int i17, int i18, java.lang.String str, java.lang.String desc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppInfo, "liteAppInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gameShareId, "gameShareId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gameShareData, "gameShareData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        this.f223641d = liteAppInfo;
        this.f223642e = gameShareId;
        this.f223643f = gameShareData;
        this.f223644g = title;
        this.f223645h = i17;
        this.f223646i = i18;
        this.f223647m = str;
        this.f223648n = desc;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m64920xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16074x60a84deb)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16074x60a84deb c16074x60a84deb = (com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16074x60a84deb) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223641d, c16074x60a84deb.f223641d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223642e, c16074x60a84deb.f223642e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223643f, c16074x60a84deb.f223643f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223644g, c16074x60a84deb.f223644g) && this.f223645h == c16074x60a84deb.f223645h && this.f223646i == c16074x60a84deb.f223646i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223647m, c16074x60a84deb.f223647m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223648n, c16074x60a84deb.f223648n);
    }

    /* renamed from: hashCode */
    public int m64921x8cdac1b() {
        int m64925x8cdac1b = ((((((((((this.f223641d.m64925x8cdac1b() * 31) + this.f223642e.hashCode()) * 31) + this.f223643f.hashCode()) * 31) + this.f223644g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f223645h)) * 31) + java.lang.Integer.hashCode(this.f223646i)) * 31;
        java.lang.String str = this.f223647m;
        return ((m64925x8cdac1b + (str == null ? 0 : str.hashCode())) * 31) + this.f223648n.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m64922x9616526c() {
        return "GameShareCardInfo(liteAppInfo=" + this.f223641d + ", gameShareId=" + this.f223642e + ", gameShareData=" + this.f223643f + ", title=" + this.f223644g + ", isVideo=" + this.f223645h + ", duration=" + this.f223646i + ", srcId=" + this.f223647m + ", desc=" + this.f223648n + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeParcelable(this.f223641d, i17);
        out.writeString(this.f223642e);
        out.writeString(this.f223643f);
        out.writeString(this.f223644g);
        out.writeInt(this.f223645h);
        out.writeInt(this.f223646i);
        out.writeString(this.f223647m);
        out.writeString(this.f223648n);
    }
}
