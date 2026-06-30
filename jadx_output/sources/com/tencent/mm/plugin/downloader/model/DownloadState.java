package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes.dex */
public class DownloadState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.downloader.model.DownloadState> CREATOR = new com.tencent.mm.plugin.downloader.model.r();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f96950d;

    /* renamed from: e, reason: collision with root package name */
    public final long f96951e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f96952f;

    /* renamed from: g, reason: collision with root package name */
    public final long f96953g;

    /* renamed from: h, reason: collision with root package name */
    public final long f96954h;

    /* renamed from: i, reason: collision with root package name */
    public final float f96955i;

    public DownloadState(android.os.Parcel parcel, com.tencent.mm.plugin.downloader.model.r rVar) {
        this.f96950d = parcel.readString();
        this.f96951e = parcel.readLong();
        this.f96952f = parcel.readString();
        this.f96953g = parcel.readLong();
        this.f96954h = parcel.readLong();
        this.f96955i = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f96950d);
        parcel.writeLong(this.f96951e);
        parcel.writeString(this.f96952f);
        parcel.writeLong(this.f96953g);
        parcel.writeLong(this.f96954h);
        parcel.writeFloat(this.f96955i);
    }
}
