package com.tencent.mm.plugin.appbrand.trade;

@mk0.a
/* loaded from: classes7.dex */
final class e implements com.tencent.mm.ipcinvoker.j {
    private e() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCVoid iPCVoid;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandThirdBusiTipsManager", "run UpdateWxaLaunchInfoTask");
        try {
            com.tencent.mm.plugin.appbrand.launching.k9 k9Var = new com.tencent.mm.plugin.appbrand.launching.k9();
            k9Var.field_appId = iPCString.f68406d;
            com.tencent.mm.plugin.appbrand.launching.i9 Zi = com.tencent.mm.plugin.appbrand.app.r9.Zi();
            if (Zi != null) {
                if (Zi.get(k9Var, "appId")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandThirdBusiTipsManager", "get showThirdBusiTips success showThirdBusiTips:%b", java.lang.Boolean.valueOf(k9Var.field_showThirdBusiTips));
                    k9Var.field_showThirdBusiTips = false;
                    if (Zi.update(k9Var, "appId")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandThirdBusiTipsManager", "update showThirdBusiTips false success");
                    }
                }
                if (rVar == null) {
                    return;
                } else {
                    iPCVoid = new com.tencent.mm.ipcinvoker.type.IPCVoid();
                }
            } else if (rVar == null) {
                return;
            } else {
                iPCVoid = new com.tencent.mm.ipcinvoker.type.IPCVoid();
            }
        } catch (java.lang.Exception unused) {
            if (rVar == null) {
                return;
            } else {
                iPCVoid = new com.tencent.mm.ipcinvoker.type.IPCVoid();
            }
        } catch (java.lang.Throwable th6) {
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
            }
            throw th6;
        }
        rVar.a(iPCVoid);
    }
}
