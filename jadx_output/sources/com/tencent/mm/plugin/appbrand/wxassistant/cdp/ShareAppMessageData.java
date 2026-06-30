package com.tencent.mm.plugin.appbrand.wxassistant.cdp;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/wxassistant/cdp/ShareAppMessageData;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class ShareAppMessageData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.wxassistant.cdp.ShareAppMessageData> CREATOR = new com.tencent.mm.plugin.appbrand.wxassistant.cdp.o3();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f92158d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f92159e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f92160f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f92161g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f92162h;

    /* renamed from: i, reason: collision with root package name */
    public final int f92163i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f92164m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f92165n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.service.CdpCommandParams f92166o;

    public ShareAppMessageData(java.lang.String title, java.lang.String iconUrl, java.lang.String username, java.lang.String path, java.lang.String appId, int i17, java.lang.String imagePath, java.lang.String targetUserName, com.tencent.mm.plugin.appbrand.service.CdpCommandParams cdpCommandParams) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(iconUrl, "iconUrl");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(imagePath, "imagePath");
        kotlin.jvm.internal.o.g(targetUserName, "targetUserName");
        this.f92158d = title;
        this.f92159e = iconUrl;
        this.f92160f = username;
        this.f92161g = path;
        this.f92162h = appId;
        this.f92163i = i17;
        this.f92164m = imagePath;
        this.f92165n = targetUserName;
        this.f92166o = cdpCommandParams;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.wxassistant.cdp.ShareAppMessageData)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.wxassistant.cdp.ShareAppMessageData shareAppMessageData = (com.tencent.mm.plugin.appbrand.wxassistant.cdp.ShareAppMessageData) obj;
        return kotlin.jvm.internal.o.b(this.f92158d, shareAppMessageData.f92158d) && kotlin.jvm.internal.o.b(this.f92159e, shareAppMessageData.f92159e) && kotlin.jvm.internal.o.b(this.f92160f, shareAppMessageData.f92160f) && kotlin.jvm.internal.o.b(this.f92161g, shareAppMessageData.f92161g) && kotlin.jvm.internal.o.b(this.f92162h, shareAppMessageData.f92162h) && this.f92163i == shareAppMessageData.f92163i && kotlin.jvm.internal.o.b(this.f92164m, shareAppMessageData.f92164m) && kotlin.jvm.internal.o.b(this.f92165n, shareAppMessageData.f92165n) && kotlin.jvm.internal.o.b(this.f92166o, shareAppMessageData.f92166o);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.f92158d.hashCode() * 31) + this.f92159e.hashCode()) * 31) + this.f92160f.hashCode()) * 31) + this.f92161g.hashCode()) * 31) + this.f92162h.hashCode()) * 31) + java.lang.Integer.hashCode(this.f92163i)) * 31) + this.f92164m.hashCode()) * 31) + this.f92165n.hashCode()) * 31;
        com.tencent.mm.plugin.appbrand.service.CdpCommandParams cdpCommandParams = this.f92166o;
        return hashCode + (cdpCommandParams == null ? 0 : cdpCommandParams.hashCode());
    }

    public java.lang.String toString() {
        return "ShareAppMessageData(title=" + this.f92158d + ", iconUrl=" + this.f92159e + ", username=" + this.f92160f + ", path=" + this.f92161g + ", appId=" + this.f92162h + ", versionType=" + this.f92163i + ", imagePath=" + this.f92164m + ", targetUserName=" + this.f92165n + ", params=" + this.f92166o + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f92158d);
        out.writeString(this.f92159e);
        out.writeString(this.f92160f);
        out.writeString(this.f92161g);
        out.writeString(this.f92162h);
        out.writeInt(this.f92163i);
        out.writeString(this.f92164m);
        out.writeString(this.f92165n);
        out.writeParcelable(this.f92166o, i17);
    }
}
