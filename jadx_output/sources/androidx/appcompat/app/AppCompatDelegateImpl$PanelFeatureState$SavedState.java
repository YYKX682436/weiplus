package androidx.appcompat.app;

/* loaded from: classes8.dex */
class AppCompatDelegateImpl$PanelFeatureState$SavedState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState> CREATOR = new androidx.appcompat.app.d0();

    /* renamed from: d, reason: collision with root package name */
    public int f9073d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9074e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Bundle f9075f;

    public static androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState a(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState appCompatDelegateImpl$PanelFeatureState$SavedState = new androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState();
        appCompatDelegateImpl$PanelFeatureState$SavedState.f9073d = parcel.readInt();
        boolean z17 = parcel.readInt() == 1;
        appCompatDelegateImpl$PanelFeatureState$SavedState.f9074e = z17;
        if (z17) {
            appCompatDelegateImpl$PanelFeatureState$SavedState.f9075f = parcel.readBundle(classLoader);
        }
        return appCompatDelegateImpl$PanelFeatureState$SavedState;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f9073d);
        parcel.writeInt(this.f9074e ? 1 : 0);
        if (this.f9074e) {
            parcel.writeBundle(this.f9075f);
        }
    }
}
