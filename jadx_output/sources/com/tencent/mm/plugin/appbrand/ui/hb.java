package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class hb implements com.tencent.mm.plugin.appbrand.jsapi.auth.entity.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandUserProfileAuthorizeUI f89761a;

    public hb(com.tencent.mm.plugin.appbrand.ui.AppBrandUserProfileAuthorizeUI appBrandUserProfileAuthorizeUI) {
        this.f89761a = appBrandUserProfileAuthorizeUI;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.l
    public void a(boolean z17) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f89761a.f89465m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.l
    public void onStart() {
        com.tencent.mm.plugin.appbrand.ui.AppBrandUserProfileAuthorizeUI appBrandUserProfileAuthorizeUI = this.f89761a;
        if (appBrandUserProfileAuthorizeUI.f89465m == null) {
            appBrandUserProfileAuthorizeUI.f89465m = db5.e1.P(appBrandUserProfileAuthorizeUI.getContext(), appBrandUserProfileAuthorizeUI.getString(com.tencent.mm.R.string.f490573yv), 3, appBrandUserProfileAuthorizeUI.getString(com.tencent.mm.R.string.a4p), true, false, com.tencent.mm.plugin.appbrand.ui.gb.f89742d);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = appBrandUserProfileAuthorizeUI.f89465m;
        if (u3Var != null) {
            u3Var.show();
        }
    }
}
