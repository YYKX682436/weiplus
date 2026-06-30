package mt1;

/* loaded from: classes12.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final mt1.b f412723d = new mt1.b();

    @Override // java.lang.Runnable
    public final void run() {
        mt1.b0 b0Var = mt1.b0.f412724a;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p4) mt1.b0.c(b0Var)).b(5);
        int myTid = android.os.Process.myTid();
        mt1.b0.b(b0Var).add(java.lang.Integer.valueOf(myTid));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            new aw1.g1(21).run();
        } finally {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "runTaskWithLeakInspect taskId=5, cost=" + currentTimeMillis2 + "ms|" + java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis2) + "min");
            mt1.b0.b(b0Var).remove(java.lang.Integer.valueOf(myTid));
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p4) mt1.b0.c(b0Var)).a(5);
        }
    }
}
