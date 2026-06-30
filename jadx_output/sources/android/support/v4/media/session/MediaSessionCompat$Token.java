package android.support.v4.media.session;

/* loaded from: classes11.dex */
public final class MediaSessionCompat$Token implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat$Token> CREATOR = new android.support.v4.media.session.e0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f8943d = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f8944e;

    /* renamed from: f, reason: collision with root package name */
    public android.support.v4.media.session.f f8945f;

    /* renamed from: g, reason: collision with root package name */
    public w4.e f8946g;

    public MediaSessionCompat$Token(java.lang.Object obj, android.support.v4.media.session.f fVar, w4.e eVar) {
        this.f8944e = obj;
        this.f8945f = fVar;
        this.f8946g = eVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof android.support.v4.media.session.MediaSessionCompat$Token)) {
            return false;
        }
        android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token = (android.support.v4.media.session.MediaSessionCompat$Token) obj;
        java.lang.Object obj2 = this.f8944e;
        if (obj2 == null) {
            return mediaSessionCompat$Token.f8944e == null;
        }
        java.lang.Object obj3 = mediaSessionCompat$Token.f8944e;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public int hashCode() {
        java.lang.Object obj = this.f8944e;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable((android.os.Parcelable) this.f8944e, i17);
    }
}
