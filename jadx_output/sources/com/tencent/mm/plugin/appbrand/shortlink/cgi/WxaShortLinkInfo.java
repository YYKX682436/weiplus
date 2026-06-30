package com.tencent.mm.plugin.appbrand.shortlink.cgi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/shortlink/cgi/WxaShortLinkInfo;", "Landroid/os/Parcelable;", "data-model_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final /* data */ class WxaShortLinkInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo> CREATOR = new lj1.d();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f88874d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f88875e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f88876f;

    /* renamed from: g, reason: collision with root package name */
    public final int f88877g;

    /* renamed from: h, reason: collision with root package name */
    public final int f88878h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f88879i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f88880m;

    public WxaShortLinkInfo(java.lang.String appId, java.lang.String pageTitle, java.lang.String path, int i17, int i18, java.lang.String nickName, java.lang.String userName) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(pageTitle, "pageTitle");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f88874d = appId;
        this.f88875e = pageTitle;
        this.f88876f = path;
        this.f88877g = i17;
        this.f88878h = i18;
        this.f88879i = nickName;
        this.f88880m = userName;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo wxaShortLinkInfo = (com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo) obj;
        return kotlin.jvm.internal.o.b(this.f88874d, wxaShortLinkInfo.f88874d) && kotlin.jvm.internal.o.b(this.f88875e, wxaShortLinkInfo.f88875e) && kotlin.jvm.internal.o.b(this.f88876f, wxaShortLinkInfo.f88876f) && this.f88877g == wxaShortLinkInfo.f88877g && this.f88878h == wxaShortLinkInfo.f88878h && kotlin.jvm.internal.o.b(this.f88879i, wxaShortLinkInfo.f88879i) && kotlin.jvm.internal.o.b(this.f88880m, wxaShortLinkInfo.f88880m);
    }

    public int hashCode() {
        return (((((((((((this.f88874d.hashCode() * 31) + this.f88875e.hashCode()) * 31) + this.f88876f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f88877g)) * 31) + java.lang.Integer.hashCode(this.f88878h)) * 31) + this.f88879i.hashCode()) * 31) + this.f88880m.hashCode();
    }

    public java.lang.String toString() {
        return "WxaShortLinkInfo(appId='" + this.f88874d + "', pageTitle='" + this.f88875e + "', path='" + this.f88876f + "', version=" + this.f88877g + ", versionType=" + this.f88878h + ", nickName='" + this.f88879i + "', userName=" + this.f88880m + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f88874d);
        out.writeString(this.f88875e);
        out.writeString(this.f88876f);
        out.writeInt(this.f88877g);
        out.writeInt(this.f88878h);
        out.writeString(this.f88879i);
        out.writeString(this.f88880m);
    }
}
