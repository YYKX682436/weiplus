package com.tencent.mm.plugin.appbrand.jsapi.game;

/* loaded from: classes7.dex */
class JsApiOpenGameDetail$OpenGameDetailTask extends com.tencent.mm.plugin.appbrand.ipc.v {

    /* loaded from: classes7.dex */
    public static final class OpenGameDetailRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.game.JsApiOpenGameDetail$OpenGameDetailTask.OpenGameDetailRequest> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.game.d();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f81244d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f81245e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f81246f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f81247g;

        public OpenGameDetailRequest() {
        }

        @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
        public boolean forcePortrait() {
            return true;
        }

        @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
        public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
            return com.tencent.mm.plugin.appbrand.jsapi.game.JsApiOpenGameDetail$OpenGameDetailTask.class;
        }

        @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
        public void readParcel(android.os.Parcel parcel) {
            this.f81244d = parcel.readString();
            this.f81245e = parcel.readString();
            this.f81246f = parcel.readString();
            this.f81247g = parcel.readString();
        }

        @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f81244d);
            parcel.writeString(this.f81245e);
            parcel.writeString(this.f81246f);
            parcel.writeString(this.f81247g);
        }

        public OpenGameDetailRequest(android.os.Parcel parcel) {
            readParcel(parcel);
        }
    }

    private JsApiOpenGameDetail$OpenGameDetailTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        com.tencent.mm.plugin.appbrand.jsapi.game.JsApiOpenGameDetail$OpenGameDetailTask.OpenGameDetailResult openGameDetailResult = new com.tencent.mm.plugin.appbrand.jsapi.game.JsApiOpenGameDetail$OpenGameDetailTask.OpenGameDetailResult();
        if (!(appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.game.JsApiOpenGameDetail$OpenGameDetailTask.OpenGameDetailRequest)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOpenGameDetail", "handleRequest, request not instance of OpenGameDetailRequest, finishProcess");
            openGameDetailResult.f81248d = false;
            finishProcess(openGameDetailResult);
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.game.JsApiOpenGameDetail$OpenGameDetailTask.OpenGameDetailRequest openGameDetailRequest = (com.tencent.mm.plugin.appbrand.jsapi.game.JsApiOpenGameDetail$OpenGameDetailTask.OpenGameDetailRequest) appBrandProxyUIProcessTask$ProcessRequest;
        java.lang.String str = openGameDetailRequest.f81244d;
        java.lang.String str2 = openGameDetailRequest.f81245e;
        java.lang.String str3 = openGameDetailRequest.f81246f;
        java.lang.String str4 = openGameDetailRequest.f81247g;
        ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).fj(getActivityContext(), str, str2, "waapp", str3, str4, new com.tencent.mm.plugin.appbrand.jsapi.game.c(this, openGameDetailResult));
    }

    /* loaded from: classes7.dex */
    public static final class OpenGameDetailResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.game.JsApiOpenGameDetail$OpenGameDetailTask.OpenGameDetailResult> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.game.e();

        /* renamed from: d, reason: collision with root package name */
        public boolean f81248d = false;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f81249e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f81250f;

        public OpenGameDetailResult() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
        public void readParcel(android.os.Parcel parcel) {
            this.f81248d = parcel.readInt() == 1;
            this.f81249e = parcel.readString();
            this.f81250f = parcel.readString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f81248d ? 1 : 0);
            parcel.writeString(this.f81249e);
            parcel.writeString(this.f81250f);
        }

        public OpenGameDetailResult(android.os.Parcel parcel) {
            readParcel(parcel);
        }
    }
}
