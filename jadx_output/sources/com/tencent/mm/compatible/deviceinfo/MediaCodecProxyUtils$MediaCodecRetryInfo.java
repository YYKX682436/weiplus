package com.tencent.mm.compatible.deviceinfo;

/* loaded from: classes13.dex */
public class MediaCodecProxyUtils$MediaCodecRetryInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.compatible.deviceinfo.MediaCodecProxyUtils$MediaCodecRetryInfo> CREATOR = new wo.l1();

    /* renamed from: d, reason: collision with root package name */
    public final int f64767d;

    public MediaCodecProxyUtils$MediaCodecRetryInfo(android.os.Parcel parcel) {
        this.f64767d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f64767d);
    }
}
