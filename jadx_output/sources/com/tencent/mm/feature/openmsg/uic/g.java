package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.h6 f67333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.uic.h f67334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel f67335f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection f67336g;

    public g(com.tencent.mm.plugin.appbrand.service.h6 h6Var, com.tencent.mm.feature.openmsg.uic.h hVar, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        this.f67333d = h6Var;
        this.f67334e = hVar;
        this.f67335f = appBrandOpenMaterialDetailModel;
        this.f67336g = appBrandOpenMaterialCollection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgByAppBrandClickForOpenMaterialUIC", "tryLaunchAppBrand, launch appBrand");
        com.tencent.mm.feature.openmsg.uic.h hVar = this.f67334e;
        android.app.Activity context = hVar.getContext();
        l81.b1 b1Var = new l81.b1();
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel appBrandOpenMaterialModel = this.f67335f.f86255d;
        b1Var.f317014b = appBrandOpenMaterialModel.f86262d;
        b1Var.f317016c = appBrandOpenMaterialModel.f86263e;
        b1Var.f317022f = appBrandOpenMaterialModel.f86264f;
        b1Var.f317032k = com.tencent.mm.plugin.appbrand.jsapi.finder.r0.CTRL_INDEX;
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection = this.f67336g;
        java.lang.String mimeType = appBrandOpenMaterialCollection.f86249d.f86269d;
        kotlin.jvm.internal.o.f(mimeType, "mimeType");
        java.lang.String materialPath = appBrandOpenMaterialCollection.f86249d.f86271f;
        kotlin.jvm.internal.o.f(materialPath, "materialPath");
        b1Var.f317028i = new bi1.e(mimeType, materialPath, null, 0, 12, null);
        b1Var.L = new com.tencent.mm.feature.openmsg.uic.f(hVar);
        ((com.tencent.mm.plugin.appbrand.launching.xc) this.f67333d).bj(context, b1Var);
    }
}
