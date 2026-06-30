package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class z2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.x2 f85450d;

    public z2(com.tencent.mm.plugin.appbrand.launching.x2 x2Var) {
        this.f85450d = x2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mm.plugin.appbrand.launching.x2 x2Var = this.f85450d;
            x2Var.h(x2Var.a());
            com.tencent.mm.plugin.appbrand.keylogger.w.e(this.f85450d.f85375r, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPrepareResourceProcess);
        } catch (java.lang.Throwable th6) {
            try {
                com.tencent.mm.plugin.appbrand.keylogger.w.c(this.f85450d.f85375r, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPrepareResourceProcess, th6.getLocalizedMessage());
                this.f85450d.l(56);
                if (th6 instanceof com.tencent.mm.plugin.appbrand.launching.fc) {
                    com.tencent.mm.plugin.appbrand.launching.x2 x2Var2 = this.f85450d;
                    x2Var2.B1 = true;
                    com.tencent.mm.plugin.appbrand.launching.i3 i3Var = x2Var2.f85365h;
                    java.lang.Object[] objArr = new java.lang.Object[3];
                    objArr[0] = x2Var2.f85374q;
                    objArr[1] = x2Var2.f85375r;
                    objArr[2] = java.lang.Boolean.valueOf(i3Var == null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "notifyRestartOnLaunchRequested username[%s] appId[%s] null==callback[%b]", objArr);
                    if (i3Var != null) {
                        ((com.tencent.mm.plugin.appbrand.launching.j1) i3Var).C();
                    }
                } else if (th6 instanceof com.tencent.mm.plugin.appbrand.launching.gc) {
                    this.f85450d.b("RestartOtherAppErrorOnMigrateRequested", new com.tencent.mm.plugin.appbrand.launching.h3() { // from class: com.tencent.mm.plugin.appbrand.launching.z2$$a
                        @Override // com.tencent.mm.plugin.appbrand.launching.h3
                        public final boolean a() {
                            com.tencent.mm.plugin.appbrand.launching.z2 z2Var = com.tencent.mm.plugin.appbrand.launching.z2.this;
                            java.lang.Throwable th7 = th6;
                            ((com.tencent.mm.plugin.appbrand.launching.j1) z2Var.f85450d.f85365h).a(((com.tencent.mm.plugin.appbrand.launching.gc) th7).f84631d);
                            return true;
                        }
                    });
                } else {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", th6, "call() exp ", new java.lang.Object[0]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                    com.tencent.mm.plugin.appbrand.launching.ib.a(com.tencent.mm.R.string.f490190nf, this.f85450d);
                    this.f85450d.h(com.tencent.mm.plugin.appbrand.launching.x2.G1);
                }
                com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = this.f85450d.f85387z;
                if (iCommLibReader == null) {
                }
            } finally {
                com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader2 = this.f85450d.f85387z;
                if (iCommLibReader2 != null) {
                    s46.d.a(iCommLibReader2);
                }
            }
        }
    }
}
