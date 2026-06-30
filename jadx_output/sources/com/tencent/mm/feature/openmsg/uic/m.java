package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.h6 f67347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.uic.n f67348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel f67349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection f67350g;

    public m(com.tencent.mm.plugin.appbrand.service.h6 h6Var, com.tencent.mm.feature.openmsg.uic.n nVar, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        this.f67347d = h6Var;
        this.f67348e = nVar;
        this.f67349f = appBrandOpenMaterialDetailModel;
        this.f67350g = appBrandOpenMaterialCollection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgByAppBrandClickUIC", "tryLaunchAppBrand, launch appBrand");
        com.tencent.mm.feature.openmsg.uic.n nVar = this.f67348e;
        android.app.Activity context = nVar.getContext();
        l81.b1 b1Var = new l81.b1();
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel = this.f67349f;
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel appBrandOpenMaterialModel = appBrandOpenMaterialDetailModel.f86255d;
        b1Var.f317014b = appBrandOpenMaterialModel.f86262d;
        b1Var.f317016c = appBrandOpenMaterialModel.f86263e;
        b1Var.f317022f = appBrandOpenMaterialModel.f86264f;
        b1Var.f317017c0 = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
        java.lang.String str = nVar.f67352d;
        b1Var.f317043u = str;
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        b1Var.f317015b0 = java.lang.String.valueOf(new j91.b(str, r17));
        boolean z17 = nVar.f67353e;
        db0.g gVar = db0.g.f227828a;
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection = this.f67350g;
        if (z17) {
            b1Var.f317032k = 1331;
            com.tencent.mm.plugin.appbrand.openmaterial.model.MultiSelectMaterialModel multiSelectMaterialModel = appBrandOpenMaterialCollection.f86250e;
            kotlin.jvm.internal.o.f(multiSelectMaterialModel, "multiSelectMaterialModel");
            java.util.List list = nVar.f67354f;
            kotlin.jvm.internal.o.d(list);
            java.lang.String talker = nVar.f67352d;
            kotlin.jvm.internal.o.g(talker, "talker");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = multiSelectMaterialModel.f86272d;
            int size = arrayList2.size();
            int i17 = 0;
            while (i17 < size) {
                java.lang.Object obj = arrayList2.get(i17);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel = (com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel) obj;
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) list.get(i17);
                com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel2 = appBrandOpenMaterialDetailModel;
                if (appBrandOpenMaterialDetailModel.f86261m.contains(materialModel.f86270e)) {
                    gVar.a(arrayList, materialModel, f9Var, talker);
                } else {
                    arrayList.add(new bi1.h("unsupported", null, null, 0, null, null, 0L, 0L, null, ac1.g.CTRL_INDEX, null));
                }
                i17++;
                appBrandOpenMaterialDetailModel = appBrandOpenMaterialDetailModel2;
            }
            b1Var.f317028i = new bi1.f(arrayList, nVar.f67356h);
        } else {
            b1Var.f317032k = com.tencent.mm.plugin.appbrand.jsapi.finder.r0.CTRL_INDEX;
            b1Var.f317034l = "1";
            com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel2 = appBrandOpenMaterialCollection.f86249d;
            kotlin.jvm.internal.o.f(materialModel2, "materialModel");
            com.tencent.mm.storage.f9 f9Var2 = nVar.f67355g;
            kotlin.jvm.internal.o.d(f9Var2);
            java.lang.String talker2 = nVar.f67352d;
            kotlin.jvm.internal.o.g(talker2, "talker");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            gVar.a(arrayList3, materialModel2, f9Var2, talker2);
            b1Var.f317028i = new bi1.f(arrayList3, nVar.f67356h);
        }
        b1Var.L = new com.tencent.mm.feature.openmsg.uic.l(nVar);
        ((com.tencent.mm.plugin.appbrand.launching.xc) this.f67347d).bj(context, b1Var);
    }
}
