package cx;

/* loaded from: classes7.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cx.j1 f305927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305928e;

    public d1(cx.j1 j1Var, java.lang.String str) {
        this.f305927d = j1Var;
        this.f305928e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        java.lang.String pj6;
        cx.j1 j1Var = this.f305927d;
        cx.w0 w0Var = j1Var.f305955e;
        if (w0Var != null) {
            com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p706x5dc4f1ad.p707x60b7c31.p708x5c6729a.C10484x8f75c5cd c10484x8f75c5cd = new com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p706x5dc4f1ad.p707x60b7c31.p708x5c6729a.C10484x8f75c5cd();
            w0Var.G1(c10484x8f75c5cd.f229414d, this.f305928e);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            pj6 = j1Var.pj();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(pj6, "brandServiceBiz is null!");
        }
    }
}
