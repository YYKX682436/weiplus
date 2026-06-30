package android.support.v4.media;

/* loaded from: classes15.dex */
public class q implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new android.support.v4.media.MediaMetadataCompat(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new android.support.v4.media.MediaMetadataCompat[i17];
    }
}
