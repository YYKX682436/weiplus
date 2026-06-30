package androidx.fragment.app;

/* loaded from: classes14.dex */
public class a2 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new androidx.fragment.app.FragmentState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new androidx.fragment.app.FragmentState[i17];
    }
}
