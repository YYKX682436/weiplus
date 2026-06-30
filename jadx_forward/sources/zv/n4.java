package zv;

/* loaded from: classes11.dex */
public final class n4 extends com.p314xaae8f345.mm.app.s2 {
    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginBrandEcs", "onAppBackground");
        zv.e0 e0Var = zv.e0.f557470a;
        if (zv.e0.f557471b && ((java.lang.Boolean) ((jz5.n) zv.e0.f557476g).mo141623x754a37bb()).booleanValue()) {
            ku5.u0 u0Var = ku5.t0.f394148d;
            zv.x xVar = zv.x.f557660d;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.w(xVar, 3000L, null);
        }
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginBrandEcs", "onAppForeground");
        zv.e0.f557470a.a("onAppForeground");
        zv.e2 e2Var = (zv.e2) ((bw.k) i95.n0.c(bw.k.class));
        if (e2Var.Ui()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.p1006xc5476f33.biz.q.f175403d;
            if (currentTimeMillis >= e2Var.f557490r) {
                ((ku5.t0) ku5.t0.f394148d).h(new zv.t1(e2Var), "onAppForeground");
            } else {
                ku5.u0 u0Var = ku5.t0.f394148d;
                zv.s1 s1Var = new zv.s1(e2Var);
                long j17 = e2Var.f557490r - currentTimeMillis;
                if (j17 < 5000) {
                    j17 = 5000;
                }
                ((ku5.t0) u0Var).l(s1Var, j17, "onAppForeground");
            }
        }
    }
}
