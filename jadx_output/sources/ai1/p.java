package ai1;

/* loaded from: classes8.dex */
public final class p implements ai1.a {

    /* renamed from: b, reason: collision with root package name */
    public static final ai1.p f5102b = new ai1.p();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f5103c = new java.util.HashMap();

    public static final void a(ai1.p pVar, java.lang.String str, boolean z17, r45.qf qfVar) {
        pVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = f5103c;
        synchronized (hashMap) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) hashMap.get(str);
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ai1.f fVar = (ai1.f) ((ai1.e) it.next());
            zh1.a1 a1Var = fVar.f5083a;
            if (z17) {
                if (a1Var != null) {
                    ai1.p pVar2 = f5102b;
                    kotlin.jvm.internal.o.d(qfVar);
                    com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection c17 = pVar2.c(qfVar, java.lang.System.currentTimeMillis(), fVar.f5084b);
                    c17.toString();
                    a1Var.a(true, c17);
                }
            } else if (a1Var != null) {
                a1Var.a(false, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection.a(new com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel("", "", "")));
            }
        }
    }

    public void b(com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel, zh1.a1 a1Var) {
        kotlin.jvm.internal.o.g(materialModel, "materialModel");
        com.tencent.mm.ipcinvoker.wx_extension.x xVar = (com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/getmaterialrecommwxacard";
        lVar.f70667d = 5049;
        r45.ii3 ii3Var = new r45.ii3();
        ii3Var.f377063d = materialModel.f86269d;
        ii3Var.f377064e = materialModel.f86270e;
        lVar.f70664a = ii3Var;
        lVar.f70665b = new r45.ji3();
        ((h80.i) xVar).wi(lVar.a(), new ai1.m(materialModel, a1Var));
    }

    public final com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection c(r45.qf qfVar, long j17, java.util.List list) {
        java.util.LinkedList<r45.yi4> recomm_card_list = qfVar.f383922d;
        kotlin.jvm.internal.o.f(recomm_card_list, "recomm_card_list");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(recomm_card_list, 10));
        for (r45.yi4 yi4Var : recomm_card_list) {
            ai1.p pVar = f5102b;
            kotlin.jvm.internal.o.d(yi4Var);
            arrayList.add(pVar.e(yi4Var));
        }
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection = new com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection(new com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel("", "", ""), kz5.p0.f313996d, arrayList);
        appBrandOpenMaterialCollection.f86253h = j17;
        appBrandOpenMaterialCollection.f86254i = qfVar.f383924f;
        java.util.ArrayList arrayList2 = appBrandOpenMaterialCollection.f86250e.f86272d;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = qfVar.f383923e.iterator();
        while (it.hasNext()) {
            r45.vi4 vi4Var = (r45.vi4) it.next();
            java.lang.String type = vi4Var.f388290d;
            kotlin.jvm.internal.o.f(type, "type");
            hashMap.put(type, vi4Var);
        }
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel = (com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel) it6.next();
            if (hashMap.containsKey(materialModel.f86269d)) {
                java.lang.Object obj = hashMap.get(materialModel.f86269d);
                kotlin.jvm.internal.o.d(obj);
                java.lang.Object obj2 = hashMap.get(materialModel.f86269d);
                kotlin.jvm.internal.o.d(obj2);
                materialModel.f86269d = ((r45.vi4) obj2).f388292f;
            }
            arrayList2.add(materialModel);
        }
        return appBrandOpenMaterialCollection;
    }

    public final com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection d(r45.ji3 ji3Var, long j17, com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel) {
        java.util.LinkedList<r45.xi4> recently_used_card_list = ji3Var.f377835d;
        kotlin.jvm.internal.o.f(recently_used_card_list, "recently_used_card_list");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(recently_used_card_list, 10));
        for (r45.xi4 xi4Var : recently_used_card_list) {
            kotlin.jvm.internal.o.d(xi4Var);
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel appBrandOpenMaterialModel = new com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel(xi4Var.f390145d, xi4Var.f390149h, xi4Var.f390148g, xi4Var.f390146e, xi4Var.f390147f);
            appBrandOpenMaterialModel.f86267i = xi4Var.f390150i;
            arrayList.add(appBrandOpenMaterialModel);
        }
        java.util.LinkedList<r45.yi4> recomm_card_list = ji3Var.f377836e;
        kotlin.jvm.internal.o.f(recomm_card_list, "recomm_card_list");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(recomm_card_list, 10));
        for (r45.yi4 yi4Var : recomm_card_list) {
            ai1.p pVar = f5102b;
            kotlin.jvm.internal.o.d(yi4Var);
            arrayList2.add(pVar.e(yi4Var));
        }
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection = new com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection(materialModel, arrayList, arrayList2);
        appBrandOpenMaterialCollection.f86253h = j17;
        return appBrandOpenMaterialCollection;
    }

    public final com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel e(r45.yi4 yi4Var) {
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel = new com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel(yi4Var.f391126d, yi4Var.f391133n, yi4Var.f391132m, yi4Var.f391127e, yi4Var.f391128f, yi4Var.f391130h, yi4Var.f391131i, yi4Var.f391129g, yi4Var.f391135p, yi4Var.f391136q, yi4Var.f391137r);
        appBrandOpenMaterialDetailModel.f86255d.f86267i = yi4Var.f391134o;
        return appBrandOpenMaterialDetailModel;
    }
}
