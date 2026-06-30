package com.tencent.mm.plugin.appbrand.permission.appidABTest;

/* loaded from: classes7.dex */
public class AppRuntimeAppidABTestPermissionBundle implements android.os.Parcelable, com.tencent.mm.plugin.appbrand.jsapi.g0 {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle> CREATOR = new ti1.a();

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f87396d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f87397e;

    public AppRuntimeAppidABTestPermissionBundle(byte[] bArr, byte[] bArr2) {
        this.f87396d = bArr;
        this.f87397e = bArr2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByteArray(this.f87396d);
        parcel.writeByteArray(this.f87397e);
    }

    public AppRuntimeAppidABTestPermissionBundle(android.os.Parcel parcel) {
        this.f87396d = parcel.createByteArray();
        this.f87397e = parcel.createByteArray();
    }
}
