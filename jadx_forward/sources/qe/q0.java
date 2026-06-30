package qe;

/* loaded from: classes7.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe.s0 f443520d;

    public q0(qe.s0 s0Var) {
        this.f443520d = s0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f443520d) {
            if (this.f443520d.f443523a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.UdpNativeInstallHelper", "DestroyTask destoryUdp");
                this.f443520d.f443523a.m78283x5212ae0d();
                this.f443520d.f443523a = null;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.UdpNativeInstallHelper", "DestroyTask udpNative is null");
            }
        }
    }
}
