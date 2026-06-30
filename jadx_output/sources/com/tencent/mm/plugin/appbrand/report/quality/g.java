package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.i f88190e;

    public g(java.lang.String str, com.tencent.mm.plugin.appbrand.report.i iVar) {
        this.f88189d = str;
        this.f88190e = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.report.i iVar;
        int i17;
        com.tencent.mm.plugin.appbrand.report.quality.p pVar;
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(this.f88189d, true);
        if (b17 == null || (iVar = this.f88190e) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandQualitySystem", "hy: not need do sample");
            return;
        }
        r45.ud7 ud7Var = iVar.f87863c;
        if (ud7Var == null || (i17 = ud7Var.f387273d) == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandQualitySystem", "hy: need do sample, type: %d, sampleInterval: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f88190e.f87863c.f387274e));
        int i18 = this.f88190e.f87863c.f387273d;
        com.tencent.mm.plugin.appbrand.report.quality.p pVar2 = com.tencent.mm.plugin.appbrand.report.quality.p.NewFull;
        com.tencent.mm.plugin.appbrand.report.quality.p pVar3 = com.tencent.mm.plugin.appbrand.report.quality.p.NewLight;
        com.tencent.mm.plugin.appbrand.report.quality.p pVar4 = com.tencent.mm.plugin.appbrand.report.quality.p.Full;
        com.tencent.mm.plugin.appbrand.report.quality.p pVar5 = com.tencent.mm.plugin.appbrand.report.quality.p.Light;
        if (i18 == 1) {
            pVar = pVar5;
        } else if (i18 == 2) {
            pVar = pVar4;
        } else if (i18 == 3) {
            pVar = pVar3;
        } else if (i18 != 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandQualitySystem", "hy: invalid type!!");
            pVar = null;
        } else {
            pVar = pVar2;
        }
        if (pVar == pVar5 || pVar == pVar4) {
            b17.f88154z.c(b17, this.f88190e.f87863c.f387274e, pVar, true);
            return;
        }
        if (pVar == pVar3 || pVar == pVar2) {
            com.tencent.mm.plugin.appbrand.report.quality.t tVar = b17.f88154z;
            int i19 = this.f88190e.f87863c.f387274e;
            if (tVar.f88308h == null) {
                tVar.f88308h = b17;
            }
            tVar.f88310j = true;
            tVar.f88303c.f88270d = i19 * 1000;
            tVar.f88305e = new java.util.HashMap();
            ((ku5.t0) ku5.t0.f312615d).g(tVar.f88304d);
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.appbrand.report.quality.r rVar = tVar.f88303c;
            ((ku5.t0) u0Var).k(rVar, rVar.f88270d);
        }
    }
}
