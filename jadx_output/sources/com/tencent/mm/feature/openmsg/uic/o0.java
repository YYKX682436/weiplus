package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class o0 extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void T6(com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgAppBrandPreProcessForOpenMaterialUIC", "dispatch collection:" + appBrandOpenMaterialCollection);
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new eb0.b(appBrandOpenMaterialCollection, null, null, true));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        hb0.a aVar;
        j75.f Q6 = Q6();
        if (Q6 == null || (aVar = (hb0.a) Q6.getState()) == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection = null;
        if (aVar.f280017m == null) {
            T6(null);
            return;
        }
        com.tencent.mm.plugin.appbrand.service.k5 k5Var = (com.tencent.mm.plugin.appbrand.service.k5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k5.class);
        if (k5Var != null) {
            com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel = aVar.f280017m;
            kotlin.jvm.internal.o.d(materialModel);
            appBrandOpenMaterialCollection = ((zh1.p) k5Var).Ri(materialModel);
        }
        T6(appBrandOpenMaterialCollection);
    }
}
