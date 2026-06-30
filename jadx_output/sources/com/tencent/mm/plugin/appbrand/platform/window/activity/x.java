package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes7.dex */
public class x implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.platform.window.activity.y f87677d;

    public x(com.tencent.mm.plugin.appbrand.platform.window.activity.y yVar) {
        this.f87677d = yVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandDeviceOrientationRetrier", "hy: still not cancelled, trigger retry");
        com.tencent.mm.plugin.appbrand.platform.window.activity.b0 b0Var = this.f87677d.f87679e;
        int i17 = b0Var.f87573a + 1;
        b0Var.f87573a = i17;
        if (i17 <= 3) {
            com.tencent.mm.plugin.appbrand.platform.window.activity.a0 a0Var = b0Var.f87574b;
            if (a0Var != null) {
                com.tencent.mm.plugin.appbrand.platform.window.activity.t tVar = (com.tencent.mm.plugin.appbrand.platform.window.activity.t) a0Var;
                android.app.Activity activity = tVar.f87659b;
                if (!activity.isDestroyed()) {
                    xi1.o oVar = tVar.f87658a.f87665a;
                    tVar.f87660c.getClass();
                    activity.setRequestedOrientation(oVar.f454712d);
                }
            }
            return true;
        }
        com.tencent.mm.plugin.appbrand.platform.window.activity.a0 a0Var2 = b0Var.f87574b;
        if (a0Var2 != null) {
            com.tencent.mm.plugin.appbrand.platform.window.activity.t tVar2 = (com.tencent.mm.plugin.appbrand.platform.window.activity.t) a0Var2;
            com.tencent.mm.plugin.appbrand.platform.window.activity.v vVar = tVar2.f87658a;
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandDeviceOrientationHandler", "hy: activity not turn to correct orientation for long time, request[%s]", vVar);
            xi1.n nVar = vVar.f87666b;
            xi1.o oVar2 = vVar.f87665a;
            if (nVar != null) {
                nVar.e(oVar2, false);
            }
            com.tencent.mm.plugin.appbrand.platform.window.activity.w wVar = tVar2.f87660c;
            if (wVar.f87668a == null) {
                com.tencent.mm.plugin.appbrand.platform.window.activity.k0 k0Var = (com.tencent.mm.plugin.appbrand.platform.window.activity.k0) i95.n0.c(com.tencent.mm.plugin.appbrand.platform.window.activity.k0.class);
                wVar.f87668a = k0Var;
                if (k0Var != null) {
                    xi1.o a17 = wVar.a();
                    com.tencent.mm.plugin.appbrand.report.model.WeAppQualityRequestOrientationStruct weAppQualityRequestOrientationStruct = new com.tencent.mm.plugin.appbrand.report.model.WeAppQualityRequestOrientationStruct();
                    weAppQualityRequestOrientationStruct.f87924d = oVar2.f454712d;
                    weAppQualityRequestOrientationStruct.f87925e = a17.f454712d;
                    weAppQualityRequestOrientationStruct.k();
                }
            }
        }
        return false;
    }
}
