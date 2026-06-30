package dr0;

/* loaded from: classes12.dex */
public final class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr0.a3 f324095d;

    public u2(dr0.a3 a3Var) {
        this.f324095d = a3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int e17 = dr0.a3.f323936d.a().e();
        dr0.a3 a3Var = this.f324095d;
        boolean z17 = false;
        if (dr0.a3.a(a3Var)) {
            a3Var.q("准备回收主进程（耗时大约 10s）");
            e17 = 0;
        } else if (e17 <= 0 || e17 > 1440) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Recycler", "abort: bg, delayMin=" + e17);
            return;
        } else {
            if (!dr0.j2.f323975d.a()) {
                return;
            }
            dr0.t2 t2Var = a3Var.f323941a;
            if (t2Var != null && t2Var.f324086b) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Recycler", "abort: bg, has task with higher priority");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Recycler", "recycle schedule: bg, delayMin=" + e17);
        a3Var.d("post-2");
        dr0.q3.j(dr0.q3.f324038i, ((long) e17) * 60000, null, 2, null);
    }
}
