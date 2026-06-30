package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.api;

/* renamed from: com.tencent.mm.plugin.downloader_app.api.DownloadWidgetTaskInfo */
/* loaded from: classes.dex */
public class C13236xb15ab0ff implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.api.C13236xb15ab0ff> f35453x681a0c0c = new m02.d();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f178760d;

    /* renamed from: e, reason: collision with root package name */
    public long f178761e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f178762f;

    /* renamed from: g, reason: collision with root package name */
    public int f178763g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f178764h;

    /* renamed from: i, reason: collision with root package name */
    public float f178765i;

    /* renamed from: m, reason: collision with root package name */
    public int f178766m;

    public C13236xb15ab0ff(android.os.Parcel parcel, m02.d dVar) {
        this.f178760d = parcel.readString();
        this.f178761e = parcel.readLong();
        this.f178762f = parcel.readString();
        this.f178763g = parcel.readInt();
        this.f178764h = parcel.readInt() == 1;
        this.f178765i = parcel.readFloat();
        this.f178766m = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f178760d);
        parcel.writeLong(this.f178761e);
        parcel.writeString(this.f178762f);
        parcel.writeInt(this.f178763g);
        parcel.writeInt(this.f178764h ? 1 : 0);
        parcel.writeFloat(this.f178765i);
        parcel.writeInt(this.f178766m);
    }
}
