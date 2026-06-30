package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
class DownloadChecker$DownloadInterceptBean implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.downloader.model.DownloadChecker$DownloadInterceptBean> CREATOR = new com.tencent.mm.plugin.downloader.model.l();

    /* renamed from: d, reason: collision with root package name */
    public boolean f96935d;

    /* renamed from: e, reason: collision with root package name */
    public int f96936e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f96937f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f96938g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f96939h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f96940i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f96941m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f96942n;

    /* renamed from: o, reason: collision with root package name */
    public long f96943o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f96944p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f96945q;

    /* renamed from: r, reason: collision with root package name */
    public int f96946r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f96947s;

    /* renamed from: t, reason: collision with root package name */
    public int f96948t;

    /* renamed from: u, reason: collision with root package name */
    public d02.q f96949u;

    public DownloadChecker$DownloadInterceptBean(android.os.Parcel parcel, com.tencent.mm.plugin.downloader.model.j jVar) {
        this.f96935d = parcel.readByte() != 0;
        this.f96936e = parcel.readInt();
        this.f96937f = parcel.readString();
        this.f96938g = parcel.readString();
        this.f96939h = parcel.readString();
        this.f96940i = parcel.readString();
        this.f96941m = parcel.readString();
        this.f96942n = parcel.readString();
        this.f96943o = parcel.readLong();
        this.f96944p = parcel.readString();
        this.f96945q = parcel.readString();
        this.f96946r = parcel.readInt();
        this.f96947s = parcel.readInt() == 1;
        this.f96948t = parcel.readInt();
        this.f96949u = new d02.q();
        try {
            byte[] bArr = new byte[this.f96948t];
            parcel.readByteArray(bArr);
            this.f96949u.parseFrom(bArr);
        } catch (java.io.IOException unused) {
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f96935d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f96936e);
        parcel.writeString(this.f96937f);
        parcel.writeString(this.f96938g);
        parcel.writeString(this.f96939h);
        parcel.writeString(this.f96940i);
        parcel.writeString(this.f96941m);
        parcel.writeString(this.f96942n);
        parcel.writeLong(this.f96943o);
        parcel.writeString(this.f96944p);
        parcel.writeString(this.f96945q);
        parcel.writeInt(this.f96946r);
        parcel.writeInt(this.f96947s ? 1 : 0);
        try {
            d02.q qVar = this.f96949u;
            if (qVar != null) {
                parcel.writeInt(qVar.toByteArray().length);
                parcel.writeByteArray(this.f96949u.toByteArray());
            }
        } catch (java.io.IOException unused) {
        }
    }
}
