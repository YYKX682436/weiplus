package gi;

/* loaded from: classes12.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gi.q1 f353634d;

    public r1(gi.q1 q1Var) {
        this.f353634d = q1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        gi.q1 q1Var = this.f353634d;
        q1Var.f353627b++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThermalExceptionMonitor", "finish, loop count: " + q1Var.f353627b);
        rh.c1 c1Var = q1Var.f353628c;
        if (c1Var != null) {
            c1Var.l();
            rh.c1 c1Var2 = q1Var.f353628c;
            if (c1Var2.f476863l != null && ((gi.w0) c1Var2).P()) {
                qh.u uVar = new qh.u();
                uVar.i();
                uVar.a("| AlertBattTest\n");
                new ri.m().a(q1Var.f353628c, uVar);
                uVar.f();
                uVar.d();
                new ri.n("alertBatt").a(q1Var.f353628c);
            }
            q1Var.f353628c.b();
            q1Var.f353628c = null;
        }
        if (q1Var.f353627b >= 5) {
            q1Var.f353626a = false;
            return;
        }
        ph.u uVar2 = q1Var.f353629d;
        if (uVar2 != null) {
            ph.u e17 = gi.d.e();
            rh.c1 c1Var3 = e17 != null ? new gi.s1(e17.f435829h, "alertBatt").f353554a : null;
            q1Var.f353628c = c1Var3;
            if (c1Var3 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThermalExceptionMonitor", "start, loop count: " + (q1Var.f353627b + 1));
                q1Var.f353628c.I();
                uVar2.f435829h.f444870f.postDelayed(this, 60000L);
            }
        }
    }
}
