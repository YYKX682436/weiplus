package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296;

/* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
/* loaded from: classes15.dex */
public final class C0045xdf9d0f54 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0045xdf9d0f54> f68x681a0c0c = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.c0();

    /* renamed from: d, reason: collision with root package name */
    public final p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0041x23c4773a f90473d;

    /* renamed from: e, reason: collision with root package name */
    public final long f90474e;

    public C0045xdf9d0f54(android.os.Parcel parcel) {
        this.f90473d = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0041x23c4773a.f65x681a0c0c.createFromParcel(parcel);
        this.f90474e = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m2469x9616526c() {
        return "MediaSession.QueueItem {Description=" + this.f90473d + ", Id=" + this.f90474e + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        this.f90473d.writeToParcel(parcel, i17);
        parcel.writeLong(this.f90474e);
    }
}
