package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
final class AppBrandFloatBallPermissionHelper$CheckFloatBallPermissionResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallPermissionHelper$CheckFloatBallPermissionResult> CREATOR = new com.tencent.mm.plugin.appbrand.floatball.q();

    /* renamed from: d, reason: collision with root package name */
    public boolean f78060d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
        this.f78060d = parcel.readByte() == 1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f78060d ? (byte) 1 : (byte) 0);
    }
}
