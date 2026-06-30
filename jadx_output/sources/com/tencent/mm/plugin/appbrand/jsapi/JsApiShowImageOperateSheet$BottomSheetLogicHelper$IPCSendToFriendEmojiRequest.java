package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
final class JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCSendToFriendEmojiRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCSendToFriendEmojiRequest> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.he();

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f78649d;

    public JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCSendToFriendEmojiRequest() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.ie.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f78649d);
    }

    public JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCSendToFriendEmojiRequest(android.os.Parcel parcel) {
        this.f78649d = parcel.readString();
    }
}
