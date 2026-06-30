package com.tencent.mm.choosemsgfile.compat;

/* loaded from: classes3.dex */
public class MsgFile implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.choosemsgfile.compat.MsgFile> CREATOR = new lo.p();

    /* renamed from: d, reason: collision with root package name */
    public long f64761d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f64762e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f64763f;

    /* renamed from: g, reason: collision with root package name */
    public long f64764g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f64765h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f64766i;

    public MsgFile(android.os.Parcel parcel) {
        this.f64761d = parcel.readLong();
        this.f64762e = parcel.readString();
        this.f64763f = parcel.readString();
        this.f64764g = parcel.readLong();
        this.f64765h = parcel.readString();
        this.f64766i = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "MsgFile{fileSize=" + this.f64761d + ", filePath='" + this.f64762e + "', fileName='" + this.f64763f + "', timeStamp=" + this.f64764g + ", type='" + this.f64765h + "', fileExt='" + this.f64766i + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f64761d);
        parcel.writeString(this.f64762e);
        parcel.writeString(this.f64763f);
        parcel.writeLong(this.f64764g);
        parcel.writeString(this.f64765h);
        parcel.writeString(this.f64766i);
    }
}
