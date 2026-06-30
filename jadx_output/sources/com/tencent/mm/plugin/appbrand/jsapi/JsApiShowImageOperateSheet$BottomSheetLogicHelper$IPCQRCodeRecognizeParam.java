package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
final class JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.fe();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f78642d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f78643e;

    public JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam(android.os.Parcel parcel) {
        this.f78642d = parcel.readString();
        this.f78643e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f78642d);
        parcel.writeString(this.f78643e);
    }
}
