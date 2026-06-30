package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.api;

/* renamed from: com.tencent.mm.plugin.game.luggage.api.GameAtSomeoneConfig */
/* loaded from: classes15.dex */
public class C15881xba5ff6ef implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.api.C15881xba5ff6ef> f36924x681a0c0c = new s43.e();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f221042d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f221043e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f221044f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f221045g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f221046h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f221047i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f221048m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f221049n;

    /* renamed from: o, reason: collision with root package name */
    public int f221050o;

    /* renamed from: p, reason: collision with root package name */
    public int f221051p;

    public C15881xba5ff6ef() {
        this.f221043e = false;
        this.f221044f = false;
        this.f221045g = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f221042d);
        parcel.writeInt(this.f221043e ? 1 : 0);
        parcel.writeInt(this.f221044f ? 1 : 0);
        parcel.writeInt(this.f221045g ? 1 : 0);
        parcel.writeString(this.f221046h);
        parcel.writeString(this.f221047i);
        parcel.writeString(this.f221048m);
        parcel.writeString(this.f221049n);
        parcel.writeInt(this.f221050o);
        parcel.writeInt(this.f221051p);
    }

    public C15881xba5ff6ef(android.os.Parcel parcel) {
        this.f221043e = false;
        this.f221044f = false;
        this.f221045g = false;
        this.f221042d = parcel.readString();
        this.f221043e = parcel.readInt() == 1;
        this.f221044f = parcel.readInt() == 1;
        this.f221045g = parcel.readInt() == 1;
        this.f221046h = parcel.readString();
        this.f221047i = parcel.readString();
        this.f221048m = parcel.readString();
        this.f221049n = parcel.readString();
        this.f221050o = parcel.readInt();
        this.f221051p = parcel.readInt();
    }
}
