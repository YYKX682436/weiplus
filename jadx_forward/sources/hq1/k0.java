package hq1;

/* loaded from: classes7.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f364687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hq1.m0 f364688e;

    public k0(hq1.m0 m0Var, int i17) {
        this.f364688e = m0Var;
        this.f364687d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = 0;
        while (true) {
            hq1.m0 m0Var = this.f364688e;
            if (i17 >= m0Var.f364695b.size()) {
                return;
            }
            hq1.g gVar = (hq1.g) ((hq1.l0) m0Var.f364695b.get(i17));
            gVar.getClass();
            int i18 = this.f364687d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEManager", "(API21)start ble scan failed, errorCode = %d", java.lang.Integer.valueOf(i18));
            if (i18 != 1) {
                gVar.f364640a.f364671d.mo50293x3498a0(new hq1.f(gVar));
            }
            i17++;
        }
    }
}
