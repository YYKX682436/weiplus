package androidx.fragment.app;

/* loaded from: classes14.dex */
public class n1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new androidx.fragment.app.FragmentManager.LaunchedFragmentInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new androidx.fragment.app.FragmentManager.LaunchedFragmentInfo[i17];
    }
}
