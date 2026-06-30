package b9;

/* loaded from: classes13.dex */
public final class f implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.exoplayer2.metadata.id3.GeobFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.google.android.exoplayer2.metadata.id3.GeobFrame[i17];
    }
}
