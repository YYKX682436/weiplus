package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4;

/* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
/* loaded from: classes15.dex */
public class C0039xb81f0939 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0039xb81f0939> f64x681a0c0c = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.k();

    /* renamed from: d, reason: collision with root package name */
    public final int f90437d;

    /* renamed from: e, reason: collision with root package name */
    public final p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0041x23c4773a f90438e;

    public C0039xb81f0939(android.os.Parcel parcel) {
        this.f90437d = parcel.readInt();
        this.f90438e = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0041x23c4773a.f65x681a0c0c.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m2461x9616526c() {
        return "MediaItem{mFlags=" + this.f90437d + ", mDescription=" + this.f90438e + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f90437d);
        this.f90438e.writeToParcel(parcel, i17);
    }
}
