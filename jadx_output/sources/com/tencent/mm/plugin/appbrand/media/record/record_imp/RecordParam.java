package com.tencent.mm.plugin.appbrand.media.record.record_imp;

/* loaded from: classes15.dex */
public class RecordParam implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam> CREATOR = new lh1.d();

    /* renamed from: d, reason: collision with root package name */
    public int f85835d;

    /* renamed from: e, reason: collision with root package name */
    public int f85836e;

    /* renamed from: f, reason: collision with root package name */
    public int f85837f;

    /* renamed from: g, reason: collision with root package name */
    public int f85838g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f85839h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f85840i;

    /* renamed from: m, reason: collision with root package name */
    public int f85841m;

    /* renamed from: n, reason: collision with root package name */
    public double f85842n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f85843o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f85844p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.media.record.e f85845q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.media.record.l f85846r;

    public RecordParam() {
        this.f85835d = 0;
        this.f85836e = 0;
        this.f85837f = 0;
        this.f85838g = 0;
        this.f85841m = 0;
        this.f85842n = 0.0d;
        this.f85843o = "";
        this.f85844p = "";
        this.f85845q = com.tencent.mm.plugin.appbrand.media.record.e.MIC;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f85835d);
        parcel.writeInt(this.f85836e);
        parcel.writeInt(this.f85837f);
        parcel.writeInt(this.f85838g);
        parcel.writeString(this.f85839h);
        parcel.writeString(this.f85840i);
        parcel.writeInt(this.f85841m);
        parcel.writeDouble(this.f85842n);
        parcel.writeString(this.f85843o);
        parcel.writeString(this.f85844p);
        parcel.writeInt(this.f85845q.ordinal());
    }

    public RecordParam(android.os.Parcel parcel) {
        this.f85835d = 0;
        this.f85836e = 0;
        this.f85837f = 0;
        this.f85838g = 0;
        this.f85841m = 0;
        this.f85842n = 0.0d;
        this.f85843o = "";
        this.f85844p = "";
        this.f85845q = com.tencent.mm.plugin.appbrand.media.record.e.MIC;
        this.f85835d = parcel.readInt();
        this.f85836e = parcel.readInt();
        this.f85837f = parcel.readInt();
        this.f85838g = parcel.readInt();
        this.f85839h = parcel.readString();
        this.f85840i = parcel.readString();
        this.f85841m = parcel.readInt();
        this.f85842n = parcel.readDouble();
        this.f85843o = parcel.readString();
        this.f85844p = parcel.readString();
        this.f85845q = com.tencent.mm.plugin.appbrand.media.record.e.values()[parcel.readInt()];
    }
}
