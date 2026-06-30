package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

/* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig */
/* loaded from: classes7.dex */
public class C11808xe47dc718 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718> f33582x681a0c0c = new k91.d0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f158811d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f158812e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f158813f;

    /* renamed from: g, reason: collision with root package name */
    public int f158814g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f158815h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f158816i;

    /* renamed from: m, reason: collision with root package name */
    public int f158817m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f158818n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f158819o;

    /* renamed from: p, reason: collision with root package name */
    public int f158820p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f158821q;

    /* renamed from: r, reason: collision with root package name */
    public int f158822r;

    /* renamed from: s, reason: collision with root package name */
    public int f158823s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f158824t;

    public C11808xe47dc718(android.os.Parcel parcel) {
        this.f158811d = parcel.readString();
        this.f158812e = parcel.readString();
        this.f158813f = parcel.readString();
        this.f158814g = parcel.readInt();
        this.f158816i = parcel.readString();
        this.f158815h = parcel.readString();
        this.f158817m = parcel.readInt();
        this.f158818n = parcel.readString();
        this.f158819o = parcel.readString();
        this.f158820p = parcel.readInt();
        this.f158821q = parcel.readString();
    }

    @Override // 
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 mo32063x5a5dd5d() {
        android.os.Parcel b17 = b();
        java.lang.Class<?> cls = getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718) new d56.b(cls, cls).d(b17).f308165b;
        b17.recycle();
        return c11808xe47dc718;
    }

    public android.os.Parcel b() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.setDataPosition(0);
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        return obtain;
    }

    public org.json.JSONObject c() {
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158811d);
        parcel.writeString(this.f158812e);
        parcel.writeString(this.f158813f);
        parcel.writeInt(this.f158814g);
        parcel.writeString(this.f158816i);
        parcel.writeString(this.f158815h);
        parcel.writeInt(this.f158817m);
        parcel.writeString(this.f158818n);
        parcel.writeString(this.f158819o);
        parcel.writeInt(this.f158820p);
        parcel.writeString(this.f158821q);
    }
}
