package dr0;

/* loaded from: classes12.dex */
public final class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr0.a3 f324102d;

    public w2(dr0.a3 a3Var) {
        this.f324102d = a3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long f17 = dr0.a3.f323936d.a().f();
        if (f17 < 0 || f17 > 1440) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Recycler", "abort: deepBg, delayMin=" + f17);
            dr0.x0.f324104a.c("RECYCLE_DEEP_BG", "check-fail", "invalidPostMin");
            return;
        }
        if (dr0.j2.f323976e.a()) {
            dr0.a3 a3Var = this.f324102d;
            dr0.t2 t2Var = a3Var.f323941a;
            boolean z17 = false;
            if (t2Var != null && t2Var.f324086b) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Recycler", "abort: deepBg, has task with higher priority");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Recycler", "recycle schedule: deepBg, delayMin=" + f17);
            long j17 = f17 * ((long) com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8);
            a3Var.d("post-3");
            dr0.q3.j(dr0.q3.f324039m, j17, null, 2, null);
        }
    }
}
