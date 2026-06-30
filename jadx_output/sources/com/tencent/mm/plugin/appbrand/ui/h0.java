package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class h0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f89746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI f89747e;

    public h0(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI, int i17) {
        this.f89747e = appBrandAuthorizeUI;
        this.f89746d = i17;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        int i19;
        int intExtra;
        if (i17 == 1 && i18 == -1 && intent != null && intent.hasExtra("key_result_state") && (intExtra = intent.getIntExtra("key_result_state", (i19 = this.f89746d))) != i19) {
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI = this.f89747e;
            appBrandAuthorizeUI.f89320z = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "onClickLocationPreference, change location state to:%s", java.lang.Integer.valueOf(intExtra));
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.Y6(appBrandAuthorizeUI, intExtra);
            if (intExtra == 2) {
                appBrandAuthorizeUI.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "report click location background auth state");
                com.tencent.mm.plugin.appbrand.backgroundrunning.v.a(appBrandAuthorizeUI.f89303f, appBrandAuthorizeUI.f89304g, java.lang.System.currentTimeMillis(), 3, "", 0);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(2);
            arrayList.add("scope.userLocation");
            arrayList.add("scope.userLocationBackground");
            appBrandAuthorizeUI.l7(arrayList, new com.tencent.mm.plugin.appbrand.ui.g0(this, intExtra));
        }
    }
}
