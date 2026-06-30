package u32;

/* loaded from: classes13.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f505860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u32.g0 f505861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u32.a2 f505862f;

    public m1(u32.a2 a2Var, int i17, u32.g0 g0Var) {
        this.f505862f = a2Var;
        this.f505860d = i17;
        this.f505861e = g0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        u32.a2 a2Var = this.f505862f;
        a2Var.getClass();
        u32.g0 g0Var = this.f505861e;
        if (g0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Error parameter: null == aCallback !!!");
            throw new java.lang.IllegalArgumentException("scanImp: null == aCallback");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "registOnscanCallback");
        android.os.RemoteCallbackList remoteCallbackList = a2Var.f505795h;
        boolean register = remoteCallbackList.register(g0Var);
        if (!register) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnScanCallback.register Failed!!!");
        }
        boolean z18 = false;
        if (register) {
            u32.i iVar = a2Var.f505792e;
            iVar.getClass();
            int i17 = this.f505860d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BTDeviceManager", "------scan------ bluetooth version = %d", java.lang.Integer.valueOf(i17));
            u32.p b17 = u32.p.b();
            boolean mo50293x3498a0 = b17.f505877e.mo50293x3498a0(new u32.j(b17, i17, iVar, new int[0]));
            if (!mo50293x3498a0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "scan: instance.mHandler.post failed!!!");
            }
            if (mo50293x3498a0) {
                z17 = true;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BTDeviceManager", "BluetoothSDKAdapter.scan Failed!!!");
                z17 = false;
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mBTDeviceMrg.scan Failed!!!");
                try {
                    g0Var.N6(0, -1, "scanImp: mBTDeviceMrg.scan failed!!!", "", "", 0, null);
                } catch (android.os.RemoteException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "aCallback.onScanCallback failed!!! %s", e17.getMessage());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.RemoteBTDeviceAdapter", e17, "", new java.lang.Object[0]);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegistOnscanCallback");
                boolean unregister = remoteCallbackList.unregister(g0Var);
                if (!unregister) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnScanCallback.unregister Failed!!!");
                }
                if (!unregister) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegistScanCallback failed!!!");
                }
            }
            z18 = z17;
        } else {
            try {
                g0Var.N6(0, -1, "scanImp: registScanCallback failed!!!", "", "", 0, null);
            } catch (android.os.RemoteException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "aCallback.onScanCallback failed!!! %s", e18.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.RemoteBTDeviceAdapter", e18, "", new java.lang.Object[0]);
            }
        }
        if (z18) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "scanImp failed!!!");
    }
}
