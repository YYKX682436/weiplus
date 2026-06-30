package u32;

/* loaded from: classes13.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u32.p f505848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f505849e;

    public k(u32.p pVar, int i17) {
        this.f505848d = pVar;
        this.f505849e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean d17;
        kq1.n nVar = this.f505848d.f505873a;
        nVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("***stopScan*** aBluetoothVersion = ");
        int i17 = this.f505849e;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKManager", sb6.toString());
        boolean z17 = true;
        if (i17 != 0) {
            if (i17 != 1) {
                iz5.a.g(null, false);
            } else {
                jq1.e eVar = nVar.f392789c;
                if (eVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
                } else {
                    d17 = eVar.b(false);
                }
            }
            d17 = false;
        } else {
            hq1.j jVar = nVar.f392788b;
            if (jVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
                d17 = false;
            } else {
                d17 = jVar.d(false, new int[0]);
            }
        }
        if (!d17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "mBTSDKMrg.stopScan failed!!!");
            z17 = false;
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "instance.stopScanImp failed!!!");
    }
}
