package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes7.dex */
public abstract class d8 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f274063a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f274064b;

    /* renamed from: c, reason: collision with root package name */
    public final long f274065c;

    /* renamed from: d, reason: collision with root package name */
    public long f274066d;

    /* renamed from: e, reason: collision with root package name */
    public long f274067e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f274068f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f274069g;

    public d8() {
        this(0L, null);
    }

    public java.lang.Object a(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        if (n3Var == null) {
            return b();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.SyncTask", "sync task exec...");
        if (n3Var.mo50280x23b2dd47() != null ? java.lang.Thread.currentThread().getId() == n3Var.mo50280x23b2dd47().getThread().getId() : n3Var.mo50284xdd3e8650().equals(xu5.b.e())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.SyncTask", "same tid, task in exec thread, return now");
            return b();
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f274066d = android.os.SystemClock.elapsedRealtime();
        try {
            synchronized (this.f274064b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.SyncTask", "sync task exec at synchronized");
                n3Var.mo50293x3498a0(this.f274069g);
                this.f274064b.wait(this.f274065c);
            }
        } catch (java.lang.InterruptedException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.SyncTask", e17, "", new java.lang.Object[0]);
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f274066d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.SyncTask", "sync task done, return=%s, cost=%d(wait=%d, run=%d)", "" + this.f274063a, java.lang.Long.valueOf(elapsedRealtime), java.lang.Long.valueOf(this.f274067e), java.lang.Long.valueOf(elapsedRealtime - this.f274067e));
        return this.f274063a;
    }

    public abstract java.lang.Object b();

    public void c(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.SyncTask", "setResultFinish ");
        this.f274063a = obj;
        synchronized (this.f274064b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.SyncTask", "setResultFinish synchronized");
            this.f274064b.notify();
        }
    }

    public d8(long j17, java.lang.Object obj, boolean z17) {
        this.f274064b = new java.lang.Object();
        this.f274068f = false;
        this.f274069g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.c8(this);
        this.f274065c = j17;
        this.f274063a = obj;
        this.f274068f = z17;
    }

    public d8(long j17, java.lang.Object obj) {
        this.f274064b = new java.lang.Object();
        this.f274068f = false;
        this.f274069g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.c8(this);
        this.f274065c = j17;
        this.f274063a = obj;
    }
}
