package com.tencent.mm.plugin.appbrand.jsapi.emoji;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class JsApiOpenSingleStickerView$OpenEmojiSinglePageResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenSingleStickerView$OpenEmojiSinglePageResult> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.emoji.p();

    /* renamed from: d, reason: collision with root package name */
    public boolean f80837d = false;

    public JsApiOpenSingleStickerView$OpenEmojiSinglePageResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
        this.f80837d = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f80837d ? 1 : 0);
    }

    public JsApiOpenSingleStickerView$OpenEmojiSinglePageResult(android.os.Parcel parcel) {
        readParcel(parcel);
    }
}
