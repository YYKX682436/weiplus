package com.google.android.flexbox;

/* loaded from: classes15.dex */
public class l implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.flexbox.FlexboxLayoutManager.SavedState(parcel, (com.google.android.flexbox.h) null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.google.android.flexbox.FlexboxLayoutManager.SavedState[i17];
    }
}
