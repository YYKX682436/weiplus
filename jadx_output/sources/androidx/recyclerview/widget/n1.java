package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public final class n1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new androidx.recyclerview.widget.LinearLayoutManager.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new androidx.recyclerview.widget.LinearLayoutManager.SavedState[i17];
    }
}
