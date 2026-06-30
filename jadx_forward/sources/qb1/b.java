package qb1;

/* loaded from: classes7.dex */
public abstract class b {
    public static byte[] a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return bArr;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.BleHelper", "data is null", new java.lang.Object[0]);
        return new byte[0];
    }

    public static boolean b() {
        if (d() == null) {
            return false;
        }
        return d().isEnabled();
    }

    public static boolean c() {
        return !fp.h.a(18) && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    public static synchronized android.bluetooth.BluetoothAdapter d() {
        synchronized (qb1.b.class) {
            android.bluetooth.BluetoothManager e17 = e();
            if (e17 != null) {
                return e17.getAdapter();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.BleHelper", "BluetoothManager is null err", new java.lang.Object[0]);
            return null;
        }
    }

    public static synchronized android.bluetooth.BluetoothManager e() {
        android.bluetooth.BluetoothManager bluetoothManager;
        synchronized (qb1.b.class) {
            bluetoothManager = (android.bluetooth.BluetoothManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("bluetooth");
        }
        return bluetoothManager;
    }

    public static boolean f(java.lang.String str) {
        try {
            java.util.UUID.fromString(str);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
