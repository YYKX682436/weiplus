package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class r implements qp1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.s f78137a;

    public r(com.tencent.mm.plugin.appbrand.floatball.s sVar) {
        this.f78137a = sVar;
    }

    @Override // qp1.k0
    public void b(qp1.j0 j0Var) {
        com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallPermissionHelper$CheckFloatBallPermissionResult appBrandFloatBallPermissionHelper$CheckFloatBallPermissionResult = new com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallPermissionHelper$CheckFloatBallPermissionResult();
        appBrandFloatBallPermissionHelper$CheckFloatBallPermissionResult.f78060d = j0Var.h();
        this.f78137a.finishProcess(appBrandFloatBallPermissionHelper$CheckFloatBallPermissionResult);
    }
}
