package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes9.dex */
public class q5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s5 f270580d;

    public q5(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s5 s5Var) {
        this.f270580d = s5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s5 s5Var = this.f270580d;
        long j17 = currentTimeMillis - s5Var.f270611p;
        boolean z17 = s5Var.f270609n;
        boolean z18 = s5Var.f270608m;
        boolean z19 = s5Var.f270607i;
        if (z17) {
            if (j17 < 10800000) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneAppMsg", "summerbig ERR: Try Run service runningFlag:" + s5Var.f270609n + " timeWait:" + j17 + ">=MAX_TIME_WAIT sending:" + s5Var.f270608m + " recving:" + s5Var.f270607i);
        }
        s5Var.f270609n = true;
        s5Var.f270608m = false;
        s5Var.f270610o = 4;
        s5Var.f270607i = false;
        s5Var.f270612q.b();
        s5Var.f270613r.c(10L, 10L);
    }

    /* renamed from: toString */
    public java.lang.String m75180x9616526c() {
        return super.toString() + "|run";
    }
}
