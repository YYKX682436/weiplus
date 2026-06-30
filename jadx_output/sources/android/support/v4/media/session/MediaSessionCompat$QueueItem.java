package android.support.v4.media.session;

/* loaded from: classes15.dex */
public final class MediaSessionCompat$QueueItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat$QueueItem> CREATOR = new android.support.v4.media.session.c0();

    /* renamed from: d, reason: collision with root package name */
    public final android.support.v4.media.MediaDescriptionCompat f8940d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8941e;

    public MediaSessionCompat$QueueItem(android.os.Parcel parcel) {
        this.f8940d = android.support.v4.media.MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f8941e = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "MediaSession.QueueItem {Description=" + this.f8940d + ", Id=" + this.f8941e + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        this.f8940d.writeToParcel(parcel, i17);
        parcel.writeLong(this.f8941e);
    }
}
