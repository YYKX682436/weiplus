package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
final class AppBrandFloatBallPermissionHelper$CheckFloatBallPermissionRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallPermissionHelper$CheckFloatBallPermissionRequest> CREATOR = new com.tencent.mm.plugin.appbrand.floatball.p();

    /* renamed from: d, reason: collision with root package name */
    int f78059d;

    public AppBrandFloatBallPermissionHelper$CheckFloatBallPermissionRequest() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.floatball.s.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public void readParcel(android.os.Parcel parcel) {
        this.f78059d = parcel.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f78059d);
    }

    public AppBrandFloatBallPermissionHelper$CheckFloatBallPermissionRequest(android.os.Parcel parcel) {
        super(parcel);
    }
}
