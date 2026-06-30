package com.tencent.mm.analyse;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/analyse/DownloadAnalyse$DownloadIndicator", "Landroid/os/Parcelable;", "feature-cdn_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class DownloadAnalyse$DownloadIndicator implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.analyse.DownloadAnalyse$DownloadIndicator> CREATOR = new nk.b();

    /* renamed from: d, reason: collision with root package name */
    public final long f53189d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f53190e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f53191f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f53192g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f53193h;

    /* renamed from: i, reason: collision with root package name */
    public long f53194i;

    /* renamed from: m, reason: collision with root package name */
    public long f53195m;

    /* renamed from: n, reason: collision with root package name */
    public long f53196n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f53197o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f53198p;

    /* renamed from: q, reason: collision with root package name */
    public final int f53199q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f53200r;

    public DownloadAnalyse$DownloadIndicator(long j17, java.lang.String str, java.lang.String snsID, java.lang.String mediaID, java.lang.String downloadFlag, long j18, long j19, long j27, java.lang.String str2, boolean z17, int i17, java.lang.String url) {
        kotlin.jvm.internal.o.g(snsID, "snsID");
        kotlin.jvm.internal.o.g(mediaID, "mediaID");
        kotlin.jvm.internal.o.g(downloadFlag, "downloadFlag");
        kotlin.jvm.internal.o.g(url, "url");
        this.f53189d = j17;
        this.f53190e = str;
        this.f53191f = snsID;
        this.f53192g = mediaID;
        this.f53193h = downloadFlag;
        this.f53194i = j18;
        this.f53195m = j19;
        this.f53196n = j27;
        this.f53197o = str2;
        this.f53198p = z17;
        this.f53199q = i17;
        this.f53200r = url;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.analyse.DownloadAnalyse$DownloadIndicator)) {
            return false;
        }
        com.tencent.mm.analyse.DownloadAnalyse$DownloadIndicator downloadAnalyse$DownloadIndicator = (com.tencent.mm.analyse.DownloadAnalyse$DownloadIndicator) obj;
        return this.f53189d == downloadAnalyse$DownloadIndicator.f53189d && kotlin.jvm.internal.o.b(this.f53190e, downloadAnalyse$DownloadIndicator.f53190e) && kotlin.jvm.internal.o.b(this.f53191f, downloadAnalyse$DownloadIndicator.f53191f) && kotlin.jvm.internal.o.b(this.f53192g, downloadAnalyse$DownloadIndicator.f53192g) && kotlin.jvm.internal.o.b(this.f53193h, downloadAnalyse$DownloadIndicator.f53193h) && this.f53194i == downloadAnalyse$DownloadIndicator.f53194i && this.f53195m == downloadAnalyse$DownloadIndicator.f53195m && this.f53196n == downloadAnalyse$DownloadIndicator.f53196n && kotlin.jvm.internal.o.b(this.f53197o, downloadAnalyse$DownloadIndicator.f53197o) && this.f53198p == downloadAnalyse$DownloadIndicator.f53198p && this.f53199q == downloadAnalyse$DownloadIndicator.f53199q && kotlin.jvm.internal.o.b(this.f53200r, downloadAnalyse$DownloadIndicator.f53200r);
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.f53189d) * 31;
        java.lang.String str = this.f53190e;
        int hashCode2 = (((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f53191f.hashCode()) * 31) + this.f53192g.hashCode()) * 31) + this.f53193h.hashCode()) * 31) + java.lang.Long.hashCode(this.f53194i)) * 31) + java.lang.Long.hashCode(this.f53195m)) * 31) + java.lang.Long.hashCode(this.f53196n)) * 31;
        java.lang.String str2 = this.f53197o;
        return ((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f53198p)) * 31) + java.lang.Integer.hashCode(this.f53199q)) * 31) + this.f53200r.hashCode();
    }

    public java.lang.String toString() {
        return "DownloadIndicator(timeStamp=" + this.f53189d + ", taskID=" + this.f53190e + ", snsID=" + this.f53191f + ", mediaID=" + this.f53192g + ", downloadFlag=" + this.f53193h + ", totalSize=" + this.f53194i + ", downloadSize=" + this.f53195m + ", wasterSize=" + this.f53196n + ", savePath=" + this.f53197o + ", download=" + this.f53198p + ", fileType=" + this.f53199q + ", url=" + this.f53200r + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeLong(this.f53189d);
        out.writeString(this.f53190e);
        out.writeString(this.f53191f);
        out.writeString(this.f53192g);
        out.writeString(this.f53193h);
        out.writeLong(this.f53194i);
        out.writeLong(this.f53195m);
        out.writeLong(this.f53196n);
        out.writeString(this.f53197o);
        out.writeInt(this.f53198p ? 1 : 0);
        out.writeInt(this.f53199q);
        out.writeString(this.f53200r);
    }
}
