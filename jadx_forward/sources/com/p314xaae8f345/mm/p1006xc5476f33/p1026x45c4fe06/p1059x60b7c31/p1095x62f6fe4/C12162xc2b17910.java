package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest */
/* loaded from: classes7.dex */
public final class C12162xc2b17910 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12162xc2b17910> f34464x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.n3();

    /* renamed from: d, reason: collision with root package name */
    java.lang.String f163167d;

    /* renamed from: e, reason: collision with root package name */
    boolean f163168e;

    /* renamed from: f, reason: collision with root package name */
    boolean f163169f;

    /* renamed from: g, reason: collision with root package name */
    boolean f163170g;

    /* renamed from: h, reason: collision with root package name */
    boolean f163171h;

    /* renamed from: i, reason: collision with root package name */
    boolean f163172i;

    /* renamed from: m, reason: collision with root package name */
    boolean f163173m;

    /* renamed from: n, reason: collision with root package name */
    int f163174n;

    /* renamed from: o, reason: collision with root package name */
    int f163175o;

    /* renamed from: p, reason: collision with root package name */
    boolean f163176p;

    /* renamed from: q, reason: collision with root package name */
    boolean f163177q;

    /* renamed from: r, reason: collision with root package name */
    boolean f163178r;

    /* renamed from: s, reason: collision with root package name */
    int f163179s;

    public C12162xc2b17910() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: getTaskClass */
    public java.lang.Class<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v> mo50317x8a7a03d() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3.class;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: getUIAlias */
    public java.lang.String mo50398xeb5ebc06() {
        return "GalleryChooseMedia";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: oneShotForeground */
    public boolean mo50401x34ca7fe3() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: readParcel */
    public void mo50318xdc053d3f(android.os.Parcel parcel) {
        this.f163167d = parcel.readString();
        this.f163168e = parcel.readByte() != 0;
        this.f163169f = parcel.readByte() != 0;
        this.f163170g = parcel.readByte() != 0;
        this.f163171h = parcel.readByte() != 0;
        this.f163172i = parcel.readByte() != 0;
        this.f163173m = parcel.readByte() != 0;
        this.f163174n = parcel.readInt();
        this.f163175o = parcel.readInt();
        this.f163176p = parcel.readByte() != 0;
        this.f163177q = parcel.readByte() != 0;
        this.f163178r = parcel.readByte() != 0;
        this.f163179s = parcel.readInt();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f163167d);
        parcel.writeByte(this.f163168e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f163169f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f163170g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f163171h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f163172i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f163173m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f163174n);
        parcel.writeInt(this.f163175o);
        parcel.writeByte(this.f163176p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f163177q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f163178r ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f163179s);
    }

    public C12162xc2b17910(android.os.Parcel parcel) {
        mo50318xdc053d3f(parcel);
    }
}
