package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

/* renamed from: com.tencent.mm.plugin.appbrand.config.WxaProfileAttributes */
/* loaded from: classes7.dex */
public final class C11833x97996a40 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11833x97996a40> f33610x681a0c0c = new k91.b6();
    public int A;
    public final java.lang.String B;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f159031d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f159032e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f159033f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f159034g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f159035h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f159036i;

    /* renamed from: m, reason: collision with root package name */
    public int f159037m;

    /* renamed from: n, reason: collision with root package name */
    public final int f159038n;

    /* renamed from: o, reason: collision with root package name */
    public int f159039o;

    /* renamed from: p, reason: collision with root package name */
    public int f159040p;

    /* renamed from: q, reason: collision with root package name */
    public int f159041q;

    /* renamed from: r, reason: collision with root package name */
    public int f159042r;

    /* renamed from: s, reason: collision with root package name */
    public int f159043s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f159044t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f159045u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f159046v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f159047w;

    /* renamed from: x, reason: collision with root package name */
    public int f159048x;

    /* renamed from: y, reason: collision with root package name */
    public int f159049y;

    /* renamed from: z, reason: collision with root package name */
    public int f159050z;

    public C11833x97996a40(android.os.Parcel parcel) {
        this.B = null;
        this.f159031d = parcel.readString();
        this.f159032e = parcel.readString();
        this.f159033f = parcel.readString();
        this.f159034g = parcel.readString();
        this.f159035h = parcel.readString();
        this.f159036i = parcel.createTypedArrayList(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11826x30fe0b2d.f33603x681a0c0c);
        this.f159037m = parcel.readInt();
        this.f159038n = parcel.readInt();
        this.f159039o = parcel.readInt();
        this.f159041q = parcel.readInt();
        this.f159042r = parcel.readInt();
        this.f159043s = parcel.readInt();
        this.f159044t = parcel.readString();
        this.f159045u = parcel.readString();
        this.f159046v = parcel.readString();
        this.f159047w = parcel.readString();
        this.f159048x = parcel.readInt();
        this.f159049y = parcel.readInt();
        this.B = parcel.readString();
        this.f159050z = parcel.readInt();
        this.A = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f159031d);
        parcel.writeString(this.f159032e);
        parcel.writeString(this.f159033f);
        parcel.writeString(this.f159034g);
        parcel.writeString(this.f159035h);
        parcel.writeTypedList(this.f159036i);
        parcel.writeInt(this.f159037m);
        parcel.writeInt(this.f159038n);
        parcel.writeInt(this.f159039o);
        parcel.writeInt(this.f159041q);
        parcel.writeInt(this.f159042r);
        parcel.writeInt(this.f159043s);
        parcel.writeString(this.f159044t);
        parcel.writeString(this.f159045u);
        parcel.writeString(this.f159046v);
        parcel.writeString(this.f159047w);
        parcel.writeInt(this.f159048x);
        parcel.writeInt(this.f159049y);
        parcel.writeString(this.B);
        parcel.writeInt(this.f159050z);
        parcel.writeInt(this.A);
    }

    public C11833x97996a40() {
        this.B = null;
    }
}
