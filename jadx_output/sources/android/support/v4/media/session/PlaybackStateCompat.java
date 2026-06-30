package android.support.v4.media.session;

/* loaded from: classes15.dex */
public final class PlaybackStateCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.session.PlaybackStateCompat> CREATOR = new android.support.v4.media.session.h0();

    /* renamed from: d, reason: collision with root package name */
    public final int f8952d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8953e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8954f;

    /* renamed from: g, reason: collision with root package name */
    public final float f8955g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8956h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8957i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.CharSequence f8958m;

    /* renamed from: n, reason: collision with root package name */
    public final long f8959n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f8960o;

    /* renamed from: p, reason: collision with root package name */
    public final long f8961p;

    /* renamed from: q, reason: collision with root package name */
    public final android.os.Bundle f8962q;

    /* renamed from: r, reason: collision with root package name */
    public android.media.session.PlaybackState f8963r;

    /* loaded from: classes15.dex */
    public static final class CustomAction implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.support.v4.media.session.PlaybackStateCompat.CustomAction> CREATOR = new android.support.v4.media.session.l0();

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f8964d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.CharSequence f8965e;

        /* renamed from: f, reason: collision with root package name */
        public final int f8966f;

        /* renamed from: g, reason: collision with root package name */
        public final android.os.Bundle f8967g;

        public CustomAction(android.os.Parcel parcel) {
            this.f8964d = parcel.readString();
            this.f8965e = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f8966f = parcel.readInt();
            this.f8967g = parcel.readBundle(android.support.v4.media.session.f0.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public java.lang.String toString() {
            return "Action:mName='" + ((java.lang.Object) this.f8965e) + ", mIcon=" + this.f8966f + ", mExtras=" + this.f8967g;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f8964d);
            android.text.TextUtils.writeToParcel(this.f8965e, parcel, i17);
            parcel.writeInt(this.f8966f);
            parcel.writeBundle(this.f8967g);
        }
    }

    public PlaybackStateCompat(int i17, long j17, long j18, float f17, long j19, int i18, java.lang.CharSequence charSequence, long j27, java.util.List list, long j28, android.os.Bundle bundle) {
        this.f8952d = i17;
        this.f8953e = j17;
        this.f8954f = j18;
        this.f8955g = f17;
        this.f8956h = j19;
        this.f8957i = i18;
        this.f8958m = charSequence;
        this.f8959n = j27;
        this.f8960o = new java.util.ArrayList(list);
        this.f8961p = j28;
        this.f8962q = bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "PlaybackState {state=" + this.f8952d + ", position=" + this.f8953e + ", buffered position=" + this.f8954f + ", speed=" + this.f8955g + ", updated=" + this.f8959n + ", actions=" + this.f8956h + ", error code=" + this.f8957i + ", error message=" + this.f8958m + ", custom actions=" + this.f8960o + ", active item id=" + this.f8961p + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f8952d);
        parcel.writeLong(this.f8953e);
        parcel.writeFloat(this.f8955g);
        parcel.writeLong(this.f8959n);
        parcel.writeLong(this.f8954f);
        parcel.writeLong(this.f8956h);
        android.text.TextUtils.writeToParcel(this.f8958m, parcel, i17);
        parcel.writeTypedList(this.f8960o);
        parcel.writeLong(this.f8961p);
        parcel.writeBundle(this.f8962q);
        parcel.writeInt(this.f8957i);
    }

    public PlaybackStateCompat(android.os.Parcel parcel) {
        this.f8952d = parcel.readInt();
        this.f8953e = parcel.readLong();
        this.f8955g = parcel.readFloat();
        this.f8959n = parcel.readLong();
        this.f8954f = parcel.readLong();
        this.f8956h = parcel.readLong();
        this.f8958m = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f8960o = parcel.createTypedArrayList(android.support.v4.media.session.PlaybackStateCompat.CustomAction.CREATOR);
        this.f8961p = parcel.readLong();
        this.f8962q = parcel.readBundle(android.support.v4.media.session.f0.class.getClassLoader());
        this.f8957i = parcel.readInt();
    }
}
