package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b;

/* renamed from: com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo */
/* loaded from: classes10.dex */
public class C16995x8ab634cd implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd> f37773x681a0c0c = new ut3.n();

    /* renamed from: d, reason: collision with root package name */
    public int f237223d;

    /* renamed from: e, reason: collision with root package name */
    public final int f237224e;

    /* renamed from: f, reason: collision with root package name */
    public final long f237225f;

    /* renamed from: g, reason: collision with root package name */
    public int f237226g;

    /* renamed from: h, reason: collision with root package name */
    public long f237227h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f237228i;

    /* renamed from: m, reason: collision with root package name */
    public int f237229m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f237230n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f237231o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f237232p;

    /* renamed from: q, reason: collision with root package name */
    public int f237233q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f237234r;

    /* renamed from: s, reason: collision with root package name */
    public int f237235s;

    public C16995x8ab634cd() {
        this.f237223d = -1;
        this.f237224e = -1;
        this.f237225f = -1L;
        this.f237226g = 0;
        this.f237227h = 0L;
        this.f237228i = null;
        this.f237229m = 0;
        this.f237230n = "";
        this.f237231o = "";
        this.f237232p = "";
        this.f237233q = 0;
        this.f237234r = "";
        this.f237235s = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f237223d);
        parcel.writeInt(this.f237224e);
        parcel.writeLong(this.f237225f);
        parcel.writeInt(this.f237226g);
        parcel.writeLong(this.f237227h);
        parcel.writeString(this.f237228i);
        parcel.writeInt(this.f237229m);
        parcel.writeString(this.f237230n);
        parcel.writeString(this.f237231o);
        parcel.writeString(this.f237232p);
        parcel.writeInt(this.f237233q);
        parcel.writeString(this.f237234r);
        parcel.writeInt(this.f237235s);
    }

    public C16995x8ab634cd(android.os.Parcel parcel) {
        this.f237223d = -1;
        this.f237224e = -1;
        this.f237225f = -1L;
        this.f237226g = 0;
        this.f237227h = 0L;
        this.f237228i = null;
        this.f237229m = 0;
        this.f237230n = "";
        this.f237231o = "";
        this.f237232p = "";
        this.f237233q = 0;
        this.f237234r = "";
        this.f237235s = 0;
        this.f237223d = parcel.readInt();
        this.f237224e = parcel.readInt();
        this.f237225f = parcel.readLong();
        this.f237226g = parcel.readInt();
        this.f237227h = parcel.readLong();
        this.f237228i = parcel.readString();
        this.f237229m = parcel.readInt();
        this.f237230n = parcel.readString();
        this.f237231o = parcel.readString();
        this.f237232p = parcel.readString();
        this.f237233q = parcel.readInt();
        this.f237234r = parcel.readString();
        this.f237235s = parcel.readInt();
    }
}
