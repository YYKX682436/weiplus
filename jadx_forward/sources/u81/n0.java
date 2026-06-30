package u81;

/* loaded from: classes7.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f506980a;

    /* renamed from: c, reason: collision with root package name */
    public final long f506982c;

    /* renamed from: d, reason: collision with root package name */
    public long f506983d;

    /* renamed from: e, reason: collision with root package name */
    public long f506984e;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f506986g;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f506981b = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f506985f = new u81.m0(this);

    public n0(long j17, java.lang.Object obj) {
        this.f506982c = j17;
        this.f506980a = obj;
    }

    public java.lang.Object a(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        if (n3Var == null) {
            return b();
        }
        this.f506986g = n3Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.SyncTask", "sync task exec...");
        if (java.lang.Thread.currentThread().getId() == n3Var.mo50280x23b2dd47().getThread().getId()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.SyncTask", "same tid, task in exec thread, return now");
            return b();
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f506983d = android.os.SystemClock.elapsedRealtime();
        try {
            synchronized (this.f506981b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.SyncTask", "sync task exec at synchronized");
                n3Var.mo50293x3498a0(this.f506985f);
                this.f506981b.wait(this.f506982c);
            }
        } catch (java.lang.InterruptedException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.SyncTask", e17, "", new java.lang.Object[0]);
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f506983d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.SyncTask", "sync task done, return=%s, cost=%d(wait=%d, run=%d)", "" + this.f506980a, java.lang.Long.valueOf(elapsedRealtime), java.lang.Long.valueOf(this.f506984e), java.lang.Long.valueOf(elapsedRealtime - this.f506984e));
        return this.f506980a;
    }

    public abstract java.lang.Object b();

    public void c(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.SyncTask", "setResultFinish ");
        this.f506980a = obj;
        synchronized (this.f506981b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.SyncTask", "setResultFinish synchronized");
            this.f506981b.notify();
        }
    }
}
