package com.tencent.mm.plugin.downloader.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/downloader/model/CloudGameAppInfo;", "Landroid/os/Parcelable;", "plugin-downloader_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final /* data */ class CloudGameAppInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.downloader.model.CloudGameAppInfo> CREATOR = new com.tencent.mm.plugin.downloader.model.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f96915d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f96916e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f96917f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f96918g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f96919h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f96920i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f96921m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f96922n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f96923o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f96924p;

    /* renamed from: q, reason: collision with root package name */
    public final long f96925q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f96926r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f96927s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f96928t;

    /* renamed from: u, reason: collision with root package name */
    public final int f96929u;

    public CloudGameAppInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, long j17, java.lang.String str11, java.lang.String str12, java.lang.String str13, int i17) {
        this.f96915d = str;
        this.f96916e = str2;
        this.f96917f = str3;
        this.f96918g = str4;
        this.f96919h = str5;
        this.f96920i = str6;
        this.f96921m = str7;
        this.f96922n = str8;
        this.f96923o = str9;
        this.f96924p = str10;
        this.f96925q = j17;
        this.f96926r = str11;
        this.f96927s = str12;
        this.f96928t = str13;
        this.f96929u = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.downloader.model.CloudGameAppInfo)) {
            return false;
        }
        com.tencent.mm.plugin.downloader.model.CloudGameAppInfo cloudGameAppInfo = (com.tencent.mm.plugin.downloader.model.CloudGameAppInfo) obj;
        return kotlin.jvm.internal.o.b(this.f96915d, cloudGameAppInfo.f96915d) && kotlin.jvm.internal.o.b(this.f96916e, cloudGameAppInfo.f96916e) && kotlin.jvm.internal.o.b(this.f96917f, cloudGameAppInfo.f96917f) && kotlin.jvm.internal.o.b(this.f96918g, cloudGameAppInfo.f96918g) && kotlin.jvm.internal.o.b(this.f96919h, cloudGameAppInfo.f96919h) && kotlin.jvm.internal.o.b(this.f96920i, cloudGameAppInfo.f96920i) && kotlin.jvm.internal.o.b(this.f96921m, cloudGameAppInfo.f96921m) && kotlin.jvm.internal.o.b(this.f96922n, cloudGameAppInfo.f96922n) && kotlin.jvm.internal.o.b(this.f96923o, cloudGameAppInfo.f96923o) && kotlin.jvm.internal.o.b(this.f96924p, cloudGameAppInfo.f96924p) && this.f96925q == cloudGameAppInfo.f96925q && kotlin.jvm.internal.o.b(this.f96926r, cloudGameAppInfo.f96926r) && kotlin.jvm.internal.o.b(this.f96927s, cloudGameAppInfo.f96927s) && kotlin.jvm.internal.o.b(this.f96928t, cloudGameAppInfo.f96928t) && this.f96929u == cloudGameAppInfo.f96929u;
    }

    public int hashCode() {
        java.lang.String str = this.f96915d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f96916e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f96917f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f96918g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f96919h;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f96920i;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.f96921m;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.f96922n;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        java.lang.String str9 = this.f96923o;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        java.lang.String str10 = this.f96924p;
        int hashCode10 = (((hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31) + java.lang.Long.hashCode(this.f96925q)) * 31;
        java.lang.String str11 = this.f96926r;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        java.lang.String str12 = this.f96927s;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        java.lang.String str13 = this.f96928t;
        return ((hashCode12 + (str13 != null ? str13.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f96929u);
    }

    public java.lang.String toString() {
        return "CloudGameAppInfo(appName=" + this.f96915d + ", iconUrl=" + this.f96916e + ", appId=" + this.f96917f + ", packageName=" + this.f96918g + ", developer=" + this.f96919h + ", operator=" + this.f96920i + ", pkgVersion=" + this.f96921m + ", privilegesUrl=" + this.f96922n + ", privacyUrl=" + this.f96923o + ", featureUrl=" + this.f96924p + ", packageSize=" + this.f96925q + ", downloadUrl=" + this.f96926r + ", alternativeDownloadUrl=" + this.f96927s + ", packageMd5=" + this.f96928t + ", downloaderType=" + this.f96929u + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f96915d);
        out.writeString(this.f96916e);
        out.writeString(this.f96917f);
        out.writeString(this.f96918g);
        out.writeString(this.f96919h);
        out.writeString(this.f96920i);
        out.writeString(this.f96921m);
        out.writeString(this.f96922n);
        out.writeString(this.f96923o);
        out.writeString(this.f96924p);
        out.writeLong(this.f96925q);
        out.writeString(this.f96926r);
        out.writeString(this.f96927s);
        out.writeString(this.f96928t);
        out.writeInt(this.f96929u);
    }
}
