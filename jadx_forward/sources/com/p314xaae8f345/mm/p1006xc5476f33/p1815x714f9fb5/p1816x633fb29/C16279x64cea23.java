package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29;

/* renamed from: com.tencent.mm.plugin.location.model.LocationInfo */
/* loaded from: classes15.dex */
public class C16279x64cea23 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23> f37452x681a0c0c = new va3.q();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f226118d;

    /* renamed from: e, reason: collision with root package name */
    public double f226119e;

    /* renamed from: f, reason: collision with root package name */
    public double f226120f;

    /* renamed from: g, reason: collision with root package name */
    public int f226121g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f226122h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f226123i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f226124m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f226125n;

    /* renamed from: o, reason: collision with root package name */
    public int f226126o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f226127p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f226128q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f226129r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f226130s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f226131t;

    /* renamed from: u, reason: collision with root package name */
    public float f226132u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f226133v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f226134w;

    public C16279x64cea23() {
        this.f226118d = "";
        this.f226119e = -85.0d;
        this.f226120f = -1000.0d;
        this.f226122h = "";
        this.f226123i = "zh-cn";
        this.f226125n = "";
        this.f226126o = 0;
        this.f226128q = false;
        this.f226129r = "";
        this.f226130s = "";
        this.f226131t = "";
        this.f226132u = 0.0f;
    }

    public boolean a() {
        return (this.f226119e == -85.0d || this.f226120f == -1000.0d) ? false : true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m65929x9616526c() {
        return this.f226119e + " " + this.f226120f + " " + this.f226122h + " " + this.f226124m + "  " + this.f226118d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f226118d);
        parcel.writeDouble(this.f226119e);
        parcel.writeDouble(this.f226120f);
        parcel.writeInt(this.f226121g);
        parcel.writeString(this.f226122h);
        parcel.writeString(this.f226123i);
        parcel.writeString(this.f226124m);
        parcel.writeString(this.f226125n);
        parcel.writeInt(this.f226126o);
        parcel.writeString(this.f226127p);
        parcel.writeInt(this.f226128q ? 1 : 0);
        parcel.writeString(this.f226129r);
        parcel.writeString(this.f226130s);
        parcel.writeString(this.f226131t);
        parcel.writeFloat(this.f226132u);
        parcel.writeString(this.f226133v);
        parcel.writeString(this.f226134w);
    }

    public C16279x64cea23(boolean z17) {
        this.f226118d = "";
        this.f226119e = -85.0d;
        this.f226120f = -1000.0d;
        this.f226122h = "";
        this.f226123i = "zh-cn";
        this.f226125n = "";
        this.f226126o = 0;
        this.f226128q = false;
        this.f226129r = "";
        this.f226130s = "";
        this.f226131t = "";
        this.f226132u = 0.0f;
        this.f226118d = m65929x9616526c() + " " + java.lang.System.nanoTime();
        this.f226121g = z17 ? 20 : 15;
    }
}
