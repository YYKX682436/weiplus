package androidx.customview.view;

/* loaded from: classes13.dex */
public final class a implements android.os.Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        if (parcel.readParcelable(null) == null) {
            return androidx.customview.view.AbsSavedState.f11111e;
        }
        throw new java.lang.IllegalStateException("superState must be null");
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new androidx.customview.view.AbsSavedState[i17];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return androidx.customview.view.AbsSavedState.f11111e;
        }
        throw new java.lang.IllegalStateException("superState must be null");
    }
}
