package dr0;

/* loaded from: classes12.dex */
public final class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr0.a3 f324099d;

    public v2(dr0.a3 a3Var) {
        this.f324099d = a3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr0.a3 a17 = dr0.a3.f323936d.a();
        int i17 = (a17.k() && mm.k.j(mm.k.E, null, 1, null) && a17.i() > 0) ? 1 : -1;
        if (i17 <= 0 || i17 > 1440) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Recycler", "abort: continuous, delayMin=" + i17);
            return;
        }
        if (dr0.j2.f323974c.a()) {
            dr0.a3 a3Var = this.f324099d;
            dr0.t2 t2Var = a3Var.f323941a;
            if (t2Var != null && t2Var.f324086b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Recycler", "abort: continuous, has task with higher priority");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Recycler", "recycle schedule: continuous, delayMin=" + i17);
            long j17 = (long) (i17 * com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8);
            if (a3Var.g()) {
                j17 = 30000;
            }
            a3Var.d("post-1");
            dr0.q3.j(dr0.q3.f324037h, j17, null, 2, null);
        }
    }
}
