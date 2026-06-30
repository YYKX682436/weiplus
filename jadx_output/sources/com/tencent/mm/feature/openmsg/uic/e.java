package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.uic.h f67329d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.feature.openmsg.uic.h hVar) {
        super(1);
        this.f67329d = hVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        hb0.a state = (hb0.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        com.tencent.mm.feature.openmsg.uic.h hVar = this.f67329d;
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof eb0.a)) {
            eb0.a aVar = (eb0.a) dVar;
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel = aVar.f250697b;
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection = aVar.f250698c;
            hVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgByAppBrandClickForOpenMaterialUIC", "tryLaunchAppBrand, appId: " + appBrandOpenMaterialDetailModel.f86255d.f86262d + ", versionType: " + appBrandOpenMaterialDetailModel.f86255d.f86263e + ", enterPath: " + appBrandOpenMaterialDetailModel.f86255d.f86264f);
            com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
            if (h6Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.OpenMsgByAppBrandClickForOpenMaterialUIC", "tryLaunchAppBrand, appBrandLauncher is null");
            } else {
                com.tencent.mm.feature.openmsg.uic.g gVar = new com.tencent.mm.feature.openmsg.uic.g(h6Var, hVar, appBrandOpenMaterialDetailModel, appBrandOpenMaterialCollection);
                if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                    gVar.run();
                } else {
                    ((ku5.t0) ku5.t0.f312615d).B(gVar);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
