package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
/* loaded from: classes15.dex */
public final class C0049x5ee9be38 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0049x5ee9be38> f72x681a0c0c = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.h0();

    /* renamed from: d, reason: collision with root package name */
    public final int f90485d;

    /* renamed from: e, reason: collision with root package name */
    public final long f90486e;

    /* renamed from: f, reason: collision with root package name */
    public final long f90487f;

    /* renamed from: g, reason: collision with root package name */
    public final float f90488g;

    /* renamed from: h, reason: collision with root package name */
    public final long f90489h;

    /* renamed from: i, reason: collision with root package name */
    public final int f90490i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.CharSequence f90491m;

    /* renamed from: n, reason: collision with root package name */
    public final long f90492n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f90493o;

    /* renamed from: p, reason: collision with root package name */
    public final long f90494p;

    /* renamed from: q, reason: collision with root package name */
    public final android.os.Bundle f90495q;

    /* renamed from: r, reason: collision with root package name */
    public android.media.session.PlaybackState f90496r;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    /* loaded from: classes15.dex */
    public static final class CustomAction implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0049x5ee9be38.CustomAction> f73x681a0c0c = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.l0();

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f90497d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.CharSequence f90498e;

        /* renamed from: f, reason: collision with root package name */
        public final int f90499f;

        /* renamed from: g, reason: collision with root package name */
        public final android.os.Bundle f90500g;

        public CustomAction(android.os.Parcel parcel) {
            this.f90497d = parcel.readString();
            this.f90498e = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f90499f = parcel.readInt();
            this.f90500g = parcel.readBundle(p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: toString */
        public java.lang.String m2478x9616526c() {
            return "Action:mName='" + ((java.lang.Object) this.f90498e) + ", mIcon=" + this.f90499f + ", mExtras=" + this.f90500g;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f90497d);
            android.text.TextUtils.writeToParcel(this.f90498e, parcel, i17);
            parcel.writeInt(this.f90499f);
            parcel.writeBundle(this.f90500g);
        }
    }

    public C0049x5ee9be38(int i17, long j17, long j18, float f17, long j19, int i18, java.lang.CharSequence charSequence, long j27, java.util.List list, long j28, android.os.Bundle bundle) {
        this.f90485d = i17;
        this.f90486e = j17;
        this.f90487f = j18;
        this.f90488g = f17;
        this.f90489h = j19;
        this.f90490i = i18;
        this.f90491m = charSequence;
        this.f90492n = j27;
        this.f90493o = new java.util.ArrayList(list);
        this.f90494p = j28;
        this.f90495q = bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m2476x9616526c() {
        return "PlaybackState {state=" + this.f90485d + ", position=" + this.f90486e + ", buffered position=" + this.f90487f + ", speed=" + this.f90488g + ", updated=" + this.f90492n + ", actions=" + this.f90489h + ", error code=" + this.f90490i + ", error message=" + this.f90491m + ", custom actions=" + this.f90493o + ", active item id=" + this.f90494p + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f90485d);
        parcel.writeLong(this.f90486e);
        parcel.writeFloat(this.f90488g);
        parcel.writeLong(this.f90492n);
        parcel.writeLong(this.f90487f);
        parcel.writeLong(this.f90489h);
        android.text.TextUtils.writeToParcel(this.f90491m, parcel, i17);
        parcel.writeTypedList(this.f90493o);
        parcel.writeLong(this.f90494p);
        parcel.writeBundle(this.f90495q);
        parcel.writeInt(this.f90490i);
    }

    public C0049x5ee9be38(android.os.Parcel parcel) {
        this.f90485d = parcel.readInt();
        this.f90486e = parcel.readLong();
        this.f90488g = parcel.readFloat();
        this.f90492n = parcel.readLong();
        this.f90487f = parcel.readLong();
        this.f90489h = parcel.readLong();
        this.f90491m = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f90493o = parcel.createTypedArrayList(p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0049x5ee9be38.CustomAction.f73x681a0c0c);
        this.f90494p = parcel.readLong();
        this.f90495q = parcel.readBundle(p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.class.getClassLoader());
        this.f90490i = parcel.readInt();
    }
}
