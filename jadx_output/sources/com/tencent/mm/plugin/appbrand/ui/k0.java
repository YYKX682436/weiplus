package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class k0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f89816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI f89817e;

    public k0(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI, int i17) {
        this.f89817e = appBrandAuthorizeUI;
        this.f89816d = i17;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        int i19;
        int intExtra;
        if (i17 == 5 && i18 == -1 && intent != null && intent.hasExtra("key_result_state") && (intExtra = intent.getIntExtra("key_result_state", (i19 = this.f89816d))) != i19) {
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI = this.f89817e;
            appBrandAuthorizeUI.f89320z = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "onClickLocationPreference, change location state to:%s", java.lang.Integer.valueOf(intExtra));
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.Z6(appBrandAuthorizeUI, intExtra);
            java.util.ArrayList arrayList = new java.util.ArrayList(1);
            arrayList.add("scope.userFuzzyLocation");
            appBrandAuthorizeUI.l7(arrayList, new com.tencent.mm.plugin.appbrand.ui.j0(this, intExtra));
        }
    }
}
