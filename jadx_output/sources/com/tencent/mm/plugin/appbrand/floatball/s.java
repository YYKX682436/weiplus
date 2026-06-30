package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
final class s extends com.tencent.mm.plugin.appbrand.ipc.v {
    private s() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        if (appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallPermissionHelper$CheckFloatBallPermissionRequest) {
            int i17 = ((com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallPermissionHelper$CheckFloatBallPermissionRequest) appBrandProxyUIProcessTask$ProcessRequest).f78059d;
            com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
            pv.h0 h0Var = (pv.h0) i95.n0.c(pv.h0.class);
            com.tencent.mm.plugin.appbrand.floatball.r rVar = new com.tencent.mm.plugin.appbrand.floatball.r(this);
            ((ov.k0) h0Var).getClass();
            qp1.q.a(activityContext, i17, false, rVar, null);
        }
    }
}
