package wo;

/* loaded from: classes12.dex */
public class k0 extends wo.r0 {
    @Override // wo.r0
    public java.lang.String b() {
        android.bluetooth.BluetoothAdapter defaultAdapter;
        try {
            if (android.os.Build.VERSION.SDK_INT >= 31 || (defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter()) == null || !defaultAdapter.isEnabled()) {
                return null;
            }
            return defaultAdapter.getAddress();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
