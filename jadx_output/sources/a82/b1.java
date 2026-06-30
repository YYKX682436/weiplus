package a82;

/* loaded from: classes12.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a82.z0 f1973d;

    public b1(a82.z0 z0Var) {
        this.f1973d = z0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        a82.z0 z0Var = this.f1973d;
        long j17 = currentTimeMillis - z0Var.f2249e;
        if (z0Var.f2248d) {
            if (j17 < 60000) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavModService", "klem ERR: Try Run service runningFlag:" + z0Var.f2248d + " timeWait:" + j17 + ">=MAX_TIME_WAIT sending:" + z0Var.f2248d);
        }
        z0Var.f2250f = false;
        z0Var.f2248d = true;
        z0Var.f2252h.c(10L, 10L);
    }

    public java.lang.String toString() {
        return super.toString() + "|run";
    }
}
