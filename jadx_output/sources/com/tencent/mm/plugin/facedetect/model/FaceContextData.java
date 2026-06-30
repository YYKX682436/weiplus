package com.tencent.mm.plugin.facedetect.model;

/* loaded from: classes14.dex */
public class FaceContextData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.facedetect.model.FaceContextData> CREATOR = new com.tencent.mm.plugin.facedetect.model.x();

    /* renamed from: e, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.facedetect.model.FaceContextData f99950e;

    /* renamed from: d, reason: collision with root package name */
    public long f99951d;

    public FaceContextData(android.os.Parcel parcel) {
        this.f99951d = -1L;
        this.f99951d = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f99951d);
    }
}
