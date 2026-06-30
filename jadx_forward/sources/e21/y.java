package e21;

/* loaded from: classes11.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg3.q0 f328132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e21.e0 f328133e;

    public y(xg3.q0 q0Var, e21.e0 e0Var) {
        this.f328132d = q0Var;
        this.f328133e = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xg3.q0 q0Var = this.f328132d;
        if (q0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OplogReportHelper", "clearRecord: op is null");
            return;
        }
        e21.e0 e0Var = this.f328133e;
        e0Var.f328044a.remove(java.lang.Integer.valueOf(q0Var.f535956b));
        e0Var.f328045b.remove(java.lang.Integer.valueOf(q0Var.f535956b));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogReportHelper", "clearRecord: op: " + e21.a1.a(q0Var));
    }
}
