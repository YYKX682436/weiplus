package com.tencent.mm.plugin.appbrand.jsapi.media;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class JsApiChooseMedia$ChooseResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.media.o3();

    /* renamed from: d, reason: collision with root package name */
    public int f81647d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f81648e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f81649f;

    public JsApiChooseMedia$ChooseResult(android.os.Parcel parcel) {
        readParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
        this.f81647d = parcel.readInt();
        this.f81648e = parcel.readString();
        this.f81649f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f81647d);
        parcel.writeString(this.f81648e);
        parcel.writeString(this.f81649f);
    }
}
