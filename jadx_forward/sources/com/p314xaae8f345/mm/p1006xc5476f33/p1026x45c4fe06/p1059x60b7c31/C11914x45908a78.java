package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$IPCFavRequest */
/* loaded from: classes7.dex */
public final class C11914x45908a78 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11914x45908a78> f33649x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c3();

    /* renamed from: d, reason: collision with root package name */
    java.lang.String f160029d;

    /* renamed from: e, reason: collision with root package name */
    java.lang.String f160030e;

    /* renamed from: f, reason: collision with root package name */
    java.lang.String f160031f;

    /* renamed from: g, reason: collision with root package name */
    java.lang.String f160032g;

    /* renamed from: h, reason: collision with root package name */
    int f160033h;

    /* renamed from: i, reason: collision with root package name */
    int f160034i;

    /* renamed from: m, reason: collision with root package name */
    java.lang.String f160035m;

    /* renamed from: n, reason: collision with root package name */
    java.lang.String f160036n;

    /* renamed from: o, reason: collision with root package name */
    int f160037o;

    /* renamed from: p, reason: collision with root package name */
    int f160038p;

    /* renamed from: q, reason: collision with root package name */
    int f160039q;

    /* renamed from: r, reason: collision with root package name */
    java.lang.String f160040r;

    /* renamed from: s, reason: collision with root package name */
    int f160041s;

    /* renamed from: t, reason: collision with root package name */
    boolean f160042t;

    /* renamed from: u, reason: collision with root package name */
    boolean f160043u;

    public C11914x45908a78() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: getTaskClass */
    public java.lang.Class<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v> mo50317x8a7a03d() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g3.class;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: useLandscape */
    public boolean mo50403x949e94f4() {
        return this.f160042t;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160029d);
        parcel.writeString(this.f160030e);
        parcel.writeString(this.f160031f);
        parcel.writeString(this.f160032g);
        parcel.writeInt(this.f160033h);
        parcel.writeInt(this.f160034i);
        parcel.writeString(this.f160035m);
        parcel.writeString(this.f160036n);
        parcel.writeInt(this.f160037o);
        parcel.writeInt(this.f160038p);
        parcel.writeInt(this.f160039q);
        parcel.writeString(this.f160040r);
        parcel.writeInt(this.f160041s);
        parcel.writeInt(this.f160042t ? 1 : 0);
        parcel.writeByte(this.f160043u ? (byte) 1 : (byte) 0);
    }

    public C11914x45908a78(android.os.Parcel parcel) {
        this.f160029d = parcel.readString();
        this.f160030e = parcel.readString();
        this.f160031f = parcel.readString();
        this.f160032g = parcel.readString();
        this.f160033h = parcel.readInt();
        this.f160034i = parcel.readInt();
        this.f160035m = parcel.readString();
        this.f160036n = parcel.readString();
        this.f160037o = parcel.readInt();
        this.f160038p = parcel.readInt();
        this.f160039q = parcel.readInt();
        this.f160040r = parcel.readString();
        this.f160041s = parcel.readInt();
        this.f160042t = parcel.readInt() == 1;
        this.f160043u = parcel.readByte() == 1;
    }
}
