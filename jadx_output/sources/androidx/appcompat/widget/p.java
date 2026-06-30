package androidx.appcompat.widget;

/* loaded from: classes13.dex */
public final class p implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new androidx.appcompat.widget.ActionMenuPresenter$SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new androidx.appcompat.widget.ActionMenuPresenter$SavedState[i17];
    }
}
