package com.tencent.mm.plugin.appbrand.jsapi.media;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class JsApiChooseImage$ChooseResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseResult> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.media.v2();

    /* renamed from: d, reason: collision with root package name */
    public int f81632d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f81633e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
        this.f81632d = parcel.readInt();
        this.f81633e = parcel.createTypedArrayList(com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f81632d);
        parcel.writeTypedList(this.f81633e);
    }
}
