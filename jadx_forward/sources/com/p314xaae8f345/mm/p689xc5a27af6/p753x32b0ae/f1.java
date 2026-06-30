package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes15.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.g1 f148685d;

    public f1(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.g1 g1Var) {
        this.f148685d = g1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.p314xaae8f345.mm.app.w.INSTANCE.f135422n) {
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.g1 g1Var = this.f148685d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "preloadLiteApp real release, appId:%s, engineId:%s, appUuid:%s, path:%s", g1Var.f148688d, java.lang.Integer.valueOf(g1Var.f148689e), java.lang.Long.valueOf(this.f148685d.f148690f), this.f148685d.f148691g);
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.g1 g1Var2 = this.f148685d;
        g1Var2.f148692h.Yj(g1Var2.f148688d, g1Var2.f148691g);
    }
}
