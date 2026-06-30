package i01;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i01.b f368029d;

    public a(i01.b bVar) {
        this.f368029d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f368029d.f368031d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TraceConfigUpdater", "summer update isUpdating and ret");
            return;
        }
        long j17 = this.f368029d.f368032e.getLong("trace_config_last_update_time", 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - j17 > 86400000 || j17 > currentTimeMillis) {
            this.f368029d.a();
            this.f368029d.f368031d = true;
            c01.d9.e().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de, this.f368029d);
            c01.d9.e().a(160, this.f368029d);
            c01.d9.e().g(new f21.g0(21));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TraceConfigUpdater", "summer last update time: " + j17 + " current time: " + currentTimeMillis + " in same day");
    }
}
