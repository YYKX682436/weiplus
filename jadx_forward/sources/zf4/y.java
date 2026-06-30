package zf4;

/* loaded from: classes13.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf4.a0 f554239d;

    public y(zf4.a0 a0Var) {
        this.f554239d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        zf4.a0 a0Var = this.f554239d;
        long j17 = currentTimeMillis - a0Var.f554176n;
        boolean z17 = a0Var.f554174i;
        boolean z18 = a0Var.f554173h;
        boolean z19 = a0Var.f554172g;
        if (z17) {
            if (j17 < 60000) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceRemindService", "ERR: Try Run service runningFlag:" + a0Var.f554174i + " timeWait:" + j17 + ">=MAX_TIME_WAIT sending:" + a0Var.f554173h + " recving:" + a0Var.f554172g);
        }
        a0Var.f554174i = true;
        a0Var.f554173h = false;
        a0Var.f554175m = 3;
        a0Var.f554172g = false;
        a0Var.f554177o.b();
        a0Var.f554178p.c(10L, 10L);
    }
}
