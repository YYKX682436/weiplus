package dr0;

/* loaded from: classes12.dex */
public final class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr0.q3 f324019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f324020e;

    public o3(dr0.q3 q3Var, long j17) {
        this.f324019d = q3Var;
        this.f324020e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TASK post run: ");
        dr0.q3 q3Var = this.f324019d;
        sb6.append(q3Var.f324048d);
        sb6.append(", delayActual=");
        sb6.append(java.lang.System.currentTimeMillis() - this.f324020e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.ProcLifeTasks", sb6.toString());
        dr0.q3.i(q3Var, null, 1, null);
    }
}
