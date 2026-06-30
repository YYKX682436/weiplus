package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanFilterCompat */
/* loaded from: classes7.dex */
public class C12039x60dafc57 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d.C12039x60dafc57> f33960x681a0c0c = new pb1.y();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f161629d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f161630e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.ParcelUuid f161631f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.ParcelUuid f161632g;

    /* renamed from: h, reason: collision with root package name */
    public final android.os.ParcelUuid f161633h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f161634i;

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f161635m;

    /* renamed from: n, reason: collision with root package name */
    public final int f161636n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f161637o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f161638p;

    public C12039x60dafc57(java.lang.String str, java.lang.String str2, android.os.ParcelUuid parcelUuid, android.os.ParcelUuid parcelUuid2, android.os.ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i17, byte[] bArr3, byte[] bArr4, pb1.y yVar) {
        this.f161629d = str;
        this.f161631f = parcelUuid;
        this.f161632g = parcelUuid2;
        this.f161630e = str2;
        this.f161633h = parcelUuid3;
        this.f161634i = bArr;
        this.f161635m = bArr2;
        this.f161636n = i17;
        this.f161637o = bArr3;
        this.f161638p = bArr4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50734xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d.C12039x60dafc57 c12039x60dafc57 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d.C12039x60dafc57) obj;
        return pb1.w.b(this.f161629d, c12039x60dafc57.f161629d) && pb1.w.b(this.f161630e, c12039x60dafc57.f161630e) && this.f161636n == c12039x60dafc57.f161636n && pb1.w.a(this.f161637o, c12039x60dafc57.f161637o) && pb1.w.a(this.f161638p, c12039x60dafc57.f161638p) && pb1.w.a(this.f161633h, c12039x60dafc57.f161633h) && pb1.w.a(this.f161634i, c12039x60dafc57.f161634i) && pb1.w.a(this.f161635m, c12039x60dafc57.f161635m) && pb1.w.b(this.f161631f, c12039x60dafc57.f161631f) && pb1.w.b(this.f161632g, c12039x60dafc57.f161632g);
    }

    /* renamed from: hashCode */
    public int m50735x8cdac1b() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f161629d, this.f161630e, java.lang.Integer.valueOf(this.f161636n), this.f161637o, this.f161638p, this.f161633h, this.f161634i, this.f161635m, this.f161631f, this.f161632g});
    }

    /* renamed from: toString */
    public java.lang.String m50736x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BluetoothLeScanFilter [mDeviceName=");
        sb6.append(this.f161629d);
        sb6.append(", mDeviceAddress=");
        sb6.append(this.f161630e);
        sb6.append(", mUuid=");
        sb6.append(this.f161631f);
        sb6.append(", mUuidMask=");
        sb6.append(this.f161632g);
        sb6.append(", mServiceDataUuid=");
        android.os.ParcelUuid parcelUuid = this.f161633h;
        sb6.append(parcelUuid == null ? "null" : parcelUuid.toString());
        sb6.append(", mServiceData=");
        sb6.append(java.util.Arrays.toString(this.f161634i));
        sb6.append(", mServiceDataMask=");
        sb6.append(java.util.Arrays.toString(this.f161635m));
        sb6.append(", mManufacturerId=");
        sb6.append(this.f161636n);
        sb6.append(", mManufacturerData=");
        sb6.append(java.util.Arrays.toString(this.f161637o));
        sb6.append(", mManufacturerDataMask=");
        sb6.append(java.util.Arrays.toString(this.f161638p));
        sb6.append("]");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        java.lang.String str = this.f161629d;
        parcel.writeInt(str == null ? 0 : 1);
        if (str != null) {
            parcel.writeString(str);
        }
        java.lang.String str2 = this.f161630e;
        parcel.writeInt(str2 == null ? 0 : 1);
        if (str2 != null) {
            parcel.writeString(str2);
        }
        android.os.ParcelUuid parcelUuid = this.f161631f;
        parcel.writeInt(parcelUuid == null ? 0 : 1);
        if (parcelUuid != null) {
            parcel.writeParcelable(parcelUuid, i17);
            android.os.ParcelUuid parcelUuid2 = this.f161632g;
            parcel.writeInt(parcelUuid2 == null ? 0 : 1);
            if (parcelUuid2 != null) {
                parcel.writeParcelable(parcelUuid2, i17);
            }
        }
        android.os.ParcelUuid parcelUuid3 = this.f161633h;
        parcel.writeInt(parcelUuid3 == null ? 0 : 1);
        if (parcelUuid3 != null) {
            parcel.writeParcelable(parcelUuid3, i17);
            byte[] bArr = this.f161634i;
            parcel.writeInt(bArr == null ? 0 : 1);
            if (bArr != null) {
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(bArr);
                byte[] bArr2 = this.f161635m;
                parcel.writeInt(bArr2 == null ? 0 : 1);
                if (bArr2 != null) {
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(bArr2);
                }
            }
        }
        parcel.writeInt(this.f161636n);
        byte[] bArr3 = this.f161637o;
        parcel.writeInt(bArr3 == null ? 0 : 1);
        if (bArr3 != null) {
            parcel.writeInt(bArr3.length);
            parcel.writeByteArray(bArr3);
            byte[] bArr4 = this.f161638p;
            parcel.writeInt(bArr4 != null ? 1 : 0);
            if (bArr4 != null) {
                parcel.writeInt(bArr4.length);
                parcel.writeByteArray(bArr4);
            }
        }
    }
}
