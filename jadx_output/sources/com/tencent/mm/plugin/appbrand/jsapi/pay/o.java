package com.tencent.mm.plugin.appbrand.jsapi.pay;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/pay/o;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
public final class o implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        boolean z17 = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Ai() == 1;
        boolean z18 = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Bi() == 1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start IPCAsyncInvokeTask, readModeEnable: ");
        sb6.append(z17);
        sb6.append(" , isRisk： ");
        boolean z19 = !z18;
        sb6.append(z19);
        rk0.c.c("MicroMsg.JsApiGetAccessibilitySecureRiskInfoWC", sb6.toString(), new java.lang.Object[0]);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("is_readmode_enable", z17);
        bundle.putBoolean("is_risk", z19);
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
