package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI f89873d;

    public n(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI) {
        this.f89873d = appBrandAuthorizeUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI = this.f89873d;
        if (appBrandAuthorizeUI.F == null) {
            appBrandAuthorizeUI.F = db5.e1.P(appBrandAuthorizeUI.getContext(), appBrandAuthorizeUI.getString(com.tencent.mm.R.string.f490573yv), 3, appBrandAuthorizeUI.getString(com.tencent.mm.R.string.a4q), true, false, new com.tencent.mm.plugin.appbrand.ui.m(this));
        }
    }
}
