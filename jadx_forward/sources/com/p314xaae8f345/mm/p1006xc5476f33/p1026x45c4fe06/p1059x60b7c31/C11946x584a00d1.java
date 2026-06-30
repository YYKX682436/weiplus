package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult */
/* loaded from: classes8.dex */
public final class C11946x584a00d1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11946x584a00d1> f33675x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ge();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f160177d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f160178e;

    /* renamed from: f, reason: collision with root package name */
    public int f160179f;

    /* renamed from: g, reason: collision with root package name */
    public int f160180g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17258x2152d807 f160181h;

    public C11946x584a00d1(android.os.Parcel parcel) {
        this.f160177d = parcel.readString();
        this.f160178e = parcel.readString();
        this.f160179f = parcel.readInt();
        this.f160180g = parcel.readInt();
        this.f160181h = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17258x2152d807) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17258x2152d807.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160177d);
        parcel.writeString(this.f160178e);
        parcel.writeInt(this.f160179f);
        parcel.writeInt(this.f160180g);
        parcel.writeParcelable(this.f160181h, i17);
    }
}
