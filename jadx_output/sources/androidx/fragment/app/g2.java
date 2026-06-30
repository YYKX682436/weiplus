package androidx.fragment.app;

/* loaded from: classes13.dex */
public class g2 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new androidx.fragment.app.FragmentTabHost.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new androidx.fragment.app.FragmentTabHost.SavedState[i17];
    }
}
