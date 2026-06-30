package t21;

/* loaded from: classes12.dex */
public class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.p3 f496377d;

    public n3(t21.p3 p3Var) {
        this.f496377d = p3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        t21.p3 p3Var = this.f496377d;
        long j17 = currentTimeMillis - p3Var.f496410t;
        boolean z17 = p3Var.f496408r;
        boolean z18 = p3Var.f496407q;
        boolean z19 = p3Var.f496406p;
        if (z17) {
            if (j17 < 3600000) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoService", "ERR: Try Run service runningFlag:" + p3Var.f496408r + " timeWait:" + j17 + ">=MAX_TIME_WAIT sending:" + p3Var.f496407q + " recving:" + p3Var.f496406p);
            if (((java.util.HashMap) p3Var.f496405o).size() != 0 && p3Var.f496407q && j17 < 3600000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoService", "already sending, do not reset service");
                return;
            }
        }
        p3Var.f496409s = 3;
        p3Var.f496408r = true;
        p3Var.f496407q = false;
        p3Var.f496406p = false;
        p3Var.f496412v = null;
        p3Var.f496411u = null;
        p3Var.f496413w.b();
        p3Var.f496399f.c(10L, 10L);
    }

    /* renamed from: toString */
    public java.lang.String m165703x9616526c() {
        return super.toString() + "|run";
    }
}
