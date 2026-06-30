package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseRequest */
/* loaded from: classes7.dex */
public final class C12164x3187af27 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12164x3187af27> f34466x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.h4();

    /* renamed from: d, reason: collision with root package name */
    java.lang.String f163183d;

    /* renamed from: e, reason: collision with root package name */
    int f163184e;

    /* renamed from: f, reason: collision with root package name */
    double f163185f;

    /* renamed from: g, reason: collision with root package name */
    double f163186g;

    /* renamed from: h, reason: collision with root package name */
    java.lang.String f163187h;

    /* renamed from: i, reason: collision with root package name */
    double f163188i;

    /* renamed from: m, reason: collision with root package name */
    boolean f163189m;

    /* renamed from: n, reason: collision with root package name */
    boolean f163190n;

    /* renamed from: o, reason: collision with root package name */
    int f163191o;

    /* renamed from: p, reason: collision with root package name */
    boolean f163192p;

    /* renamed from: q, reason: collision with root package name */
    boolean f163193q;

    /* renamed from: r, reason: collision with root package name */
    int f163194r;

    /* renamed from: s, reason: collision with root package name */
    boolean f163195s;

    public C12164x3187af27() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: getTaskClass */
    public java.lang.Class<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v> mo50317x8a7a03d() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.o4.class;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: getUIAlias */
    public java.lang.String mo50398xeb5ebc06() {
        return "GalleryChooseMultiMedia";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: oneShotForeground */
    public boolean mo50401x34ca7fe3() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: readParcel */
    public void mo50318xdc053d3f(android.os.Parcel parcel) {
        this.f163183d = parcel.readString();
        this.f163184e = parcel.readInt();
        this.f163185f = parcel.readDouble();
        this.f163186g = parcel.readDouble();
        this.f163187h = parcel.readString();
        this.f163188i = parcel.readDouble();
        this.f163189m = parcel.readByte() != 0;
        this.f163190n = parcel.readByte() != 0;
        this.f163191o = parcel.readInt();
        this.f163192p = parcel.readByte() != 0;
        this.f163193q = parcel.readByte() != 0;
        this.f163194r = parcel.readInt();
        this.f163195s = parcel.readByte() != 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f163183d);
        parcel.writeInt(this.f163184e);
        parcel.writeDouble(this.f163185f);
        parcel.writeDouble(this.f163186g);
        parcel.writeString(this.f163187h);
        parcel.writeDouble(this.f163188i);
        parcel.writeByte(this.f163189m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f163190n ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f163191o);
        parcel.writeByte(this.f163192p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f163193q ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f163194r);
        parcel.writeByte(this.f163195s ? (byte) 1 : (byte) 0);
    }

    public C12164x3187af27(android.os.Parcel parcel) {
        mo50318xdc053d3f(parcel);
    }
}
