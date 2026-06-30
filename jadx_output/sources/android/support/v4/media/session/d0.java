package android.support.v4.media.session;

/* loaded from: classes14.dex */
public class d0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper[i17];
    }
}
