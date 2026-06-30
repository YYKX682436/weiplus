package qe;

/* loaded from: classes7.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe.d1 f443537d;

    public x0(qe.d1 d1Var) {
        this.f443537d = d1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f443537d) {
            qe.d1 d1Var = this.f443537d;
            if (d1Var.f443468h != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WcWssNativeInstallHelper", "destroyTask destroyWcWssBinding mContextId:%s", d1Var.f443461a);
                this.f443537d.f443468h.m83410x183b4217();
                this.f443537d.f443468h = null;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WcWssNativeInstallHelper", "destroyTask mWcwssNative is null");
            }
        }
    }
}
