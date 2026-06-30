package android.support.v4.media.session;

/* loaded from: classes15.dex */
public class ParcelableVolumeInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.session.ParcelableVolumeInfo> CREATOR = new android.support.v4.media.session.g0();

    /* renamed from: d, reason: collision with root package name */
    public final int f8947d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8948e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8949f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8950g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8951h;

    public ParcelableVolumeInfo(android.os.Parcel parcel) {
        this.f8947d = parcel.readInt();
        this.f8949f = parcel.readInt();
        this.f8950g = parcel.readInt();
        this.f8951h = parcel.readInt();
        this.f8948e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f8947d);
        parcel.writeInt(this.f8949f);
        parcel.writeInt(this.f8950g);
        parcel.writeInt(this.f8951h);
        parcel.writeInt(this.f8948e);
    }
}
