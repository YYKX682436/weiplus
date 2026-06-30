package com.tencent.mm.plugin.appbrand.jsapi.media;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class JsApiChooseVideo$ChooseResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.media.v4();

    /* renamed from: d, reason: collision with root package name */
    public int f81670d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject f81671e;

    public JsApiChooseVideo$ChooseResult(android.os.Parcel parcel) {
        readParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
        this.f81670d = parcel.readInt();
        this.f81671e = (com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject) parcel.readParcelable(com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f81670d);
        parcel.writeParcelable(this.f81671e, i17);
    }
}
