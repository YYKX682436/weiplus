package com.tencent.mm.plugin.facedetect.model;

/* loaded from: classes14.dex */
public class w implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult[i17];
    }
}
