package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* renamed from: com.tencent.mm.plugin.scanner.ImageQBarDataBean */
/* loaded from: classes8.dex */
public class C17261xe88a6357 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357> f37911x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.e0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f240152d;

    /* renamed from: e, reason: collision with root package name */
    public int f240153e;

    /* renamed from: f, reason: collision with root package name */
    public int f240154f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f240155g;

    /* renamed from: h, reason: collision with root package name */
    public float f240156h;

    /* renamed from: i, reason: collision with root package name */
    public float f240157i;

    /* renamed from: m, reason: collision with root package name */
    public int f240158m;

    /* renamed from: n, reason: collision with root package name */
    public int f240159n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f240160o;

    /* renamed from: p, reason: collision with root package name */
    public int f240161p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f240162q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17258x2152d807 f240163r;

    public C17261xe88a6357(android.os.Parcel parcel) {
        this.f240152d = parcel.readString();
        this.f240153e = parcel.readInt();
        this.f240154f = parcel.readInt();
        this.f240155g = parcel.readString();
        this.f240156h = parcel.readFloat();
        this.f240157i = parcel.readFloat();
        this.f240158m = parcel.readInt();
        this.f240159n = parcel.readInt();
        this.f240160o = parcel.readString();
        this.f240161p = parcel.readInt();
        this.f240162q = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f240152d);
        parcel.writeInt(this.f240153e);
        parcel.writeInt(this.f240154f);
        parcel.writeString(this.f240155g);
        parcel.writeFloat(this.f240156h);
        parcel.writeFloat(this.f240157i);
        parcel.writeInt(this.f240158m);
        parcel.writeInt(this.f240159n);
        parcel.writeString(this.f240160o);
        parcel.writeInt(this.f240161p);
        parcel.writeByte(this.f240162q ? (byte) 1 : (byte) 0);
    }
}
