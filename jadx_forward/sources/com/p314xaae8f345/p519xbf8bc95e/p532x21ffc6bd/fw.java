package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class fw implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fw> f17384x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fw>() { // from class: com.tencent.mapsdk.internal.fw.1
        private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fw a(android.os.Parcel parcel) {
            return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fw(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fw createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fw(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fw[] newArray(int i17) {
            return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fw[i17];
        }

        private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fw[] a(int i17) {
            return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fw[i17];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public int f131006a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f131007b;

    /* renamed from: c, reason: collision with root package name */
    public int f131008c;

    /* renamed from: d, reason: collision with root package name */
    public int f131009d;

    /* renamed from: e, reason: collision with root package name */
    public float f131010e;

    /* renamed from: f, reason: collision with root package name */
    public float f131011f;

    /* renamed from: g, reason: collision with root package name */
    public float f131012g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f131013h;

    /* renamed from: i, reason: collision with root package name */
    public int f131014i;

    /* renamed from: j, reason: collision with root package name */
    public int f131015j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f131016k;

    /* renamed from: l, reason: collision with root package name */
    public float f131017l;

    /* renamed from: m, reason: collision with root package name */
    public float f131018m;

    /* renamed from: n, reason: collision with root package name */
    public int f131019n;

    /* renamed from: o, reason: collision with root package name */
    public int f131020o;

    /* renamed from: p, reason: collision with root package name */
    public int f131021p;

    /* renamed from: q, reason: collision with root package name */
    public int f131022q;

    /* renamed from: r, reason: collision with root package name */
    public int f131023r;

    /* renamed from: s, reason: collision with root package name */
    public int f131024s;

    /* renamed from: t, reason: collision with root package name */
    public int f131025t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f131026u;

    public fw() {
        this.f131010e = 0.5f;
        this.f131011f = 0.5f;
        this.f131012g = 1.0f;
        this.f131019n = 0;
        this.f131020o = 3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f131006a);
        parcel.writeString(this.f131007b);
        parcel.writeInt(this.f131008c);
        parcel.writeInt(this.f131009d);
        parcel.writeFloat(this.f131010e);
        parcel.writeFloat(this.f131011f);
        parcel.writeFloat(this.f131012g);
        parcel.writeString(this.f131013h);
        parcel.writeInt(this.f131014i);
        parcel.writeInt(this.f131015j);
        parcel.writeString(this.f131016k);
        parcel.writeFloat(this.f131017l);
        parcel.writeFloat(this.f131018m);
        parcel.writeInt(this.f131019n);
        parcel.writeInt(this.f131020o);
        parcel.writeInt(this.f131021p);
        parcel.writeInt(this.f131022q);
        parcel.writeInt(this.f131023r);
        parcel.writeParcelable(this.f131026u, i17);
    }

    public fw(android.os.Parcel parcel) {
        this.f131010e = 0.5f;
        this.f131011f = 0.5f;
        this.f131012g = 1.0f;
        this.f131019n = 0;
        this.f131020o = 3;
        this.f131006a = parcel.readInt();
        this.f131007b = parcel.readString();
        this.f131008c = parcel.readInt();
        this.f131009d = parcel.readInt();
        this.f131010e = parcel.readFloat();
        this.f131011f = parcel.readFloat();
        this.f131012g = parcel.readFloat();
        this.f131013h = parcel.readString();
        this.f131014i = parcel.readInt();
        this.f131015j = parcel.readInt();
        this.f131016k = parcel.readString();
        this.f131017l = parcel.readFloat();
        this.f131018m = parcel.readFloat();
        this.f131019n = parcel.readInt();
        this.f131020o = parcel.readInt();
        this.f131021p = parcel.readInt();
        this.f131022q = parcel.readInt();
        this.f131023r = parcel.readInt();
        this.f131026u = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26) parcel.readParcelable(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26.class.getClassLoader());
    }
}
