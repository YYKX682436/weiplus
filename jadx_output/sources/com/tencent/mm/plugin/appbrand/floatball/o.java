package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class o implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qp1.k0 f78126a;

    public o(qp1.k0 k0Var) {
        this.f78126a = k0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallPermissionHelper$CheckFloatBallPermissionResult appBrandFloatBallPermissionHelper$CheckFloatBallPermissionResult = (com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallPermissionHelper$CheckFloatBallPermissionResult) appBrandProxyUIProcessTask$ProcessResult;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(appBrandFloatBallPermissionHelper$CheckFloatBallPermissionResult != null && appBrandFloatBallPermissionHelper$CheckFloatBallPermissionResult.f78060d);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "onClose, checkFloatBallPermission isOK:%b", objArr);
        qp1.k0 k0Var = this.f78126a;
        if (k0Var != null) {
            k0Var.b((appBrandFloatBallPermissionHelper$CheckFloatBallPermissionResult == null || !appBrandFloatBallPermissionHelper$CheckFloatBallPermissionResult.f78060d) ? qp1.j0.Cancel : qp1.j0.Allow);
        }
    }
}
