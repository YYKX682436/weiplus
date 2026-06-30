package i32;

/* loaded from: classes13.dex */
public class b extends u32.c0 {

    /* renamed from: d, reason: collision with root package name */
    public static i32.b f369651d;

    @Override // u32.d0
    public void p5(int i17, long j17, int i18, int i19, byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Long.valueOf(j17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        objArr[3] = java.lang.Integer.valueOf(i19);
        objArr[4] = java.lang.Integer.valueOf(bArr == null ? -1 : bArr.length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.DeviceRequestManager", "------onDeviceRequest------ errorCode = %d, deviceId = %d, seq = %d, cmdId = %d, datalength = %d", objArr);
        t32.a.a(j17, i17 == 0 ? 1 : 0);
        if (a42.i.a(bArr) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.DeviceRequestManager", "dataIn is null!!! Just leave without process data");
        } else {
            new i32.a(i17, j17, i18, i19, bArr).a();
        }
    }
}
