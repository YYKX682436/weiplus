package hq1;

/* loaded from: classes13.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f364730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f364731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f364732f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hq1.w f364733g;

    public v(hq1.w wVar, long j17, boolean z17, long j18) {
        this.f364733g = wVar;
        this.f364730d = j17;
        this.f364731e = z17;
        this.f364732f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        hq1.w wVar = this.f364733g;
        java.util.HashMap hashMap = wVar.f364734a.f364622i;
        long j17 = this.f364730d;
        hq1.h0 h0Var = (hq1.h0) hashMap.get(java.lang.Long.valueOf(j17));
        boolean z17 = this.f364731e;
        boolean z18 = !z17;
        if (h0Var == null && !z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESimpleManager", "no seesion(mac=%s) found", a42.i.f(j17));
            return;
        }
        hq1.z zVar = wVar.f364734a.f364615b;
        if (zVar != null) {
            u32.l1 l1Var = (u32.l1) zVar;
            l1Var.getClass();
            u32.q1 q1Var = new u32.q1(null);
            q1Var.f505884a = j17;
            q1Var.f505886c = z17 ? 2 : 4;
            q1Var.f505885b = 1;
            q1Var.f505887d = 0;
            q1Var.f505888e = this.f364732f;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = l1Var.f505856a.f505800p;
            if (!n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(9, q1Var))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", 9);
            }
            if (z18) {
                a42.i.f(j17);
            }
        }
        if (z18) {
            a42.i.f(j17);
            wVar.f364734a.f364622i.remove(java.lang.Long.valueOf(j17));
            wVar.f364734a.f364623j.remove(java.lang.Long.valueOf(j17));
        }
    }
}
