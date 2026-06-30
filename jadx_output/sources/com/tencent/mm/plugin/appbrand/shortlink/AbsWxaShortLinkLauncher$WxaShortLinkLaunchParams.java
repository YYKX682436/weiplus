package com.tencent.mm.plugin.appbrand.shortlink;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/shortlink/AbsWxaShortLinkLauncher$WxaShortLinkLaunchParams", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final /* data */ class AbsWxaShortLinkLauncher$WxaShortLinkLaunchParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher$WxaShortLinkLaunchParams> CREATOR = new kj1.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f88865d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f88866e;

    /* renamed from: f, reason: collision with root package name */
    public final int f88867f;

    /* renamed from: g, reason: collision with root package name */
    public final int f88868g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f88869h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f88870i;

    public AbsWxaShortLinkLauncher$WxaShortLinkLaunchParams(java.lang.String appId, java.lang.String path, int i17, int i18, java.lang.String shortLink, java.lang.String userName) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(shortLink, "shortLink");
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f88865d = appId;
        this.f88866e = path;
        this.f88867f = i17;
        this.f88868g = i18;
        this.f88869h = shortLink;
        this.f88870i = userName;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher$WxaShortLinkLaunchParams)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher$WxaShortLinkLaunchParams absWxaShortLinkLauncher$WxaShortLinkLaunchParams = (com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher$WxaShortLinkLaunchParams) obj;
        return kotlin.jvm.internal.o.b(this.f88865d, absWxaShortLinkLauncher$WxaShortLinkLaunchParams.f88865d) && kotlin.jvm.internal.o.b(this.f88866e, absWxaShortLinkLauncher$WxaShortLinkLaunchParams.f88866e) && this.f88867f == absWxaShortLinkLauncher$WxaShortLinkLaunchParams.f88867f && this.f88868g == absWxaShortLinkLauncher$WxaShortLinkLaunchParams.f88868g && kotlin.jvm.internal.o.b(this.f88869h, absWxaShortLinkLauncher$WxaShortLinkLaunchParams.f88869h) && kotlin.jvm.internal.o.b(this.f88870i, absWxaShortLinkLauncher$WxaShortLinkLaunchParams.f88870i);
    }

    public int hashCode() {
        return (((((((((this.f88865d.hashCode() * 31) + this.f88866e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f88867f)) * 31) + java.lang.Integer.hashCode(this.f88868g)) * 31) + this.f88869h.hashCode()) * 31) + this.f88870i.hashCode();
    }

    public java.lang.String toString() {
        return "WxaShortLinkLaunchParams(appId=" + this.f88865d + ", path=" + this.f88866e + ", version=" + this.f88867f + ", versionType=" + this.f88868g + ", shortLink=" + this.f88869h + ", userName=" + this.f88870i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f88865d);
        out.writeString(this.f88866e);
        out.writeInt(this.f88867f);
        out.writeInt(this.f88868g);
        out.writeString(this.f88869h);
        out.writeString(this.f88870i);
    }
}
