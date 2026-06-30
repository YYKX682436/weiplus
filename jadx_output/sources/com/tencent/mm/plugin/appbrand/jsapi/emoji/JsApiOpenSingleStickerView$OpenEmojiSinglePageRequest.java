package com.tencent.mm.plugin.appbrand.jsapi.emoji;

/* loaded from: classes7.dex */
final class JsApiOpenSingleStickerView$OpenEmojiSinglePageRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenSingleStickerView$OpenEmojiSinglePageRequest> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.emoji.o();

    /* renamed from: d, reason: collision with root package name */
    java.lang.String f80836d;

    public JsApiOpenSingleStickerView$OpenEmojiSinglePageRequest() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public boolean forcePortrait() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.emoji.r.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public void readParcel(android.os.Parcel parcel) {
        this.f80836d = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f80836d);
    }

    public JsApiOpenSingleStickerView$OpenEmojiSinglePageRequest(android.os.Parcel parcel) {
        readParcel(parcel);
    }
}
