package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class n extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f67352d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f67353e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f67354f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f67355g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f67356h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f67352d = "";
        this.f67356h = "";
    }

    public static final void T6(com.tencent.mm.feature.openmsg.uic.n nVar, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        nVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgByAppBrandClickUIC", "tryLaunchAppBrand, appId: " + appBrandOpenMaterialDetailModel.f86255d.f86262d + ", versionType: " + appBrandOpenMaterialDetailModel.f86255d.f86263e + ", enterPath: " + appBrandOpenMaterialDetailModel.f86255d.f86264f);
        com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
        if (h6Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenMsgByAppBrandClickUIC", "tryLaunchAppBrand, appBrandLauncher is null");
            return;
        }
        com.tencent.mm.feature.openmsg.uic.m mVar = new com.tencent.mm.feature.openmsg.uic.m(h6Var, nVar, appBrandOpenMaterialDetailModel, appBrandOpenMaterialCollection);
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            mVar.run();
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(mVar);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new com.tencent.mm.feature.openmsg.uic.k(this));
        }
    }
}
