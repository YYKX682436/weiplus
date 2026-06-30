package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public class AppBrandInitConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig> CREATOR = new k91.d0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f77278d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f77279e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f77280f;

    /* renamed from: g, reason: collision with root package name */
    public int f77281g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f77282h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f77283i;

    /* renamed from: m, reason: collision with root package name */
    public int f77284m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f77285n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f77286o;

    /* renamed from: p, reason: collision with root package name */
    public int f77287p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f77288q;

    /* renamed from: r, reason: collision with root package name */
    public int f77289r;

    /* renamed from: s, reason: collision with root package name */
    public int f77290s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f77291t;

    public AppBrandInitConfig(android.os.Parcel parcel) {
        this.f77278d = parcel.readString();
        this.f77279e = parcel.readString();
        this.f77280f = parcel.readString();
        this.f77281g = parcel.readInt();
        this.f77283i = parcel.readString();
        this.f77282h = parcel.readString();
        this.f77284m = parcel.readInt();
        this.f77285n = parcel.readString();
        this.f77286o = parcel.readString();
        this.f77287p = parcel.readInt();
        this.f77288q = parcel.readString();
    }

    @Override // 
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig clone() {
        android.os.Parcel b17 = b();
        java.lang.Class<?> cls = getClass();
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig) new d56.b(cls, cls).d(b17).f226632b;
        b17.recycle();
        return appBrandInitConfig;
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
        parcel.writeString(this.f77278d);
        parcel.writeString(this.f77279e);
        parcel.writeString(this.f77280f);
        parcel.writeInt(this.f77281g);
        parcel.writeString(this.f77283i);
        parcel.writeString(this.f77282h);
        parcel.writeInt(this.f77284m);
        parcel.writeString(this.f77285n);
        parcel.writeString(this.f77286o);
        parcel.writeInt(this.f77287p);
        parcel.writeString(this.f77288q);
    }
}
