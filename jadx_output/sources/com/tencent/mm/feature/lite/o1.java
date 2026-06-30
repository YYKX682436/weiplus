package com.tencent.mm.feature.lite;

/* loaded from: classes8.dex */
public class o1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.feature.lite.LiteAppFeatureService$OpenLiteAppData(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.feature.lite.LiteAppFeatureService$OpenLiteAppData[i17];
    }
}
