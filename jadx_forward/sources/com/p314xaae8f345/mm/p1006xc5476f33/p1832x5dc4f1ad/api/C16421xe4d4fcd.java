package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api;

/* renamed from: com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo */
/* loaded from: classes7.dex */
public class C16421xe4d4fcd implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd> f37483x681a0c0c = new jc3.z0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f229391d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f229392e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f229393f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f229394g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f229395h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f229396i;

    /* renamed from: m, reason: collision with root package name */
    public int f229397m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f229398n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f229399o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f229400p;

    /* renamed from: q, reason: collision with root package name */
    public long f229401q;

    /* renamed from: r, reason: collision with root package name */
    public long f229402r;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m66277x9616526c() {
        return "WxaMagicPkgInfo{pkgId='" + this.f229391d + "', url='" + this.f229392e + "', md5='" + this.f229393f + "', pkgpath='" + this.f229394g + "', unzippath='" + this.f229395h + "', originalName='" + this.f229396i + "', pkgtype='" + this.f229397m + "', patchId='" + this.f229398n + "', version='" + this.f229399o + "', wxapath='" + this.f229400p + "', updateTime=" + this.f229401q + ", lastUseTime=" + this.f229402r + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f229391d);
        parcel.writeString(this.f229392e);
        parcel.writeString(this.f229393f);
        parcel.writeString(this.f229394g);
        parcel.writeString(this.f229395h);
        parcel.writeString(this.f229396i);
        parcel.writeInt(this.f229397m);
        parcel.writeString(this.f229398n);
        parcel.writeString(this.f229399o);
        parcel.writeString(this.f229400p);
        parcel.writeLong(this.f229401q);
        parcel.writeLong(this.f229402r);
    }
}
