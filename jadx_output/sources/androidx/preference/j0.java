package androidx.preference;

/* loaded from: classes13.dex */
public final class j0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new androidx.preference.SeekBarPreference.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new androidx.preference.SeekBarPreference.SavedState[i17];
    }
}
