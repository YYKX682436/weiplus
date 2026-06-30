package a82;

/* loaded from: classes12.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a82.h2 f83580d;

    public j2(a82.h2 h2Var) {
        this.f83580d = h2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        a82.h2 h2Var = this.f83580d;
        long j17 = currentTimeMillis - h2Var.f83545e;
        if (h2Var.f83544d) {
            if (j17 < 60000) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavSendService", "klem ERR: Try Run service runningFlag:" + h2Var.f83544d + " timeWait:" + j17 + ">=MAX_TIME_WAIT sending:" + h2Var.f83544d);
        }
        h2Var.f83546f = false;
        h2Var.f83544d = true;
        h2Var.f83548h.c(10L, 10L);
    }

    /* renamed from: toString */
    public java.lang.String m822x9616526c() {
        return super.toString() + "|run";
    }
}
