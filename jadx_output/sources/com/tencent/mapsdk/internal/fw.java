package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class fw implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mapsdk.internal.fw> CREATOR = new android.os.Parcelable.Creator<com.tencent.mapsdk.internal.fw>() { // from class: com.tencent.mapsdk.internal.fw.1
        private static com.tencent.mapsdk.internal.fw a(android.os.Parcel parcel) {
            return new com.tencent.mapsdk.internal.fw(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.tencent.mapsdk.internal.fw createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.mapsdk.internal.fw(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.tencent.mapsdk.internal.fw[] newArray(int i17) {
            return new com.tencent.mapsdk.internal.fw[i17];
        }

        private static com.tencent.mapsdk.internal.fw[] a(int i17) {
            return new com.tencent.mapsdk.internal.fw[i17];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public int f49473a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f49474b;

    /* renamed from: c, reason: collision with root package name */
    public int f49475c;

    /* renamed from: d, reason: collision with root package name */
    public int f49476d;

    /* renamed from: e, reason: collision with root package name */
    public float f49477e;

    /* renamed from: f, reason: collision with root package name */
    public float f49478f;

    /* renamed from: g, reason: collision with root package name */
    public float f49479g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f49480h;

    /* renamed from: i, reason: collision with root package name */
    public int f49481i;

    /* renamed from: j, reason: collision with root package name */
    public int f49482j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f49483k;

    /* renamed from: l, reason: collision with root package name */
    public float f49484l;

    /* renamed from: m, reason: collision with root package name */
    public float f49485m;

    /* renamed from: n, reason: collision with root package name */
    public int f49486n;

    /* renamed from: o, reason: collision with root package name */
    public int f49487o;

    /* renamed from: p, reason: collision with root package name */
    public int f49488p;

    /* renamed from: q, reason: collision with root package name */
    public int f49489q;

    /* renamed from: r, reason: collision with root package name */
    public int f49490r;

    /* renamed from: s, reason: collision with root package name */
    public int f49491s;

    /* renamed from: t, reason: collision with root package name */
    public int f49492t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.model.LatLng f49493u;

    public fw() {
        this.f49477e = 0.5f;
        this.f49478f = 0.5f;
        this.f49479g = 1.0f;
        this.f49486n = 0;
        this.f49487o = 3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f49473a);
        parcel.writeString(this.f49474b);
        parcel.writeInt(this.f49475c);
        parcel.writeInt(this.f49476d);
        parcel.writeFloat(this.f49477e);
        parcel.writeFloat(this.f49478f);
        parcel.writeFloat(this.f49479g);
        parcel.writeString(this.f49480h);
        parcel.writeInt(this.f49481i);
        parcel.writeInt(this.f49482j);
        parcel.writeString(this.f49483k);
        parcel.writeFloat(this.f49484l);
        parcel.writeFloat(this.f49485m);
        parcel.writeInt(this.f49486n);
        parcel.writeInt(this.f49487o);
        parcel.writeInt(this.f49488p);
        parcel.writeInt(this.f49489q);
        parcel.writeInt(this.f49490r);
        parcel.writeParcelable(this.f49493u, i17);
    }

    public fw(android.os.Parcel parcel) {
        this.f49477e = 0.5f;
        this.f49478f = 0.5f;
        this.f49479g = 1.0f;
        this.f49486n = 0;
        this.f49487o = 3;
        this.f49473a = parcel.readInt();
        this.f49474b = parcel.readString();
        this.f49475c = parcel.readInt();
        this.f49476d = parcel.readInt();
        this.f49477e = parcel.readFloat();
        this.f49478f = parcel.readFloat();
        this.f49479g = parcel.readFloat();
        this.f49480h = parcel.readString();
        this.f49481i = parcel.readInt();
        this.f49482j = parcel.readInt();
        this.f49483k = parcel.readString();
        this.f49484l = parcel.readFloat();
        this.f49485m = parcel.readFloat();
        this.f49486n = parcel.readInt();
        this.f49487o = parcel.readInt();
        this.f49488p = parcel.readInt();
        this.f49489q = parcel.readInt();
        this.f49490r = parcel.readInt();
        this.f49493u = (com.tencent.tencentmap.mapsdk.maps.model.LatLng) parcel.readParcelable(com.tencent.tencentmap.mapsdk.maps.model.LatLng.class.getClassLoader());
    }
}
