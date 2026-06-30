package com.google.android.flexbox;

/* loaded from: classes15.dex */
public class g implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.flexbox.FlexboxLayout.LayoutParams(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.google.android.flexbox.FlexboxLayout.LayoutParams[i17];
    }
}
