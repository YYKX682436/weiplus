package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.p1175xe0b91e4f;

/* renamed from: com.tencent.mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle */
/* loaded from: classes7.dex */
public class C12541xa79a9e89 implements android.os.Parcelable, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.p1175xe0b91e4f.C12541xa79a9e89> f35147x681a0c0c = new ti1.a();

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f168929d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f168930e;

    public C12541xa79a9e89(byte[] bArr, byte[] bArr2) {
        this.f168929d = bArr;
        this.f168930e = bArr2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByteArray(this.f168929d);
        parcel.writeByteArray(this.f168930e);
    }

    public C12541xa79a9e89(android.os.Parcel parcel) {
        this.f168929d = parcel.createByteArray();
        this.f168930e = parcel.createByteArray();
    }
}
