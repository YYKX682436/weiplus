package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public abstract class t {
    public static void a(android.content.Context context, int i17, qp1.k0 k0Var) {
        com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallPermissionHelper$CheckFloatBallPermissionRequest appBrandFloatBallPermissionHelper$CheckFloatBallPermissionRequest = new com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallPermissionHelper$CheckFloatBallPermissionRequest();
        appBrandFloatBallPermissionHelper$CheckFloatBallPermissionRequest.f78059d = i17;
        com.tencent.mm.plugin.appbrand.floatball.o oVar = new com.tencent.mm.plugin.appbrand.floatball.o(k0Var);
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, appBrandFloatBallPermissionHelper$CheckFloatBallPermissionRequest, oVar, null);
    }
}
