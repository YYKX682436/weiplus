package com.google.android.material.bottomnavigation;

/* loaded from: classes13.dex */
class BottomNavigationPresenter$SavedState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState> CREATOR = new com.google.android.material.bottomnavigation.c();

    /* renamed from: d, reason: collision with root package name */
    public int f44422d;

    public BottomNavigationPresenter$SavedState(android.os.Parcel parcel) {
        this.f44422d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f44422d);
    }
}
