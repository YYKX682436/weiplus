package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam */
/* loaded from: classes7.dex */
final class C11945x7657f959 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11945x7657f959> f33674x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.fe();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f160175d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f160176e;

    public C11945x7657f959(android.os.Parcel parcel) {
        this.f160175d = parcel.readString();
        this.f160176e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160175d);
        parcel.writeString(this.f160176e);
    }
}
