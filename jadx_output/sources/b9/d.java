package b9;

/* loaded from: classes13.dex */
public final class d implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.exoplayer2.metadata.id3.ChapterTocFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.google.android.exoplayer2.metadata.id3.ChapterTocFrame[i17];
    }
}
