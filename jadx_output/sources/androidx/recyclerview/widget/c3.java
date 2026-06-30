package androidx.recyclerview.widget;

/* loaded from: classes13.dex */
public final class c3 implements android.os.Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        return new androidx.recyclerview.widget.RecyclerView.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new androidx.recyclerview.widget.RecyclerView.SavedState[i17];
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new androidx.recyclerview.widget.RecyclerView.SavedState(parcel, null);
    }
}
