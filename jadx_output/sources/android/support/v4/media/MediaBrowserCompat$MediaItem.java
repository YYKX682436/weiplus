package android.support.v4.media;

/* loaded from: classes15.dex */
public class MediaBrowserCompat$MediaItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.MediaBrowserCompat$MediaItem> CREATOR = new android.support.v4.media.k();

    /* renamed from: d, reason: collision with root package name */
    public final int f8904d;

    /* renamed from: e, reason: collision with root package name */
    public final android.support.v4.media.MediaDescriptionCompat f8905e;

    public MediaBrowserCompat$MediaItem(android.os.Parcel parcel) {
        this.f8904d = parcel.readInt();
        this.f8905e = android.support.v4.media.MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "MediaItem{mFlags=" + this.f8904d + ", mDescription=" + this.f8905e + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f8904d);
        this.f8905e.writeToParcel(parcel, i17);
    }
}
