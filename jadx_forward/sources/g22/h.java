package g22;

/* loaded from: classes15.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.oo3 f349352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g22.i f349353e;

    public h(r45.oo3 oo3Var, g22.i iVar) {
        this.f349352d = oo3Var;
        this.f349353e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z85.z zVar;
        r45.oo3 oo3Var = this.f349352d;
        if (oo3Var != null) {
            g22.i iVar = this.f349353e;
            int i17 = iVar.f349355d;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f();
            synchronized (f17.f276696a) {
                zVar = f17.f276702g;
            }
            zVar.y0(iVar.f349355d, oo3Var);
        }
    }
}
