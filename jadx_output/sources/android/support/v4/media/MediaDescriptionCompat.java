package android.support.v4.media;

/* loaded from: classes15.dex */
public final class MediaDescriptionCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.MediaDescriptionCompat> CREATOR = new android.support.v4.media.n();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f8906d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.CharSequence f8907e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.CharSequence f8908f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.CharSequence f8909g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Bitmap f8910h;

    /* renamed from: i, reason: collision with root package name */
    public final android.net.Uri f8911i;

    /* renamed from: m, reason: collision with root package name */
    public final android.os.Bundle f8912m;

    /* renamed from: n, reason: collision with root package name */
    public final android.net.Uri f8913n;

    /* renamed from: o, reason: collision with root package name */
    public android.media.MediaDescription f8914o;

    public MediaDescriptionCompat(java.lang.String str, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, android.graphics.Bitmap bitmap, android.net.Uri uri, android.os.Bundle bundle, android.net.Uri uri2) {
        this.f8906d = str;
        this.f8907e = charSequence;
        this.f8908f = charSequence2;
        this.f8909g = charSequence3;
        this.f8910h = bitmap;
        this.f8911i = uri;
        this.f8912m = bundle;
        this.f8913n = uri2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return ((java.lang.Object) this.f8907e) + ", " + ((java.lang.Object) this.f8908f) + ", " + ((java.lang.Object) this.f8909g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        android.media.MediaDescription mediaDescription = this.f8914o;
        if (mediaDescription == null) {
            android.media.MediaDescription.Builder b17 = android.support.v4.media.o.b();
            android.support.v4.media.o.n(b17, this.f8906d);
            android.support.v4.media.o.p(b17, this.f8907e);
            android.support.v4.media.o.o(b17, this.f8908f);
            android.support.v4.media.o.j(b17, this.f8909g);
            android.support.v4.media.o.l(b17, this.f8910h);
            android.support.v4.media.o.m(b17, this.f8911i);
            android.support.v4.media.o.k(b17, this.f8912m);
            android.support.v4.media.p.b(b17, this.f8913n);
            mediaDescription = android.support.v4.media.o.a(b17);
            this.f8914o = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i17);
    }
}
