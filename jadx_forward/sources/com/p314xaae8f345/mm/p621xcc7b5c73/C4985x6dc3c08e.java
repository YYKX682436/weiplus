package com.p314xaae8f345.mm.p621xcc7b5c73;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/analyse/DownloadAnalyse$DownloadIndicator", "Landroid/os/Parcelable;", "feature-cdn_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.analyse.DownloadAnalyse$DownloadIndicator */
/* loaded from: classes7.dex */
public final /* data */ class C4985x6dc3c08e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p621xcc7b5c73.C4985x6dc3c08e> f21396x681a0c0c = new nk.b();

    /* renamed from: d, reason: collision with root package name */
    public final long f134722d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f134723e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f134724f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f134725g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f134726h;

    /* renamed from: i, reason: collision with root package name */
    public long f134727i;

    /* renamed from: m, reason: collision with root package name */
    public long f134728m;

    /* renamed from: n, reason: collision with root package name */
    public long f134729n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f134730o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f134731p;

    /* renamed from: q, reason: collision with root package name */
    public final int f134732q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f134733r;

    public C4985x6dc3c08e(long j17, java.lang.String str, java.lang.String snsID, java.lang.String mediaID, java.lang.String downloadFlag, long j18, long j19, long j27, java.lang.String str2, boolean z17, int i17, java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsID, "snsID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaID, "mediaID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadFlag, "downloadFlag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f134722d = j17;
        this.f134723e = str;
        this.f134724f = snsID;
        this.f134725g = mediaID;
        this.f134726h = downloadFlag;
        this.f134727i = j18;
        this.f134728m = j19;
        this.f134729n = j27;
        this.f134730o = str2;
        this.f134731p = z17;
        this.f134732q = i17;
        this.f134733r = url;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m42920xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p621xcc7b5c73.C4985x6dc3c08e)) {
            return false;
        }
        com.p314xaae8f345.mm.p621xcc7b5c73.C4985x6dc3c08e c4985x6dc3c08e = (com.p314xaae8f345.mm.p621xcc7b5c73.C4985x6dc3c08e) obj;
        return this.f134722d == c4985x6dc3c08e.f134722d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134723e, c4985x6dc3c08e.f134723e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134724f, c4985x6dc3c08e.f134724f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134725g, c4985x6dc3c08e.f134725g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134726h, c4985x6dc3c08e.f134726h) && this.f134727i == c4985x6dc3c08e.f134727i && this.f134728m == c4985x6dc3c08e.f134728m && this.f134729n == c4985x6dc3c08e.f134729n && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134730o, c4985x6dc3c08e.f134730o) && this.f134731p == c4985x6dc3c08e.f134731p && this.f134732q == c4985x6dc3c08e.f134732q && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134733r, c4985x6dc3c08e.f134733r);
    }

    /* renamed from: hashCode */
    public int m42921x8cdac1b() {
        int hashCode = java.lang.Long.hashCode(this.f134722d) * 31;
        java.lang.String str = this.f134723e;
        int hashCode2 = (((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f134724f.hashCode()) * 31) + this.f134725g.hashCode()) * 31) + this.f134726h.hashCode()) * 31) + java.lang.Long.hashCode(this.f134727i)) * 31) + java.lang.Long.hashCode(this.f134728m)) * 31) + java.lang.Long.hashCode(this.f134729n)) * 31;
        java.lang.String str2 = this.f134730o;
        return ((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f134731p)) * 31) + java.lang.Integer.hashCode(this.f134732q)) * 31) + this.f134733r.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m42922x9616526c() {
        return "DownloadIndicator(timeStamp=" + this.f134722d + ", taskID=" + this.f134723e + ", snsID=" + this.f134724f + ", mediaID=" + this.f134725g + ", downloadFlag=" + this.f134726h + ", totalSize=" + this.f134727i + ", downloadSize=" + this.f134728m + ", wasterSize=" + this.f134729n + ", savePath=" + this.f134730o + ", download=" + this.f134731p + ", fileType=" + this.f134732q + ", url=" + this.f134733r + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeLong(this.f134722d);
        out.writeString(this.f134723e);
        out.writeString(this.f134724f);
        out.writeString(this.f134725g);
        out.writeString(this.f134726h);
        out.writeLong(this.f134727i);
        out.writeLong(this.f134728m);
        out.writeLong(this.f134729n);
        out.writeString(this.f134730o);
        out.writeInt(this.f134731p ? 1 : 0);
        out.writeInt(this.f134732q);
        out.writeString(this.f134733r);
    }
}
