package android.support.design.widget;

/* loaded from: classes14.dex */
public class a implements android.os.Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        return new android.support.design.widget.MMBottomSheetBehavior.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new android.support.design.widget.MMBottomSheetBehavior.SavedState[i17];
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new android.support.design.widget.MMBottomSheetBehavior.SavedState(parcel, (java.lang.ClassLoader) null);
    }
}
