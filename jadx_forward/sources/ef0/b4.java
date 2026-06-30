package ef0;

/* loaded from: classes8.dex */
public final class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef0.d4 f333708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f333709e;

    public b4(ef0.d4 d4Var, java.lang.String str) {
        this.f333708d = d4Var;
        this.f333709e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ef0.d4 d4Var = this.f333708d;
        long j17 = 0;
        if (d4Var.f333730e == 0) {
            if (gm4.a.f355092c) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = gm4.a.f355091b;
                if (o4Var != null) {
                    j17 = o4Var.getLong("key_sync_recommend", 0L);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingLocalStorage", "not init");
            }
            d4Var.f333730e = j17;
        }
        long j18 = d4Var.f333730e;
        if (java.lang.System.currentTimeMillis() - j18 < ((java.lang.Number) ((jz5.n) d4Var.f333732g).mo141623x754a37bb()).longValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingTaskBarRecommendService", "syncTaskBarRecommendData ignore, last: %d", java.lang.Long.valueOf(j18));
            return;
        }
        d4Var.Bi(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingTaskBarRecommendService", "syncTaskBarRecommendData from source: " + this.f333709e);
        w71.m1 a17 = ((hm4.c) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).f478670h.mo141623x754a37bb()).a();
        if (a17 != null) {
            p3380x6a61f93.p3386xf51b86f1.C30596x21b1ccf3.m170141x21b98e08(((w71.n1) a17).m105978x2737f10(), 10, 8);
        }
    }
}
