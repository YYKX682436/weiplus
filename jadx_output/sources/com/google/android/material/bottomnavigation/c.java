package com.google.android.material.bottomnavigation;

/* loaded from: classes13.dex */
public final class c implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState[i17];
    }
}
