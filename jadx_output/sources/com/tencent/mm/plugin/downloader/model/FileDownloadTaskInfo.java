package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes.dex */
public class FileDownloadTaskInfo implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public long f96961d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f96962e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f96963f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f96964g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f96965h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f96966i = "";

    /* renamed from: m, reason: collision with root package name */
    public long f96967m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f96968n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f96969o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f96970p = 2;

    /* renamed from: q, reason: collision with root package name */
    public boolean f96971q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f96972r = false;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f96973s = "";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f96961d);
        parcel.writeString(this.f96962e);
        parcel.writeInt(this.f96963f);
        parcel.writeString(this.f96964g);
        parcel.writeString(this.f96965h);
        parcel.writeString(this.f96966i);
        parcel.writeLong(this.f96967m);
        parcel.writeLong(this.f96968n);
        parcel.writeByte(this.f96969o ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f96970p);
        parcel.writeByte(this.f96971q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f96972r ? (byte) 1 : (byte) 0);
    }
}
