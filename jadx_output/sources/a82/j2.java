package a82;

/* loaded from: classes12.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a82.h2 f2047d;

    public j2(a82.h2 h2Var) {
        this.f2047d = h2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        a82.h2 h2Var = this.f2047d;
        long j17 = currentTimeMillis - h2Var.f2012e;
        if (h2Var.f2011d) {
            if (j17 < 60000) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavSendService", "klem ERR: Try Run service runningFlag:" + h2Var.f2011d + " timeWait:" + j17 + ">=MAX_TIME_WAIT sending:" + h2Var.f2011d);
        }
        h2Var.f2013f = false;
        h2Var.f2011d = true;
        h2Var.f2015h.c(10L, 10L);
    }

    public java.lang.String toString() {
        return super.toString() + "|run";
    }
}
