package u32;

/* loaded from: classes13.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f505865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u32.g0 f505866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u32.a2 f505867f;

    public n1(u32.a2 a2Var, int i17, u32.g0 g0Var) {
        this.f505867f = a2Var;
        this.f505865d = i17;
        this.f505866e = g0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        u32.a2 a2Var = this.f505867f;
        u32.g0 g0Var = this.f505866e;
        boolean z18 = false;
        if (g0Var == null) {
            a2Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Error parameter: null == aCallback !!!");
        } else {
            a2Var.f505792e.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BTDeviceManager", "------stopScan------");
            int i17 = this.f505865d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---stopScan--- aBluetoothVersion = %d", java.lang.Integer.valueOf(i17));
            u32.p b17 = u32.p.b();
            boolean mo50293x3498a0 = b17.f505877e.mo50293x3498a0(new u32.k(b17, i17));
            if (!mo50293x3498a0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "stopScan: instance.mHandler.post failed!!!");
            }
            if (mo50293x3498a0) {
                z17 = true;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BTDeviceManager", "BluetoothSDKAdapter.stopScan Failed!!!");
                z17 = false;
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mBTDeviceMrg.stopScan Failed!!!");
                try {
                    g0Var.N6(0, -1, "stopScanImp: mBTDeviceMrg.stopScan failed!!!", "", "", 0, null);
                } catch (android.os.RemoteException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopScanImp: aCallback.onScanCallback failed!!!, %s", e17.getMessage());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.RemoteBTDeviceAdapter", e17, "", new java.lang.Object[0]);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegistOnscanCallback");
            boolean unregister = a2Var.f505795h.unregister(g0Var);
            if (!unregister) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnScanCallback.unregister Failed!!!");
            }
            if (!unregister) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegistScanCallback failed!!!");
            }
            z18 = z17;
        }
        if (z18) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopScanImp failed!!!");
    }
}
