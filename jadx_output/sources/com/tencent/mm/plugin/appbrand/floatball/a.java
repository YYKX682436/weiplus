package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class a implements com.tencent.mm.plugin.appbrand.backgroundrunning.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.d f78063a;

    public a(com.tencent.mm.plugin.appbrand.floatball.d dVar) {
        this.f78063a = dVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundrunning.u0
    public void a(com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel) {
        if (appBrandBackgroundRunningOperationParcel != null && this.f78063a.f78078w.f74803n.equals(appBrandBackgroundRunningOperationParcel.f76932d) && this.f78063a.f78078w.f74805p.f77281g == appBrandBackgroundRunningOperationParcel.f76933e && appBrandBackgroundRunningOperationParcel.f76934f == 8) {
            int i17 = appBrandBackgroundRunningOperationParcel.f76935g;
            if (i17 != 1) {
                if (i17 == 2 || i17 == 3) {
                    com.tencent.mm.plugin.appbrand.floatball.d dVar = this.f78063a;
                    gp1.v vVar = dVar.f93136h;
                    com.tencent.mm.plugin.ball.model.BallInfo t07 = vVar != null ? vVar.t0(dVar.f93132d) : null;
                    if (t07 != null) {
                        if (!t07.I) {
                            com.tencent.mars.xlog.Log.w(dVar.f78077v, "removeBackgroundPlayAudioBall, passive is false");
                            return;
                        }
                        com.tencent.mars.xlog.Log.i(dVar.f78077v, "removeBackgroundPlayAudioBall, remove passive float ball");
                        dVar.d();
                        dVar.f78080y = false;
                        return;
                    }
                    com.tencent.mars.xlog.Log.i(dVar.f78077v, "removeBackgroundPlayAudioBall, no this float ball");
                    pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
                    int i18 = dVar.f93132d.H;
                    ((ov.p0) j0Var).getClass();
                    java.lang.Boolean bool = qp1.w.f365755a;
                    dVar.b0(i18 & (-129));
                    return;
                }
                return;
            }
            com.tencent.mm.plugin.appbrand.floatball.d dVar2 = this.f78063a;
            if (dVar2.u()) {
                com.tencent.mars.xlog.Log.i(dVar2.f78077v, "onSendBackgroundRunningOperation, add audio of video background play state to float ball");
                pv.j0 j0Var2 = (pv.j0) i95.n0.c(pv.j0.class);
                int i19 = dVar2.f93132d.H;
                ((ov.p0) j0Var2).getClass();
                java.lang.Boolean bool2 = qp1.w.f365755a;
                dVar2.b0(i19 | 128);
                dVar2.a0(true);
                return;
            }
            com.tencent.mars.xlog.Log.i(dVar2.f78077v, "onSendBackgroundRunningOperation, add passive audio of video background play float ball");
            dVar2.Z(dVar2.u0());
            dVar2.a0(true);
            dVar2.W(false);
            pv.j0 j0Var3 = (pv.j0) i95.n0.c(pv.j0.class);
            int i27 = dVar2.f93132d.H;
            ((ov.p0) j0Var3).getClass();
            java.lang.Boolean bool3 = qp1.w.f365755a;
            dVar2.b0(i27 | 128);
            dVar2.t().f93086f = 13;
            dVar2.g();
            dVar2.j();
            dVar2.f78080y = true;
        }
    }
}
