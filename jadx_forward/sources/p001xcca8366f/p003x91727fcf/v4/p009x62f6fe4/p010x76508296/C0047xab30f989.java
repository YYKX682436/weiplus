package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296;

/* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
/* loaded from: classes11.dex */
public final class C0047xab30f989 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989> f70x681a0c0c = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.e0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f90476d = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f90477e;

    /* renamed from: f, reason: collision with root package name */
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f f90478f;

    /* renamed from: g, reason: collision with root package name */
    public w4.e f90479g;

    public C0047xab30f989(java.lang.Object obj, p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f fVar, w4.e eVar) {
        this.f90477e = obj;
        this.f90478f = fVar;
        this.f90479g = eVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m2472xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989)) {
            return false;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 c0047xab30f989 = (p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989) obj;
        java.lang.Object obj2 = this.f90477e;
        if (obj2 == null) {
            return c0047xab30f989.f90477e == null;
        }
        java.lang.Object obj3 = c0047xab30f989.f90477e;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    /* renamed from: hashCode */
    public int m2473x8cdac1b() {
        java.lang.Object obj = this.f90477e;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable((android.os.Parcelable) this.f90477e, i17);
    }
}
