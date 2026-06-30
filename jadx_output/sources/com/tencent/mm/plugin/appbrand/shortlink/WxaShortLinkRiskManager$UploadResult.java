package com.tencent.mm.plugin.appbrand.shortlink;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/shortlink/WxaShortLinkRiskManager$UploadResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class WxaShortLinkRiskManager$UploadResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$UploadResult> CREATOR = new kj1.j0();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f88872d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f88873e;

    public WxaShortLinkRiskManager$UploadResult(boolean z17, java.lang.String fileUrl) {
        kotlin.jvm.internal.o.g(fileUrl, "fileUrl");
        this.f88872d = z17;
        this.f88873e = fileUrl;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$UploadResult)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$UploadResult wxaShortLinkRiskManager$UploadResult = (com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$UploadResult) obj;
        return this.f88872d == wxaShortLinkRiskManager$UploadResult.f88872d && kotlin.jvm.internal.o.b(this.f88873e, wxaShortLinkRiskManager$UploadResult.f88873e);
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f88872d) * 31) + this.f88873e.hashCode();
    }

    public java.lang.String toString() {
        return "UploadResult(ret=" + this.f88872d + ", fileUrl=" + this.f88873e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f88872d ? 1 : 0);
        out.writeString(this.f88873e);
    }

    public /* synthetic */ WxaShortLinkRiskManager$UploadResult(boolean z17, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this(z17, (i17 & 2) != 0 ? "" : str);
    }
}
