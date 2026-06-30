package com.tencent.mm.plugin.downloader_app.api;

/* loaded from: classes.dex */
public class DownloadWidgetTaskInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.downloader_app.api.DownloadWidgetTaskInfo> CREATOR = new m02.d();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f97227d;

    /* renamed from: e, reason: collision with root package name */
    public long f97228e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f97229f;

    /* renamed from: g, reason: collision with root package name */
    public int f97230g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f97231h;

    /* renamed from: i, reason: collision with root package name */
    public float f97232i;

    /* renamed from: m, reason: collision with root package name */
    public int f97233m;

    public DownloadWidgetTaskInfo(android.os.Parcel parcel, m02.d dVar) {
        this.f97227d = parcel.readString();
        this.f97228e = parcel.readLong();
        this.f97229f = parcel.readString();
        this.f97230g = parcel.readInt();
        this.f97231h = parcel.readInt() == 1;
        this.f97232i = parcel.readFloat();
        this.f97233m = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f97227d);
        parcel.writeLong(this.f97228e);
        parcel.writeString(this.f97229f);
        parcel.writeInt(this.f97230g);
        parcel.writeInt(this.f97231h ? 1 : 0);
        parcel.writeFloat(this.f97232i);
        parcel.writeInt(this.f97233m);
    }
}
