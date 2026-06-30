package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
/* loaded from: classes15.dex */
public final class C0041x23c4773a implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0041x23c4773a> f65x681a0c0c = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.n();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f90439d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.CharSequence f90440e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.CharSequence f90441f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.CharSequence f90442g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Bitmap f90443h;

    /* renamed from: i, reason: collision with root package name */
    public final android.net.Uri f90444i;

    /* renamed from: m, reason: collision with root package name */
    public final android.os.Bundle f90445m;

    /* renamed from: n, reason: collision with root package name */
    public final android.net.Uri f90446n;

    /* renamed from: o, reason: collision with root package name */
    public android.media.MediaDescription f90447o;

    public C0041x23c4773a(java.lang.String str, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, android.graphics.Bitmap bitmap, android.net.Uri uri, android.os.Bundle bundle, android.net.Uri uri2) {
        this.f90439d = str;
        this.f90440e = charSequence;
        this.f90441f = charSequence2;
        this.f90442g = charSequence3;
        this.f90443h = bitmap;
        this.f90444i = uri;
        this.f90445m = bundle;
        this.f90446n = uri2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m2463x9616526c() {
        return ((java.lang.Object) this.f90440e) + ", " + ((java.lang.Object) this.f90441f) + ", " + ((java.lang.Object) this.f90442g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        android.media.MediaDescription mediaDescription = this.f90447o;
        if (mediaDescription == null) {
            android.media.MediaDescription.Builder b17 = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.o.b();
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.o.n(b17, this.f90439d);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.o.p(b17, this.f90440e);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.o.o(b17, this.f90441f);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.o.j(b17, this.f90442g);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.o.l(b17, this.f90443h);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.o.m(b17, this.f90444i);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.o.k(b17, this.f90445m);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p.b(b17, this.f90446n);
            mediaDescription = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.o.a(b17);
            this.f90447o = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i17);
    }
}
