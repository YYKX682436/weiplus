package androidx.appcompat.app;

/* loaded from: classes8.dex */
public final class d0 implements android.os.Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        return androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState.a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState[i17];
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState.a(parcel, null);
    }
}
