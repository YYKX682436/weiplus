package android.support.v4.media.session;

/* loaded from: classes14.dex */
final class MediaSessionCompat$ResultReceiverWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper> CREATOR = new android.support.v4.media.session.d0();

    /* renamed from: d, reason: collision with root package name */
    public final android.os.ResultReceiver f8942d;

    public MediaSessionCompat$ResultReceiverWrapper(android.os.Parcel parcel) {
        this.f8942d = (android.os.ResultReceiver) android.os.ResultReceiver.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        this.f8942d.writeToParcel(parcel, i17);
    }
}
