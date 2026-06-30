package com.tencent.mm.plugin.appbrand.jsapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.ge();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f78644d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f78645e;

    /* renamed from: f, reason: collision with root package name */
    public int f78646f;

    /* renamed from: g, reason: collision with root package name */
    public int f78647g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.CodePointRect f78648h;

    public JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult(android.os.Parcel parcel) {
        this.f78644d = parcel.readString();
        this.f78645e = parcel.readString();
        this.f78646f = parcel.readInt();
        this.f78647g = parcel.readInt();
        this.f78648h = (com.tencent.mm.plugin.scanner.CodePointRect) parcel.readParcelable(com.tencent.mm.plugin.scanner.CodePointRect.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f78644d);
        parcel.writeString(this.f78645e);
        parcel.writeInt(this.f78646f);
        parcel.writeInt(this.f78647g);
        parcel.writeParcelable(this.f78648h, i17);
    }
}
