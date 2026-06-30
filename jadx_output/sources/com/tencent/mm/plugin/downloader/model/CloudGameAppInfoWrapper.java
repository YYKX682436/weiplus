package com.tencent.mm.plugin.downloader.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/downloader/model/CloudGameAppInfoWrapper;", "Landroid/os/Parcelable;", "plugin-downloader_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final /* data */ class CloudGameAppInfoWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper> CREATOR = new com.tencent.mm.plugin.downloader.model.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f96930d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f96931e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f96932f;

    /* renamed from: g, reason: collision with root package name */
    public final int f96933g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.downloader.model.CloudGameAppInfo f96934h;

    public CloudGameAppInfoWrapper(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, com.tencent.mm.plugin.downloader.model.CloudGameAppInfo appInfo) {
        kotlin.jvm.internal.o.g(appInfo, "appInfo");
        this.f96930d = str;
        this.f96931e = str2;
        this.f96932f = str3;
        this.f96933g = i17;
        this.f96934h = appInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper)) {
            return false;
        }
        com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper cloudGameAppInfoWrapper = (com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper) obj;
        return kotlin.jvm.internal.o.b(this.f96930d, cloudGameAppInfoWrapper.f96930d) && kotlin.jvm.internal.o.b(this.f96931e, cloudGameAppInfoWrapper.f96931e) && kotlin.jvm.internal.o.b(this.f96932f, cloudGameAppInfoWrapper.f96932f) && this.f96933g == cloudGameAppInfoWrapper.f96933g && kotlin.jvm.internal.o.b(this.f96934h, cloudGameAppInfoWrapper.f96934h);
    }

    public int hashCode() {
        java.lang.String str = this.f96930d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f96931e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f96932f;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f96933g)) * 31) + this.f96934h.hashCode();
    }

    public java.lang.String toString() {
        return "CloudGameAppInfoWrapper(jumpUrl=" + this.f96930d + ", gameId=" + this.f96931e + ", actId=" + this.f96932f + ", scene=" + this.f96933g + ", appInfo=" + this.f96934h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f96930d);
        out.writeString(this.f96931e);
        out.writeString(this.f96932f);
        out.writeInt(this.f96933g);
        this.f96934h.writeToParcel(out, i17);
    }
}
