package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan;

/* loaded from: classes7.dex */
public class ScanFilterCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanFilterCompat> CREATOR = new pb1.y();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f80096d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f80097e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.ParcelUuid f80098f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.ParcelUuid f80099g;

    /* renamed from: h, reason: collision with root package name */
    public final android.os.ParcelUuid f80100h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f80101i;

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f80102m;

    /* renamed from: n, reason: collision with root package name */
    public final int f80103n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f80104o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f80105p;

    public ScanFilterCompat(java.lang.String str, java.lang.String str2, android.os.ParcelUuid parcelUuid, android.os.ParcelUuid parcelUuid2, android.os.ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i17, byte[] bArr3, byte[] bArr4, pb1.y yVar) {
        this.f80096d = str;
        this.f80098f = parcelUuid;
        this.f80099g = parcelUuid2;
        this.f80097e = str2;
        this.f80100h = parcelUuid3;
        this.f80101i = bArr;
        this.f80102m = bArr2;
        this.f80103n = i17;
        this.f80104o = bArr3;
        this.f80105p = bArr4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanFilterCompat scanFilterCompat = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanFilterCompat) obj;
        return pb1.w.b(this.f80096d, scanFilterCompat.f80096d) && pb1.w.b(this.f80097e, scanFilterCompat.f80097e) && this.f80103n == scanFilterCompat.f80103n && pb1.w.a(this.f80104o, scanFilterCompat.f80104o) && pb1.w.a(this.f80105p, scanFilterCompat.f80105p) && pb1.w.a(this.f80100h, scanFilterCompat.f80100h) && pb1.w.a(this.f80101i, scanFilterCompat.f80101i) && pb1.w.a(this.f80102m, scanFilterCompat.f80102m) && pb1.w.b(this.f80098f, scanFilterCompat.f80098f) && pb1.w.b(this.f80099g, scanFilterCompat.f80099g);
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f80096d, this.f80097e, java.lang.Integer.valueOf(this.f80103n), this.f80104o, this.f80105p, this.f80100h, this.f80101i, this.f80102m, this.f80098f, this.f80099g});
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BluetoothLeScanFilter [mDeviceName=");
        sb6.append(this.f80096d);
        sb6.append(", mDeviceAddress=");
        sb6.append(this.f80097e);
        sb6.append(", mUuid=");
        sb6.append(this.f80098f);
        sb6.append(", mUuidMask=");
        sb6.append(this.f80099g);
        sb6.append(", mServiceDataUuid=");
        android.os.ParcelUuid parcelUuid = this.f80100h;
        sb6.append(parcelUuid == null ? "null" : parcelUuid.toString());
        sb6.append(", mServiceData=");
        sb6.append(java.util.Arrays.toString(this.f80101i));
        sb6.append(", mServiceDataMask=");
        sb6.append(java.util.Arrays.toString(this.f80102m));
        sb6.append(", mManufacturerId=");
        sb6.append(this.f80103n);
        sb6.append(", mManufacturerData=");
        sb6.append(java.util.Arrays.toString(this.f80104o));
        sb6.append(", mManufacturerDataMask=");
        sb6.append(java.util.Arrays.toString(this.f80105p));
        sb6.append("]");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        java.lang.String str = this.f80096d;
        parcel.writeInt(str == null ? 0 : 1);
        if (str != null) {
            parcel.writeString(str);
        }
        java.lang.String str2 = this.f80097e;
        parcel.writeInt(str2 == null ? 0 : 1);
        if (str2 != null) {
            parcel.writeString(str2);
        }
        android.os.ParcelUuid parcelUuid = this.f80098f;
        parcel.writeInt(parcelUuid == null ? 0 : 1);
        if (parcelUuid != null) {
            parcel.writeParcelable(parcelUuid, i17);
            android.os.ParcelUuid parcelUuid2 = this.f80099g;
            parcel.writeInt(parcelUuid2 == null ? 0 : 1);
            if (parcelUuid2 != null) {
                parcel.writeParcelable(parcelUuid2, i17);
            }
        }
        android.os.ParcelUuid parcelUuid3 = this.f80100h;
        parcel.writeInt(parcelUuid3 == null ? 0 : 1);
        if (parcelUuid3 != null) {
            parcel.writeParcelable(parcelUuid3, i17);
            byte[] bArr = this.f80101i;
            parcel.writeInt(bArr == null ? 0 : 1);
            if (bArr != null) {
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(bArr);
                byte[] bArr2 = this.f80102m;
                parcel.writeInt(bArr2 == null ? 0 : 1);
                if (bArr2 != null) {
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(bArr2);
                }
            }
        }
        parcel.writeInt(this.f80103n);
        byte[] bArr3 = this.f80104o;
        parcel.writeInt(bArr3 == null ? 0 : 1);
        if (bArr3 != null) {
            parcel.writeInt(bArr3.length);
            parcel.writeByteArray(bArr3);
            byte[] bArr4 = this.f80105p;
            parcel.writeInt(bArr4 != null ? 1 : 0);
            if (bArr4 != null) {
                parcel.writeInt(bArr4.length);
                parcel.writeByteArray(bArr4);
            }
        }
    }
}
