package dr0;

/* loaded from: classes12.dex */
public final class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr0.t2 f324069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f324070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f324071f;

    public s2(dr0.t2 t2Var, boolean z17, java.util.List list) {
        this.f324069d = t2Var;
        this.f324070e = z17;
        this.f324071f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr0.t2 t2Var = this.f324069d;
        if (t2Var.a()) {
            dr0.a3.c(dr0.a3.f323936d.a());
            t2Var.c();
            dr0.x0.f324104a.b("recycle-" + t2Var.f324085a, "abort", "4");
            return;
        }
        boolean z17 = this.f324070e;
        boolean z18 = !z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "ipc postCheckAlive: " + z18);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(z18), dr0.d1.class, new dr0.r2(t2Var, this.f324071f, z17));
    }
}
