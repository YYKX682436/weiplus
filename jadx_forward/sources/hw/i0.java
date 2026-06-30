package hw;

/* loaded from: classes7.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw.o0 f366918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366919e;

    public i0(hw.o0 o0Var, java.lang.String str) {
        this.f366918d = o0Var;
        this.f366919e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        java.lang.String ij6;
        hw.o0 o0Var = this.f366918d;
        hw.c0 c0Var = o0Var.f366942e;
        if (c0Var != null) {
            com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p706x5dc4f1ad.p707x60b7c31.p708x5c6729a.C10484x8f75c5cd c10484x8f75c5cd = new com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p706x5dc4f1ad.p707x60b7c31.p708x5c6729a.C10484x8f75c5cd();
            c0Var.G1(c10484x8f75c5cd.f229414d, this.f366919e);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            ij6 = o0Var.ij();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(ij6, "brandServiceBiz is null!");
        }
    }
}
