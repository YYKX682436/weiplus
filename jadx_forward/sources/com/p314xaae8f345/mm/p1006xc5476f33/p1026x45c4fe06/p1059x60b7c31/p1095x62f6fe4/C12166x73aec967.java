package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseRequest */
/* loaded from: classes7.dex */
public final class C12166x73aec967 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12166x73aec967> f34468x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u4();

    /* renamed from: d, reason: collision with root package name */
    java.lang.String f163198d;

    /* renamed from: e, reason: collision with root package name */
    int f163199e;

    /* renamed from: f, reason: collision with root package name */
    boolean f163200f;

    /* renamed from: g, reason: collision with root package name */
    boolean f163201g;

    /* renamed from: h, reason: collision with root package name */
    boolean f163202h;

    public C12166x73aec967() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: getTaskClass */
    public java.lang.Class<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v> mo50317x8a7a03d() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z4.class;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: getUIAlias */
    public java.lang.String mo50398xeb5ebc06() {
        return "GalleryChooseVideo";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: oneShotForeground */
    public boolean mo50401x34ca7fe3() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: readParcel */
    public void mo50318xdc053d3f(android.os.Parcel parcel) {
        this.f163198d = parcel.readString();
        this.f163199e = parcel.readInt();
        this.f163200f = parcel.readByte() != 0;
        this.f163201g = parcel.readByte() != 0;
        this.f163202h = parcel.readByte() != 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f163198d);
        parcel.writeInt(this.f163199e);
        parcel.writeByte(this.f163200f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f163201g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f163202h ? (byte) 1 : (byte) 0);
    }

    public C12166x73aec967(android.os.Parcel parcel) {
        mo50318xdc053d3f(parcel);
    }
}
