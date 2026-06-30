package jh;

/* loaded from: classes13.dex */
public final class l extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final jh.d0 f381256a;

    public l(jh.d0 d0Var) {
        this.f381256a = d0Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        oj.j.c("Matrix.WarmUpDelegate", "Warm-up received.", new java.lang.Object[0]);
        java.lang.String action = intent.getAction();
        if (action != null && action.equals("action.backtrace.warmed-up")) {
            com.p314xaae8f345.p552xbf8d97c1.p553x50bbe4be.C4623x5780ee2f.m40748x9432d221(true);
            jh.d0 d0Var = jh.d0.FpUntilQuickenWarmedUp;
            jh.d0 d0Var2 = this.f381256a;
            if (d0Var2 == d0Var || d0Var2 == jh.d0.DwarfUntilQuickenWarmedUp) {
                com.p314xaae8f345.p552xbf8d97c1.p553x50bbe4be.C4623x5780ee2f.m40744x62fa263f(1);
            }
            try {
                context.unregisterReceiver(this);
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.WarmUpDelegate", th6, "Unregister receiver twice.", new java.lang.Object[0]);
            }
        }
    }
}
