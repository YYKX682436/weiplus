package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api;

/* renamed from: com.tencent.mm.plugin.scanner.api.ScanGoodsRequest */
/* loaded from: classes.dex */
public class C17265xca2bb196 extends com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17264x215089a1 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17265xca2bb196> f37913x681a0c0c = new ry3.n();

    /* renamed from: m, reason: collision with root package name */
    public int f240201m;

    /* renamed from: n, reason: collision with root package name */
    public int f240202n;

    /* renamed from: o, reason: collision with root package name */
    public int f240203o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f240204p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f240205q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f240206r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f240207s;

    /* renamed from: t, reason: collision with root package name */
    public int f240208t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f240209u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f240210v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f240211w;

    public C17265xca2bb196() {
        this.f240208t = 0;
        this.f240195d = true;
        this.f240196e = true;
        this.f240197f = true;
        this.f240198g = true;
        this.f240199h = true;
        this.f240209u = true;
        this.f240210v = false;
        this.f240203o = 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17264x215089a1, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17264x215089a1, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f240201m);
        parcel.writeInt(this.f240202n);
        parcel.writeInt(this.f240203o);
        parcel.writeString(this.f240204p);
        parcel.writeString(this.f240205q);
        parcel.writeString(this.f240206r);
        parcel.writeString(this.f240207s);
        parcel.writeInt(this.f240208t);
        parcel.writeByte(this.f240209u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f240210v ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f240211w);
    }

    public C17265xca2bb196(android.os.Parcel parcel) {
        super(parcel);
        this.f240208t = 0;
        this.f240209u = true;
        this.f240210v = false;
        this.f240201m = parcel.readInt();
        this.f240202n = parcel.readInt();
        this.f240203o = parcel.readInt();
        this.f240204p = parcel.readString();
        this.f240205q = parcel.readString();
        this.f240206r = parcel.readString();
        this.f240207s = parcel.readString();
        this.f240208t = parcel.readInt();
        this.f240209u = parcel.readByte() != 0;
        this.f240210v = parcel.readByte() != 0;
        this.f240211w = parcel.readString();
    }
}
