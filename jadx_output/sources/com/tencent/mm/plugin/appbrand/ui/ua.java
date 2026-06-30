package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class ua implements com.tencent.mm.plugin.appbrand.jsapi.auth.entity.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI f90258a;

    public ua(com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI appBrandUserInfoAuthorizeUI) {
        this.f90258a = appBrandUserInfoAuthorizeUI;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.l
    public void a(boolean z17) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f90258a.f89454m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.l
    public void onStart() {
        com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI appBrandUserInfoAuthorizeUI = this.f90258a;
        if (appBrandUserInfoAuthorizeUI.f89454m == null) {
            appBrandUserInfoAuthorizeUI.f89454m = db5.e1.P(appBrandUserInfoAuthorizeUI.getContext(), appBrandUserInfoAuthorizeUI.getString(com.tencent.mm.R.string.f490573yv), 3, appBrandUserInfoAuthorizeUI.getString(com.tencent.mm.R.string.a4p), true, false, com.tencent.mm.plugin.appbrand.ui.ta.f90238d);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = appBrandUserInfoAuthorizeUI.f89454m;
        if (u3Var != null) {
            u3Var.show();
        }
    }
}
