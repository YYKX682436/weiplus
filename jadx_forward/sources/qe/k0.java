package qe;

/* loaded from: classes7.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe.m0 f443505d;

    public k0(qe.m0 m0Var) {
        this.f443505d = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f443505d) {
            if (this.f443505d.f443508a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.TcpNativeInstallHelper", "DestroyTask destoryTcp");
                this.f443505d.f443508a.m78203x5212aa2d();
                this.f443505d.f443508a = null;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.TcpNativeInstallHelper", "DestroyTask tcpNative is null");
            }
        }
    }
}
