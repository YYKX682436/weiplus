package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* renamed from: com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo */
/* loaded from: classes.dex */
public class C13222x107de37 implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public long f178494d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f178495e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f178496f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f178497g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f178498h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f178499i = "";

    /* renamed from: m, reason: collision with root package name */
    public long f178500m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f178501n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f178502o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f178503p = 2;

    /* renamed from: q, reason: collision with root package name */
    public boolean f178504q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f178505r = false;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f178506s = "";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f178494d);
        parcel.writeString(this.f178495e);
        parcel.writeInt(this.f178496f);
        parcel.writeString(this.f178497g);
        parcel.writeString(this.f178498h);
        parcel.writeString(this.f178499i);
        parcel.writeLong(this.f178500m);
        parcel.writeLong(this.f178501n);
        parcel.writeByte(this.f178502o ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f178503p);
        parcel.writeByte(this.f178504q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f178505r ? (byte) 1 : (byte) 0);
    }
}
