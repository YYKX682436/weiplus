package com.tencent.mm.modelmulti;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/modelmulti/WxaInfo;", "Landroid/os/Parcelable;", "w11/m2", "plugin-messenger-foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final /* data */ class WxaInfo implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f71261d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f71262e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f71263f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f71264g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f71265h;

    /* renamed from: i, reason: collision with root package name */
    public final int f71266i;

    /* renamed from: m, reason: collision with root package name */
    public final int f71267m;

    /* renamed from: n, reason: collision with root package name */
    public static final w11.m2 f71260n = new w11.m2(null);
    public static final android.os.Parcelable.Creator<com.tencent.mm.modelmulti.WxaInfo> CREATOR = new w11.n2();

    public WxaInfo(java.lang.String appId, java.lang.String nickname, java.lang.String iconUrl, java.lang.String str, java.lang.String str2, int i17, int i18) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(nickname, "nickname");
        kotlin.jvm.internal.o.g(iconUrl, "iconUrl");
        this.f71261d = appId;
        this.f71262e = nickname;
        this.f71263f = iconUrl;
        this.f71264g = str;
        this.f71265h = str2;
        this.f71266i = i17;
        this.f71267m = i18;
    }

    public final java.lang.String a() {
        java.lang.String str = this.f71265h;
        java.util.List f07 = str != null ? r26.n0.f0(str, new java.lang.String[]{":"}, false, 0, 6, null) : null;
        return (f07 == null || f07.size() < 3) ? "" : (java.lang.String) f07.get(2);
    }

    public final java.lang.String b() {
        java.lang.String str = this.f71265h;
        java.util.List f07 = str != null ? r26.n0.f0(str, new java.lang.String[]{":"}, false, 0, 6, null) : null;
        return (f07 == null || f07.size() < 2) ? "" : (java.lang.String) f07.get(1);
    }

    public final p15.x c() {
        p15.x xVar = new p15.x();
        xVar.p(this.f71261d);
        xVar.u(this.f71262e);
        xVar.t(this.f71263f);
        xVar.q(this.f71264g);
        xVar.s(this.f71265h);
        xVar.w(this.f71266i);
        xVar.x(this.f71267m);
        return xVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.modelmulti.WxaInfo)) {
            return false;
        }
        com.tencent.mm.modelmulti.WxaInfo wxaInfo = (com.tencent.mm.modelmulti.WxaInfo) obj;
        return kotlin.jvm.internal.o.b(this.f71261d, wxaInfo.f71261d) && kotlin.jvm.internal.o.b(this.f71262e, wxaInfo.f71262e) && kotlin.jvm.internal.o.b(this.f71263f, wxaInfo.f71263f) && kotlin.jvm.internal.o.b(this.f71264g, wxaInfo.f71264g) && kotlin.jvm.internal.o.b(this.f71265h, wxaInfo.f71265h) && this.f71266i == wxaInfo.f71266i && this.f71267m == wxaInfo.f71267m;
    }

    public int hashCode() {
        int hashCode = ((((this.f71261d.hashCode() * 31) + this.f71262e.hashCode()) * 31) + this.f71263f.hashCode()) * 31;
        java.lang.String str = this.f71264g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f71265h;
        return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f71266i)) * 31) + java.lang.Integer.hashCode(this.f71267m);
    }

    public java.lang.String toString() {
        return "WxaInfo(appId=" + this.f71261d + ", nickname=" + this.f71262e + ", iconUrl=" + this.f71263f + ", enterPath=" + this.f71264g + ", forwardSceneNote=" + this.f71265h + ", showSourceView=" + this.f71266i + ", versionType=" + this.f71267m + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f71261d);
        out.writeString(this.f71262e);
        out.writeString(this.f71263f);
        out.writeString(this.f71264g);
        out.writeString(this.f71265h);
        out.writeInt(this.f71266i);
        out.writeInt(this.f71267m);
    }
}
