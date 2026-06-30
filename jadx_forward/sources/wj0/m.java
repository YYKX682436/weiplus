package wj0;

/* loaded from: classes11.dex */
public class m implements java.lang.Runnable {
    public m(wj0.n nVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXHardCoderJNI", "reportHardcoderRunnable start to run");
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_REPORT_HARDCODER_TIME_LONG;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - longValue > 86400000 || longValue > currentTimeMillis) {
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(currentTimeMillis));
            s75.d.b(new wj0.l(this), "reportHardCoder");
        }
    }
}
