package com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc;

/* renamed from: com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo */
/* loaded from: classes8.dex */
public class C13091xf399cf00 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00> f35399x681a0c0c = new jv1.a();

    /* renamed from: d, reason: collision with root package name */
    public boolean f177031d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f177032e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f177033f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f177034g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f177035h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f177036i;

    /* renamed from: m, reason: collision with root package name */
    public int f177037m;

    /* renamed from: n, reason: collision with root package name */
    public int f177038n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f177039o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f177040p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f177041q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f177042r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f177043s;

    public C13091xf399cf00(android.os.Parcel parcel, jv1.a aVar) {
        this.f177031d = parcel.readByte() == 1;
        this.f177032e = parcel.readString();
        this.f177033f = parcel.readString();
        this.f177034g = parcel.readString();
        this.f177035h = parcel.readString();
        this.f177036i = parcel.readString();
        this.f177037m = parcel.readInt();
        this.f177038n = parcel.readInt();
        this.f177039o = parcel.readByte() == 1;
        this.f177041q = parcel.readByte() == 1;
        this.f177042r = parcel.readString();
        this.f177043s = parcel.readByte() == 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m54472xb2c87fbf(java.lang.Object obj) {
        return obj == this || (obj != null && (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00) obj).f177032e.equals(this.f177032e));
    }

    /* renamed from: hashCode */
    public int m54473x8cdac1b() {
        return this.f177032e.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f177031d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f177032e);
        parcel.writeString(this.f177033f);
        parcel.writeString(this.f177034g);
        parcel.writeString(this.f177035h);
        parcel.writeString(this.f177036i);
        parcel.writeInt(this.f177037m);
        parcel.writeInt(this.f177038n);
        parcel.writeByte(this.f177039o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f177041q ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f177042r);
        parcel.writeByte(this.f177043s ? (byte) 1 : (byte) 0);
    }

    public C13091xf399cf00(java.lang.String str) {
        this.f177032e = str;
    }
}
