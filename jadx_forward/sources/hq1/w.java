package hq1;

/* loaded from: classes13.dex */
public class w extends hq1.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hq1.a0 f364734a;

    public w(hq1.a0 a0Var) {
        this.f364734a = a0Var;
    }

    @Override // hq1.f0
    public void a(long j17, boolean z17, long j18) {
        a42.i.f(j17);
        hq1.v vVar = new hq1.v(this, j17, z17, j18);
        hq1.a0 a0Var = this.f364734a;
        java.util.concurrent.locks.ReentrantLock reentrantLock = a0Var.f364617d;
        reentrantLock.lock();
        vVar.run();
        reentrantLock.unlock();
        a0Var.f364622i.size();
    }

    @Override // hq1.f0
    public void b(long j17, boolean z17) {
        a42.i.f(j17);
        hq1.z zVar = this.f364734a.f364615b;
        if (zVar != null) {
            u32.l1 l1Var = (u32.l1) zVar;
            l1Var.getClass();
            u32.v1 v1Var = new u32.v1(null);
            v1Var.f505919a = j17;
            if (z17) {
                v1Var.f505920b = 0;
                v1Var.f505921c = 0;
            } else {
                v1Var.f505920b = -1;
                v1Var.f505921c = -1;
            }
            v1Var.f505922d = "";
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = l1Var.f505856a.f505800p;
            if (n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(11, v1Var))) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", 11);
        }
    }
}
