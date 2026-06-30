package androidx.fragment.app;

/* loaded from: classes13.dex */
public class h0 implements android.os.Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new androidx.fragment.app.Fragment.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new androidx.fragment.app.Fragment.SavedState[i17];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        return new androidx.fragment.app.Fragment.SavedState(parcel, classLoader);
    }
}
