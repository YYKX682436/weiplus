package dr0;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr0.m f323954d;

    public f(dr0.m mVar) {
        this.f323954d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr0.m mVar = this.f323954d;
        mVar.getClass();
        long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("battery-accstats-lastreportms", 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j18 = currentTimeMillis - j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccStats", "#checkReport, deltaMs=" + j18);
        mVar.Ni(new dr0.i(mVar));
        if (j18 >= dr0.m.f323998f * 3600000) {
            if (j17 != 0) {
                mVar.Ni(new dr0.k(mVar, j18));
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putLong("battery-accstats-lastreportms", currentTimeMillis);
        }
        mVar.Ni(new dr0.j(mVar));
    }
}
