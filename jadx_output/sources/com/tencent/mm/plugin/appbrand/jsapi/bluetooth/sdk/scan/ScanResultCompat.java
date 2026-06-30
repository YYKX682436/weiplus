package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan;

/* loaded from: classes7.dex */
public class ScanResultCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat> CREATOR = new pb1.a0();

    /* renamed from: d, reason: collision with root package name */
    public android.bluetooth.BluetoothDevice f80106d;

    /* renamed from: e, reason: collision with root package name */
    public pb1.z f80107e;

    /* renamed from: f, reason: collision with root package name */
    public int f80108f;

    /* renamed from: g, reason: collision with root package name */
    public long f80109g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Boolean f80110h;

    public ScanResultCompat(android.bluetooth.le.ScanResult scanResult) {
        this.f80106d = scanResult.getDevice();
        android.bluetooth.le.ScanRecord scanRecord = scanResult.getScanRecord();
        if (scanRecord != null) {
            this.f80107e = pb1.z.a(scanRecord.getBytes());
        }
        this.f80108f = scanResult.getRssi();
        this.f80109g = java.lang.System.currentTimeMillis();
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.f80110h = java.lang.Boolean.valueOf(scanResult.isConnectable());
        } else {
            this.f80110h = null;
        }
    }

    public android.bluetooth.BluetoothDevice a() {
        android.bluetooth.BluetoothDevice bluetoothDevice = this.f80106d;
        if (bluetoothDevice != null) {
            return bluetoothDevice;
        }
        return null;
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
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat scanResultCompat = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat) obj;
        return pb1.w.b(this.f80106d, scanResultCompat.f80106d) && this.f80108f == scanResultCompat.f80108f && pb1.w.b(this.f80107e, scanResultCompat.f80107e) && this.f80109g == scanResultCompat.f80109g;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f80106d, java.lang.Integer.valueOf(this.f80108f), this.f80107e, java.lang.Long.valueOf(this.f80109g)});
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ScanResult{mDevice=");
        sb6.append(this.f80106d);
        sb6.append(", mScanRecord=");
        pb1.z zVar = this.f80107e;
        sb6.append(zVar == null ? "null" : zVar.toString());
        sb6.append(", mRssi=");
        sb6.append(this.f80108f);
        sb6.append(", mTimestampNanos=");
        sb6.append(this.f80109g);
        sb6.append('}');
        return sb6.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        if (this.f80106d != null) {
            parcel.writeInt(1);
            this.f80106d.writeToParcel(parcel, i17);
        } else {
            parcel.writeInt(0);
        }
        if (this.f80107e != null) {
            parcel.writeInt(1);
            parcel.writeByteArray(this.f80107e.f353170g);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f80108f);
        parcel.writeLong(this.f80109g);
        java.lang.Boolean bool = this.f80110h;
        parcel.writeInt(bool == null ? -1 : bool.booleanValue());
    }

    public ScanResultCompat(android.os.Parcel parcel, pb1.a0 a0Var) {
        if (parcel.readInt() == 1) {
            this.f80106d = (android.bluetooth.BluetoothDevice) android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 1) {
            this.f80107e = pb1.z.a(parcel.createByteArray());
        }
        this.f80108f = parcel.readInt();
        this.f80109g = parcel.readLong();
        int readInt = parcel.readInt();
        if (-1 == readInt) {
            this.f80110h = null;
        } else {
            this.f80110h = java.lang.Boolean.valueOf(1 == readInt);
        }
    }
}
