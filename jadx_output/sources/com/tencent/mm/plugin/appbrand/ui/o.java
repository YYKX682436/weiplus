package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI f89892d;

    public o(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI) {
        this.f89892d = appBrandAuthorizeUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI = this.f89892d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = appBrandAuthorizeUI.F;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        appBrandAuthorizeUI.F.dismiss();
        appBrandAuthorizeUI.F = null;
    }
}
