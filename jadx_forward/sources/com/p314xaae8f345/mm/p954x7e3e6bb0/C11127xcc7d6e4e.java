package com.p314xaae8f345.mm.p954x7e3e6bb0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/modelmulti/WxaInfo;", "Landroid/os/Parcelable;", "w11/m2", "plugin-messenger-foundation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.modelmulti.WxaInfo */
/* loaded from: classes9.dex */
public final /* data */ class C11127xcc7d6e4e implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f152794d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f152795e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f152796f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f152797g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f152798h;

    /* renamed from: i, reason: collision with root package name */
    public final int f152799i;

    /* renamed from: m, reason: collision with root package name */
    public final int f152800m;

    /* renamed from: n, reason: collision with root package name */
    public static final w11.m2 f152793n = new w11.m2(null);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e> f32566x681a0c0c = new w11.n2();

    public C11127xcc7d6e4e(java.lang.String appId, java.lang.String nickname, java.lang.String iconUrl, java.lang.String str, java.lang.String str2, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconUrl, "iconUrl");
        this.f152794d = appId;
        this.f152795e = nickname;
        this.f152796f = iconUrl;
        this.f152797g = str;
        this.f152798h = str2;
        this.f152799i = i17;
        this.f152800m = i18;
    }

    public final java.lang.String a() {
        java.lang.String str = this.f152798h;
        java.util.List f07 = str != null ? r26.n0.f0(str, new java.lang.String[]{":"}, false, 0, 6, null) : null;
        return (f07 == null || f07.size() < 3) ? "" : (java.lang.String) f07.get(2);
    }

    public final java.lang.String b() {
        java.lang.String str = this.f152798h;
        java.util.List f07 = str != null ? r26.n0.f0(str, new java.lang.String[]{":"}, false, 0, 6, null) : null;
        return (f07 == null || f07.size() < 2) ? "" : (java.lang.String) f07.get(1);
    }

    public final p15.x c() {
        p15.x xVar = new p15.x();
        xVar.p(this.f152794d);
        xVar.u(this.f152795e);
        xVar.t(this.f152796f);
        xVar.q(this.f152797g);
        xVar.s(this.f152798h);
        xVar.w(this.f152799i);
        xVar.x(this.f152800m);
        return xVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m48140xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e)) {
            return false;
        }
        com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e c11127xcc7d6e4e = (com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f152794d, c11127xcc7d6e4e.f152794d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f152795e, c11127xcc7d6e4e.f152795e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f152796f, c11127xcc7d6e4e.f152796f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f152797g, c11127xcc7d6e4e.f152797g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f152798h, c11127xcc7d6e4e.f152798h) && this.f152799i == c11127xcc7d6e4e.f152799i && this.f152800m == c11127xcc7d6e4e.f152800m;
    }

    /* renamed from: hashCode */
    public int m48141x8cdac1b() {
        int hashCode = ((((this.f152794d.hashCode() * 31) + this.f152795e.hashCode()) * 31) + this.f152796f.hashCode()) * 31;
        java.lang.String str = this.f152797g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f152798h;
        return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f152799i)) * 31) + java.lang.Integer.hashCode(this.f152800m);
    }

    /* renamed from: toString */
    public java.lang.String m48142x9616526c() {
        return "WxaInfo(appId=" + this.f152794d + ", nickname=" + this.f152795e + ", iconUrl=" + this.f152796f + ", enterPath=" + this.f152797g + ", forwardSceneNote=" + this.f152798h + ", showSourceView=" + this.f152799i + ", versionType=" + this.f152800m + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f152794d);
        out.writeString(this.f152795e);
        out.writeString(this.f152796f);
        out.writeString(this.f152797g);
        out.writeString(this.f152798h);
        out.writeInt(this.f152799i);
        out.writeInt(this.f152800m);
    }
}
