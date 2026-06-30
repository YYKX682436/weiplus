package a82;

/* loaded from: classes12.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a82.z0 f83506d;

    public b1(a82.z0 z0Var) {
        this.f83506d = z0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        a82.z0 z0Var = this.f83506d;
        long j17 = currentTimeMillis - z0Var.f83782e;
        if (z0Var.f83781d) {
            if (j17 < 60000) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavModService", "klem ERR: Try Run service runningFlag:" + z0Var.f83781d + " timeWait:" + j17 + ">=MAX_TIME_WAIT sending:" + z0Var.f83781d);
        }
        z0Var.f83783f = false;
        z0Var.f83781d = true;
        z0Var.f83785h.c(10L, 10L);
    }

    /* renamed from: toString */
    public java.lang.String m801x9616526c() {
        return super.toString() + "|run";
    }
}
