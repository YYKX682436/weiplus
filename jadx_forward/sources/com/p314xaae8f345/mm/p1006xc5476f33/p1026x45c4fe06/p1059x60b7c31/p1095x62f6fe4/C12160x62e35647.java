package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseRequest */
/* loaded from: classes7.dex */
public final class C12160x62e35647 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12160x62e35647> f34462x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u2();

    /* renamed from: d, reason: collision with root package name */
    java.lang.String f163158d;

    /* renamed from: e, reason: collision with root package name */
    int f163159e;

    /* renamed from: f, reason: collision with root package name */
    boolean f163160f;

    /* renamed from: g, reason: collision with root package name */
    boolean f163161g;

    /* renamed from: h, reason: collision with root package name */
    boolean f163162h;

    /* renamed from: i, reason: collision with root package name */
    boolean f163163i;

    /* renamed from: m, reason: collision with root package name */
    boolean f163164m = true;

    public C12160x62e35647() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: getTaskClass */
    public java.lang.Class<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v> mo50317x8a7a03d() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d3.class;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: getUIAlias */
    public java.lang.String mo50398xeb5ebc06() {
        return "GalleryChooseImage";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: oneShotForeground */
    public boolean mo50401x34ca7fe3() {
        if (this.f163164m) {
            return true;
        }
        this.f163164m = true;
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: readParcel */
    public void mo50318xdc053d3f(android.os.Parcel parcel) {
        this.f163158d = parcel.readString();
        this.f163159e = parcel.readInt();
        this.f163160f = parcel.readByte() != 0;
        this.f163161g = parcel.readByte() != 0;
        this.f163162h = parcel.readByte() != 0;
        this.f163163i = parcel.readByte() != 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f163158d);
        parcel.writeInt(this.f163159e);
        parcel.writeByte(this.f163160f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f163161g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f163162h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f163163i ? (byte) 1 : (byte) 0);
    }

    public C12160x62e35647(android.os.Parcel parcel) {
        mo50318xdc053d3f(parcel);
    }
}
