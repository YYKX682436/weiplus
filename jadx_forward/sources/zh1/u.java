package zh1;

/* loaded from: classes8.dex */
public final class u {
    public u(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final zh1.z0 a(long j17, bi1.g openMaterialScene, android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 bottomSheet, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 openMaterialCollection, zh1.v0 v0Var, zh1.c1 c1Var) {
        zh1.z0 e1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialScene, "openMaterialScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialCollection, "openMaterialCollection");
        boolean a17 = zh1.w.a(context);
        zh1.z0 z0Var = zh1.z0.f554492t1;
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.BottomSheetEnhanceLogic", "create, context is invalid, use dummy");
            return z0Var;
        }
        zh1.c1 c1Var2 = zh1.c1.f554402a;
        boolean z17 = true;
        java.util.List appBrandOpenMaterialDetailModels = openMaterialCollection.f167785g;
        if (bottomSheet.R1 == 0) {
            java.util.List appBrandOpenMaterialModels = openMaterialCollection.f167784f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appBrandOpenMaterialModels, "appBrandOpenMaterialModels");
            if (!(!appBrandOpenMaterialModels.isEmpty())) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appBrandOpenMaterialDetailModels, "appBrandOpenMaterialDetailModels");
                if (!(!appBrandOpenMaterialDetailModels.isEmpty())) {
                    z17 = false;
                }
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.BottomSheetEnhanceLogic", "create, can not enhance, use dummy");
                return z0Var;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.BottomSheetEnhanceLogic", "create, create GridBottomSheetEnhanceLogic");
            e1Var = new zh1.r0(j17, openMaterialScene, context, bottomSheet, openMaterialCollection, v0Var, c1Var == null ? c1Var2 : c1Var);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appBrandOpenMaterialDetailModels, "appBrandOpenMaterialDetailModels");
            if (!(true ^ appBrandOpenMaterialDetailModels.isEmpty())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.BottomSheetEnhanceLogic", "create, can not enhance, use dummy");
                return z0Var;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.BottomSheetEnhanceLogic", "create, create ListBottomSheetEnhanceLogic");
            e1Var = new zh1.e1(j17, openMaterialScene, context, bottomSheet, openMaterialCollection, v0Var, c1Var == null ? c1Var2 : c1Var);
        }
        return e1Var;
    }
}
