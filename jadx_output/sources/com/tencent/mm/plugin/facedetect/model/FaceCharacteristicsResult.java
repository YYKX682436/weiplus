package com.tencent.mm.plugin.facedetect.model;

/* loaded from: classes14.dex */
public class FaceCharacteristicsResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult> CREATOR = new com.tencent.mm.plugin.facedetect.model.w();

    /* renamed from: d, reason: collision with root package name */
    public int f99948d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f99949e;

    public FaceCharacteristicsResult(android.os.Parcel parcel) {
        this.f99948d = parcel.readInt();
        this.f99949e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "FaceCharacteristicsResult{mStatus=null, errCode=" + this.f99948d + ", errMsg='" + this.f99949e + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(null, i17);
        parcel.writeInt(this.f99948d);
        parcel.writeString(this.f99949e);
    }
}
