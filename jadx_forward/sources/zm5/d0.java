package zm5;

/* loaded from: classes3.dex */
public final class d0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f555726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zm5.f0 f555727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f555728f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555729g;

    public d0(boolean z17, zm5.f0 f0Var, long j17, java.lang.String str) {
        this.f555726d = z17;
        this.f555727e = f0Var;
        this.f555728f = j17;
        this.f555729g = str;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        g4Var.clear();
        boolean z17 = this.f555726d;
        zm5.f0 f0Var = this.f555727e;
        if (z17) {
            g4Var.h(1, f0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.i89), com.p314xaae8f345.mm.R.raw.f80089x8164b1e0, f0Var.m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        }
        g4Var.h(6, f0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.fz7), com.p314xaae8f345.mm.R.raw.f80259x58c5ec65, f0Var.m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        boolean z18 = false;
        if (aq.p.f94463b != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getGoToChatToShow: ");
            long j17 = this.f555728f;
            sb6.append(j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryComposeOp", sb6.toString());
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(this.f555729g, j17);
            boolean z19 = n17.t0() == -1 && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.K3(n17.Q0());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryComposeOp", "getGoToChatToShow: " + z19);
            z18 = z19;
        }
        if (z18) {
            g4Var.h(5, f0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f573836fz5), com.p314xaae8f345.mm.R.raw.f80047x8e8a2dc3, f0Var.m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        }
        g4Var.h(7, f0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.fz8), com.p314xaae8f345.mm.R.raw.f80336x9bb432f6, f0Var.m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        g4Var.h(10, f0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.fz6), com.p314xaae8f345.mm.R.raw.f80228xde514cc6, f0Var.m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
    }
}
