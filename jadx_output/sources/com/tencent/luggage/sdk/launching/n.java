package com.tencent.luggage.sdk.launching;

/* loaded from: classes7.dex */
public class n implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper[i17];
    }
}
