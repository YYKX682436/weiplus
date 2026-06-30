package android.support.v4.media.session;

/* loaded from: classes11.dex */
public class e0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new android.support.v4.media.session.MediaSessionCompat$Token(parcel.readParcelable(null), null, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new android.support.v4.media.session.MediaSessionCompat$Token[i17];
    }
}
