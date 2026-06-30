package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public final class WxaProfileAttributes implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.WxaProfileAttributes> CREATOR = new k91.b6();
    public int A;
    public final java.lang.String B;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f77498d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f77499e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f77500f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f77501g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f77502h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f77503i;

    /* renamed from: m, reason: collision with root package name */
    public int f77504m;

    /* renamed from: n, reason: collision with root package name */
    public final int f77505n;

    /* renamed from: o, reason: collision with root package name */
    public int f77506o;

    /* renamed from: p, reason: collision with root package name */
    public int f77507p;

    /* renamed from: q, reason: collision with root package name */
    public int f77508q;

    /* renamed from: r, reason: collision with root package name */
    public int f77509r;

    /* renamed from: s, reason: collision with root package name */
    public int f77510s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f77511t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f77512u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f77513v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f77514w;

    /* renamed from: x, reason: collision with root package name */
    public int f77515x;

    /* renamed from: y, reason: collision with root package name */
    public int f77516y;

    /* renamed from: z, reason: collision with root package name */
    public int f77517z;

    public WxaProfileAttributes(android.os.Parcel parcel) {
        this.B = null;
        this.f77498d = parcel.readString();
        this.f77499e = parcel.readString();
        this.f77500f = parcel.readString();
        this.f77501g = parcel.readString();
        this.f77502h = parcel.readString();
        this.f77503i = parcel.createTypedArrayList(com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo.CREATOR);
        this.f77504m = parcel.readInt();
        this.f77505n = parcel.readInt();
        this.f77506o = parcel.readInt();
        this.f77508q = parcel.readInt();
        this.f77509r = parcel.readInt();
        this.f77510s = parcel.readInt();
        this.f77511t = parcel.readString();
        this.f77512u = parcel.readString();
        this.f77513v = parcel.readString();
        this.f77514w = parcel.readString();
        this.f77515x = parcel.readInt();
        this.f77516y = parcel.readInt();
        this.B = parcel.readString();
        this.f77517z = parcel.readInt();
        this.A = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77498d);
        parcel.writeString(this.f77499e);
        parcel.writeString(this.f77500f);
        parcel.writeString(this.f77501g);
        parcel.writeString(this.f77502h);
        parcel.writeTypedList(this.f77503i);
        parcel.writeInt(this.f77504m);
        parcel.writeInt(this.f77505n);
        parcel.writeInt(this.f77506o);
        parcel.writeInt(this.f77508q);
        parcel.writeInt(this.f77509r);
        parcel.writeInt(this.f77510s);
        parcel.writeString(this.f77511t);
        parcel.writeString(this.f77512u);
        parcel.writeString(this.f77513v);
        parcel.writeString(this.f77514w);
        parcel.writeInt(this.f77515x);
        parcel.writeInt(this.f77516y);
        parcel.writeString(this.B);
        parcel.writeInt(this.f77517z);
        parcel.writeInt(this.A);
    }

    public WxaProfileAttributes() {
        this.B = null;
    }
}
