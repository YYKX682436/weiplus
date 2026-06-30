package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat */
/* loaded from: classes7.dex */
public class C12040xecd7293c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d.C12040xecd7293c> f33961x681a0c0c = new pb1.a0();

    /* renamed from: d, reason: collision with root package name */
    public android.bluetooth.BluetoothDevice f161639d;

    /* renamed from: e, reason: collision with root package name */
    public pb1.z f161640e;

    /* renamed from: f, reason: collision with root package name */
    public int f161641f;

    /* renamed from: g, reason: collision with root package name */
    public long f161642g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Boolean f161643h;

    public C12040xecd7293c(android.bluetooth.le.ScanResult scanResult) {
        this.f161639d = scanResult.getDevice();
        android.bluetooth.le.ScanRecord scanRecord = scanResult.getScanRecord();
        if (scanRecord != null) {
            this.f161640e = pb1.z.a(scanRecord.getBytes());
        }
        this.f161641f = scanResult.getRssi();
        this.f161642g = java.lang.System.currentTimeMillis();
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.f161643h = java.lang.Boolean.valueOf(scanResult.isConnectable());
        } else {
            this.f161643h = null;
        }
    }

    public android.bluetooth.BluetoothDevice a() {
        android.bluetooth.BluetoothDevice bluetoothDevice = this.f161639d;
        if (bluetoothDevice != null) {
            return bluetoothDevice;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50738xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d.C12040xecd7293c c12040xecd7293c = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d.C12040xecd7293c) obj;
        return pb1.w.b(this.f161639d, c12040xecd7293c.f161639d) && this.f161641f == c12040xecd7293c.f161641f && pb1.w.b(this.f161640e, c12040xecd7293c.f161640e) && this.f161642g == c12040xecd7293c.f161642g;
    }

    /* renamed from: hashCode */
    public int m50739x8cdac1b() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f161639d, java.lang.Integer.valueOf(this.f161641f), this.f161640e, java.lang.Long.valueOf(this.f161642g)});
    }

    /* renamed from: toString */
    public java.lang.String m50740x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ScanResult{mDevice=");
        sb6.append(this.f161639d);
        sb6.append(", mScanRecord=");
        pb1.z zVar = this.f161640e;
        sb6.append(zVar == null ? "null" : zVar.m158054x9616526c());
        sb6.append(", mRssi=");
        sb6.append(this.f161641f);
        sb6.append(", mTimestampNanos=");
        sb6.append(this.f161642g);
        sb6.append('}');
        return sb6.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        if (this.f161639d != null) {
            parcel.writeInt(1);
            this.f161639d.writeToParcel(parcel, i17);
        } else {
            parcel.writeInt(0);
        }
        if (this.f161640e != null) {
            parcel.writeInt(1);
            parcel.writeByteArray(this.f161640e.f434703g);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f161641f);
        parcel.writeLong(this.f161642g);
        java.lang.Boolean bool = this.f161643h;
        parcel.writeInt(bool == null ? -1 : bool.booleanValue());
    }

    public C12040xecd7293c(android.os.Parcel parcel, pb1.a0 a0Var) {
        if (parcel.readInt() == 1) {
            this.f161639d = (android.bluetooth.BluetoothDevice) android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 1) {
            this.f161640e = pb1.z.a(parcel.createByteArray());
        }
        this.f161641f = parcel.readInt();
        this.f161642g = parcel.readLong();
        int readInt = parcel.readInt();
        if (-1 == readInt) {
            this.f161643h = null;
        } else {
            this.f161643h = java.lang.Boolean.valueOf(1 == readInt);
        }
    }
}
