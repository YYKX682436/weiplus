package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
/* loaded from: classes15.dex */
public class C0048xec879c4b implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0048xec879c4b> f71x681a0c0c = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.g0();

    /* renamed from: d, reason: collision with root package name */
    public final int f90480d;

    /* renamed from: e, reason: collision with root package name */
    public final int f90481e;

    /* renamed from: f, reason: collision with root package name */
    public final int f90482f;

    /* renamed from: g, reason: collision with root package name */
    public final int f90483g;

    /* renamed from: h, reason: collision with root package name */
    public final int f90484h;

    public C0048xec879c4b(android.os.Parcel parcel) {
        this.f90480d = parcel.readInt();
        this.f90482f = parcel.readInt();
        this.f90483g = parcel.readInt();
        this.f90484h = parcel.readInt();
        this.f90481e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f90480d);
        parcel.writeInt(this.f90482f);
        parcel.writeInt(this.f90483g);
        parcel.writeInt(this.f90484h);
        parcel.writeInt(this.f90481e);
    }
}
