package androidx.core.widget;

/* loaded from: classes13.dex */
public class p implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new androidx.core.widget.NestedScrollView.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new androidx.core.widget.NestedScrollView.SavedState[i17];
    }
}
