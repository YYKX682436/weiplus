package androidx.slidingpanelayout.widget;

/* loaded from: classes13.dex */
public final class e implements android.os.Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        return new androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState[i17];
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState(parcel, null);
    }
}
