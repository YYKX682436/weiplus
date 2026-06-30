package com.tencent.mm.plugin.appbrand.permission;

/* loaded from: classes7.dex */
public final class AppRuntimeApiPermissionBundle implements android.os.Parcelable, com.tencent.mm.plugin.appbrand.jsapi.g0 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f87393d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f87394e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f87395f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle f87392g = new com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle();
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle> CREATOR = new si1.f();

    public AppRuntimeApiPermissionBundle(r45.b10 b10Var) {
        this.f87393d = b10Var.f370425d.f192156a;
        java.util.LinkedList linkedList = b10Var.f370426e;
        this.f87394e = ((com.tencent.mm.protobuf.g) linkedList.get(0)).f192156a;
        this.f87395f = ((com.tencent.mm.protobuf.g) linkedList.get(1)).f192156a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "PermissionBundle[%d][%d][%d]", java.lang.Integer.valueOf(this.f87393d.length), java.lang.Integer.valueOf(this.f87394e.length), java.lang.Integer.valueOf(this.f87395f.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByteArray(this.f87393d);
        parcel.writeByteArray(this.f87394e);
        parcel.writeByteArray(this.f87395f);
    }

    private AppRuntimeApiPermissionBundle() {
        this.f87393d = new byte[0];
        this.f87394e = new byte[0];
        this.f87395f = new byte[0];
    }

    public AppRuntimeApiPermissionBundle(android.os.Parcel parcel, si1.f fVar) {
        this.f87393d = parcel.createByteArray();
        this.f87394e = parcel.createByteArray();
        this.f87395f = parcel.createByteArray();
    }
}
