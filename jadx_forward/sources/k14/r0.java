package k14;

/* loaded from: classes11.dex */
public class r0 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k14.x0 f384904e;

    public r0(k14.x0 x0Var) {
        this.f384904e = x0Var;
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "MicroMsg.UnfamiliarContactEngineAwait";
    }

    @Override // java.lang.Runnable
    public void run() {
        k14.x0 x0Var = this.f384904e;
        try {
            x0Var.f384938d.await();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            x0Var.f384941g.clear();
            x0Var.f384942h.remove(c01.z1.r());
            x0Var.f384941g.addAll(x0Var.f384942h);
            x0Var.f384941g.addAll(x0Var.f384943i);
            x0Var.f384941g.addAll(x0Var.f384944j);
            if (x0Var.f384936b) {
                x0Var.f384941g.retainAll(x0Var.f384944j);
            }
            if (x0Var.f384937c) {
                x0Var.f384941g.retainAll(x0Var.f384943i);
            }
            if (x0Var.f384935a) {
                x0Var.f384941g.retainAll(x0Var.f384942h);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vp) x0Var.f384946l).b(x0Var.f384941g);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnfamiliarContactEngine", "[onResult] :%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            x0Var.f384939e.mo77785xc570fb34(new k14.p0(this));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnfamiliarContactEngine", "all cost:%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - x0Var.f384947m));
        } catch (java.lang.InterruptedException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UnfamiliarContactEngine", e17, "", new java.lang.Object[0]);
            x0Var.f384939e.mo77785xc570fb34(new k14.q0(this));
        }
    }
}
