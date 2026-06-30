package qe;

/* loaded from: classes7.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe.f0 f443460d;

    public d0(qe.f0 f0Var) {
        this.f443460d = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f443460d) {
            if (this.f443460d.f443478a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LockStepNativeInstallHelper", "DestroyTask destoryLockStep");
                this.f443460d.f443478a.m45665xb96f57cb();
                this.f443460d.f443478a = null;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LockStepNativeInstallHelper", "DestroyTask lockStepNative is null");
            }
        }
    }
}
