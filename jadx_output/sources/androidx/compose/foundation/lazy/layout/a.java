package androidx.compose.foundation.lazy.layout;

/* loaded from: classes.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new androidx.compose.foundation.lazy.layout.DefaultLazyKey(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new androidx.compose.foundation.lazy.layout.DefaultLazyKey[i17];
    }
}
