package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* renamed from: com.tencent.mm.plugin.downloader.model.DownloadChecker$DownloadInterceptBean */
/* loaded from: classes8.dex */
class C13217x9736d853 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13217x9736d853> f35451x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l();

    /* renamed from: d, reason: collision with root package name */
    public boolean f178468d;

    /* renamed from: e, reason: collision with root package name */
    public int f178469e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f178470f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f178471g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f178472h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f178473i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f178474m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f178475n;

    /* renamed from: o, reason: collision with root package name */
    public long f178476o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f178477p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f178478q;

    /* renamed from: r, reason: collision with root package name */
    public int f178479r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f178480s;

    /* renamed from: t, reason: collision with root package name */
    public int f178481t;

    /* renamed from: u, reason: collision with root package name */
    public d02.q f178482u;

    public C13217x9736d853(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j jVar) {
        this.f178468d = parcel.readByte() != 0;
        this.f178469e = parcel.readInt();
        this.f178470f = parcel.readString();
        this.f178471g = parcel.readString();
        this.f178472h = parcel.readString();
        this.f178473i = parcel.readString();
        this.f178474m = parcel.readString();
        this.f178475n = parcel.readString();
        this.f178476o = parcel.readLong();
        this.f178477p = parcel.readString();
        this.f178478q = parcel.readString();
        this.f178479r = parcel.readInt();
        this.f178480s = parcel.readInt() == 1;
        this.f178481t = parcel.readInt();
        this.f178482u = new d02.q();
        try {
            byte[] bArr = new byte[this.f178481t];
            parcel.readByteArray(bArr);
            this.f178482u.mo11468x92b714fd(bArr);
        } catch (java.io.IOException unused) {
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f178468d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f178469e);
        parcel.writeString(this.f178470f);
        parcel.writeString(this.f178471g);
        parcel.writeString(this.f178472h);
        parcel.writeString(this.f178473i);
        parcel.writeString(this.f178474m);
        parcel.writeString(this.f178475n);
        parcel.writeLong(this.f178476o);
        parcel.writeString(this.f178477p);
        parcel.writeString(this.f178478q);
        parcel.writeInt(this.f178479r);
        parcel.writeInt(this.f178480s ? 1 : 0);
        try {
            d02.q qVar = this.f178482u;
            if (qVar != null) {
                parcel.writeInt(qVar.mo14344x5f01b1f6().length);
                parcel.writeByteArray(this.f178482u.mo14344x5f01b1f6());
            }
        } catch (java.io.IOException unused) {
        }
    }
}
